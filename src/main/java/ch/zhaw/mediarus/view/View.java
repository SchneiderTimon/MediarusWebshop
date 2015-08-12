/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.zhaw.mediarus.view;

import ch.zhaw.mediarus.serlvet.MediarusServlet;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author buef
 */
public class View {
    Page p;
    PrintWriter pw;
    
    public View() throws IOException {
        pw = MediarusServlet.getResp().getWriter();

    }
    
    
    
    protected void render() {

    }
}
