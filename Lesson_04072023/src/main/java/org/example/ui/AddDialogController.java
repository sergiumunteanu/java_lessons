package org.example.ui;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.example.db.Employee;


public class AddDialogController {
    public TextField nameTextField;
    public TextField departmentTextField;
    public TextField sallaryTextField;

    public Employee result;

    public Employee getResult() {
        return result;
    }

    public void onSave(ActionEvent event)
    {
        if(!nameTextField.getText().isEmpty() || !departmentTextField.getText().isEmpty()) {
            result = new Employee(nameTextField.getText(), departmentTextField.getText(), Double.parseDouble(sallaryTextField.getText()));
        }
        Node button = (Node)event.getSource();
        Stage stage = (Stage)button.getScene().getWindow();
        stage.close();
    }
}
