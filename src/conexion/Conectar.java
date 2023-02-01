/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;
import java.sql.*;
import javax.swing.JOptionPane;

public class Conectar {
    
    public static Connection DataBase(){
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/cerrajeria_mati","root","");
            return cn;
        } catch (Exception e) {
            System.out.println("error de conexion " + e);
            JOptionPane.showMessageDialog(null, "debes conectarte al la base de datos.");
        }
        return null;
    }
    
}
