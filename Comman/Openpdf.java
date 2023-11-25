/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comman;

import javax.swing.JOptionPane;
import Connections.pharmacyUtils;
import java.io.File;
/**
 *
 * @author MAYUR K
 */
public class Openpdf {
    public static void openById(String id)
    {
    try{
        
      if((new File(pharmacyUtils.billPath+id+"pdf")).exists())
      {
          Process p = Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+pharmacyUtils.billPath+""+id+".pdf");
      }           
      else{
        JOptionPane.showMessageDialog(null, "file does not exists");
      }
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null, e);
    }
    }
}
