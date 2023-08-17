module mun.sergiu.calculator {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;

    opens mun.sergiu.calculator to javafx.fxml;
    exports mun.sergiu.calculator;
}