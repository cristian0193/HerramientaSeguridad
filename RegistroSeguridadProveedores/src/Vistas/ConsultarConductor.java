package Vistas;

import Conexion.ConexioSQLite;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ConsultarConductor extends javax.swing.JFrame {

    DefaultTableModel modelo;
    ConexioSQLite conexion;
    
    public ConsultarConductor() {
        initComponents();
        this.setLocationRelativeTo(null);
        cargar_tabla_conductor();
        ancho_columnas();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_conductores_buscar = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_cedula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_nombre_cond = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_empresa = new javax.swing.JTextField();
        txt_placa = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btn_guardar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        combo_filtro = new javax.swing.JComboBox();
        btn_guardar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONDUCTORES");

        tabla_conductores_buscar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla_conductores_buscar.setRowHeight(23);
        tabla_conductores_buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_conductores_buscarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_conductores_buscar);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Cedula :");

        txt_cedula.setEnabled(false);

        jLabel3.setText("Nombre :");

        txt_nombre_cond.setEnabled(false);

        jLabel5.setText("Empresa :");

        txt_empresa.setEnabled(false);

        txt_placa.setEnabled(false);

        jLabel6.setText("Placa:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nombre_cond, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_empresa, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_placa, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txt_empresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txt_placa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txt_nombre_cond, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_guardar.setBackground(new java.awt.Color(102, 255, 255));
        btn_guardar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_guardar.setText("Consultar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        jLabel4.setText("Seleccionar Filtro :");

        combo_filtro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "CEDULA", "EMPRESA", "NOMBRE", "PLACA" }));
        combo_filtro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_filtroItemStateChanged(evt);
            }
        });

        btn_guardar1.setBackground(new java.awt.Color(255, 204, 102));
        btn_guardar1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_guardar1.setText("Refrescar");
        btn_guardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardar1ActionPerformed(evt);
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
                        .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_guardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combo_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(combo_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_guardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String nombre = "";

        RegistrosIngresoProveedores original = new RegistrosIngresoProveedores();

        int select = tabla_conductores_buscar.getSelectedRow();

        if (select == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione una Fila");
        } else {
            nombre = tabla_conductores_buscar.getValueAt(select, 1).toString();                       

             original.combo_conductor.setSelectedItem(nombre);
             original.setVisible(true);
             this.hide();
            

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tabla_conductores_buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_conductores_buscarMouseClicked

    }//GEN-LAST:event_tabla_conductores_buscarMouseClicked

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed

        int index = combo_filtro.getSelectedIndex();
        
        if (index == 0) {
            JOptionPane.showMessageDialog(null, "SELECCIONE UNA OPCION");
        }else if(index == 1){
            
            String lider = txt_cedula.getText();

            if (lider.equals("")) {
                JOptionPane.showMessageDialog(null, "INGRESE CEDULA");
            } else {
                consulta_identificacion(lider);
                conexion.cerrar();
            }
            
        }else if(index == 2){
            
            String empresa = txt_empresa.getText();

            if (empresa.equals("")) {
                JOptionPane.showMessageDialog(null, "INGRESE EMPRESA");
            } else {
                consulta_empresa(empresa);
                conexion.cerrar();
            }
        }else if(index == 3){
            String nombre = txt_nombre_cond.getText();

            if (nombre.equals("")) {
                JOptionPane.showMessageDialog(null, "INGRESE NOMBRE");
            } else {
                consulta_nombre(nombre);
                conexion.cerrar();
            }
        }else{
            String placa = txt_placa.getText();

            if (placa.equals("")) {
                JOptionPane.showMessageDialog(null, "INGRESE PLACA");
            } else {
                consulta_placa(placa);
                conexion.cerrar();
            }
        }
        
        
        
       
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void combo_filtroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_filtroItemStateChanged
       
        int index = combo_filtro.getSelectedIndex();

        switch (index) {
            case 1:
                this.txt_empresa.setEnabled(false);
                this.txt_nombre_cond.setEnabled(false);
                this.txt_placa.setEnabled(false);
                this.txt_cedula.setEnabled(true);
                this.txt_cedula.setEditable(true);
                break;
            case 2:
                this.txt_cedula.setEnabled(false);
                this.txt_nombre_cond.setEnabled(false);
                this.txt_placa.setEnabled(false);
                this.txt_empresa.setEnabled(true);
                this.txt_empresa.setEditable(true);
                break;
            case 3:
                this.txt_cedula.setEnabled(false);
                this.txt_empresa.setEnabled(false);
                this.txt_placa.setEnabled(false);
                this.txt_nombre_cond.setEnabled(true);
                this.txt_nombre_cond.setEditable(true);
                break;
            case 4:
                this.txt_cedula.setEnabled(false);
                this.txt_empresa.setEnabled(false);
                this.txt_nombre_cond.setEnabled(false);
                this.txt_placa.setEnabled(true);
                this.txt_placa.setEditable(true);
                break;
            default:
                this.txt_cedula.setEnabled(false);
                this.txt_empresa.setEnabled(false);
                this.txt_nombre_cond.setEnabled(false);
        }

                
    }//GEN-LAST:event_combo_filtroItemStateChanged

    private void btn_guardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardar1ActionPerformed
        
        cargar_tabla_conductor();
        
    }//GEN-LAST:event_btn_guardar1ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ConsultarConductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ConsultarConductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ConsultarConductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ConsultarConductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ConsultarConductor().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_guardar1;
    private javax.swing.JComboBox combo_filtro;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_conductores_buscar;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_empresa;
    private javax.swing.JTextField txt_nombre_cond;
    private javax.swing.JTextField txt_placa;
    // End of variables declaration//GEN-END:variables
 
    
    void cargar_tabla_conductor() {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"CEDULA", "NOMBRE", "EMPRESA", "PLACA"};
        String[] registro = new String[5];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
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

                registro[0] = rs.getString("CEDULA");
                registro[1] = rs.getString("NOMBRE");
                registro[2] = rs.getString("EMPRE");
                registro[3] = rs.getString("PLACA");

                modelo.addRow(registro);
            }
            tabla_conductores_buscar.setModel(modelo);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }
    
    
    
     // METODO PARA CONSULTAR IDENTIFICACION
    public void consulta_identificacion(String identificacion) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"CEDULA", "NOMBRE", "EMPRESA", "PLACA"};
        String[] registro = new String[5];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

         query = "SELECT "
                + "CEDULA AS CEDULA, "
                + "NOMBRE_CONDUCTOR AS NOMBRE, "
                + "EMPRESA AS EMPRE, "
                + "PLACA_VEHICULO AS PLACA "
                + "FROM CONDUCTORES "
                + "WHERE "  
                + "CEDULA LIKE '%" + identificacion + "%' " 
                + "ORDER BY NOMBRE_CONDUCTOR ASC";
         
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("CEDULA");
                registro[1] = rs.getString("NOMBRE");
                registro[2] = rs.getString("EMPRE");
                registro[3] = rs.getString("PLACA");

                modelo.addRow(registro);
            }
            tabla_conductores_buscar.setModel(modelo);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

    
     // METODO PARA CONSULTAR EMPRESA
    public void consulta_empresa(String empresa) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"CEDULA", "NOMBRE", "EMPRESA", "PLACA"};
        String[] registro = new String[5];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

         query = "SELECT "
                + "CEDULA AS CEDULA, "
                + "NOMBRE_CONDUCTOR AS NOMBRE, "
                + "EMPRESA AS EMPRE, "
                + "PLACA_VEHICULO AS PLACA "
                + "FROM CONDUCTORES "
                + "WHERE "  
                + "EMPRESA LIKE '%" + empresa + "%' " 
                + "ORDER BY NOMBRE_CONDUCTOR ASC";
         
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("CEDULA");
                registro[1] = rs.getString("NOMBRE");
                registro[2] = rs.getString("EMPRE");
                registro[3] = rs.getString("PLACA");

                modelo.addRow(registro);
            }
            tabla_conductores_buscar.setModel(modelo);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }
    
    
     // METODO PARA CONSULTAR NOMBRE
    public void consulta_nombre(String nombre) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"CEDULA", "NOMBRE", "EMPRESA", "PLACA"};
        String[] registro = new String[5];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

         query = "SELECT "
                + "CEDULA AS CEDULA, "
                + "NOMBRE_CONDUCTOR AS NOMBRE, "
                + "EMPRESA AS EMPRE, "
                + "PLACA_VEHICULO AS PLACA "
                + "FROM CONDUCTORES "
                + "WHERE "  
                + "NOMBRE_CONDUCTOR LIKE '%" + nombre + "%' " 
                + "ORDER BY NOMBRE_CONDUCTOR ASC";
         
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("CEDULA");
                registro[1] = rs.getString("NOMBRE");
                registro[2] = rs.getString("EMPRE");
                registro[3] = rs.getString("PLACA");

                modelo.addRow(registro);
            }
            tabla_conductores_buscar.setModel(modelo);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }
    
    
     // METODO PARA CONSULTAR IDENTIFICACION
    public void consulta_placa(String placa) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"CEDULA", "NOMBRE", "EMPRESA", "PLACA"};
        String[] registro = new String[5];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

         query = "SELECT "
                + "CEDULA AS CEDULA, "
                + "NOMBRE_CONDUCTOR AS NOMBRE, "
                + "EMPRESA AS EMPRE, "
                + "PLACA_VEHICULO AS PLACA "
                + "FROM CONDUCTORES "
                + "WHERE "  
                + "PLACA_VEHICULO LIKE '%" + placa + "%' " 
                + "ORDER BY NOMBRE_CONDUCTOR ASC";
         
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("CEDULA");
                registro[1] = rs.getString("NOMBRE");
                registro[2] = rs.getString("EMPRE");
                registro[3] = rs.getString("PLACA");

                modelo.addRow(registro);
            }
            tabla_conductores_buscar.setModel(modelo);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }
    
     // METODO PARA ORGANIZAR COLUMNAS
    public void ancho_columnas() {
        tabla_conductores_buscar.getColumnModel().getColumn(0).setPreferredWidth(100);
        tabla_conductores_buscar.getColumnModel().getColumn(1).setPreferredWidth(200);
        tabla_conductores_buscar.getColumnModel().getColumn(2).setPreferredWidth(200);
        tabla_conductores_buscar.getColumnModel().getColumn(3).setPreferredWidth(200);
    }
}
