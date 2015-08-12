/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.zhaw.mediarus.controller;

import ch.zhaw.mediarus.dao.DAO;
import ch.zhaw.mediarus.model.TableModel;
import ch.zhaw.mediarus.serlvet.MediarusServlet;
import ch.zhaw.mediarus.view.ContainableView;
import ch.zhaw.mediarus.view.TableView;
import ch.zhaw.mediarus.view.Page;
import ch.zhaw.mediarus.view.View;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.jetty.http.HttpStatus;

/**
 *
 * @author buef
 */
public class TableController extends Controller{

    
    String title;
    String author;
    String category;
    
    

    public TableController() {
        super();
                
        title = "";
        author = "";
        category = "";
        
        if (MediarusServlet.getRequest().getParameter("search_input_title") != null)
            title = MediarusServlet.getRequest().getParameter("search_input_title");
        
        if (MediarusServlet.getRequest().getParameter("search_input_author") != null)
            author = MediarusServlet.getRequest().getParameter("search_input_author");
        
        if (MediarusServlet.getRequest().getParameter("search_input_category") != null)
            category = MediarusServlet.getRequest().getParameter("search_input_category");
        
    }

    
    @Override
    public void setUpContent() {
        TableModel tm = new TableModel();
        tm.fillList(dao.getBooks( title, author, category));
        TableView tv = new TableView(tm);
        content.add(tv);
    }
    
    
}
