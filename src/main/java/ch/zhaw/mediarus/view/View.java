/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.zhaw.mediarus.view;

import ch.zhaw.mediarus.serlvet.MediarusServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author buef
 */
public class View {
    protected PrintWriter pw;
    
    public View(){
        try {
            pw = MediarusServlet.getResp().getWriter();
        } catch (IOException ex) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    
    
    protected void render() {

    }
}
