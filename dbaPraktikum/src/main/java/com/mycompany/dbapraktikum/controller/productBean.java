/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dbapraktikum.controller;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.servlet.http.HttpSession;
import java.io.Serializable;
import util.LoginDAO;
import util.Util;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

@Named(value = "productBean")
@SessionScoped
/**
 *tessst
 * @author lmich
 */
public class productBean implements Serializable{
    private static final long serialVersionUID = 1L;
    private String password;
    private String message, uname;


}

