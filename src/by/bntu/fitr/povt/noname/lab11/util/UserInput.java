package by.bntu.fitr.povt.noname.lab11.util;

import java.util.Scanner;

public class UserInput {
    private static Scanner scanner = new Scanner(System.in);

    public static double inputDouble(){
        if (scanner.hasNextDouble()){
            return scanner.nextDouble();
        }
        scanner.next();
        return 0.0;
    }

    public static int inputInt(){
        if (scanner.hasNextInt()){
            return scanner.nextInt();
        }
        scanner.next();
        return 0;
    }
}
