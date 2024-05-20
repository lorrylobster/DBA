/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dbapraktikum;

/**
 *
 * @author lmich
 */
import java.io.Serializable;
import java.util.List;
public class Warenkorb implements Serializable {
    
    private int wID;
    private List wProduktliste;
    private float wPreisTotal;
    
    public Warenkorb(){
        
    }
    
    public Warenkorb(int id, List liste, float preistotal){
        this.wID = id;
        this.wProduktliste = liste;
        this.wPreisTotal = preistotal;
    }
    
    public Integer getWid(){
        return wID;
    }
    
    public void setWid(int id){
        this.wID = id;
    }            
    
    public List getWproduktliste(){
        return wProduktliste;
    }
    
    public void setWproduktliste(List liste){
        this.wProduktliste = liste;
    }
    
    public float getWpreistotal(){
        return wPreisTotal;
    }
    
    public void setWpreistotal(float preistotal){
        this.wPreisTotal = preistotal;
    }
            
}
