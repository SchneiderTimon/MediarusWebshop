/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.zhaw.mediarus.controller;

import ch.zhaw.mediarus.dao.DAO;
import ch.zhaw.mediarus.model.BookModel;
import ch.zhaw.mediarus.model.TableModel;
import ch.zhaw.mediarus.view.BookView;
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
public class BookController extends HttpServlet{
    
    

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setStatus(HttpStatus.OK_200);
        
        DAO dao = new DAO();
        
        BookModel bm = new BookModel(dao.getBookByID(Integer.parseInt(req.getParameter("book_id"))));
        
        BookView bv = new BookView(bm);
        
        
        
        bv.render(resp.getWriter());    
        
    }
    
    
}
