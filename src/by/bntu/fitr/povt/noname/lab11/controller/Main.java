package by.bntu.fitr.povt.noname.lab11.controller;

import by.bntu.fitr.povt.noname.lab11.model.entity.Vector;
import by.bntu.fitr.povt.noname.lab11.model.logic.Calculator;
import by.bntu.fitr.povt.noname.lab11.util.PrinterCreator;
import by.bntu.fitr.povt.noname.lab11.util.UserInput;
import by.bntu.fitr.povt.noname.lab11.view.Printable;
import by.bntu.fitr.povt.noname.lab11.view.PrinterType;

public class Main {
    public static void main(String[] args) {
        Printable printer = PrinterCreator.create(PrinterType.CONSOLE);

        printer.print("Input count of elements in vector:");
        int n = UserInput.inputInt();

        double[] doubleArray = new double[n];

        for (int i = 0; i < n; i++){
            printer.print("Input element №" + i);
            doubleArray[i] = UserInput.inputDouble();
        }

        Vector vector = new Vector(doubleArray);
        double sumOfNegative = Calculator.sumOfNegativeElem(vector);

        printer.print(Calculator.prodOfElemBetweenMinAndMax(vector));


    }
}
