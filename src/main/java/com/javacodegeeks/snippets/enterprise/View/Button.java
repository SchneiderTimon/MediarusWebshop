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
public class Button extends Component{
    
    
    String value;
    String type;
    String id;
    
    public Button(String value, String type, String id){
        code += "<button id=\""+id+"\" type="+ type +" class=\"btn btn-default\">\"" +value+ "\"</button>\n";
    }

    
}
