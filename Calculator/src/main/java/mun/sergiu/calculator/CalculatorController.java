package mun.sergiu.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculatorController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public String showText;

    public double total = 0;

    public TextField showCalcTextField;

    public String operation = "";

    //public String calcNumber = "";
    public StringBuilder calcNumber = new StringBuilder("");

    public void onCalcButtonsClick(ActionEvent event)
    {
        switch (((Button)event.getSource()).getText()){
            case "0":
                this.calcNumber.append('0');
                break;
            case "1":
                this.calcNumber.append('1');
                break;
            case "2":
                this.calcNumber.append('2');
                break;
            case "3":
                this.calcNumber.append('3');
                break;
            case "4":
                this.calcNumber.append('4');
                break;
            case "5":
                this.calcNumber.append('5');
                break;
            case "6":
                this.calcNumber.append('6');
                break;
            case "7":
                this.calcNumber.append('7');
                break;
            case "8":
                this.calcNumber.append('8');
                break;
            case "9":
                this.calcNumber.append('9');
                break;
            case "+":
                this.operation = "+";
                break;
            case "-":
                this.operation = "-";
                break;
            case "*":
                this.operation = "*";
                break;
            case "/":
                this.operation = "/";
                break;
            case "C":
                this.calcNumber.deleteCharAt(this.calcNumber.length()-1);
                break;
            case "=":

                break;
        }

        if(((Button)event.getSource()).getText().equalsIgnoreCase("=")){
            this.showCalcTextField.setText(Double.toString(this.total));
        }else{
            this.showCalcTextField.setText(this.calcNumber.toString());
        }


        if(!this.operation.isEmpty() && !this.calcNumber.isEmpty())
        {
            if(this.total > 0){
                if(this.operation.equalsIgnoreCase("+")){
                    this.total += Double.parseDouble(this.calcNumber.toString());
                } else if (this.operation.equalsIgnoreCase("-")) {
                    this.total -= Double.parseDouble(this.calcNumber.toString());
                } else if (this.operation.equalsIgnoreCase("/")) {
                    this.total /= Double.parseDouble(this.calcNumber.toString());
                }else if (this.operation.equalsIgnoreCase("*")) {
                    this.total *= Double.parseDouble(this.calcNumber.toString());
                }
                this.operation = "";

            }else{
                this.total = Double.parseDouble(this.calcNumber.toString());
            }

            this.calcNumber = new StringBuilder("");
        }
    }
}