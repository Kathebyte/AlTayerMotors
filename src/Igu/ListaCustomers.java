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
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ListaCustomers extends javax.swing.JFrame {

    public ListaCustomers() {
        initComponents();
        mostrarCustomers(0,null);
    }
    
    public void mostrarCustomers(int opBuscar, String valor){
        DefaultTableModel customers = new DefaultTableModel();
        
        customers.addColumn("ID CUSTOMER");
        customers.addColumn("NAME");
        customers.addColumn("ADDRESS");
        customers.addColumn("PHONE NUMBER");
        customers.addColumn("EMAIL");
        TableClients.setModel(customers);
        
        String [] datosCustomers = new String[5];
        
        String query;
        
        if(opBuscar ==0 && valor==null){
            query = "select * from customer";
                }else{
                if(opBuscar==1 && valor !=null){
                    query = "select * from customer where name = '"+valor+"'";
                    }else{
                    if(opBuscar==2 && valor !=null){
                        query= "select * from customer where id_customer = '"+valor+"'";
                    }else{
                    query = "select * from customer";
                    }
                }
            }

        Conexion db_connect = new Conexion();
        PreparedStatement ps=null;

        try(Connection conexion = db_connect.getConnection()){
            ps=conexion.prepareStatement(query);
            ResultSet rs= ps.executeQuery();
            
            while (rs.next()){
                datosCustomers[0] = rs.getString(1);
                datosCustomers[1] = rs.getString(2);
                datosCustomers[2] = rs.getString(3);
                datosCustomers[3] = rs.getString(4);
                datosCustomers[4] = rs.getString(5);
                
                customers.addRow(datosCustomers);
            }
            
            TableClients.setModel(customers);
            
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, ex + "Error consulta");      
        } 
    }

    public void UpdateClients(){
        
        int fila = TableClients.getSelectedRow();
        
        int idCustomer= Integer.parseInt(this.TableClients.getValueAt(fila, 0).toString());
        
        String nameUpdate =TableClients.getValueAt(fila,1).toString();
        String addressUpdate =TableClients.getValueAt(fila,2).toString();
        String phoneNumberUpdate =TableClients.getValueAt(fila,3).toString();
        String emailUpdate =TableClients.getValueAt(fila,4).toString();
        
        Conexion db_connect = new Conexion();
        PreparedStatement ps=null;

         
        //name, address, phone_number, email
        
        try (Connection conexion = db_connect.getConnection()){
            ps = conexion.prepareStatement("UPDATE customer SET name='"+nameUpdate+"', address='"+addressUpdate+"', phone_number='"+phoneNumberUpdate+"', email='"+emailUpdate+"' WHERE id_customer='"+idCustomer+"'");
            ps.executeUpdate();
            
            JOptionPane optionPane = new JOptionPane("Client successfully updated ");
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
            JDialog dialog = optionPane.createDialog("titulo");
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
            
            mostrarCustomers(0,null);
            
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "No rows were updated");
        }
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableClients = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        bttSalir1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        comboBuscar = new javax.swing.JComboBox<>();
        txtFilter = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btonSearch = new javax.swing.JButton();
        btonUpdate = new javax.swing.JButton();
        bttSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TableClients.setAutoCreateRowSorter(true);
        TableClients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TableClients.setToolTipText("Lista Customers: ");
        jScrollPane1.setViewportView(TableClients);

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel2.setText("List Customers");

        bttSalir1.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        bttSalir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Igu/exit.png"))); // NOI18N
        bttSalir1.setText("Exit");
        bttSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttSalir1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(bttSalir1, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bttSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filter by", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 1, 14))); // NOI18N

        comboBuscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "See all Customer", "Name", "ID Customer" }));
        comboBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBuscarActionPerformed(evt);
            }
        });

        txtFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFilterActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PerdistenciaDatos/member.png"))); // NOI18N

        btonSearch.setText("Search");
        btonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(comboBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(txtFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 170, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btonSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(25, 25, 25))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(btonSearch)))
                .addContainerGap())
        );

        btonUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Igu/updated.png"))); // NOI18N
        btonUpdate.setText("Update");
        btonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btonUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(190, 190, 190)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addGap(42, 42, 42)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bttSalir.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        bttSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Igu/exit.png"))); // NOI18N
        bttSalir.setText("Exit");
        bttSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(266, 266, 266)
                    .addComponent(bttSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(310, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(225, 225, 225)
                    .addComponent(bttSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(303, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttSalirActionPerformed
        dispose();
    }//GEN-LAST:event_bttSalirActionPerformed

    private void bttSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttSalir1ActionPerformed
        dispose();
    }//GEN-LAST:event_bttSalir1ActionPerformed

    private void comboBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBuscarActionPerformed

    private void txtFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFilterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFilterActionPerformed

    private void btonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonSearchActionPerformed
        int option= comboBuscar.getSelectedIndex();
        String valorBuscado= txtFilter.getText();
        mostrarCustomers(option, valorBuscado);

    }//GEN-LAST:event_btonSearchActionPerformed

    private void btonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonUpdateActionPerformed
       UpdateClients();
    }//GEN-LAST:event_btonUpdateActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableClients;
    private javax.swing.JButton btonSearch;
    private javax.swing.JButton btonUpdate;
    private javax.swing.JButton bttSalir;
    private javax.swing.JButton bttSalir1;
    private javax.swing.JComboBox<String> comboBuscar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtFilter;
    // End of variables declaration//GEN-END:variables
}
