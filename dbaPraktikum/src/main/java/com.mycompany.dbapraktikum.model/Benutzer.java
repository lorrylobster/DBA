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
public class Benutzer implements Serializable{
    private Integer bID;
    private String bVorname;
    private String bNachname;
    private Integer bGeburtstag;
    private String bEmail;
    private String bSalutation;
    
    public Benutzer (){
    }
    
    public Benutzer (int id, String vorname, String nachname, int geburtstag, String mail, String salutation)
    {
        this.bID = id;
        this.bVorname = vorname;
        this.bNachname = nachname;
        this.bGeburtstag = geburtstag;
        this.bEmail = mail;
        this.bSalutation = salutation;
    }
    
    public Integer getBid() {
        return bID;
    }

    public void setBid(Integer bID) {
        this.bID = bID;
    }
    
    public String getBvorname() {
        return bVorname;
    }

    public void setBvorname(String bvorname) {
        this.bVorname = bvorname;
    }
    
    public String getBnachname() {
        return bNachname;
    }

    public void setBnachname(String bnachname) {
        this.bNachname = bnachname;
    }
    
    public Integer getBgeburtstag() {
        return bGeburtstag;
    }

    public void setBgeburtstag(Integer bgeburtstag) {
        this.bGeburtstag = bgeburtstag;
    }
    
    public String getBmail() {
        return bEmail;
    }

    public void setBmail(String bmail) {
        this.bEmail = bmail;
    }
    
    public String getBsalutation() {
        return bSalutation;
    }

    public void setBsalutationl(String bsalutation) {
        this.bSalutation = bsalutation;
    }
    
    
    //hier kommen noch Overrides hin (s.Publisher pojo in Template Input Button)
}


