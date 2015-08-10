/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.zhaw.mediarus.model;

import ch.zhaw.mediarus.dao.Book;
import ch.zhaw.mediarus.dao.DAO;
import ch.zhaw.mediarus.view.TableView;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author buef
 */
public class TableModel {
    DAO dao;
    TableView tv;

    public TableModel() {
        dao = new DAO();
        tv = new TableView(new String []{"Title", "Author", "Publisher", "Category"});
    }
    
    public void insertBooks(String title, String author, String category) {
        List<Book> list = dao.getBooks(title, author, category);
        for(Book b: list) {
            tv.insertRow(new String[]{b.getTitle(), b.getAuthor(), b.getPublisher(), b.getCategorie()});
        }
    } 
    
    
    
}
