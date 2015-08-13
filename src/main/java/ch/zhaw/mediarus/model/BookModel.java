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
public class BookModel extends Model{
    private Book b;

    public BookModel(Book book) {
        this.b = book;
    }
    public String[] getTitles() {
        return new String[] {"Title", "Author", "Publisher", "Release_date", "Language", "Weight", "ISBN", "Number of Pages", "Category", "Price"};
    }
    
    public String[] getValues() {
        return new String [] {b.getTitle(), b.getAuthor(), b.getPublisher(), b.getReleaseDate(), b.getLanguage(), b.getWeight(), b.getISBN(), b.getNumberOfPages()+"", b.getCategorie(), b.getPrice()+""};
    }

    public Book getB() {
        return b;
    }

    public void setB(Book b) {
        this.b = b;
    }
    
    
    
}
