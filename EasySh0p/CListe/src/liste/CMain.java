/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package liste;

import liste.CArticel;
import liste.CInput;
import liste.CWarenkorb;
import liste.CMenu;

/**
 *
 * @author Riverside
 */
public class CMain {
    
    /* public static void main(String[] args) {
        // TODO code application logic here
        CArticel b1 = new CArticel("etstste");
        CArticel b2 = new CArticel("te");
        CArticel b3 = new CArticel("edede");
        CArticel b4 = new CArticel("edhtfh");
        CArticel b5 = new CArticel();

        CWarenkorb z1 = new CWarenkorb();

        z1.add(b1);
    }
    */
    
    public static void main(String[] args)
    {
        new CMenu().menu();
    }
}
