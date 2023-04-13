/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.EBank;
import view.Menu;
import java.util.Locale;

/**
 *
 * @author HOME
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("-------Login Program-------");
        EBank tpbank = new EBank();
        switch (Menu.getChoice(Menu.Mend_Option)) {
            case 1:
                tpbank.setLocate(new Locale("vi", "VN"));
                break;
            case 2:
                tpbank.setLocate(Locale.ENGLISH);
                break;
            case 3:
                return;
        }
        Login.loginDisplay(tpbank);
    }
}
