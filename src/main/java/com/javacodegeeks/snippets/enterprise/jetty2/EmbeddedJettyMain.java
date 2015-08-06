/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javacodegeeks.snippets.enterprise.jetty2;

/**
 *
 * @author scnt
 */
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;



public class EmbeddedJettyMain {

	public static void main(String[] args) throws Exception {

		Server server = new Server(7073);
		ServletContextHandler handler = new ServletContextHandler(server, "/example");
		handler.addServlet(ExampleServlet.class, "/hello world");
		server.start();

	}

}