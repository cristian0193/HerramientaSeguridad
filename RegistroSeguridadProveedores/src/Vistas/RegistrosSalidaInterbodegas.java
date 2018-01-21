package Vistas;

import Conexion.ConexioSQLite;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class RegistrosSalidaInterbodegas extends javax.swing.JFrame {

    public static DefaultTableCellRenderer Alinear;
    public static DefaultTableModel modelo;
    ConexioSQLite conexion;

    public RegistrosSalidaInterbodegas() {
        initComponents();
        this.setLocationRelativeTo(null);
        cargar_tabla();
        ancho_columnas();
        centrar_datos();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_registro = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        txt_consulta_inicial = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txt_consulta_final = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txt_consulta_placa = new javax.swing.JTextField();
        txt_consulta_cedula = new javax.swing.JTextField();
        txt_consulta_guarda = new javax.swing.JTextField();
        txt_consulta_autorizo = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        combo_consulta = new javax.swing.JComboBox();
        jButton5 = new javax.swing.JButton();
        btn_refrescar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1240, 630));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRO DE SALIDA DE INTERBODEGAS");

        tabla_registro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla_registro.setRowHeight(25);
        tabla_registro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_registroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_registro);
        tabla_registro.getAccessibleContext().setAccessibleName("");

        jLabel18.setText("Fecha Inicial :");

        txt_consulta_inicial.setEditable(false);
        txt_consulta_inicial.setText("0000-00-00 00:00:00");
        txt_consulta_inicial.setToolTipText("");
        txt_consulta_inicial.setEnabled(false);

        jLabel19.setText("Fecha Final :");

        txt_consulta_final.setEditable(false);
        txt_consulta_final.setText("0000-00-00 00:00:00");
        txt_consulta_final.setToolTipText("");
        txt_consulta_final.setEnabled(false);

        jLabel25.setText("Cedula :");

        jLabel20.setText("Placa :");

        txt_consulta_placa.setEditable(false);
        txt_consulta_placa.setToolTipText("");
        txt_consulta_placa.setEnabled(false);

        txt_consulta_cedula.setEditable(false);
        txt_consulta_cedula.setToolTipText("");
        txt_consulta_cedula.setEnabled(false);

        txt_consulta_guarda.setEditable(false);
        txt_consulta_guarda.setToolTipText("");
        txt_consulta_guarda.setEnabled(false);

        txt_consulta_autorizo.setEditable(false);
        txt_consulta_autorizo.setToolTipText("");
        txt_consulta_autorizo.setEnabled(false);

        jLabel22.setText("Autorizo :");

        jLabel26.setText("Guarda :");

        jLabel21.setText("Seleccionar Filtro :");

        combo_consulta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "RANGO DE FECHAS", "PLACA", "CEDULA", "AUTORIZA", "GUARDA" }));
        combo_consulta.setToolTipText("Permite seleccionar el Filtro para la consulta de informacion");
        combo_consulta.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_consultaItemStateChanged(evt);
            }
        });
        combo_consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_consultaActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(102, 255, 255));
        jButton5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton5.setText("Buscar");
        jButton5.setToolTipText("Permite Buscar la informacion seleccioda en el filtro");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        btn_refrescar.setBackground(new java.awt.Color(255, 255, 51));
        btn_refrescar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_refrescar.setText("Refrescar");
        btn_refrescar.setToolTipText("Permite Refrescar los datos de la tabla.");
        btn_refrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refrescarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1232, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_consulta_inicial)
                            .addComponent(txt_consulta_final, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_consulta_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_consulta_placa, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_consulta_autorizo)
                            .addComponent(txt_consulta_guarda, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(btn_refrescar, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(combo_consulta, 0, 200, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(14, 14, 14))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_consulta_autorizo)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combo_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_consulta_inicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_consulta_placa)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_consulta_guarda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_consulta_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_consulta_final, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton5)
                                .addComponent(btn_refrescar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 22, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabla_registroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_registroMouseClicked


    }//GEN-LAST:event_tabla_registroMouseClicked

    private void combo_consultaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_consultaItemStateChanged

        int index = combo_consulta.getSelectedIndex();

        if (index == 0) {
            JOptionPane.showMessageDialog(null, "SELECCIONE UNA OPCION");
        } else if (index == 1) {
            this.txt_consulta_inicial.setEnabled(true);
            this.txt_consulta_final.setEnabled(true);
            this.txt_consulta_placa.setEnabled(false);
            this.txt_consulta_cedula.setEnabled(false);
            this.txt_consulta_autorizo.setEnabled(false);
            this.txt_consulta_guarda.setEnabled(false);

            this.txt_consulta_inicial.setEditable(true);
            this.txt_consulta_final.setEditable(true);

        } else if (index == 2) {
            this.txt_consulta_inicial.setEnabled(false);
            this.txt_consulta_final.setEnabled(false);
            this.txt_consulta_placa.setEnabled(true);
            this.txt_consulta_cedula.setEnabled(false);
            this.txt_consulta_autorizo.setEnabled(false);
            this.txt_consulta_guarda.setEnabled(false);

            this.txt_consulta_placa.setEditable(true);

        } else if (index == 3) {
            this.txt_consulta_inicial.setEnabled(false);
            this.txt_consulta_final.setEnabled(false);
            this.txt_consulta_placa.setEnabled(false);
            this.txt_consulta_cedula.setEnabled(true);
            this.txt_consulta_autorizo.setEnabled(false);
            this.txt_consulta_guarda.setEnabled(false);

            this.txt_consulta_cedula.setEditable(true);
        } else if (index == 4) {
            this.txt_consulta_inicial.setEnabled(false);
            this.txt_consulta_final.setEnabled(false);
            this.txt_consulta_placa.setEnabled(false);
            this.txt_consulta_cedula.setEnabled(false);
            this.txt_consulta_autorizo.setEnabled(true);
            this.txt_consulta_guarda.setEnabled(false);

            this.txt_consulta_autorizo.setEditable(true);
        } else {
            this.txt_consulta_inicial.setEnabled(false);
            this.txt_consulta_final.setEnabled(false);
            this.txt_consulta_placa.setEnabled(false);
            this.txt_consulta_cedula.setEnabled(false);
            this.txt_consulta_autorizo.setEnabled(false);
            this.txt_consulta_guarda.setEnabled(true);

            this.txt_consulta_guarda.setEditable(true);
        }

    }//GEN-LAST:event_combo_consultaItemStateChanged

    private void combo_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_consultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_consultaActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        int index = combo_consulta.getSelectedIndex();

        if (index == 0) {
            JOptionPane.showMessageDialog(null, "SELECCIONE UNA OPCION");
        } else if (index == 1) {

            if (this.txt_consulta_inicial.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "INGRESE FECHA INICIAL");
            } else if (this.txt_consulta_final.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "INGRESE FECHA FINAL");
            } else {
                String fecha_ini = txt_consulta_inicial.getText();
                String fecha_fin = txt_consulta_final.getText();

                consulta_rango_fechas(fecha_ini, fecha_fin);
                ancho_columnas();
                centrar_datos();
                conexion.cerrar();
            }

        } else if (index == 2) {

            String placa = txt_consulta_placa.getText();

            if (placa.equals("")) {
                JOptionPane.showMessageDialog(null, "INGRESE PLACA");
            } else {
                consulta_placa(placa);
                ancho_columnas();
                centrar_datos();
                conexion.cerrar();
            }

        } else if (index == 3) {
            String cedula = txt_consulta_cedula.getText();

            if (cedula.equals("")) {
                JOptionPane.showMessageDialog(null, "INGRESE CEDULA");
            } else {
                consulta_cedula(cedula);
                ancho_columnas();
                centrar_datos();
                conexion.cerrar();
            }
        } else if (index == 4) {
            String autorizo = txt_consulta_autorizo.getText();

            if (autorizo.equals("")) {
                JOptionPane.showMessageDialog(null, "INGRESE AUTORIZADO");
            } else {
                consulta_autorizo(autorizo);
                ancho_columnas();
                centrar_datos();
                conexion.cerrar();
            }
        } else {
            String guarda = txt_consulta_guarda.getText();

            if (guarda.equals("")) {
                JOptionPane.showMessageDialog(null, "INGRESE GUARDA");
            } else {
                consulta_guarda(guarda);
                ancho_columnas();
                centrar_datos();
                conexion.cerrar();
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btn_refrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refrescarActionPerformed
        cargar_tabla();
        ancho_columnas();
        centrar_datos();
        conexion.cerrar();
    }//GEN-LAST:event_btn_refrescarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_refrescar;
    private javax.swing.JComboBox combo_consulta;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_registro;
    private javax.swing.JTextField txt_consulta_autorizo;
    private javax.swing.JTextField txt_consulta_cedula;
    private javax.swing.JTextField txt_consulta_final;
    private javax.swing.JTextField txt_consulta_guarda;
    private javax.swing.JTextField txt_consulta_inicial;
    private javax.swing.JTextField txt_consulta_placa;
    // End of variables declaration//GEN-END:variables

    public void LimpiarCampos() {

    }

// METODO PARA CARGAR TABLA DE REGISTRO
    public void cargar_tabla() {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"ID", "INGRESO", "SALIDA", "FICHA", "CONDUCTOR", "EMPRESA", "CEDULA", "PLACA", "AUTORIZO", "GUARDA", "ESTADO", "OBSERVA"};
        String[] registro = new String[12];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "ID_REGISTRO AS ID, "
                + "FECHA_ENTRADA AS ENTRADA, "
                + "FECHA_SALIDA AS SALIDA, "
                + "N_FICHA AS FICHA, "
                + "NOMBRE_CONDUCTOR AS NOMBRE, "
                + "EMPRESA AS EMPRESA, "
                + "CEDULA AS CEDULA, "
                + "PLACA AS PLACA, "
                + "AUTORIZADO AS AUTORIZADO, "
                + "GUARDA AS GUARDA, "
                + "ESTADO AS ESTADOS, "
                + "OBSERVACIONES AS OBSERVACION "
                + "FROM "
                + "REGISTRO_SEGURIDAD "
                + "WHERE ESTADO = 'SALIDA' "
                + "ORDER BY FECHA_ENTRADA DESC;";
        System.out.println(query);
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("ID");
                registro[1] = rs.getString("ENTRADA");
                registro[2] = rs.getString("SALIDA");
                registro[3] = rs.getString("FICHA");
                registro[4] = rs.getString("NOMBRE");
                registro[5] = rs.getString("EMPRESA");
                registro[6] = rs.getString("CEDULA");
                registro[7] = rs.getString("PLACA");
                registro[8] = rs.getString("AUTORIZADO");
                registro[9] = rs.getString("GUARDA");
                registro[10] = rs.getString("ESTADOS");
                registro[11] = rs.getString("OBSERVACION");

                modelo.addRow(registro);
            }
            tabla_registro.setModel(modelo);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

    // METODO PARA CONSULTAR RANGO DE FECHAS
    public void consulta_rango_fechas(String fecha_inicio, String fecha_final) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"ID", "INGRESO", "SALIDA", "FICHA", "CONDUCTOR", "EMPRESA", "CEDULA", "PLACA", "AUTORIZO", "GUARDA", "ESTADO", "OBSERVA"};
        String[] registro = new String[12];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "ID_REGISTRO AS ID, "
                + "FECHA_ENTRADA AS ENTRADA, "
                + "FECHA_SALIDA AS SALIDA, "
                + "N_FICHA AS FICHA, "
                + "NOMBRE_CONDUCTOR AS NOMBRE, "
                + "EMPRESA AS EMPRESA, "
                + "CEDULA AS CEDULA, "
                + "PLACA AS PLACA, "
                + "AUTORIZADO AS AUTORIZADO, "
                + "GUARDA AS GUARDA, "
                + "ESTADO AS ESTADOS, "
                + "OBSERVACIONES AS OBSERVACION "
                + "FROM "
                + "REGISTRO_SEGURIDAD "
                + "WHERE "
                + "ESTADO = 'SALIDA' AND "
                + "FECHA_ENTRADA BETWEEN '" + fecha_inicio + "' AND '" + fecha_final + "'"
                + "ORDER BY FECHA_ENTRADA DESC";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("ID");
                registro[1] = rs.getString("ENTRADA");
                registro[2] = rs.getString("SALIDA");
                registro[3] = rs.getString("FICHA");
                registro[4] = rs.getString("NOMBRE");
                registro[5] = rs.getString("EMPRESA");
                registro[6] = rs.getString("CEDULA");
                registro[7] = rs.getString("PLACA");
                registro[8] = rs.getString("AUTORIZADO");
                registro[9] = rs.getString("GUARDA");
                registro[10] = rs.getString("ESTADOS");
                registro[11] = rs.getString("OBSERVACION");

                modelo.addRow(registro);
            }
            tabla_registro.setModel(modelo);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

    // METODO PARA CONSULTAR PLACAS
    public void consulta_placa(String placa) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"ID", "INGRESO", "SALIDA", "FICHA", "CONDUCTOR", "EMPRESA", "CEDULA", "PLACA", "AUTORIZO", "GUARDA", "ESTADO", "OBSERVA"};
        String[] registro = new String[12];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "ID_REGISTRO AS ID, "
                + "FECHA_ENTRADA AS ENTRADA, "
                + "FECHA_SALIDA AS SALIDA, "
                + "N_FICHA AS FICHA, "
                + "NOMBRE_CONDUCTOR AS NOMBRE, "
                + "EMPRESA AS EMPRESA, "
                + "CEDULA AS CEDULA, "
                + "PLACA AS PLACA, "
                + "AUTORIZADO AS AUTORIZADO, "
                + "GUARDA AS GUARDA, "
                + "ESTADO AS ESTADOS, "
                + "OBSERVACIONES AS OBSERVACION "
                + "FROM "
                + "REGISTRO_SEGURIDAD "
                + "WHERE "
                + "ESTADO = 'SALIDA' AND "
                + "PLACA LIKE '%" + placa + "%' "
                + "ORDER BY FECHA_ENTRADA DESC";
        System.out.println(query);
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("ID");
                registro[1] = rs.getString("ENTRADA");
                registro[2] = rs.getString("SALIDA");
                registro[3] = rs.getString("FICHA");
                registro[4] = rs.getString("NOMBRE");
                registro[5] = rs.getString("EMPRESA");
                registro[6] = rs.getString("CEDULA");
                registro[7] = rs.getString("PLACA");
                registro[8] = rs.getString("AUTORIZADO");
                registro[9] = rs.getString("GUARDA");
                registro[10] = rs.getString("ESTADOS");
                registro[11] = rs.getString("OBSERVACION");

                modelo.addRow(registro);
            }
            tabla_registro.setModel(modelo);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

    // METODO PARA CONSULTAR CEDULA
    public void consulta_cedula(String cedula) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"ID", "INGRESO", "SALIDA", "FICHA", "CONDUCTOR", "EMPRESA", "CEDULA", "PLACA", "AUTORIZO", "GUARDA", "ESTADO", "OBSERVA"};
        String[] registro = new String[12];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "ID_REGISTRO AS ID, "
                + "FECHA_ENTRADA AS ENTRADA, "
                + "FECHA_SALIDA AS SALIDA, "
                + "N_FICHA AS FICHA, "
                + "NOMBRE_CONDUCTOR AS NOMBRE, "
                + "EMPRESA AS EMPRESA, "
                + "CEDULA AS CEDULA, "
                + "PLACA AS PLACA, "
                + "AUTORIZADO AS AUTORIZADO, "
                + "GUARDA AS GUARDA, "
                + "ESTADO AS ESTADOS, "
                + "OBSERVACIONES AS OBSERVACION "
                + "FROM "
                + "REGISTRO_SEGURIDAD "
                + "WHERE "
                + "ESTADO = 'SALIDA' AND "
                + "CEDULA LIKE '%" + cedula + "%' "
                + "ORDER BY FECHA_ENTRADA DESC";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("ID");
                registro[1] = rs.getString("ENTRADA");
                registro[2] = rs.getString("SALIDA");
                registro[3] = rs.getString("FICHA");
                registro[4] = rs.getString("NOMBRE");
                registro[5] = rs.getString("EMPRESA");
                registro[6] = rs.getString("CEDULA");
                registro[7] = rs.getString("PLACA");
                registro[8] = rs.getString("AUTORIZADO");
                registro[9] = rs.getString("GUARDA");
                registro[10] = rs.getString("ESTADOS");
                registro[11] = rs.getString("OBSERVACION");

                modelo.addRow(registro);
            }
            tabla_registro.setModel(modelo);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

    // METODO PARA CONSULTAR AUTORIZADO
    public void consulta_autorizo(String autorizo) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"ID", "INGRESO", "SALIDA", "FICHA", "CONDUCTOR", "EMPRESA", "CEDULA", "PLACA", "AUTORIZO", "GUARDA", "ESTADO", "OBSERVA"};
        String[] registro = new String[12];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "ID_REGISTRO AS ID, "
                + "FECHA_ENTRADA AS ENTRADA, "
                + "FECHA_SALIDA AS SALIDA, "
                + "N_FICHA AS FICHA, "
                + "NOMBRE_CONDUCTOR AS NOMBRE, "
                + "EMPRESA AS EMPRESA, "
                + "CEDULA AS CEDULA, "
                + "PLACA AS PLACA, "
                + "AUTORIZADO AS AUTORIZADO, "
                + "GUARDA AS GUARDA, "
                + "ESTADO AS ESTADOS, "
                + "OBSERVACIONES AS OBSERVACION "
                + "FROM "
                + "REGISTRO_SEGURIDAD "
                + "WHERE "
                + "ESTADO = 'SALIDA' AND "
                + "AUTORIZADO LIKE '%" + autorizo + "%' "
                + "ORDER BY FECHA_ENTRADA DESC";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("ID");
                registro[1] = rs.getString("ENTRADA");
                registro[2] = rs.getString("SALIDA");
                registro[3] = rs.getString("FICHA");
                registro[4] = rs.getString("NOMBRE");
                registro[5] = rs.getString("EMPRESA");
                registro[6] = rs.getString("CEDULA");
                registro[7] = rs.getString("PLACA");
                registro[8] = rs.getString("AUTORIZADO");
                registro[9] = rs.getString("GUARDA");
                registro[10] = rs.getString("ESTADOS");
                registro[11] = rs.getString("OBSERVACION");

                modelo.addRow(registro);
            }
            tabla_registro.setModel(modelo);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

    // METODO PARA CONSULTAR GUARDA
    public void consulta_guarda(String guarda) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"ID", "INGRESO", "SALIDA", "FICHA", "CONDUCTOR", "EMPRESA", "CEDULA", "PLACA", "AUTORIZO", "GUARDA", "ESTADO", "OBSERVA"};
        String[] registro = new String[12];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "ID_REGISTRO AS ID, "
                + "FECHA_ENTRADA AS ENTRADA, "
                + "FECHA_SALIDA AS SALIDA, "
                + "N_FICHA AS FICHA, "
                + "NOMBRE_CONDUCTOR AS NOMBRE, "
                + "EMPRESA AS EMPRESA, "
                + "CEDULA AS CEDULA, "
                + "PLACA AS PLACA, "
                + "AUTORIZADO AS AUTORIZADO, "
                + "GUARDA AS GUARDA, "
                + "ESTADO AS ESTADOS, "
                + "OBSERVACIONES AS OBSERVACION "
                + "FROM "
                + "REGISTRO_SEGURIDAD "
                + "WHERE "
                + "ESTADO = 'SALIDA' AND "
                + "GUARDA LIKE '%" + guarda + "%' "
                + "ORDER BY FECHA_ENTRADA DESC";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("ID");
                registro[1] = rs.getString("ENTRADA");
                registro[2] = rs.getString("SALIDA");
                registro[3] = rs.getString("FICHA");
                registro[4] = rs.getString("NOMBRE");
                registro[5] = rs.getString("EMPRESA");
                registro[6] = rs.getString("CEDULA");
                registro[7] = rs.getString("PLACA");
                registro[8] = rs.getString("AUTORIZADO");
                registro[9] = rs.getString("GUARDA");
                registro[10] = rs.getString("ESTADOS");
                registro[11] = rs.getString("OBSERVACION");

                modelo.addRow(registro);
            }
            tabla_registro.setModel(modelo);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

    // METODO PARA CARGAR JCOMBOBOX GUARDA
    public void ancho_columnas() {
        tabla_registro.getColumnModel().getColumn(0).setPreferredWidth(30);
        tabla_registro.getColumnModel().getColumn(1).setPreferredWidth(130);
        tabla_registro.getColumnModel().getColumn(2).setPreferredWidth(130);
        tabla_registro.getColumnModel().getColumn(3).setPreferredWidth(40);
        tabla_registro.getColumnModel().getColumn(4).setPreferredWidth(150);
        tabla_registro.getColumnModel().getColumn(5).setPreferredWidth(100);
        tabla_registro.getColumnModel().getColumn(6).setPreferredWidth(70);
        tabla_registro.getColumnModel().getColumn(7).setPreferredWidth(70);
        tabla_registro.getColumnModel().getColumn(8).setPreferredWidth(120);
        tabla_registro.getColumnModel().getColumn(9).setPreferredWidth(120);
        tabla_registro.getColumnModel().getColumn(10).setPreferredWidth(50);
        tabla_registro.getColumnModel().getColumn(11).setPreferredWidth(100);
    }

    // METODO PARA CARGAR JCOMBOBOX GUARDA
    public void centrar_datos() {
        Alinear = new DefaultTableCellRenderer();
        Alinear.setHorizontalAlignment(SwingConstants.CENTER);
        tabla_registro.getColumnModel().getColumn(0).setCellRenderer(Alinear);
        tabla_registro.getColumnModel().getColumn(3).setCellRenderer(Alinear);
        tabla_registro.getColumnModel().getColumn(6).setCellRenderer(Alinear);
        tabla_registro.getColumnModel().getColumn(7).setCellRenderer(Alinear);
        tabla_registro.getColumnModel().getColumn(10).setCellRenderer(Alinear);
    }

}
