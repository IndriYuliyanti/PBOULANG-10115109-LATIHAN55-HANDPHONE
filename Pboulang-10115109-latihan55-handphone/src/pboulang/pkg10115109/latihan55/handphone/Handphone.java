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
public class Handphone {
   protected String manufacture;
   protected String operatingSystem;
   protected String model;
   protected int harga;
   
   public Handphone(String manufacture, String operatingSystem, String model, int harga){
       this.manufacture = manufacture;
       this.operatingSystem = operatingSystem;
       this.model = model;
       this.harga = harga;
   }
   
   Handphone(){
       
   }
   public void displayProduct(){
       System.out.println("Manufacture :"+manufacture);
        System.out.println("OS :"+operatingSystem);
         System.out.println("model :"+model);
          System.out.println("Harga :"+harga);
   }
   
   public void Inputdata(String m, String o, String mod, String h){
      manufacture(m);
      operatingSystem(o);
      model(mod);
      harga(h);
      
   }
   
   private void operatingSystem(String o ){
   }
   
   private void manufacture(String m){
   }
   
   private void model(String mod){
   }
   
   private void harga (String h){
   }
   
       
    
   }

