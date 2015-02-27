package liste;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;



public class CSave {
  
    FileWriter writer;
    File file;
    
  
  public void Save(String savename,int pos,String description,float price,int count,float zsumme)
  {
    // File anlegen
     file = new File(savename+".txt");
     try {
       // new FileWriter(file ,true) - falls die Datei bereits existiert
       // werden die Bytes an das Ende der Datei geschrieben
       
       // new FileWriter(file) - falls die Datei bereits existiert
       // wird diese überschrieben
       writer = new FileWriter(file ,true);
       
       // Text wird in den Stream geschrieben
       
       // Platformunabhängiger Zeilenumbruch wird in den Stream geschrieben
       writer.write(System.getProperty("line.separator")); 
       
       
       writer.write
        (
                /*pos                 +System.getProperty("line.separator")
                +*/ 
                description         +System.getProperty("line.separator")
                + price             +System.getProperty("line.separator")
                + count             +System.getProperty("line.separator")
                /*+ zsumme*/
        );
       
      
       // Schreibt den Stream in die Datei
       // Sollte immer am Ende ausgeführt werden, sodass der Stream 
       // leer ist und alles in der Datei steht.
       writer.flush();
       
       // Schließt den Stream
       writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  
}