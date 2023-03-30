/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package altayermotors;

import Igu.ListCustomers;
import Igu.PantallaPrincipal;
import PerdistenciaDatos.Conexion;
import PerdistenciaDatos.ControlerDao;
import PerdistenciaDatos.ControlerDao;
import backend.Vehicle;
import java.sql.Connection;
import java.util.List;

public class Main {

    
    public static void main(String[] args) {
        PantallaPrincipal patalla = new PantallaPrincipal();
        patalla.setVisible(true);
        patalla.setLocationRelativeTo(null);
        
        ControlerDao dao = new ControlerDao();
        
        
        Conexion conexion = new Conexion();
        try(Connection cnx = conexion.getConnection()) {
        
        } catch (Exception e) {
        System.out.println(e);
        }
    }
    
}
