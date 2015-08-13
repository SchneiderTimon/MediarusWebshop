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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.eclipse.jetty.http.HttpStatus;

/**
 *
 * @author buef
 */
public class MediarusServlet extends HttpServlet {

    Controller c;

    private static ThreadLocal<HttpServletRequest> req = new ThreadLocal<>();
    private static ThreadLocal<HttpServletResponse> resp = new ThreadLocal<>();

    public static HttpServletRequest getRequest() {
        return req.get();
    }

    public static HttpServletResponse getResp() {
        return resp.get();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setStatus(HttpStatus.OK_200);

        this.req.set(req);
        this.resp.set(resp);
        
        /*
        // Create a session object if it is already not  created.
      HttpSession session = getRequest().getSession(true);
      
        System.out.println("Session: ");
      session.setMaxInactiveInterval(80);
        System.out.println(session.getId());
        System.out.println(session.getMaxInactiveInterval());
        System.out.println("");*/
        

        try {

            String requestedObject = getRequest().getRequestURI();
            requestedObject = requestedObject.replace("/mediarus/", "");
            requestedObject = requestedObject.replace("/", "");
            Class cl = Class.forName("ch.zhaw.mediarus.controller." + requestedObject);
            c = (Controller) cl.newInstance();
            c.setUpContent();
            c.printPage();

        } catch (InstantiationException ex) {
            Logger.getLogger(MediarusServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(MediarusServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MediarusServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
