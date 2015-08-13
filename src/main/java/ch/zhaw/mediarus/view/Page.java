/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.zhaw.mediarus.view;

import ch.zhaw.mediarus.serlvet.MediarusServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 *
 * @author scnt
 */
public class Page extends View {

    List<ContainableView> content;

    public Page(List<ContainableView> content) throws IOException {
        super();
        this.content = content;
    }

    public void beginRender(PrintWriter pw) {

    }

    public void endRender() {

    }

    @Override
    public void render() {
        pw.print("<html>\n"
                + "<head>\n"
                + "     <meta charset=\"utf-8\" />\n"
                + "     <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css\">"
                + "     <title>mediarus</title>\n"
                + "    </head>\n"
                + "<body>\n"
                + "<div class=\"container\">\n"
                + "<nav class=\"navbar navbar-default navbar-static-top\">\n"
                + "	<div class=\"container\">\n"
                + "         <div class=\"navbar-header\">"
                + "             <a class=\"navbar-brand\" href=\"#\">MediaRus</a>"
                + "         </div>"
                + "         <ul class=\"nav navbar-nav\">\n"
                + "             <li><a href=\"/mediarus/HomeController/\">Home</a></li>\n"
                + "             <li><a href=\"/mediarus/TableController/\">Books</a></li>\n"
                + "             <li><a class=\"glyphicon glyphicon-shopping-cart\" href=\"#\"></a></li>\n"
                + "         </ul>\n"
                + "         <ul class=\"nav navbar-icon navbar-right\">"        
                + "         </ul>"
                + "	</div>"
                + "</nav>");

        for (ContainableView cv : content) {
            cv.render();
        }

        pw.print("</div>"
                + "</body>\n"
                + "</html>\n");
    }

}
