/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.zhaw.mediarus.controller;

import ch.zhaw.mediarus.model.TableModel;
import ch.zhaw.mediarus.view.TableView;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.jetty.http.HttpStatus;

/**
 *
 * @author buef
 */
public class TableController extends HttpServlet{
    String inputTitle;
    String inputAuthor;
    String inputCategory;
    
    

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setStatus(HttpStatus.OK_200);
        
        TableModel tm = new TableModel();
        TableView tv = new TableView(new String []{"Title", "Author", "Publisher", "Category"});
        
        String title = "";
        String author = "";
        String category = "";
        
        if (req.getParameter("search_input_title") != null)
            title = req.getParameter("search_input_title");
        
        if (req.getParameter("search_input_author") != null)
            author = req.getParameter("search_input_author");
        
        if (req.getParameter("search_input_category") != null)
            category = req.getParameter("search_input_category");
        
        tm.insertBooks(title, author, category, tv);
        
        
        tv.render(resp.getWriter());
        
        
    }
    
    
}
