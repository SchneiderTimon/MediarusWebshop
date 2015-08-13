/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.zhaw.mediarus.controller;

import ch.zhaw.mediarus.model.BookModel;
import ch.zhaw.mediarus.serlvet.MediarusServlet;
import ch.zhaw.mediarus.view.BookView;
import ch.zhaw.mediarus.view.HomeView;

/**
 *
 * @author buef
 */
public class HomeController extends Controller{

    public HomeController() {
        super();
    }
    
    @Override
    public void setUpContent() {
         HomeView bv = new HomeView();
         content.add(bv);
    }
    
}
