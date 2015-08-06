/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javacodegeeks.snippets.enterprise.View;

/**
 *
 * @author scnt
 */
public class Component {
    String code;
    
    public Component() {
        code="";
    }
    
    public String getCode() {
        return code;
    }
    
    public void add(Component comp) {
        code += comp.getCode();
    }
}