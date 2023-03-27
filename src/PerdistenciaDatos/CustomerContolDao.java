/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PerdistenciaDatos;

import backend.Customer;
import backend.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class CustomerContolDao {
    public static void createCustomerDB(Customer customer){
        Conexion db_connect = new Conexion();

        try(Connection conexion = db_connect.getConnection()){
            PreparedStatement ps=null;
            try{
                String query= "insert into customer(name, address, phone_number, email) VALUES (?,?,?,?)";
                ps= conexion.prepareStatement(query);
                ps.setString(1,customer.getName());
                ps.setString(2,customer.getAddress());
                ps.setString(3,customer.getPhoneNumber());
                ps.setString(4,customer.getEmail());
                ps.executeUpdate();
               
                 
            }catch(SQLException ex){
                System.out.println(ex);
            }

        }catch (SQLException e){
            System.out.println(e);
        }
        
        
    }
}
