/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javacodegeeks.snippets.enterprise.View;


/**
 *
 * @author buef
 */
public class FormInline extends Component{
    String id;
    
    public FormInline (String id) {
        super();
        code += "<form class=\"form-inline\">";
    }
    
    public void endFormInline() {
        code += "</form>";
    }
}
