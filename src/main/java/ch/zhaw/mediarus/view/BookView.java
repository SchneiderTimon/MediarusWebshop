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
public class BookView extends ContainableView{
    BookModel bm;

    public BookView(BookModel bm) {
        this.bm = bm;
    }
    
    @Override
    public void render() {
        pw.print("<div id=\"BookView\" class=\"col-md-6 col-md-offset-3\">\n"         
                +"<div class=\"form-inline\">\n"
                
                + " <h2 class=\"text-center\">"+ bm.getValues()[0] + "</h2>\n"
                +"<a style=\"font-size: 35px;\"class=\"glyphicon glyphicon-chevron-left pull-left\" href=\"/mediarus/BookController/?book_id=" + (bm.getB().getId()-1) + "\"></a>\n"
                +"<a style=\"font-size: 35px;\"class=\"glyphicon glyphicon-chevron-right pull-right\" href=\"/mediarus/BookController/?book_id=" + (bm.getB().getId()+1) + "\"></a>\n"
                + "</div>\n"
                + "<br>\n"
                + "<br>\n"
                +"  <table class=\"table table-bordered\">\n"
                + "     <tbody>\n");
        
        for(int i = 1; i < bm.getTitles().length; i++) {
            pw.print("          <tr>\n"
                    +"             <th class=\"col-md-4\">"+bm.getTitles()[i]+"</th>\n"
                    +"              <th class=\"col-md-8\">"+bm.getValues()[i]+"</th>\n"
                    +"      </tr>\n");
        }
        pw.print("     </tbody>\n"
                + "</table>\n"
                +"  <div class=\"form-inline pull-left\">\n"
                +"      <form action=\"/mediarus/TableController/\" method=\"GET\">\n"
                +"          <button type=\"submit\" class=\"btn btn-default\" id=\"buyButton\">Back</button>\n"
                +"      </form>\n"
                +"  </div>\n"
                +"  <div class=\"form-inline pull-right\">\n"
                +"      <form action=\"/mediarus/bucket/\" method=\"GET\">\n"
                +"          <button type=\"submit\" class=\"btn btn-default\" id=\"buyButton\">Add to Bucket</button>\n"
                +"      </form>\n"
                +"  </div>\n"
                + "</div>\n");
    }
    
    
}
