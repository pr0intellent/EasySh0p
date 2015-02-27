
package liste;

import java.io.*;

public class CRead {
    
    String[] list = new String[100];
    
    public String[] Read(String file)
    {
        
        String zeile="";
        int index = 0;
        try {
        BufferedReader b = new BufferedReader (new FileReader(file+".txt") );
        while( (zeile = b.readLine()) != null ) { 
             list[index]  = zeile;
             index++;
        }
        b.close();
      }
      catch (IOException e) {
        System.out.println("Fehler: "+e.toString());
      }
        return list;
    }
     
}
