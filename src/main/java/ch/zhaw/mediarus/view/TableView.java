/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.zhaw.mediarus.view;

import ch.zhaw.mediarus.dao.Book;
import ch.zhaw.mediarus.model.TableModel;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author buef
 */
public class TableView extends ContainableView {

    TableModel tm;

    public TableView(TableModel tm) {
        super();
        this.tm = tm;
    }

    @Override
    public void render() {
        pw.print("<div id=\"TableView\">\n"
                + "  <div class=\"form-inline pull-right\">\n"
                + "      <form action=\"#\" method=\"GET\">\n"
                + "          <input type=\"text\" class=\"form-control\" id=\"textInputTitle\" placeholder=\"Title\" name=\"search_input_title\" />\n"
                + "          <input type=\"text\" class=\"form-control\" id=\"textInputAuthor\" placeholder=\"Author\" name=\"search_input_author\" />\n"
                + "          <input type=\"text\" class=\"form-control\" id=\"textInputCategory\" placeholder=\"Category\" name=\"search_input_category\"/>\n"
                + "          <button type=\"submit\" class=\"btn btn-default\" id=\"searchSubmitButton\">Search</button>\n"
                + "      </form>\n"
                + "  </div>\n"
                + "  <table class=\"table table-bordered\">\n"
                + "      <thead>\n"
                + "          <tr>\n");

        for (int i = 0; i < tm.getTitles().length; i++) {
            pw.print("             <th>" + tm.getTitles()[i] + "</th>\n");
        }

        pw.print("            </tr>\n"
                + "      </thead>\n"
                + "      <tbody>\n");
        
        for (Book b : tm.getBooks()) {
            pw.print("           <tr>\n"
                     + "             <th>" + b.getTitle() + "</th>\n"
                    + "              <th>" + b.getAuthor() + "</th>\n"
                    + "              <th>" + b.getPublisher() + "</th>\n"
                    + "              <th>" + b.getCategorie() + "</th>\n"
                    + "                 <th><a class=\"glyphicon glyphicon-info-sign\" href=\"BookController/?book_id=" + b.getId() + "\"></a></th>"
                    + "           </tr>\n");
        }
        
        pw.print("</tbody>\n"
                + "</table>\n"
                + "</div>\n");
    }
}
