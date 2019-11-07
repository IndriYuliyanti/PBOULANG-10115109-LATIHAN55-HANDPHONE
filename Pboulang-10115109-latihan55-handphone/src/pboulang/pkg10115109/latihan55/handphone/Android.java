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
public class Android extends Handphone {
    private String keyStore;
    
    public Android(String manufacture, String operatingSystem, String model, int harga){
        super(manufacture, operatingSystem, model, harga);
    }
    String keystore = "234ibfd3840fo";
    
    Handphone h = new Handphone();
    
    Android() {
    }

    public String getKeyStore() {
        return keyStore;
    }

    public void setKeyStore(String keyStore) {
        this.keyStore = keyStore;
    }

    
    
    
    }

