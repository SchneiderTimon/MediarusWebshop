/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.zhaw.mediarus.view;

import java.io.PrintWriter;

/**
 *
 * @author scnt
 */
public class View {
    String code;
    
    public View() {
        code="<html>\n"
                + "<head>\n"
                + "     <meta charset=\"utf-8\" />\n"
                + "     <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css\">"
                + "     <title>mediarus</title>\n"
                + "    </head>\n"
                + "<body>\n"
                + " <div class=\"container\">\n"
                + " <h1>Mediarus</h1>";
    }
    
    public void render(PrintWriter pw) {
        code += "</div>"
                + "</body>\n"
                + "</html>";
        pw.print(code);
    }
    
}