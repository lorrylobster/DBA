/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dbapraktikum;

import java.io.Serializable;
/**
 *
 * @author lmich
 */
public class Produkte implements Serializable{
    private Integer pID;
    private String pName;
    private float pPreis;
    
    public Produkte(){
        
    }
    
    public Produkte(int id, String name, float preis){
        this.pID = id;
        this.pName = name;
        this.pPreis = preis;
    }
    
    public int getPid (){
        return pID;
    }
    
    public void setPid(int pid){
        this.pID = pid;
    }
    
    public String getPname(){
        return pName;
    }
            
    public void setPname(String pname){
        this.pName = pname;
    }
    
    public float getPreis(){
        return pPreis;
    }
    
    public void setPpreis(float ppreis){
        this.pPreis = ppreis;
    }
}
