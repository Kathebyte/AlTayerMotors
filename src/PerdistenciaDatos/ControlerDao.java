package PerdistenciaDatos;

import backend.Customer;
import backend.Vehicle;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;


public class ControlerDao extends JFrame{
    
    public static void createVehicledDB(Vehicle vehicle){
        Conexion db_connect = new Conexion();

        try(Connection conexion = db_connect.getConnection()){
            PreparedStatement ps=null;
            try{
                String query= "insert into vehicle(make, brand, year, miliage, color, prices, type_car, warranty_time) VALUES (?,?,?,?,?,?,?,?)";
                ps= conexion.prepareStatement(query);
                ps.setString(1,vehicle.getMake());
                ps.setString(2,vehicle.getBrand());
                ps.setString(3,vehicle.getYear());
                ps.setString(4,vehicle.getMiliage());
                ps.setString(5,vehicle.getColor());
                ps.setString(6,vehicle.getPrices());
                ps.setString(7,vehicle.getTypeCar());
                ps.setString(8,vehicle.getWarrantyTime());
                ps.executeUpdate();
               
                 
            }catch(SQLException ex){
                System.out.println(ex);
            }

        }catch (SQLException e){
            System.out.println(e);
        }
    }

      public static void createUserDb(Customer customer){
          
          Conexion db_connect = new Conexion();

        try(Connection conexion = db_connect.getConnection()){
            PreparedStatement ps=null;
            try{
                String query= "INSERT INTO customer (name, address, phone_number, email) VALUES(?,?,?,?)";
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

   
    

  
   

    


