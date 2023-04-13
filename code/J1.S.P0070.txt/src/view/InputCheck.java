/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class InputCheck {

    private final static Scanner sc = new Scanner(System.in);

    public static int inputCheckNumber(int max, int min, String mention) {
        System.out.print(mention);
        boolean check = true;
        int result = 0;
        do {
            try {
                result = Integer.parseInt(sc.nextLine().trim());
                if (result > max || result < min) {
                    throw new Exception();
                }
                check = false;
            } catch (NumberFormatException e) {
                System.out.println("Invalid integer.");
                System.out.print("Enter again:");
            } catch (Exception e) {
                System.out.println("Input out of range. Enter a value between " + min + " and " + max + ":");
            }
        } while (check);
        return result;
    }

    public static String inputCheckPattern(String regex, String mention, String context) {
        System.out.print("\n" + mention);
        String InputUser;
        while (true) {
            InputUser = sc.nextLine().toUpperCase().trim();
            if (InputUser.matches(regex)) {
                return InputUser;
            }
            System.out.println(context);
            System.out.print("Enter again: ");
        }
    }

    public static double inputDouble(double max, double min, String regex, String mention, String context) {
        System.out.println(mention);
        String inputUser;
        double scole;
        while (true) {
            inputUser = sc.nextLine().trim();
            if (inputUser.matches(regex)) {
                scole = Double.parseDouble(inputUser);
                if (scole > max) {
                    System.out.println(context + " is less than equal ten");
                } else if (scole < min) {
                    System.out.println(context + " is greater than equal zero");
                } else {
                    return scole;
                }
            }
            System.out.println(context + " is digit");
            System.out.println(mention);
        }
    }

    public static boolean inputBoolean(String mention) {
        System.out.print("\n" + mention);
        while (true) {
            switch (sc.nextLine().toUpperCase()) {
                case "Y":
                case "YES":
                    return true;
                case "N":
                case "NO":
                    return false;
                default:
                    System.out.println("Only Y/N or YES/NO answer.");
                    System.out.print("Enter again: ");
            }
        }
    }

    public static String inputString(String message) {
        System.out.print(message);
        return sc.nextLine().trim();
    }
}
