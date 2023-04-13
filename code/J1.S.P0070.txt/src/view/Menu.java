/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author HOME
 */
public class Menu {
    public static final String[] Mend_Option ={"VietNamese","English","Exit"};
    
    public static int getChoice(String[] options){
        int minChoice = 1;
        int maxChoice = options.length;
        for(int i = 0; i < options.length; i++){
            System.out.printf("<%d> %s%n", i+1, options[i]);
        }
         String msg = "Choice [" + minChoice + " to " + maxChoice + "]: ";
         return InputCheck.inputCheckNumber(maxChoice, minChoice, msg);
    }
}
