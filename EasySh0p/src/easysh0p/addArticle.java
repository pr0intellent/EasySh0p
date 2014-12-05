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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class addArticle {
    
    public void addArticlesToList(double Number, String Name, boolean Done, double Priceper, double Price)
    {
        article artikel = new article();
        artikel.setNumber(Number);
        artikel.setName(Name);
        artikel.setDone(Done);
        artikel.setPriceper(Priceper);
        artikel.setPrice(Price);
        List<article> artikels = new ArrayList<article>();
        artikels.add (artikel);
      
    }
    public void sortArticleList(List artikels)
    {
        Collections.sort(artikels);
    }     
}
    

