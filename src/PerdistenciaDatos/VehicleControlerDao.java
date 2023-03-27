
package PerdistenciaDatos;

import backend.Vehicle;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;



public class VehicleControlerDao {
    
  
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
    
    public static void buscarVehiclesDb(String buscarVehicle){
        Conexion db_connect = new Conexion();
        PreparedStatement ps=null;
        ResultSet rs= null;

        try(Connection conexion = db_connect.getConnection()){
            String query = "SELECT * FROM vehicles WHERE id_vehicle = ?";
            ps=conexion.prepareStatement(query);
            ps.setString(1, buscarVehicle);
            rs=ps.executeQuery();
            
             while (rs.next()){
                String id_vehicle= rs.getNString("");
            }
        }catch (SQLException e){
            System.out.println("No se pudieron recuperar los mensajes");
            System.out.println(e);
        }

    }
}
    



/*private javax.swing.JTextField txColor;
    private javax.swing.JTextField txtAWarranty;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtIdVeh;
    private javax.swing.JTextField txtMake;
    private javax.swing.JTextField txtMiliage;
    private javax.swing.JTextField txtPrices;
    private javax.swing.JTextField txtYear;
*/