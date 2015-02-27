/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liste;
import java.io.File;
/**
 *
 * @author Michel
 */
public class CDelete {
   public void delete(String file) {
    File datei = new File(file+".txt");
    if (datei.exists()) {
      datei.delete();
      System.out.println("Datei gelöscht!");
    }
  }
}
