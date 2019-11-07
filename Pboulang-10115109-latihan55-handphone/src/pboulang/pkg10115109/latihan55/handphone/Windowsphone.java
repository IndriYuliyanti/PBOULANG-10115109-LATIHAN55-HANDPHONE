/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10115109.latihan55.handphone;

/**
 *
 * @author User
 */
public class Windowsphone extends Handphone{
    private String wpKeyStore;
    
    
    public Windowsphone(String manufacture, String operatingSystem, String model, int harga ){
        super(manufacture, operatingSystem, model , harga);
    }
       String wpkeystore = "UUUQIWORJ";
       
       Handphone h = new Handphone();
       public String getWpKeyStore(){
           return wpKeyStore;
       }
       
       public void setWpKeyStore(String wpKeyStore){
           this.wpKeyStore = wpKeyStore;
        
    }
    
    
}
