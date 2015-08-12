/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.zhaw.mediarus.controller;

import ch.zhaw.mediarus.dao.DAO;
import ch.zhaw.mediarus.model.Model;
import ch.zhaw.mediarus.view.ContainableView;
import ch.zhaw.mediarus.view.Page;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author buef
 */
public class Controller {

    DAO dao;
    
    List<ContainableView> content;
    
    public Controller() {

        this.dao = new DAO();
        
        this.content = new ArrayList<>();
    }
    
    public void setUpContent() {
        
    }
    
    public void printPage() throws IOException {
        Page p = new Page(content);
        p.render();
    }
}
