/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import modelo.FormatoNumerico;

/**
 *
 * @author ce_al
 */
public class VistaInicio extends javax.swing.JFrame {

    
    public VistaInicio() {
        initComponents();
        //txtRetencion.setText("10");
        anioConValor();
    
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelAnio = new javax.swing.JLabel();
        comboBoxAnio = new javax.swing.JComboBox<>();
        labelIngresoHonorario = new javax.swing.JLabel();
        txtIngresoHonorario = new javax.swing.JTextField();
        labelHonorarioRetencion = new javax.swing.JLabel();
        txtHonorarioRetencion = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        labelRetencion = new javax.swing.JLabel();
        txtRetencion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CALCULADORA BOLETA HONORARIO v0.1");
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        labelAnio.setText("Año");

        comboBoxAnio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2019", "2020", "2021", "2022", "2023", "2024", "2025" }));
        comboBoxAnio.setSelectedIndex(6);
        comboBoxAnio.setToolTipText("");
        comboBoxAnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxAnioActionPerformed(evt);
            }
        });

        labelIngresoHonorario.setText("Ingreso Honorario");

        txtIngresoHonorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIngresoHonorarioActionPerformed(evt);
            }
        });
        txtIngresoHonorario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIngresoHonorarioKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIngresoHonorarioKeyReleased(evt);
            }
        });

        labelHonorarioRetencion.setText("Honorario con retencion");

        txtHonorarioRetencion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHonorarioRetencionActionPerformed(evt);
            }
        });

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        labelRetencion.setText("Retencion");

        txtRetencion.setEditable(false);
        txtRetencion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRetencionActionPerformed(evt);
            }
        });

        jLabel1.setText("%");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelHonorarioRetencion)
                    .addComponent(labelIngresoHonorario)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelAnio)
                        .addGap(18, 18, 18)
                        .addComponent(comboBoxAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelRetencion)
                        .addGap(18, 18, 18)
                        .addComponent(txtRetencion, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtHonorarioRetencion, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(txtIngresoHonorario))
                        .addGap(18, 18, 18)
                        .addComponent(btnCalcular)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAnio)
                    .addComponent(comboBoxAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelRetencion)
                    .addComponent(txtRetencion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelIngresoHonorario)
                    .addComponent(txtIngresoHonorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalcular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelHonorarioRetencion)
                    .addComponent(txtHonorarioRetencion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        FormatoNumerico fn = new FormatoNumerico();

        if (!txtIngresoHonorario.getText().isEmpty()) {
            String retencion = txtRetencion.getText();
            String ingresoHonorario = txtIngresoHonorario.getText();
            String nuevoIngresoHonorario = fn.quitarSeparacionMiles(ingresoHonorario);

            double calculoPorsentaje = (100 - Double.parseDouble(retencion)) / 100;
            double calculoFinal = Double.parseDouble(nuevoIngresoHonorario) / calculoPorsentaje;

            Locale region = Locale.getDefault();
            Currency moneda = Currency.getInstance(region);
            NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance(region);

            txtHonorarioRetencion.setText(String.valueOf(formatoMoneda.format(calculoFinal)));

            // JOptionPane.showMessageDialog(null, region);
            // JOptionPane.showMessageDialog(null, moneda);
            //  JOptionPane.showMessageDialog(null, formatoMoneda);
        }else{
            txtIngresoHonorario.setText("0");
        }


    }//GEN-LAST:event_btnCalcularActionPerformed

    private void txtRetencionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRetencionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRetencionActionPerformed

    private void txtHonorarioRetencionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHonorarioRetencionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHonorarioRetencionActionPerformed

    private void txtIngresoHonorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIngresoHonorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIngresoHonorarioActionPerformed

    private void txtIngresoHonorarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIngresoHonorarioKeyReleased
        // TODO add your handling code here:
        FormatoNumerico fn = new FormatoNumerico();
        if (!txtIngresoHonorario.getText().isEmpty()) {
            //separar en miles
            Double numero;
            String num = txtIngresoHonorario.getText();
            String numeracion = num.replace(".", "");
            numero = Double.valueOf(numeracion);
            txtIngresoHonorario.setText(fn.separarEnMiles(numero));
        } else {
            txtIngresoHonorario.setText("0");
        }

    }//GEN-LAST:event_txtIngresoHonorarioKeyReleased

    private void txtIngresoHonorarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIngresoHonorarioKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIngresoHonorarioKeyPressed

    private void comboBoxAnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxAnioActionPerformed
        
        anioConValor();
        
        
    }//GEN-LAST:event_comboBoxAnioActionPerformed
    
    public void anioConValor(){
    int seleccionAnio = comboBoxAnio.getSelectedIndex();
        switch (seleccionAnio) {
            case 0 -> txtRetencion.setText("10");
            case 1 -> txtRetencion.setText("10.75");
            case 2 -> txtRetencion.setText("11.5");
            case 3 -> txtRetencion.setText("12.25");
            case 4 -> txtRetencion.setText("13");
            case 5 -> txtRetencion.setText("13.75");
            case 6 -> txtRetencion.setText("14.5");
            default -> {
            }
        }
    
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JComboBox<String> comboBoxAnio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelAnio;
    private javax.swing.JLabel labelHonorarioRetencion;
    private javax.swing.JLabel labelIngresoHonorario;
    private javax.swing.JLabel labelRetencion;
    private javax.swing.JTextField txtHonorarioRetencion;
    private javax.swing.JTextField txtIngresoHonorario;
    private javax.swing.JTextField txtRetencion;
    // End of variables declaration//GEN-END:variables
}
