/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package liste;

import liste.CArticel;
import java.util.ArrayList;

/**
 *
 * @author Riverside
 */
public class CWarenkorb {
    
    private ArrayList<CArticel> liste = new ArrayList<CArticel>();
   
    public CWarenkorb()
    {
        
    }
   
    public void add(CArticel a)
    {
        liste.add(a);
    }
   
    public void remove(int position)
    {
        if (position > 0 && position <= liste.size())
            liste.remove(position-1);
        else
            System.out.println("ungültige Position");
    }
   
    public CArticel getArticel(int position)
    {
        if (position > 0 && position <= liste.size())
            return liste.get(position-1);
        else
            return null;
    }
   
    public void liste()
    {
        System.out.println("");
        System.out.println("Position\tBezeichnung\t\tPreis\tAnzahl\tGesamtpreis");
        System.out.println("---------------------------------------------------------------");
        float zsumme = 0;
        float summe = 0;
        for (int i = 0; i < liste.size(); i++)
        {
            CArticel a = liste.get(i);
            zsumme = a.getPrice() * a.getCount();
            System.out.println((i+1)
                    + "\t\t" + a.getDescription()
                    + "\t\t\t" + a.getPrice()
                    + "\t" + a.getCount()
                    + "\t" + zsumme);
            summe += a.getPrice() * a.getCount();
        }
        System.out.println("---------------------------------------------------------------");
        System.out.println("Gesamtpreis Einkauf:\t" + summe); 
        System.out.println("");
    }
}
