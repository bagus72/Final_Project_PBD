package koneksi;


import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class Koneksi {

    com.mysql.jdbc.Connection getConnection;
    public Koneksi(){
    }
    public static Connection bukaKoneksi() throws SQLException{
        Connection con = null;
            try{
            String url = "jdbc:mysql://localhost/kasir_buah";
            String user = "root";
            String pass = "";
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(url, user, pass);
            
            return con;
        }
        
        catch(SQLException se){
            JOptionPane.showMessageDialog(null, "Coba Lagi");
            System.out.println("No Connection open");
            return null;
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Tidak Ditemukan");
            System.out.println("Could't open connection");
            return null;
        }
    }
    public static void main (String[]args) throws SQLException{
        bukaKoneksi();
    }
}