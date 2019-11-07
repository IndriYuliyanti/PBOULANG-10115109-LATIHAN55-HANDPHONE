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
public class Blackberry extends Handphone{
    private String pinBB;
    
    public Blackberry(String manufacture, String operatingSystem, String model, int harga){
        super(manufacture, operatingSystem, model, harga);
    }
    
    String pinbb = "BHS429";
    
    Handphone h = new Handphone();

    public String getPinBB() {
        return pinBB;
    }

    public void setPinBB(String pinBB) {
        this.pinBB = pinBB;
    }
    
    
    }
    

