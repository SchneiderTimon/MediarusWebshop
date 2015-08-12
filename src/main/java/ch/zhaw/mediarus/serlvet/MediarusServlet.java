/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.zhaw.mediarus.serlvet;

import ch.zhaw.mediarus.controller.BookController;
import ch.zhaw.mediarus.controller.Controller;
import ch.zhaw.mediarus.controller.TableController;
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
public class MediarusServlet extends HttpServlet{
    Controller c;
    

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setStatus(HttpStatus.OK_200);
        

        
        
        
        if(req.getRequestURI().equals("/mediarus/")) {
            c = new TableController(req, resp);
            c.setUpContent();
            c.printPage();
        }
        
        else if(req.getRequestURI().equals("/mediarus/book/")) {
            c = new BookController(req, resp);
            c.setUpContent();
            c.printPage();
        }
        
    }
    
    
}
