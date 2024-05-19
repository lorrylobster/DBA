/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dbapraktikum.controller;

/**
 *
 * @author lmich
 */

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

@Named(value = "serviceBean")
@SessionScoped //damit Bean während der gesamten Benutzersitzung aktiv

public class serviceBean {
    private static final long serialVersionUID = 1L;
    
}
