/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package liste;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Riverside
 */
public class CInput {
    
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
   
     /**
     * liest eine Zeile aus der Eingabe.
     * (Die Zeile kann auch leer sein.)
     * @param prompt Eingabeaufforderung
     * @return die gelesene Zeile, null falls ein Fehler auftritt
     */
    public static String readText(String prompt)
    {
        String str = null;
       
        System.out.print(prompt);
        try
        {
            str = reader.readLine();
        } catch (IOException e)
        {
            System.err.println("Fehler: " + e.getMessage());
            str = null;
        }
        return str;
    }
   
   
    /**
     * liest einen Wahrheitswert (true oder false)
     * Die Eingabeaufforderung wird so lange wiederholt, bis der Benutzer true oder false eingibt.
     * @param prompt Eingabeaufforderung
     * @return gelesener Wahrheitswert
     */
    public static boolean readBoolean(String prompt)
    {
        boolean bool = false;
        boolean ok = false;
        while(!ok)
        {
            String line = readText(prompt);
            if ("true".equals(line.trim()))
            {
                bool = true;
                ok = true;
            }
            else if ("false".equals(line.trim()))
            {
                bool = false;
                ok = true;
            }
            else
                System.out.println("Bitte \"true\" oder \"false\" eingeben");
               
        }
       
        return bool;
    }
   
    /**
     * liest ein Zeichen (char)
     * Die Eingabeaufforderung wird so lange wiederholt, bis der Benutzer ein einzelnes Zeichen eingibt.
     * @param prompt Eingabeaufforderung
     * @return gelesenes Zeichen
     */
    public static char readChar(String prompt)
    {
        char zeichen = ' ';
        boolean ok = false;
        while(!ok)
        {
            String line = readText(prompt);
            if (line != null && line.length() == 1)
            {
                zeichen = line.charAt(0);
                ok = true;
            }
            else
                System.out.println("Bitte einzelnes Zeichen eingeben (dann ENTER)");
        }
       
        return zeichen;
    }   
   
    /**
     * liest eine Ganznumber (int)
     * Die Eingabeaufforderung wird so lange wiederholt, bis der Benutzer eine number eingibt.
     * @param prompt Eingabeaufforderung
     * @return die gelesene number
     */
    public static int readInt(String prompt)
    {
        int number = 0;
        boolean ok = false;
        while(!ok)
        {
            try
            {
                number = Integer.parseInt(readText(prompt));
                ok = true;
            }
            catch(NumberFormatException e)
            {
                System.out.println("Bitte Ganznumber eingeben");
            }
        }
       
        return number;
    }
   
   
    /**
     * liest eine Ganznumber (long)
     * Die Eingabeaufforderung wird so lange wiederholt, bis der Benutzer eine number eingibt.
     * @param prompt Eingabeaufforderung
     * @return die gelesene number
     */
    public static long readLong(String prompt)
    {
        long number = 0;
        boolean ok = false;
        while(!ok)
        {
            try
            {
                number = Long.parseLong(readText(prompt));
                ok = true;
            }
            catch(NumberFormatException e)
            {
                System.out.println("Bitte Ganzzahl eingeben");
            }
        }
        return number;
    }
   
    
    /**
     * liest eine Gleitkommanumber (float)
     * Die Eingabeaufforderung wird so lange wiederholt, bis der Benutzer eine number eingibt.
     * @param prompt Eingabeaufforderung
     * @return die gelesene number
     */
    public static float readFloat(String prompt)
    {
        float number = 0;
        boolean ok = false;
        while(!ok)
        {
            try
            {
                number = Float.parseFloat(readText(prompt));
                ok = true;
            }
            catch(NumberFormatException e)
            {
                System.out.println("Bitte Dezimalnumber eingeben");
            }
        }       
        return number;
    }
   
   
    /**
     * liest eine Gleitkommanumber (double)
     * Eingabeaufforderung wird so lange wiederholt, bis number eingegeben wird.
     * @param prompt Eingabeaufforderung
     * @return die gelesene number
     */
    public static double readDouble(String prompt)
    {
        double number = 0;
        boolean ok = false;
        while(!ok)
        {
            try
            {
                number = Double.parseDouble(readText(prompt));
                ok = true;
            }
            catch(NumberFormatException e)
            {
                System.out.println("Bitte Dezimalnumber eingeben");
            }
        }
       
        return number;
    }
    
}