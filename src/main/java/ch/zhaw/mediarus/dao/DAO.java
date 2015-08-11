package ch.zhaw.mediarus.dao;


import java.awt.BorderLayout;
import java.sql.PreparedStatement;

import java.sql.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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

             

            String query = "SELECT b.id, b.title, b.author, b.publisher, b.release_date, b.language, b.weight, b.isbn, b.number_of_pages, c.title FROM books b JOIN categories c ON b.categorie_fk = c.id ";
            
            query+= "WHERE b.id = "+id+";";
            
            st = conn.createStatement();
            rs = st.executeQuery(query);
            
             while (rs.next()) {
                b.setId(rs.getInt("b.id"));

                b.setTitle(rs.getString("b.title"));
                
                b.setAuthor(rs.getString("b.author"));

                b.setPublisher(rs.getString("b.publisher"));

                b.setReleaseDate(rs.getString("b.release_date"));

                b.setLanguage(rs.getString("b.language"));

                b.setWeight(rs.getString("b.weight"));

                b.setISBN(rs.getString("b.isbn"));

                b.setNumberOfPages(rs.getInt("b.number_of_pages"));

                b.setCategorie(rs.getString("c.title"));
            }
             
             st.close();
            return b;

        } catch (SQLException ex) {
            Logger.getLogger(DAO.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

        return b;
    }

    public ArrayList<Book> getBooks(String title, String author, String category) {
        ArrayList<Book> list = new ArrayList<Book>();

        try {


            String query = "SELECT b.id, b.title, b.author, b.publisher, b.release_date, b.language, b.weight, b.isbn, b.number_of_pages, c.title FROM books b JOIN categories c ON b.categorie_fk = c.id ";

            
                query += "WHERE b.title LIKE '%"+ title +"%'";
            
                query += "AND b.author LIKE '%"+ author +"%'";
            
                query += "AND c.title LIKE '%"+ category +"%'";
            
            
            st = conn.createStatement();
            rs = st.executeQuery(query);

            while (rs.next()) {
                Book b = new Book();
                b.setId(rs.getInt("b.id"));

                b.setTitle(rs.getString("b.title"));
                
                b.setAuthor(rs.getString("b.author"));

                b.setPublisher(rs.getString("b.publisher"));

                b.setReleaseDate(rs.getString("b.release_date"));

                b.setLanguage(rs.getString("b.language"));

                b.setWeight(rs.getString("b.weight"));

                b.setISBN(rs.getString("b.isbn"));

                b.setNumberOfPages(rs.getInt("b.number_of_pages"));

                b.setCategorie(rs.getString("c.title"));

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

