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
import ch.zhaw.mediarus.serlvet.MediarusServlet;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;



public class EmbeddedJettyMain {

	public static void main(String[] args) throws Exception {

		Server server = new Server(7073);
		ServletContextHandler handler = new ServletContextHandler(server, "/mediarus");
		handler.addServlet(MediarusServlet.class, "/");
		server.start();

	}

}