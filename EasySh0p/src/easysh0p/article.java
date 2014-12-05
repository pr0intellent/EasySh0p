/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easysh0p;

/**
 *
 * @author Michel
 */
public class article {
    private double number=0;
    private String name=" ";
    private boolean done=false;
    private double priceper= 0;
    private double price=0;
    
    public void setNumber(double num)
    {
        number=num;
    }
    public double getNumber()
    {
        return number;
    }
   public void setName(String newname)
    {
        name=newname;
    }
    public String getName()
    {
        return name;
    }
    public void setDone(boolean newdone)
    {
        done=newdone;
    }
    public boolean getDone()
    {
        return done;
    }
    public void setPriceper(double newpriceper)
    {
        priceper=newpriceper;
    }
    public double getPriceper()
    {
        return priceper;
    }
    public void setPrice(double newprice)
    {
        price=newprice;
    }
    public double getPrice()
    {
        return price;
    }
}
