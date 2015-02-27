/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package liste;

import liste.CArticel;
import liste.CWarenkorb;
import liste.CMain;
import liste.CSave;
import liste.CRead;
import liste.CDelete;

/**
 *
 * @author Riverside
 */
public class CMenu {
    
    private CWarenkorb liste;
   
    public CMenu()
    {
        liste = new CWarenkorb();
    }
   
    public void menu()
    {
        int option = -1;
       
        while (option != 0)
        {
            System.out.println("============= Willkommen im EasySh0p ===========");
            System.out.println("0) Beenden");
            System.out.println("1) Artikel einfügen");
            System.out.println("2) Artikel löschen");
            System.out.println("3) Einkaufsliste ausgeben");
            System.out.println("4) Anzahl ändern");
            System.out.println("5) Speichern");
            System.out.println("6) Laden");
            System.out.println("7) Datei löschen");
            System.out.println("================================================");
       
            option = CInput.readInt("Bitte auswählen: ");
           
            switch(option)
            {
            case 0:
                System.out.println("Vielen Dank!");
                break;
           
            case 1:
                einfuegen();
                break;
               
            case 2:
                loeschen();             
                break;
               
            case 3:
                liste.liste();
                break;
               
            case 4:
                Count();
                break;
            case 5:
                liste.saveliste();
                break;
            case 6:
                readlist();
                break;
            case 7:
                del();
                break;
            default:
                System.out.println("Bitte Ziffer von 0 bis 6 eingeben");
            }
        }
       
    }

    private void Count()
    {
        int position = CInput.readInt("Position des Artikels: ");
        CArticel a = liste.getArticel(position);
        if (a != null)
        {
            System.out.println(a.getDescription()
                    + " Preis: " + a.getPrice()
                    + " Anzahl: " + a.getCount());
            int anew = CInput.readInt("neue Anzahl eingeben: ");
            if (anew > 0)
                a.setCount(anew);
            else
                System.out.println("ungültige Anzahl");
        }
        else
            System.out.println("ungültige Position");
    }

    private void loeschen()
    {
        int position = CInput.readInt("Position des Artikels: ");
        liste.remove(position);
    }
    
   
    
    private void einfuegen()
    {
        System.out.println("");
        System.out.println("========== NEUEN ARTIKEL HINZUFÜGEN ============");
        System.out.println("");
        String description = CInput.readText("Bezeichnung: ");
        /*if (description.length() <= 10)
        {
            System.out.println("");
        }
        else
            System.out.println("Bitte Eingabe überprüfen");*/
        float price = CInput.readFloat("Einzelpreis: ");
        int Count = CInput.readInt("Anzahl: ");
        if (description.length() > 0 && price > 0 && Count > 0)
        {
            CArticel a = new CArticel(description);
            a.setPrice(price);
            a.setCount(Count);
            liste.add(a);
        }
        else
            System.out.println("Bitte Eingabe überprüfen");       
    }
    
    private void readlist()
    {
        String file = CInput.readText("Name der lesenden Datei: ");
        CRead saved = new CRead();
        String[] savelist= new String[100];
        int index=0;
        savelist = saved.Read(file);
        //String description="";
        while(savelist[index] != null )
        {
            System.out.println(savelist[index]);
           
        
        
            CArticel a = new CArticel(savelist[index+1]);
            a.setPrice(Float.valueOf(savelist[index+2]));
            a.setCount(Integer.parseInt(savelist[index+3]));
            liste.add(a);
            index=index+4;
        }
      
        /*
        int Count;
                
        CArticel a = new CArticel(description);
        a.setPrice(price);
        a.setCount(Count);
        liste.add(a);*/
    }
    private void del()
    {
        String file = CInput.readText("Name der zulöschenden Datei: ");
        CDelete deleted = new CDelete();
        deleted.delete(file);
        
    }
    
}
