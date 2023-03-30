
package PerdistenciaDatos;


import java.sql.*;

public class Conexion{
    
    Connection connection =null;
    
    public Connection getConnection(){
        
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/al_tayer_motors","root","");
            if(connection != null){
                System.out.println("Conexion exitosa");

            }
        }catch(SQLException e){

            System.out.println(e);
        }
       
        return connection;
    }
    
    public void closeConection(){
        connection.close();
    }
    
}