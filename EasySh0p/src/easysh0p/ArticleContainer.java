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

public class ArticleContainer {
    List<article> articles = new ArrayList<article>();
    public void addArticlesToList(double Number, String Name, boolean Done, double Priceper, double Price)
    {
        article newarticle = new article();
        newarticle.setNumber(Number);
        newarticle.setName(Name);
        newarticle.setDone(Done);
        newarticle.setPriceper(Priceper);
        newarticle.setPrice(Price);
        articles.add (newarticle);
      
    }
    public void sortArticleList()
    {
        Collections.sort(articles);
    }     
}
