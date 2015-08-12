package ch.zhaw.mediarus.dao;


import java.awt.BorderLayout;
import java.sql.PreparedStatement;

import java.sql.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * Created by buef on 05.08.2015.
 */
public class DAO {

    private Connection conn = null;
    private Statement st = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet rs = null;

    public DAO() {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            // setup the connection with the DB.
            conn = DriverManager.getConnection("jdbc:mysql://localhost/mediarus?"
                            + "user=root&password=");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Book getBookByID(int id) {
        Book b = new Book();
         try {

             

            String query = "SELECT id, title, author, publisher, release_date, language, weight, isbn, number_of_pages, category, price FROM books ";
            
            query+= "WHERE id = "+id+";";
            
            st = conn.createStatement();
            rs = st.executeQuery(query);
            
             while (rs.next()) {
                b.setId(rs.getInt("id"));

                b.setTitle(rs.getString("title"));
                
                b.setAuthor(rs.getString("author"));

                b.setPublisher(rs.getString("publisher"));

                b.setReleaseDate(rs.getString("release_date"));

                b.setLanguage(rs.getString("language"));

                b.setWeight(rs.getString("weight"));

                b.setISBN(rs.getString("isbn"));

                b.setNumberOfPages(rs.getInt("number_of_pages"));

                b.setCategorie(rs.getString("category"));
                
                b.setPrice(rs.getFloat("price"));
            }
             
             st.close();
            return b;

        } catch (SQLException ex) {
            Logger.getLogger(DAO.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

        return b;
    }

    public List<Book> getBooks(String title, String author, String category) {
        List<Book> list = new ArrayList<>();
        
        

        try {


            String query = "SELECT id, title, author, publisher, release_date, language, weight, isbn, number_of_pages, category, price FROM books ";

            
                query += "WHERE title LIKE '%"+ title +"%'";
            
                query += "AND author LIKE '%"+ author +"%'";
            
                query += "AND category LIKE '%"+ category +"%'";
            
            
            st = conn.createStatement();
            rs = st.executeQuery(query);

            while (rs.next()) {
                Book b = new Book();
                b.setId(rs.getInt("id"));

                b.setTitle(rs.getString("title"));
                
                b.setAuthor(rs.getString("author"));

                b.setPublisher(rs.getString("publisher"));

                b.setReleaseDate(rs.getString("release_date"));

                b.setLanguage(rs.getString("language"));

                b.setWeight(rs.getString("weight"));

                b.setISBN(rs.getString("isbn"));

                b.setNumberOfPages(rs.getInt("number_of_pages"));

                b.setCategorie(rs.getString("category"));
                
                b.setPrice(rs.getFloat("price"));

                list.add(b);
            }


            st.close();
            return list;

        } catch (SQLException ex) {
            Logger.getLogger(DAO.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }
    
}

