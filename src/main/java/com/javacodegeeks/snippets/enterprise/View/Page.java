/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javacodegeeks.snippets.enterprise.View;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author scnt
 */
public class Page extends Component {

    

    public Page() {
        super();

    }

    public void beginPage(String title, String css) {
        code =" <html>\n"
                + "<head>\n"
                + "<meta charset=\"utf-8\">\n"
                + "<title>"+ title +"</title>\n"
                + "<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css\">\n"
        + "</head>\n"
        + "<body>\n";
    }
    
    
    public void endPage(){
        code += "</body>\n "
                + "</html>";
    }

    public static void main(String[] args) {
        Page page = new Page();
        
        page.beginPage("Hallo", "Kuuhl");
        
        Button button = new Button("hello", "input", "1");
        
        page.add(button);
        
        page.endPage();
        
        System.out.println(page.code);
    }
}
