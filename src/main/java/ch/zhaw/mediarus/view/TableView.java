/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.zhaw.mediarus.view;

import ch.zhaw.mediarus.dao.Book;
import ch.zhaw.mediarus.model.TableModel;
import java.io.PrintWriter;

/**
 *
 * @author buef
 */
public class TableView extends View{

    public TableView(String[] columnTitles, TableModel tm) {
        super();
        code += "<div id=\"TableView\">\n"
                +"  <div class=\"form-inline pull-right\">\n"
                +"      <form action=\"#\" method=\"GET\">\n"
                +"          <input type=\"text\" class=\"form-control\" id=\"textInputTitle\" placeholder=\"Title\" name=\"search_input_title\" />\n"
                +"          <input type=\"text\" class=\"form-control\" id=\"textInputAuthor\" placeholder=\"Author\" name=\"search_input_author\" />\n"
                +"          <input type=\"text\" class=\"form-control\" id=\"textInputCategory\" placeholder=\"Category\" name=\"search_input_category\"/>\n"
                +"          <button type=\"submit\" class=\"btn btn-default\" id=\"searchSubmitButton\">Search</button>\n"
                +"      </form>\n"
                +"  </div>\n"
                +"  <table class=\"table table-bordered\">\n"
                +"      <thead>\n"
                +"          <tr>\n";
        
        for(int i = 0; i < columnTitles.length; i++)
            code+="             <th>"+columnTitles[i]+"</th>\n";
        
        code +="            </tr>\n"
                +"      </thead>\n"
                +"      <tbody>\n";
        
        

        for(Book b: tm.getBooks()) {
            code += "           <tr>\n";
            code+="             <th>"+b.getTitle()+"</th>\n"
                +"              <th>"+b.getAuthor()+"</th>\n"
                +"              <th>"+b.getPublisher()+"</th>\n"
                +"              <th>"+b.getCategorie()+"</th>\n"
                +"                 <th><a class=\"glyphicon glyphicon-info-sign\" href=\"book/?book_id="+ b.getId() +"\"></a></th>";
            code += "           </tr>\n";
        }
        
     
        
    }

    
    public void closeTable() {
        code+= "</tbody>\n"
                + "</table>\n"
                + "</div>\n";
    }
}
