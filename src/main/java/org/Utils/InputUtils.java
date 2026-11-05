package org.Utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputUtils {
    static Scanner input = new Scanner(System.in);

    public static String showMenu() {
        return "------------" +
                "\nLibrary" +
                "\n0:Leave" +
                "\n1:Add book" +
                "\n2:SearchBook" +
                "\n-----------------";
    }

    public static byte returnByte() {
        try {
            return input.nextByte();
        } catch (InputMismatchException e) {
            input.nextLine();
            System.out.println("input error");
        }
            return returnByte();
    }

    public static String returnString(){
        return input.nextLine();
    }

    public static int returnInt() {
        try {
            return input.nextInt();
        } catch (InputMismatchException e) {
            input.nextLine();
            System.out.println("input error");
        }
        return returnInt();
    }
}
