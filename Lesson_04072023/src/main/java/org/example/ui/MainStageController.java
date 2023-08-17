package org.example.ui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import org.example.db.Employee;

import javafx.scene.control.TableColumn;
import org.example.db.JavaLessonsDB;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;

public class MainStageController implements Initializable {

    public TableColumn<Employee, String> nameColumn;
    public TableColumn<Employee, String> departmentColumn;
    public TableColumn<Employee, Double> sallaryColumn;
    public TableView<Employee> employeeTable;
    private JavaLessonsDB javaLessonsDB;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.javaLessonsDB = new JavaLessonsDB();
        List<Employee> employees = this.javaLessonsDB.selectAll();
        ObservableList<Employee> objects = FXCollections.observableArrayList(employees);

        //employeeTable.setItems(objects);
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        departmentColumn.setCellValueFactory(new PropertyValueFactory<>("department"));
        sallaryColumn.setCellValueFactory(new PropertyValueFactory<>("sallary"));
    }

    public void deleteEmployeeBtn()
    {
        int index = employeeTable.getSelectionModel().getSelectedIndex();
        if(index != -1){
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setHeaderText("Please confirm");
            Employee employee = employeeTable.getItems().get(index);
            alert.setContentText("Are you sure you want to delete " + employee.getName() + "?");
            Optional<ButtonType> result = alert.showAndWait();
            if(result.isPresent()){
                if(result.get() == ButtonType.OK){
                    javaLessonsDB.delete(employeeTable.getItems().get(index).getId());
                    employeeTable.getItems().remove(index);
                }
            }

        }
    }

    public void onAdd() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/add.fxml"));
        AnchorPane pane = fxmlLoader.load();//FXMLLoader.load(getClass().getResource("/fxml/add.fxml"));
        Scene scene = new Scene(pane);
        Stage addDialog = new Stage();
        addDialog.setScene(scene);
        addDialog.setTitle("Add employee");
        addDialog.initModality(Modality.APPLICATION_MODAL);
        addDialog.showAndWait();
        AddDialogController controller = fxmlLoader.getController();
        Employee emp = controller.getResult();
        if(emp != null){
            javaLessonsDB.create(emp);
            employeeTable.getItems().add(emp);
        }
    }
}
