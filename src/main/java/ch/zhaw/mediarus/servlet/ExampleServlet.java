/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.zhaw.mediarus.servlet;

/**
 *
 * @author scnt
 */
import ch.zhaw.mediarus.view.Page;
import ch.zhaw.mediarus.view.TableView;
import ch.zhaw.mediarus.view.View;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.http.HttpStatus;

public class ExampleServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		resp.setStatus(HttpStatus.OK_200);
		
                
                Page page = new Page("Hallo Welt", "css.css");
        
                String [] array = {"Column 1", "Column 2", "Column 3"};
                String [] row1 = {"AA", "AB", "AC"};
                String [] row2 = {"BA", "BB", "BC"};
        
        TableView tv = new TableView(array);
        tv.insertRow(row1);
        tv.insertRow(row2);
        
        page.insertComponent(tv.generateCode());
        
        page.endPage();
        resp.getWriter().println(page.getCode());
	}
}

