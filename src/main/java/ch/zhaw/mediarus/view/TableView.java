/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.zhaw.mediarus.view;

/**
 *
 * @author buef
 */
public class TableView extends View{

    public TableView(String[] columnTitles) {
        super();
        code += "<div id=\"TableView\">\n"
                +"  <div class=\"form-inline pull-right\">\n"
                +"      <form action=\"#\" method=\"GET\">\n"
                +"          <input type=\"text\" class=\"form-control\" id=\"textInputTitle\" placeholder=\"Title\" name=\"search_input_title\" />\n"
                +"          <input type=\"text\" class=\"form-control\" id=\"textInputAuthor\" placeholder=\"Author\" name=\"search_input_author\" />\n"
                +"          <input type=\"text\" class=\"form-control\" id=\"textInputCategory\" placeholder=\"Category\" name=\"search_input_category\"/>\n"
                +"          <button type=\"submit\" class=\"btn btn-default\" id=\"searchSubmitButton\">Search</button>\n"
                +"      </form>\n"
                +"  </div>\n"
                +"  <table class=\"table table-bordered\">\n"
                +"      <thead>\n"
                +"          <tr>\n";
        
        for(int i = 0; i < columnTitles.length; i++)
            code+="             <th>"+columnTitles[i]+"</th>\n";
        
        code +="            </tr>\n"
                +"      </thead>\n"
                +"      <tbody>\n";
        
    }
    
    public void insertRow(String[] row) {
        code += "           <tr>\n";
        for(int i = 0; i < row.length; i++)
            code+="             <a href=\"#\"><th>"+row[i]+"</th></a>\n";
        
        code += "           </tr>\n";
    }
    
    public String generateCode() {
        code +="        </tbody>"
                +"  </table>"
                +"</div>";
        
        return code;
    }
    
}
