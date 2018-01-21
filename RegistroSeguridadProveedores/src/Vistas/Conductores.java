package Vistas;

import Conexion.ConexioSQLite;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Conductores extends javax.swing.JFrame {

    DefaultTableModel modelo;
    ConexioSQLite conexion;

    public Conductores() {
        initComponents();
        this.setLocationRelativeTo(null);
        cargar_tabla_conductor();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_id_conductor = new javax.swing.JTextField();
        txt_nombre_completo = new javax.swing.JTextField();
        txt_identificacion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_empresa = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_placa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_conductores = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONDUCTORES");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel2.setText("ID : ");

        jLabel3.setText("NOMBRE COMPLETO :");

        txt_id_conductor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_id_conductor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_id_conductor.setEnabled(false);

        txt_identificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_identificacionActionPerformed(evt);
            }
        });

        jLabel4.setText("IDENTIFICACION :");

        jLabel5.setText("EMPRESA :");

        jLabel6.setText("PLACA VEHICULO :");

        txt_placa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_placaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(95, 95, 95)
                            .addComponent(jLabel2))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(45, 45, 45)
                            .addComponent(jLabel4))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel6)))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_empresa, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_id_conductor, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nombre_completo, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_placa, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(161, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_id_conductor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nombre_completo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_empresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_placa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabla_conductores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla_conductores.setRowHeight(23);
        tabla_conductores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_conductoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_conductores);

        jButton1.setBackground(new java.awt.Color(102, 255, 255));
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 153, 51));
        jButton2.setText("Actualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(102, 255, 0));
        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (txt_identificacion.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "CEDULA OBLIGATORIO");
        } else if (txt_nombre_completo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "NOMBRE OBLIGATORIO");
        } else if (txt_empresa.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "EMPRESA OBLIGATORIO");
        } else if (txt_placa.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "PLACA OBLIGATORIO");
        } else {

            conexion = new ConexioSQLite();
            conexion.coneccionbase();

            String id = txt_identificacion.getText();
            String nombre = txt_nombre_completo.getText();
            String empresa = txt_empresa.getText();
            String placa = txt_placa.getText();

            boolean resultado = conexion.insert_conductor(id, nombre.toUpperCase(), empresa.toUpperCase(), placa.toUpperCase());

            if (resultado == true) {
                JOptionPane.showMessageDialog(null, "CONDUCTOR INSERTADO");
                LimpiarCampos();
                cargar_tabla_conductor();
                conexion.cerrar();
            } else {
                JOptionPane.showMessageDialog(null, "ERROR AL INSERTAR");
                LimpiarCampos();
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void tabla_conductoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_conductoresMouseClicked

        int rec = this.tabla_conductores.getSelectedRow();

        this.txt_id_conductor.setText(tabla_conductores.getValueAt(rec, 0).toString());
        this.txt_identificacion.setText(tabla_conductores.getValueAt(rec, 1).toString());
        this.txt_nombre_completo.setText(tabla_conductores.getValueAt(rec, 2).toString());
        this.txt_empresa.setText(tabla_conductores.getValueAt(rec, 3).toString());
        this.txt_placa.setText(tabla_conductores.getValueAt(rec, 4).toString());

    }//GEN-LAST:event_tabla_conductoresMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if (txt_id_conductor.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "SELECCIONE DE LA TABLA");
        } else {
            conexion = new ConexioSQLite();
            conexion.coneccionbase();

            String id = txt_id_conductor.getText();
            String cedula = txt_identificacion.getText();
            String nombre = txt_nombre_completo.getText();
            String empresa = txt_empresa.getText();
            String placa = txt_placa.getText();

            boolean resultado = conexion.upgrade_conductor(id,cedula ,nombre,empresa,placa);

            if (resultado == true) {
                JOptionPane.showMessageDialog(null, "CONDUCTOR ACTUALIZADA");
                LimpiarCampos();
                cargar_tabla_conductor();
                conexion.cerrar();
            } else {
                JOptionPane.showMessageDialog(null, "ERROR AL INSERTADAR");
                LimpiarCampos();
            }
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        if (txt_id_conductor.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "SELECCIONE DE LA TABLA");
        } else {
            conexion = new ConexioSQLite();
            conexion.coneccionbase();

            String id = txt_id_conductor.getText();

            boolean resultado = conexion.delete_conductor(id);

            if (resultado == true) {
                JOptionPane.showMessageDialog(null, "CONDUCTOR ELIMINADO");
                LimpiarCampos();
                cargar_tabla_conductor();
                conexion.cerrar();
            } else {
                JOptionPane.showMessageDialog(null, "ERROR AL ELIMINADO");
                LimpiarCampos();
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txt_identificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_identificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_identificacionActionPerformed

    private void txt_placaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_placaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_placaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_conductores;
    private javax.swing.JTextField txt_empresa;
    private javax.swing.JTextField txt_id_conductor;
    private javax.swing.JTextField txt_identificacion;
    private javax.swing.JTextField txt_nombre_completo;
    private javax.swing.JTextField txt_placa;
    // End of variables declaration//GEN-END:variables

    public void LimpiarCampos() {
        txt_id_conductor.setText("");
        txt_identificacion.setText("");
        txt_nombre_completo.setText("");
        txt_empresa.setText("");
        txt_placa.setText("");
    }

    void cargar_tabla_conductor() {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"ID","CEDULA" ,"NOMBRE","EMPRESA","PLACA"};
        String[] registro = new String[5];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "ID_CONDUCTOR AS ID, "
                + "CEDULA AS CEDULA, "
                + "NOMBRE_CONDUCTOR AS NOMBRE, "
                + "EMPRESA AS EMPRE, "
                + "PLACA_VEHICULO AS PLACA "
                + "FROM "
                + "CONDUCTORES "
                + "ORDER BY NOMBRE_CONDUCTOR ASC";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("ID");
                registro[1] = rs.getString("CEDULA");
                registro[2] = rs.getString("NOMBRE");
                registro[3] = rs.getString("EMPRE");
                registro[4] = rs.getString("PLACA");

                modelo.addRow(registro);
            }
            tabla_conductores.setModel(modelo);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

}
