/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.zhaw.mediarus.model;

import ch.zhaw.mediarus.dao.Book;
import ch.zhaw.mediarus.dao.DAO;

/**
 *
 * @author buef
 */
public class BookModel {
    DAO dao;

    public BookModel() {
        dao = new DAO();
    }
    
    public String[] getTitles() {
        return new String[] {"Title", "Author", "Publisher", "Release_date", "Language", "Weight", "ISBN", "Number of Pages", "Category"};
    }
    
    public String[] getValues(int id) {
        Book b = dao.getBookByID(id);
        return new String [] {b.getTitle(), b.getAuthor(), b.getPublisher(), b.getReleaseDate(), b.getLanguage(), b.getWeight(), b.getISBN(), b.getNumberOfPages()+"", b.getCategorie()};
    }
    
}
