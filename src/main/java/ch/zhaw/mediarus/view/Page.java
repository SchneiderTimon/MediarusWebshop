/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.zhaw.mediarus.view;

import java.io.PrintWriter;
import java.util.List;

/**
 *
 * @author scnt
 */
public class Page extends View{
    List<ContainableView> content;
    
    public Page(List<ContainableView> content) {
        this.content = content;
    }
    
    public void beginRender(PrintWriter pw) {
        
    }
    
    public void endRender() {
        
    }
    
    @Override
    public void render(PrintWriter pw) {
        pw.print("<html>\n"
                + "<head>\n"
                + "     <meta charset=\"utf-8\" />\n"
                + "     <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css\">"
                + "     <title>mediarus</title>\n"
                + "    </head>\n"
                + "<body>\n"
                + " <div class=\"container\">\n"
                + " <h1 class=\"text-center\">Mediarus</h1>\n");
        
        for(ContainableView cv: content) {
            cv.render(pw);
        }
        
        pw.print("</div>"
                + "</body>\n"
                + "</html>\n");
    }
    
    
    
}