package Igu;

import backend.Vehicle;
import PerdistenciaDatos.ControlerDao;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class CargaVehicle extends javax.swing.JFrame {
    
    public CargaVehicle() {
        initComponents();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtMiliage = new javax.swing.JTextField();
        bttLimpiar = new javax.swing.JButton();
        bttGuardar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ComboTypeCar = new javax.swing.JComboBox<>();
        txtPrices = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtAWarranty = new javax.swing.JTextField();
        bttSalir = new javax.swing.JButton();
        bttCarsAvailable = new javax.swing.JButton();
        comboBrand = new javax.swing.JComboBox<>();
        combMake = new javax.swing.JComboBox<>();
        comboColor = new javax.swing.JComboBox<>();
        ComboYear = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel2.setText("VEHICLE");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Igu/car-insurance.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel6.setText("Make");

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel7.setText("Brand");

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel11.setText("Miliage");

        bttLimpiar.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        bttLimpiar.setIcon(new javax.swing.ImageIcon("/Users/kathemacbook/Documents/Repaso/Imagenes/Gatos/broom-2.png")); // NOI18N
        bttLimpiar.setText("Limpiar");
        bttLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttLimpiarActionPerformed(evt);
            }
        });

        bttGuardar.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        bttGuardar.setIcon(new javax.swing.ImageIcon("/Users/kathemacbook/Documents/Repaso/Imagenes/Gatos/save.png")); // NOI18N
        bttGuardar.setText("Guardar");
        bttGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttGuardarActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel9.setText("Color");

        jLabel12.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel12.setText("Prices");

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel10.setText("TypeCar");

        ComboTypeCar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---", "Sedan", "Hatchback", "Coupe", "Convertible", "SUV", "Crossover", "Pickup truck", "Van", "Minivan", "Sports car", "Luxury car", "Electric car", "Hybrid car", "Compact car" }));
        ComboTypeCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboTypeCarActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel14.setText("Year");

        jLabel15.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel15.setText("WarrantyTime");

        bttSalir.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        bttSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Igu/exit.png"))); // NOI18N
        bttSalir.setText("Exit");
        bttSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttSalirActionPerformed(evt);
            }
        });

        bttCarsAvailable.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        bttCarsAvailable.setIcon(new javax.swing.ImageIcon("/Users/kathemacbook/Documents/Repaso/Imagenes/Gatos/broom-2.png")); // NOI18N
        bttCarsAvailable.setText("All Cars");
        bttCarsAvailable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttCarsAvailableActionPerformed(evt);
            }
        });

        comboBrand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----", "Camry", "Corolla", "Civic", "Accord", "Altima", "Maxima", "Silverado", "Tahoe", "Mustang", "F-150", "Wrangler", "Grand Cherokee", "S-Class", "E-Class", "3 Series", "5 Series", "A4", "Q5", "Sonata", "Tucson", "Optima", "Sorento", "Golf", "Tiguan", "911", "Panamera", "488 GTB", "F8 Tributo", "Aventador", "Huracan", "DB11", "Vantage", "720S", "GT", "F-Pace", "XJ", "Range Rover", "Discovery", "RX", "LS" }));

        combMake.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---", "Toyota", "Honda", "Nissan", "Chevrolet", "Ford", "Jeep", "Mercedes-Benz", "BMW", "Audi", "Hyundai", "Kia", "Volkswagen", "Porsche", "Ferrari", "Lamborghini", "Aston Martin", "McLaren", "Jaguar", "Land Rover", "Lexus" }));
        combMake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combMakeActionPerformed(evt);
            }
        });

        comboColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---", "White", "Black", "Gray", "Silver", "Gold", "Red", "Blue", "Green", "Yellow", "Orange", "Brown", "Beige", "Purple", "Pink", "Turquoise", "Copper", "Bronze", "Olive Green", "Smoky Gray", "Pearl White", "Navy Blue" }));
        comboColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboColorActionPerformed(evt);
            }
        });

        ComboYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", " " }));
        ComboYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboYearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combMake, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ComboTypeCar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboColor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboBrand, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAWarranty, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ComboYear, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtPrices, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(63, 63, 63)
                            .addComponent(bttGuardar)
                            .addGap(36, 36, 36)
                            .addComponent(bttLimpiar)
                            .addGap(31, 31, 31)
                            .addComponent(bttSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(190, 190, 190))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                    .addGap(212, 212, 212)
                                    .addComponent(jLabel11)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtMiliage, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(183, 183, 183)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(bttCarsAvailable)
                        .addGap(88, 88, 88))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel12)
                    .addComponent(txtPrices, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combMake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel14)
                            .addComponent(comboBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(comboColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtAWarranty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel15)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(ComboTypeCar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtMiliage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bttGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bttSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bttLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bttCarsAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(661, 661, 661))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttLimpiarActionPerformed
      
        cleanCode();
    }//GEN-LAST:event_bttLimpiarActionPerformed

    public void cleanCode(){
        comboColor.setSelectedIndex(0);
        txtAWarranty.setText("");
        txtMiliage.setText("");
        txtPrices.setText("");
        ComboYear.setSelectedIndex(0);
        comboBrand.setSelectedIndex(0);
        ComboTypeCar.setSelectedIndex(0);
        combMake.setSelectedIndex(0);
        
    }
    private void bttGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttGuardarActionPerformed
        String make= (String) combMake.getSelectedItem();
        String brand= (String) comboBrand.getSelectedItem();
        String year = (String) ComboYear.getSelectedItem();
        String miliage= txtMiliage.getText();
        String color =(String) comboColor.getSelectedItem();
        String prices = txtPrices.getText();
        String typeCar= (String) ComboTypeCar.getSelectedItem();
        String warrantyTime =txtAWarranty.getText();
     
        Vehicle registro = new Vehicle(make, brand, year, miliage, color, prices, typeCar, warrantyTime, warrantyTime);
        ControlerDao.createVehicledDB(registro);
        
        
       JOptionPane optionPane = new JOptionPane("The information has been saved successfully.");
       optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
       JDialog dialog = optionPane.createDialog("titulo");
       dialog.setAlwaysOnTop(true);
       dialog.setVisible(true);
             
        cleanCode();
        
    }//GEN-LAST:event_bttGuardarActionPerformed

    private void bttSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttSalirActionPerformed
        dispose();
    }//GEN-LAST:event_bttSalirActionPerformed

    private void ComboTypeCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboTypeCarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboTypeCarActionPerformed

    private void bttCarsAvailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttCarsAvailableActionPerformed
        ListVehicles listVehicles = new ListVehicles();
        listVehicles.setVisible(true);
        listVehicles.setLocationRelativeTo(null);
           
    }//GEN-LAST:event_bttCarsAvailableActionPerformed

    private void combMakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combMakeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combMakeActionPerformed

    private void comboColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboColorActionPerformed

    private void ComboYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboYearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboTypeCar;
    private javax.swing.JComboBox<String> ComboYear;
    private javax.swing.JButton bttCarsAvailable;
    private javax.swing.JButton bttGuardar;
    private javax.swing.JButton bttLimpiar;
    private javax.swing.JButton bttSalir;
    private javax.swing.JComboBox<String> combMake;
    private javax.swing.JComboBox<String> comboBrand;
    private javax.swing.JComboBox<String> comboColor;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txtAWarranty;
    private javax.swing.JTextField txtMiliage;
    private javax.swing.JTextField txtPrices;
    // End of variables declaration//GEN-END:variables
}

