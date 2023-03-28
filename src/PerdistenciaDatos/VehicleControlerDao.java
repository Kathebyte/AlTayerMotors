package PerdistenciaDatos;

import backend.Vehicle;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;


public class VehicleControlerDao extends JFrame{
    
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
    
    public List<Vehicle> listarVehicles (){
        List<Vehicle> vehiculos = new ArrayList<>();
        Conexion db_connect = new Conexion();
        PreparedStatement ps=null;

        try(Connection conexion = db_connect.getConnection()){
            String query = "select * from vehicle";
            ps=conexion.prepareStatement(query);
            ResultSet rs= ps.executeQuery();
            
            while (rs.next()){
            Vehicle vehiculo = new Vehicle();
            //vehiculo.setCarId("ID VEHICLE: " + rs.getInt("id_vehicle") + "\n");
            vehiculo.setMake ("MAKE: " + rs.getString("make") + "\n");
            vehiculo.setBrand("BRAND: " + rs.getString("brand") + "\n");
            vehiculo.setYear("YEAR: " + rs.getString("year") + "\n");
            vehiculo.setMiliage("MILIAGE: " + rs.getString("miliage") + "\n");
            vehiculo.setColor("COLOR: " + rs.getString("color") + "\n");
            vehiculo.setPrices("PRICES: " + rs.getInt("prices") + "\n");
            vehiculo.setTypeCar("TYPE CAR: " + rs.getString("type_Car") + "\n");
            vehiculo.setWarrantyTime("WARRANTY TIME: " + rs.getString("warranty_time") + "\n");
            //textArea.append("ACCIDENT HISTORY: " + rs.getString("accidentHistory") + "\n");
          
            vehiculos.add(vehiculo);
           
            }
          
        }catch(SQLException ex){
                System.out.println(ex);
            }
        
        return vehiculos;
    }
   

    }

  
   

    


