/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch.zhaw.mediarus.view;
/**
 *
 * @author buef
 */
public class Page extends View{


    public Page(String title, String css) {
        code += "<html>\n"
                + "<head>\n"
                + "     <meta charset=\"utf-8\" />\n"
                + "	<link rel=\"stylesheet\" type=\"text/css\" href=\"" + css + "\" />\n"
                + "     <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css\">"
                + "     <title>"+ title +"</title>\n"
                + "    </head>\n"
                + "<body>\n"
                + "<div class=\"container\">\n"
                + "<h1>Mediarus</h1>";
    }
    
    public void insertComponent(String v) {
        code += v;
    }
    
    

    
    public void endPage() {
        code += "</div>"
                + "</body>\n"
                + "</html>";
    }

    
}


