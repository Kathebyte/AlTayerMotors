/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Igu;

import PerdistenciaDatos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kathemacbook
 */
public class ListVehicles extends javax.swing.JFrame {

    /**
     * Creates new form ListVehicles
     */
    public ListVehicles() {
        initComponents();
        mostrarVehicles();
    }
    
    public void mostrarVehicles(){
        
        DefaultTableModel vehiculos = new DefaultTableModel();
        
        vehiculos.addColumn("ID");
        vehiculos.addColumn("MAKE");
        vehiculos.addColumn("BRAND");
        vehiculos.addColumn("YEAR");
        vehiculos.addColumn("MILIAGE");
        vehiculos.addColumn("COLOR");
        vehiculos.addColumn("PRICES");
        vehiculos.addColumn("TYPE CAR");
        vehiculos.addColumn("WARRANTY TIME");
        tableVehicles.setModel(vehiculos);
        
        String []datosVehicles = new String[9];
        
        Conexion db_connect = new Conexion();
        PreparedStatement ps=null;

        try(Connection conexion = db_connect.getConnection()){
            String query = "select * from vehicle";
            ps=conexion.prepareStatement(query);
            ResultSet rs= ps.executeQuery();
            
            while (rs.next()){
                datosVehicles[0] = rs.getString(1);
                datosVehicles[1] = rs.getString(2);
                datosVehicles[2] = rs.getString(3);
                datosVehicles[3] = rs.getString(4);
                datosVehicles[4] = rs.getString(5);
                datosVehicles[5] = rs.getString(6);
                datosVehicles[6]= rs.getString(7);
                datosVehicles[7] = rs.getString(8);
                datosVehicles[8] = rs.getString(9);
                vehiculos.addRow(datosVehicles);
            }
            
            tableVehicles.setModel(vehiculos);
            
         
        }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, ex + "Error consulta");
                
        }  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableVehicles = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableVehicles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableVehicles.setToolTipText("");
        jScrollPane1.setViewportView(tableVehicles);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 91, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableVehicles;
    // End of variables declaration//GEN-END:variables
}
