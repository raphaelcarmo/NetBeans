/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author Raphael
 */
public class ConnectionFactory {
    
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/todoapp2";
    public static final String USER = "root";
    public static final String PASS = "";

    public static Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public statis Connection getConnection(){
        try{
            
            Class.forName(DRIVE);
            return DriverManager.getConnection(URL, USER, PASS);        
        } catch (Exception ex) {
            throw new RuntimeException("Erro na conexão com o banco de dados", ex);
        
        }
       
    
    }
    
    public static void closeConnection(Connection connection) {
        try{
            if (connection != null) {
                connection.close();
            }
        
        } catch (Exception ex){
            throw new RuntimeException("Erro ao fechar a conexão com o banco de dados", ex);
        
        }
    
    
    }
    
}
