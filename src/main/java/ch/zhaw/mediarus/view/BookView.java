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
public class BookView extends View{

    public BookView(String[] titles, String[] values) {
        super();
        code += "<div id=\"BookView\" class=\"col-md-6\">\n"
                + "<h2>"+ values[0] + "</h2>"
                +"  <table class=\"table table-bordered\">\n"
                + "     <tbody>\n";
        
        for(int i = 1; i < titles.length; i++) {
            code+="          <tr>\n"
                    +"             <th>"+titles[i]+"</th>\n"
                    +"              <th>"+values[i]+"</th>\n"
                    +"      </tr>\n";
        }
        code += "     </tbody>\n"
                + "</table>\n"
                +"  <div class=\"form-inline pull-right\">\n"
                +"      <form action=\"bucket\" method=\"GET\">\n"
                +"          <button type=\"submit\" class=\"btn btn-default\" id=\"buyButton\">Add to Bucket</button>\n"
                +"      </form>\n"
                +"  </div>\n"
                + "</div>\n";
    }
    
    
}
