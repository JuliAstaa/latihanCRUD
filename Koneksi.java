/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Koneksi;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author SCU
 */
public class Koneksi {
    Connection conn;
    public static Connection DB(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //orang adalah nama database, jadi sesuaikan dengan nama database kalian
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/orang", "root", "");
            return conn;
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
