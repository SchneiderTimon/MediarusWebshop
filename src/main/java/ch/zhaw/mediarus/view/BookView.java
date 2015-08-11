/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.zhaw.mediarus.view;

import ch.zhaw.mediarus.model.BookModel;

/**
 *
 * @author buef
 */
public class BookView extends View{

    public BookView(BookModel bm) {
        super();
        code += "<div id=\"BookView\" class=\"col-md-6\">\n"
                + "<h2>"+ bm.getValues()[0] + "</h2>"
                +"  <table class=\"table table-bordered\">\n"
                + "     <tbody>\n";
        
        for(int i = 1; i < bm.getTitles().length; i++) {
            code+="          <tr>\n"
                    +"             <th>"+bm.getTitles()[i]+"</th>\n"
                    +"              <th>"+bm.getValues()[i]+"</th>\n"
                    +"      </tr>\n";
        }
        code += "     </tbody>\n"
                + "</table>\n"
                +"  <div class=\"form-inline pull-right\">\n"
                +"      <form action=\"../bucket/\" method=\"GET\">\n"
                +"          <button type=\"submit\" class=\"btn btn-default\" id=\"buyButton\">Add to Bucket</button>\n"
                +"      </form>\n"
                +"  </div>\n"
                + "</div>\n";
    }
    
    
}
