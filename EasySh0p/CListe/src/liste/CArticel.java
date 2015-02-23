/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package liste;

/**
 *
 * @author Riverside
 */
public class CArticel {
    private String description;
    private float price;
    private int Count;
   
   
    public CArticel(String description)
    {
        this.description = description;
    }
    
    public int getCount()
    {
        return Count;
    }


    public void setCount(int Count)
    {
        if (Count > 0)
            this.Count = Count;
        else
            System.out.println("Anzahl muss > 0 sein");
    }


    public float getPrice()
    {
        return price;
    }


    public void setPrice(float price)
    {
        if (price > 0)
            this.price = price;
        else
            System.out.println("Der Preis muss > 0 sein");
    }


    public String getDescription()
    {
        return description;
    }
   
}
