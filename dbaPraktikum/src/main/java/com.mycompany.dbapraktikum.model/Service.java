/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum.model;

import java.io.Serializable;
/**
 *
 * @author lmich
 */
public class Service implements Serializable{
    private Integer sID;
    private String sName;
    private float sPreis;
    
    public Service(){
        
    }
    
    public Service(int id, String name, float preis){
        this.sID = id;
        this.sName = name;
        this.sPreis = preis;
    }
    
    public Integer getSid (){
        return sID;
    }
            
    public void setSid(int sid){
        this.sID = sid;
    }
    
    public String getSname(){
        return sName;
    }
    
    public void setSname(String sname){
        this.sName = sname;
    }
    
    public float getSpreis (){
        return sPreis;
    }
    
    public void setSpreis(float spreis){
        this.sPreis = spreis;
    }
}
