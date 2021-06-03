package ru.geekbrains.calculator20;

import android.media.VolumeShaper;

public class DataCenter {
    float result = 0;
    String operationField = "0";
    String operationOne = null;
    String getOperationTwo = null;

    public float getResult() {
        return result;
    }

    public String getOperationField() {
        return operationField;
    }

    public String getOperationOne() {
        return operationOne;
    }

    public String getGetOperationTwo() {
        return getOperationTwo;
    }

    public void setResult(float result) {
        this.result = result;
    }

    public void setOperationField(String operationField) {
        if( this.operationField.equals("0") && operationField.equals(".") ) this.operationField = this.operationField + operationField ;
        else if (this.operationField.equals("0")) this.operationField = operationField;
        else this.operationField = this.operationField + operationField ;
    }

    public void setOperationOne(String operationOne) {
        this.operationOne = operationOne;
    }

    public void setGetOperationTwo(String getOperationTwo) {
        this.getOperationTwo = getOperationTwo;
    }

    public void clearAll () {
        result = 0;
        String operationField = "0";

    }

    public void multiplication(){
        float operationFloat = Float.parseFloat(operationField);
        if (operationOne.equals("+")) {
            result += operationFloat;
            operationOne = "*";

        }
        if (operationOne.equals("-")) {
            result -= operationFloat;
            operationOne = "*";

        }
        if (operationOne.equals("*")) {
            result *= operationFloat;
            operationOne = "*";

        }
        if (operationOne.equals("/")) {
            result /= operationFloat;
            operationOne = "*";

        }
        if (operationOne.equals("=")) {
            result = operationFloat;
            operationOne = "*";

        }

        if (operationOne.equals("%")) { //здесь додумать
            result = operationFloat/100;
            operationOne = "*";

        }
        if (operationOne.equals("+-")) { //здесь додумать
            operationField = "-" + operationField;
            operationOne = "*";

        }


    }

    public void divizion(){
        float operationFloat = Float.parseFloat(operationField);
        if (operationOne.equals("+")) {
            result += operationFloat;
            operationOne = "/";

        }
        if (operationOne.equals("-")) {
            result -= operationFloat;
            operationOne = "/";

        }
        if (operationOne.equals("*")) {
            result *= operationFloat;
            operationOne = "/";

        }
        if (operationOne.equals("/")) {
            result /= operationFloat;
            operationOne = "/";

        }
        if (operationOne.equals("=")) {
            result = operationFloat;
            operationOne = "/";

        }

        if (operationOne.equals("%")) { //здесь додумать
            result = operationFloat/100;
            operationOne = "/";

        }
        if (operationOne.equals("+-")) { //здесь додумать
            operationField = "-" + operationField;
            operationOne = "/";

        }


    }

    public void plus(){
        float operationFloat = Float.parseFloat(operationField);
        if (operationOne.equals("+")) {
            result += operationFloat;
            operationOne = "+";

        }
        if (operationOne.equals("-")) {
            result -= operationFloat;
            operationOne = "+";

        }
        if (operationOne.equals("*")) {
            result *= operationFloat;
            operationOne = "+";

        }
        if (operationOne.equals("/")) {
            result /= operationFloat;
            operationOne = "+";

        }
        if (operationOne.equals("=")) {
            result = operationFloat;
            operationOne = "+";

        }

        if (operationOne.equals("%")) { //здесь додумать
            result = operationFloat/100;
            operationOne = "+";

        }
        if (operationOne.equals("+-")) { //здесь додумать
            operationField = "-" + operationField;
            operationOne = "+";

        }


    }
    public void minus(){
        float operationFloat = Float.parseFloat(operationField);
        if (operationOne.equals("+")) {
            result += operationFloat;
            operationOne = "-";

        }
        if (operationOne.equals("-")) {
            result -= operationFloat;
            operationOne = "-";

        }
        if (operationOne.equals("*")) {
            result *= operationFloat;
            operationOne = "-";

        }
        if (operationOne.equals("/")) {
            result /= operationFloat;
            operationOne = "-";

        }
        if (operationOne.equals("=")) {
            result = operationFloat;
            operationOne = "-";

        }

        if (operationOne.equals("%")) { //здесь додумать
            result = operationFloat/100;
            operationOne = "-";

        }
        if (operationOne.equals("+-")) { //здесь додумать
            operationField = "-" + operationField;
            operationOne = "-";

        }


    }
    public void result(){
        float operationFloat = Float.parseFloat(operationField);
        if (operationOne.equals("+")) {
            result += operationFloat;
            operationOne = "=";

        }
        if (operationOne.equals("-")) {
            result -= operationFloat;
            operationOne = "=";

        }
        if (operationOne.equals("*")) {
            result *= operationFloat;
            operationOne = "=";

        }
        if (operationOne.equals("/")) {
            result /= operationFloat;
            operationOne = "=";

        }
        if (operationOne.equals("=")) {
            result = operationFloat;
            operationOne = "=";

        }

        if (operationOne.equals("%")) { //здесь додумать
            result = operationFloat/100;
            operationOne = "=";

        }
        if (operationOne.equals("+-")) { //здесь додумать
            operationField = "-" + operationField;
            operationOne = "=";

        }


    }


}
