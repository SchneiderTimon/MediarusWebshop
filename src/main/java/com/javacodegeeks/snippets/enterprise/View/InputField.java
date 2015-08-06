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
public class InputField extends Component{
    
    String placeholder;
    String type;
    String id;
    
    public InputField() {

        super();
        
        code += "  <div class=\"form-group\">\n"
            +"    <label class=\"sr-only\" for=\"" +id+ "\">"+placeholder+"</label>\n" 
            +"    <input type=\""+type+"\" class=\"form-control\" id=\""+ id +"\" placeholder=\""+placeholder+"\">\n" 
            +"  </div>";
    }
}
