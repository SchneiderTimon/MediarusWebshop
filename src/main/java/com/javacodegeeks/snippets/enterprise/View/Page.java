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
public class Page extends Component{


    public Page(String title, String css) {
        code += "<html>\n"
                + "<head>\n"
                + "     <meta charset=\"utf-8\" />\n"
                + "	<link rel=\"stylesheet\" type=\"text/css\" href=\"" + css + "\" />\n"
                + "     <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css\">"
                + "     <title>"+ title +"</title>\n"
                + "    </head>\n"
                + "<body>\n";
    }
    
    

    
    public void endPage() {
        code += "</body>\n"
                + "</html>";
    }
    
    
    public static void main(String[] args) {
        Page page = new Page("Hallo Welt", "css.css");
        
        
        page.endPage();
        
        
    }
}


