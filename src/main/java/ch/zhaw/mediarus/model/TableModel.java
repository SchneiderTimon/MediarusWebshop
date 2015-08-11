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
    List<Book> books;

    public TableModel() {
        books = new ArrayList<>();
    }
    
    public void fillList(List<Book> list) {
        books = list;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
