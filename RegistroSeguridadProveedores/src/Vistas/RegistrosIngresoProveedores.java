package Vistas;

import Conexion.ConexioSQLite;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class RegistrosIngresoProveedores extends javax.swing.JFrame {

    public static DefaultTableModel modelo;
    public static DefaultTableCellRenderer Alinear;
    ConexioSQLite conexion;

    public RegistrosIngresoProveedores() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.txt_n_registro.setVisible(false);
        cargar_tabla();
        cargar_lista_conductor();
        cargar_tabla_autorizo();
        cargar_tabla_guarda();
        this.btn_actualizar.setEnabled(false);
        ancho_columnas();
        centrar_datos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        combo_conductor = new javax.swing.JComboBox();
        txt_ficha = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_numero_cedula = new javax.swing.JTextField();
        txt_empresa = new javax.swing.JTextField();
        txt_placa = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_fecha_ingreso = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_fecha_salida = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        combo_autorizo = new javax.swing.JComboBox();
        combo_guarda = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        txt_estado_color = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_observaciones = new javax.swing.JTextArea();
        btn_guardar = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        btn_refrescar = new javax.swing.JButton();
        txt_n_registro = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txt_estado = new javax.swing.JTextField();
        combo_marca = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        btn_conuslta = new javax.swing.JButton();
        btn_conuslta1 = new javax.swing.JButton();
        txt_nombre_conductor_consultado = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_registro = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txt_consulta_placa = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txt_consulta_cedula = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        combo_consulta = new javax.swing.JComboBox();
        txt_consulta_inicial = new javax.swing.JTextField();
        txt_consulta_final = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txt_consulta_autorizo = new javax.swing.JTextField();
        txt_consulta_guarda = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        txt_consultar_conductor = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txt_consultar_empresa = new javax.swing.JTextField();

        jMenuItem1.setText("Detalle de Observacion");
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1240, 630));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRO DE INGRESO Y SALIDA DE PROVEEDORES");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de Registro"));
        jPanel1.setMinimumSize(new java.awt.Dimension(1184, 320));
        jPanel1.setPreferredSize(new java.awt.Dimension(1191, 320));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("NOMBRE CONDUCTOR :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 180, 20));

        jLabel3.setText("NUMERO FICHA :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, 130, 44));

        combo_conductor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar" }));
        combo_conductor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_conductorItemStateChanged(evt);
            }
        });
        jPanel1.add(combo_conductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 210, -1));

        txt_ficha.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_ficha.setForeground(new java.awt.Color(255, 0, 0));
        txt_ficha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_ficha.setEnabled(false);
        txt_ficha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fichaActionPerformed(evt);
            }
        });
        jPanel1.add(txt_ficha, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 30, 63, 47));

        jLabel4.setText("NUMERO CEDULA :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 170, 20));

        jLabel5.setText("EMPRESA :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 160, 20));

        jLabel6.setText("PLACA VEHICULO :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 160, 20));

        txt_numero_cedula.setEditable(false);
        jPanel1.add(txt_numero_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 210, -1));

        txt_empresa.setEditable(false);
        jPanel1.add(txt_empresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 272, -1));

        txt_placa.setEditable(false);
        jPanel1.add(txt_placa, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 132, -1));

        jLabel7.setText("FECHA Y HORA DE INGRESO :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 180, 20));

        txt_fecha_ingreso.setEditable(false);
        txt_fecha_ingreso.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(txt_fecha_ingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 205, -1));

        jLabel8.setText("FECHA Y HORA DE SALIDA :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, 167, 20));

        txt_fecha_salida.setEditable(false);
        txt_fecha_salida.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_fecha_salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fecha_salidaActionPerformed(evt);
            }
        });
        jPanel1.add(txt_fecha_salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 150, 197, -1));

        jLabel9.setText("PERSONA QUE AUTORIZA :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, 159, 20));

        jLabel10.setText("GUARDA TURNO :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 166, 20));

        combo_autorizo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar" }));
        jPanel1.add(combo_autorizo, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, 197, -1));

        combo_guarda.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar" }));
        jPanel1.add(combo_guarda, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 120, 197, -1));

        jLabel12.setText("ESTADO :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, 140, 20));

        txt_estado_color.setEditable(false);
        txt_estado_color.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_estado_color.setForeground(new java.awt.Color(255, 0, 0));
        txt_estado_color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_estado_colorActionPerformed(evt);
            }
        });
        jPanel1.add(txt_estado_color, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 180, 90, -1));

        jLabel13.setText("OBSERVACIONES :");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, 178, 82));

        txt_observaciones.setColumns(20);
        txt_observaciones.setRows(5);
        jScrollPane2.setViewportView(txt_observaciones);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 220, 439, 80));

        btn_guardar.setBackground(new java.awt.Color(0, 255, 0));
        btn_guardar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_guardar.setText("Guardar");
        btn_guardar.setToolTipText("Permite Guardar el proyecto en Base de Datos");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 90, 30));

        btn_actualizar.setBackground(new java.awt.Color(255, 102, 102));
        btn_actualizar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_actualizar.setText("Actualizar");
        btn_actualizar.setToolTipText("Permite Actualizar el proyecto en Base de Datos");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 90, 30));

        btn_limpiar.setBackground(new java.awt.Color(0, 153, 255));
        btn_limpiar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_limpiar.setText("Limpiar");
        btn_limpiar.setToolTipText("Permite Limpiar los cambios");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 90, 30));

        btn_refrescar.setBackground(new java.awt.Color(255, 255, 51));
        btn_refrescar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_refrescar.setText("Refrescar");
        btn_refrescar.setToolTipText("Permite Refrescar los datos de la tabla.");
        btn_refrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refrescarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_refrescar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 90, 30));

        txt_n_registro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_n_registro.setForeground(new java.awt.Color(255, 0, 0));
        txt_n_registro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_n_registro.setEnabled(false);
        txt_n_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_n_registroActionPerformed(evt);
            }
        });
        jPanel1.add(txt_n_registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 30, 63, 47));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("(*)");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 40, 20, 20));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("(*)");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 120, 20, 20));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("(*)");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, 20, 20));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 0, 0));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("(*)");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 90, 20, 20));

        txt_estado.setEditable(false);
        txt_estado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_estado.setForeground(new java.awt.Color(255, 0, 0));
        txt_estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_estadoActionPerformed(evt);
            }
        });
        jPanel1.add(txt_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 180, 100, -1));

        combo_marca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "SI" }));
        combo_marca.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_marcaItemStateChanged(evt);
            }
        });
        jPanel1.add(combo_marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 110, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("SALE :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 50, 21));

        btn_conuslta.setText("...");
        btn_conuslta.setToolTipText("Pulsa para Buscar un conductor");
        btn_conuslta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_conusltaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_conuslta, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 90, 40, -1));

        btn_conuslta1.setText("...");
        btn_conuslta1.setToolTipText("Pulsa para Buscar un conductor");
        btn_conuslta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_conuslta1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_conuslta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 37, 40, -1));

        txt_nombre_conductor_consultado.setEditable(false);
        jPanel1.add(txt_nombre_conductor_consultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 210, -1));

        tabla_registro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla_registro.setRowHeight(23);
        tabla_registro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_registroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_registro);

        jLabel18.setText("Fecha Inicial :");

        jLabel19.setText("Fecha Final :");

        jLabel20.setText("Placa :");

        txt_consulta_placa.setEditable(false);
        txt_consulta_placa.setToolTipText("");
        txt_consulta_placa.setEnabled(false);

        jLabel25.setText("Cedula :");

        txt_consulta_cedula.setEditable(false);
        txt_consulta_cedula.setToolTipText("");
        txt_consulta_cedula.setEnabled(false);

        jLabel21.setText("Seleccionar Filtro :");

        combo_consulta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "RANGO DE FECHAS", "PLACA", "CEDULA", "AUTORIZA", "GUARDA", "CONDUCTOR", "EMPRESA" }));
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

        txt_consulta_inicial.setEditable(false);
        txt_consulta_inicial.setText("0000-00-00 00:00:00");
        txt_consulta_inicial.setToolTipText("");
        txt_consulta_inicial.setEnabled(false);

        txt_consulta_final.setEditable(false);
        txt_consulta_final.setText("0000-00-00 00:00:00");
        txt_consulta_final.setToolTipText("");
        txt_consulta_final.setEnabled(false);

        jLabel26.setText("Guarda :");

        jLabel22.setText("Autorizo :");

        txt_consulta_autorizo.setEditable(false);
        txt_consulta_autorizo.setToolTipText("");
        txt_consulta_autorizo.setEnabled(false);

        txt_consulta_guarda.setEditable(false);
        txt_consulta_guarda.setToolTipText("");
        txt_consulta_guarda.setEnabled(false);

        jButton5.setBackground(new java.awt.Color(102, 255, 255));
        jButton5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton5.setText("Buscar");
        jButton5.setToolTipText("Permite Buscar la informacion seleccioda en el filtro");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel23.setText("Conductor:");

        txt_consultar_conductor.setEditable(false);
        txt_consultar_conductor.setToolTipText("");
        txt_consultar_conductor.setEnabled(false);

        jLabel27.setText("Empresa:");

        txt_consultar_empresa.setEditable(false);
        txt_consultar_empresa.setToolTipText("");
        txt_consultar_empresa.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_consulta_inicial, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addComponent(txt_consulta_final))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_consulta_placa, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_consulta_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_consulta_autorizo, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_consulta_guarda, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_consultar_conductor, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                            .addComponent(txt_consultar_empresa))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(combo_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1205, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt_consulta_inicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(20, 20, 20)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txt_consulta_final, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txt_consulta_placa)
                                        .addGap(20, 20, 20)
                                        .addComponent(txt_consulta_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(16, 16, 16))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txt_consulta_autorizo)
                                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(16, 16, 16)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txt_consulta_guarda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txt_consultar_conductor)
                                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(14, 14, 14)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txt_consultar_empresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combo_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_fecha_salidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fecha_salidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fecha_salidaActionPerformed

    private void txt_fichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fichaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fichaActionPerformed

    private void txt_estado_colorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_estado_colorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_estado_colorActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed

        if (combo_conductor.getSelectedIndex() == 0 || txt_numero_cedula.getText().equals("")
                || txt_empresa.getText().equals("") || txt_empresa.getText().equals("") || txt_placa.getText().equals("")
                || txt_fecha_ingreso.getText().equals("") || txt_ficha.getText().equals("")
                || combo_autorizo.getSelectedIndex() == 0 || combo_guarda.getSelectedIndex() == 0) {

            JOptionPane.showMessageDialog(null, "INGRESE TODOS LOS DATOS OBLIGATORIOS (*)");
        } else {

            String ficha = txt_ficha.getText();
            int numero = validacion_ficha_repetida(ficha);

            if (numero > 0) {
                JOptionPane.showMessageDialog(null, "LA FICHA : " + ficha + " SE ENCUENTRA SIENDO USADA");
            } else {
                conexion.cerrar();
                conexion = new ConexioSQLite();
                conexion.coneccionbase();

                String registro = txt_n_registro.getText();
                String conductor = combo_conductor.getSelectedItem().toString();
                String cedula = txt_numero_cedula.getText();
                String empresa = txt_empresa.getText();
                String placa = txt_placa.getText();
                String fecha_ingreso = txt_fecha_ingreso.getText();
                String ficha_ingreso = txt_ficha.getText();
                String autoriza = combo_autorizo.getSelectedItem().toString();
                String guarda = combo_guarda.getSelectedItem().toString();
                String fecha_salida = txt_fecha_salida.getText();
                String estado = txt_estado.getText();
                String observaciones = txt_observaciones.getText();

                boolean resultado = conexion.insert_registro(fecha_ingreso, fecha_salida, ficha_ingreso, conductor, empresa, cedula, placa, autoriza, guarda, estado, observaciones);

                if (resultado == true) {
                    JOptionPane.showMessageDialog(null, "INGRESO REGISTRADO");
                    LimpiarCampos();
                    cargar_tabla();
                    ancho_columnas();
                    centrar_datos();
                    conexion.cerrar();
                } else {
                    JOptionPane.showMessageDialog(null, "ERROR AL INSERTADAR");
                    ancho_columnas();
                    centrar_datos();
                    LimpiarCampos();
                }
            }
        }
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed

        if (this.txt_n_registro.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "SELECCIONE UN REGISTRO DE TABLA");
        } else if (this.combo_marca.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "SELECCIONE (SI) DESEA SALIR");
        } else {
            conexion.cerrar();
            conexion = new ConexioSQLite();
            conexion.coneccionbase();

            String registro = txt_n_registro.getText();
            String conductor = combo_conductor.getSelectedItem().toString();
            String cedula = txt_numero_cedula.getText();
            String empresa = txt_empresa.getText();
            String placa = txt_placa.getText();
            String fecha_ingreso = txt_fecha_ingreso.getText();
            String ficha = txt_ficha.getText();
            String autoriza = combo_autorizo.getSelectedItem().toString();
            String guarda = combo_guarda.getSelectedItem().toString();
            String fecha_salida = txt_fecha_salida.getText();
            String estado = txt_estado.getText();
            String observaciones = txt_observaciones.getText();

            boolean resultado = conexion.upgrade_registro(registro, fecha_ingreso, fecha_salida, ficha, conductor, empresa, cedula, placa, autoriza, guarda, estado, observaciones);

            if (resultado == true) {
                JOptionPane.showMessageDialog(null, "INGRESO ACTUALIZADO");
                LimpiarCampos();
                cargar_tabla();
                ancho_columnas();
                centrar_datos();
                conexion.cerrar();
            } else {
                JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR");
                ancho_columnas();
                centrar_datos();
                LimpiarCampos();
            }

        }


    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        LimpiarCampos();
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_refrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refrescarActionPerformed
        cargar_tabla();
        ancho_columnas();
        centrar_datos();
        conexion.cerrar();
    }//GEN-LAST:event_btn_refrescarActionPerformed

    private void txt_n_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_n_registroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_n_registroActionPerformed

    private void combo_conductorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_conductorItemStateChanged

        int opcion = combo_conductor.getSelectedIndex();
        if (opcion == 0) {
            this.txt_empresa.setText("");
            this.txt_numero_cedula.setText("");
            this.txt_placa.setText("");
            this.txt_estado.setText("");
            this.txt_fecha_ingreso.setText("");
            this.txt_estado_color.setBackground(Color.WHITE);
        } else {
            String nombre = combo_conductor.getSelectedItem().toString();
            this.txt_ficha.setEnabled(true);

            conexion = new ConexioSQLite();
            conexion.coneccionbase();

            String query = "";

            ConexioSQLite con = new ConexioSQLite();
            Connection cn = con.Conectar();

            query = "SELECT "
                    + "CEDULA AS CEDULA, "
                    + "EMPRESA AS EMPRESA, "
                    + "PLACA_VEHICULO AS PLACA "
                    + "FROM "
                    + "CONDUCTORES "
                    + "WHERE NOMBRE_CONDUCTOR = '" + nombre + "';";

            try {
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(query);

                String cedula = rs.getString("CEDULA");
                String empresa = rs.getString("EMPRESA");
                String placa = rs.getString("PLACA");

                this.txt_numero_cedula.setText(cedula);
                this.txt_empresa.setText(empresa);
                this.txt_placa.setText(placa);

                conexion.cerrar();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERROR EN CONSULTA");
            }

            Date fecha = new Date();

            DateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
            DateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");

            this.txt_fecha_ingreso.setText("" + formatoFecha.format(fecha) + " " + formatoHora.format(fecha) + "");
            this.txt_estado.setText("INGRESO");
            this.txt_estado_color.setBackground(Color.GREEN);
            this.txt_nombre_conductor_consultado.setText("");

//            Calendar calendario = Calendar.getInstance();
//            int dia, mes, año, hora, minutos, segundos;
//
//            dia = calendario.get(Calendar.DAY_OF_MONTH);
//            mes = calendario.get(Calendar.MONTH) + 1;
//            año = calendario.get(Calendar.YEAR);
//
//            hora = calendario.get(Calendar.HOUR_OF_DAY);
//            minutos = calendario.get(Calendar.MINUTE);
//            segundos = calendario.get(Calendar.SECOND);
//
//            this.txt_fecha_ingreso.setText("" + año + "-" + mes + "-" + dia + " " + hora + ":" + minutos + ":" + segundos);
//            this.txt_estado.setText("INGRESO");
//            this.txt_estado_color.setBackground(Color.GREEN);
        }

//        }

    }//GEN-LAST:event_combo_conductorItemStateChanged

    private void tabla_registroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_registroMouseClicked
 
        int rec = this.tabla_registro.getSelectedRow();

        this.txt_n_registro.setText(tabla_registro.getValueAt(rec, 0).toString());
        this.txt_fecha_ingreso.setText(tabla_registro.getValueAt(rec, 1).toString());
        this.txt_ficha.setText(tabla_registro.getValueAt(rec, 2).toString());

        // this.combo_conductor.setSelectedItem(tabla_registro.getValueAt(rec, 3).toString());
        this.txt_nombre_conductor_consultado.setText(tabla_registro.getValueAt(rec, 3).toString());
        this.txt_empresa.setText(tabla_registro.getValueAt(rec, 4).toString());
        this.txt_numero_cedula.setText(tabla_registro.getValueAt(rec, 5).toString());
        this.txt_placa.setText(tabla_registro.getValueAt(rec, 6).toString());
        this.combo_autorizo.setSelectedItem(tabla_registro.getValueAt(rec, 7).toString());
        this.combo_guarda.setSelectedItem(tabla_registro.getValueAt(rec, 8).toString());
        this.txt_estado.setText(tabla_registro.getValueAt(rec, 9).toString());
        this.txt_observaciones.setText(tabla_registro.getValueAt(rec, 10).toString());


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
            this.txt_consultar_conductor.setEnabled(false);
            this.txt_consultar_empresa.setEnabled(false);

        } else if (index == 2) {
            this.txt_consulta_inicial.setEnabled(false);
            this.txt_consulta_final.setEnabled(false);
            this.txt_consulta_placa.setEnabled(true);
            this.txt_consulta_cedula.setEnabled(false);
            this.txt_consulta_autorizo.setEnabled(false);
            this.txt_consulta_guarda.setEnabled(false);
            this.txt_consulta_placa.setEditable(true);
            this.txt_consultar_conductor.setEnabled(false);
            this.txt_consultar_empresa.setEnabled(false);
        } else if (index == 3) {
            this.txt_consulta_inicial.setEnabled(false);
            this.txt_consulta_final.setEnabled(false);
            this.txt_consulta_placa.setEnabled(false);
            this.txt_consulta_cedula.setEnabled(true);
            this.txt_consulta_autorizo.setEnabled(false);
            this.txt_consulta_guarda.setEnabled(false);
            this.txt_consulta_cedula.setEditable(true);
            this.txt_consultar_conductor.setEnabled(false);
            this.txt_consultar_empresa.setEnabled(false);
        } else if (index == 4) {
            this.txt_consulta_inicial.setEnabled(false);
            this.txt_consulta_final.setEnabled(false);
            this.txt_consulta_placa.setEnabled(false);
            this.txt_consulta_cedula.setEnabled(false);
            this.txt_consulta_autorizo.setEnabled(true);
            this.txt_consulta_guarda.setEnabled(false);
            this.txt_consulta_autorizo.setEditable(true);
            this.txt_consultar_conductor.setEnabled(false);
            this.txt_consultar_empresa.setEnabled(false);
        } else if (index == 5) {
            this.txt_consulta_inicial.setEnabled(false);
            this.txt_consulta_final.setEnabled(false);
            this.txt_consulta_placa.setEnabled(false);
            this.txt_consulta_cedula.setEnabled(false);
            this.txt_consulta_autorizo.setEnabled(false);
            this.txt_consulta_guarda.setEnabled(true);
            this.txt_consulta_guarda.setEditable(true);
            this.txt_consultar_conductor.setEnabled(false);
            this.txt_consultar_empresa.setEnabled(false);
        } else if (index == 6) {
            this.txt_consulta_inicial.setEnabled(false);
            this.txt_consulta_final.setEnabled(false);
            this.txt_consulta_placa.setEnabled(false);
            this.txt_consulta_cedula.setEnabled(false);
            this.txt_consulta_autorizo.setEnabled(false);
            this.txt_consulta_guarda.setEnabled(false);
            this.txt_consulta_guarda.setEditable(false);
            this.txt_consultar_conductor.setEnabled(true);
            this.txt_consultar_conductor.setEditable(true);
            this.txt_consultar_empresa.setEnabled(false);
            
            
        } else  {
            this.txt_consulta_inicial.setEnabled(false);
            this.txt_consulta_final.setEnabled(false);
            this.txt_consulta_placa.setEnabled(false);
            this.txt_consulta_cedula.setEnabled(false);
            this.txt_consulta_autorizo.setEnabled(false);
            this.txt_consulta_guarda.setEnabled(false);
            this.txt_consulta_guarda.setEditable(false);
            this.txt_consultar_conductor.setEnabled(false);
            this.txt_consultar_empresa.setEnabled(true);
            this.txt_consultar_empresa.setEditable(true);
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
        } else if (index == 5){
            String guarda = txt_consulta_guarda.getText();

            if (guarda.equals("")) {
                JOptionPane.showMessageDialog(null, "INGRESE GUARDA");
            } else {
                consulta_guarda(guarda);
                ancho_columnas();
                centrar_datos();
                conexion.cerrar();
            }
        } else if (index == 6){
            String conductor = txt_consultar_conductor.getText();

            if (conductor.equals("")) {
                JOptionPane.showMessageDialog(null, "INGRESE CONDUCTOR");
            } else {
                consulta_conductor(conductor);
                ancho_columnas();
                centrar_datos();
                conexion.cerrar();
            }
        } else {
            String empresa = txt_consultar_empresa.getText();

            if (empresa.equals("")) {
                JOptionPane.showMessageDialog(null, "INGRESE EMPRESA");
            } else {
                consulta_empresa(empresa);
                ancho_columnas();
                centrar_datos();
                conexion.cerrar();
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txt_estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_estadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_estadoActionPerformed

    private void combo_marcaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_marcaItemStateChanged

        int opcion = combo_marca.getSelectedIndex();
        if (opcion == 0) {
            this.txt_fecha_salida.setText("");
            this.txt_estado.setText("");
            this.txt_estado_color.setBackground(Color.WHITE);
            this.btn_actualizar.setEnabled(false);
            this.btn_guardar.setEnabled(true);
        } else {

            Date fecha = new Date();

            DateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
            DateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");

            this.txt_fecha_salida.setText("" + formatoFecha.format(fecha) + " " + formatoHora.format(fecha) + "");
            this.txt_estado.setText("SALIDA");
            this.txt_estado_color.setBackground(Color.RED);
            this.btn_actualizar.setEnabled(true);
            this.btn_guardar.setEnabled(false);
        }

    }//GEN-LAST:event_combo_marcaItemStateChanged

    private void btn_conusltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_conusltaActionPerformed
        
        ConsultarAutorizado frame = new ConsultarAutorizado();
        String conductor = combo_conductor.getSelectedItem().toString();
        frame.txt_conductor.setText(conductor);
        frame.setVisible(true);
        this.dispose();
                
    }//GEN-LAST:event_btn_conusltaActionPerformed

    private void btn_conuslta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_conuslta1ActionPerformed
        ConsultarConductor frame = new ConsultarConductor();
        frame.setVisible(true);
        this.dispose();
        this.txt_nombre_conductor_consultado.setText("");
    }//GEN-LAST:event_btn_conuslta1ActionPerformed
//    /**
//     * @param args the command line arguments
//     */
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
//            java.util.logging.Logger.getLogger(RegistrosIngresoProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(RegistrosIngresoProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(RegistrosIngresoProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(RegistrosIngresoProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new RegistrosIngresoProveedores().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_conuslta;
    private javax.swing.JButton btn_conuslta1;
    public javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_refrescar;
    public javax.swing.JComboBox combo_autorizo;
    public javax.swing.JComboBox combo_conductor;
    private javax.swing.JComboBox combo_consulta;
    public javax.swing.JComboBox combo_guarda;
    private javax.swing.JComboBox combo_marca;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla_registro;
    private javax.swing.JTextField txt_consulta_autorizo;
    private javax.swing.JTextField txt_consulta_cedula;
    private javax.swing.JTextField txt_consulta_final;
    private javax.swing.JTextField txt_consulta_guarda;
    private javax.swing.JTextField txt_consulta_inicial;
    private javax.swing.JTextField txt_consulta_placa;
    private javax.swing.JTextField txt_consultar_conductor;
    private javax.swing.JTextField txt_consultar_empresa;
    private javax.swing.JTextField txt_empresa;
    private javax.swing.JTextField txt_estado;
    private javax.swing.JTextField txt_estado_color;
    private javax.swing.JTextField txt_fecha_ingreso;
    private javax.swing.JTextField txt_fecha_salida;
    private javax.swing.JTextField txt_ficha;
    private javax.swing.JTextField txt_n_registro;
    private javax.swing.JTextField txt_nombre_conductor_consultado;
    private javax.swing.JTextField txt_numero_cedula;
    private javax.swing.JTextArea txt_observaciones;
    private javax.swing.JTextField txt_placa;
    // End of variables declaration//GEN-END:variables

    public void LimpiarCampos() {

        combo_conductor.setSelectedIndex(0);
        combo_guarda.setSelectedIndex(0);
        combo_autorizo.setSelectedIndex(0);
        txt_empresa.setText("");
        txt_estado_color.setText("");
        txt_ficha.setText("");
        txt_fecha_ingreso.setText("");
        txt_fecha_salida.setText("");
        txt_numero_cedula.setText("");
        txt_observaciones.setText("");
        txt_placa.setText("");
        txt_nombre_conductor_consultado.setText("");

    }

// METODO PARA CARGAR TABLA DE REGISTRO
    public void cargar_tabla() {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"ID", "INGRESO", "FICHA", "CONDUCTOR", "EMPRESA", "CEDULA", "PLACA", "AUTORIZO", "GUARDA", "ESTADO", "OBSERVA"};
        String[] registro = new String[11];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "ID_REGISTRO AS ID, "
                + "FECHA_ENTRADA AS ENTRADA, "
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
                + "WHERE ESTADO = 'INGRESO' "
                + "ORDER BY FECHA_ENTRADA DESC;";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("ID");
                registro[1] = rs.getString("ENTRADA");
                registro[2] = rs.getString("FICHA");
                registro[3] = rs.getString("NOMBRE");
                registro[4] = rs.getString("EMPRESA");
                registro[5] = rs.getString("CEDULA");
                registro[6] = rs.getString("PLACA");
                registro[7] = rs.getString("AUTORIZADO");
                registro[8] = rs.getString("GUARDA");
                registro[9] = rs.getString("ESTADOS");
                registro[10] = rs.getString("OBSERVACION");

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

        String[] titulos = {"ID", "INGRESO", "FICHA", "CONDUCTOR", "EMPRESA", "CEDULA", "PLACA", "AUTORIZO", "GUARDA", "ESTADO", "OBSERVA"};
        String[] registro = new String[11];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "ID_REGISTRO AS ID, "
                + "FECHA_ENTRADA AS ENTRADA, "
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
                + "ESTADO = 'INGRESO' "
                + "AND FECHA_ENTRADA BETWEEN '" + fecha_inicio + "' AND '" + fecha_final + "'"
                + "ORDER BY FECHA_ENTRADA DESC";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("ID");
                registro[1] = rs.getString("ENTRADA");
                registro[2] = rs.getString("FICHA");
                registro[3] = rs.getString("NOMBRE");
                registro[4] = rs.getString("EMPRESA");
                registro[5] = rs.getString("CEDULA");
                registro[6] = rs.getString("PLACA");
                registro[7] = rs.getString("AUTORIZADO");
                registro[8] = rs.getString("GUARDA");
                registro[9] = rs.getString("ESTADOS");
                registro[10] = rs.getString("OBSERVACION");

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

        String[] titulos = {"ID", "INGRESO", "FICHA", "CONDUCTOR", "EMPRESA", "CEDULA", "PLACA", "AUTORIZO", "GUARDA", "ESTADO", "OBSERVA"};
        String[] registro = new String[11];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "ID_REGISTRO AS ID, "
                + "FECHA_ENTRADA AS ENTRADA, "
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
                + "ESTADO = 'INGRESO' "
                + "AND PLACA LIKE '%" + placa + "%' "
                + "ORDER BY FECHA_ENTRADA DESC";
        System.out.println(query);
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("ID");
                registro[1] = rs.getString("ENTRADA");
                registro[2] = rs.getString("FICHA");
                registro[3] = rs.getString("NOMBRE");
                registro[4] = rs.getString("EMPRESA");
                registro[5] = rs.getString("CEDULA");
                registro[6] = rs.getString("PLACA");
                registro[7] = rs.getString("AUTORIZADO");
                registro[8] = rs.getString("GUARDA");
                registro[9] = rs.getString("ESTADOS");
                registro[10] = rs.getString("OBSERVACION");

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

        String[] titulos = {"ID", "INGRESO", "FICHA", "CONDUCTOR", "EMPRESA", "CEDULA", "PLACA", "AUTORIZO", "GUARDA", "ESTADO", "OBSERVA"};
        String[] registro = new String[11];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "ID_REGISTRO AS ID, "
                + "FECHA_ENTRADA AS ENTRADA, "
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
                + "ESTADO = 'INGRESO' "
                + "AND CEDULA LIKE '%" + cedula + "%' "
                + "ORDER BY FECHA_ENTRADA DESC";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("ID");
                registro[1] = rs.getString("ENTRADA");
                registro[2] = rs.getString("FICHA");
                registro[3] = rs.getString("NOMBRE");
                registro[4] = rs.getString("EMPRESA");
                registro[5] = rs.getString("CEDULA");
                registro[6] = rs.getString("PLACA");
                registro[7] = rs.getString("AUTORIZADO");
                registro[8] = rs.getString("GUARDA");
                registro[9] = rs.getString("ESTADOS");
                registro[10] = rs.getString("OBSERVACION");

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

        String[] titulos = {"ID", "INGRESO", "FICHA", "CONDUCTOR", "EMPRESA", "CEDULA", "PLACA", "AUTORIZO", "GUARDA", "ESTADO", "OBSERVA"};
        String[] registro = new String[11];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "ID_REGISTRO AS ID, "
                + "FECHA_ENTRADA AS ENTRADA, "
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
                + "ESTADO = 'INGRESO' "
                + "AND AUTORIZADO LIKE '%" + autorizo + "%' "
                + "ORDER BY FECHA_ENTRADA DESC";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("ID");
                registro[1] = rs.getString("ENTRADA");
                registro[2] = rs.getString("FICHA");
                registro[3] = rs.getString("NOMBRE");
                registro[4] = rs.getString("EMPRESA");
                registro[5] = rs.getString("CEDULA");
                registro[6] = rs.getString("PLACA");
                registro[7] = rs.getString("AUTORIZADO");
                registro[8] = rs.getString("GUARDA");
                registro[9] = rs.getString("ESTADOS");
                registro[10] = rs.getString("OBSERVACION");

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

        String[] titulos = {"ID", "INGRESO", "FICHA", "CONDUCTOR", "EMPRESA", "CEDULA", "PLACA", "AUTORIZO", "GUARDA", "ESTADO", "OBSERVA"};
        String[] registro = new String[11];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "ID_REGISTRO AS ID, "
                + "FECHA_ENTRADA AS ENTRADA, "
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
                + "ESTADO = 'INGRESO' "
                + "AND GUARDA LIKE '%" + guarda + "%' "
                + "ORDER BY FECHA_ENTRADA DESC";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("ID");
                registro[1] = rs.getString("ENTRADA");
                registro[2] = rs.getString("FICHA");
                registro[3] = rs.getString("NOMBRE");
                registro[4] = rs.getString("EMPRESA");
                registro[5] = rs.getString("CEDULA");
                registro[6] = rs.getString("PLACA");
                registro[7] = rs.getString("AUTORIZADO");
                registro[8] = rs.getString("GUARDA");
                registro[9] = rs.getString("ESTADOS");
                registro[10] = rs.getString("OBSERVACION");

                modelo.addRow(registro);
            }
            tabla_registro.setModel(modelo);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

    // METODO PARA CONSULTAR CONDUCTOR
    public void consulta_conductor(String conductor) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"ID", "INGRESO", "FICHA", "CONDUCTOR", "EMPRESA", "CEDULA", "PLACA", "AUTORIZO", "GUARDA", "ESTADO", "OBSERVA"};
        String[] registro = new String[11];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "ID_REGISTRO AS ID, "
                + "FECHA_ENTRADA AS ENTRADA, "
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
                + "ESTADO = 'INGRESO' "
                + "AND NOMBRE_CONDUCTOR LIKE '%" + conductor + "%' "
                + "ORDER BY FECHA_ENTRADA DESC";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("ID");
                registro[1] = rs.getString("ENTRADA");
                registro[2] = rs.getString("FICHA");
                registro[3] = rs.getString("NOMBRE");
                registro[4] = rs.getString("EMPRESA");
                registro[5] = rs.getString("CEDULA");
                registro[6] = rs.getString("PLACA");
                registro[7] = rs.getString("AUTORIZADO");
                registro[8] = rs.getString("GUARDA");
                registro[9] = rs.getString("ESTADOS");
                registro[10] = rs.getString("OBSERVACION");

                modelo.addRow(registro);
            }
            tabla_registro.setModel(modelo);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }
    
    
     // METODO PARA CONSULTAR CONDUCTOR
    public void consulta_empresa(String empresa) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"ID", "INGRESO", "FICHA", "CONDUCTOR", "EMPRESA", "CEDULA", "PLACA", "AUTORIZO", "GUARDA", "ESTADO", "OBSERVA"};
        String[] registro = new String[11];
        String query = "";

        modelo = new DefaultTableModel(null, titulos);

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT "
                + "ID_REGISTRO AS ID, "
                + "FECHA_ENTRADA AS ENTRADA, "
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
                + "ESTADO = 'INGRESO' "
                + "AND EMPRESA LIKE '%" + empresa + "%' "
                + "ORDER BY FECHA_ENTRADA DESC";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("ID");
                registro[1] = rs.getString("ENTRADA");
                registro[2] = rs.getString("FICHA");
                registro[3] = rs.getString("NOMBRE");
                registro[4] = rs.getString("EMPRESA");
                registro[5] = rs.getString("CEDULA");
                registro[6] = rs.getString("PLACA");
                registro[7] = rs.getString("AUTORIZADO");
                registro[8] = rs.getString("GUARDA");
                registro[9] = rs.getString("ESTADOS");
                registro[10] = rs.getString("OBSERVACION");

                modelo.addRow(registro);
            }
            tabla_registro.setModel(modelo);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }
    
    
    // METODO PARA CARGAR JCOMBOBOX CONDUCTORES
    public void cargar_lista_conductor() {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String query = "";

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT * FROM CONDUCTORES ORDER BY NOMBRE_CONDUCTOR ASC";

        System.out.println(query);
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                combo_conductor.addItem(rs.getString("NOMBRE_CONDUCTOR"));
            }
            conexion.cerrar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    // METODO PARA CARGAR JCOMBOBOX AUTORIZADO
    public void cargar_tabla_autorizo() {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String query = "";

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT * FROM AUTORIZACION ";

        System.out.println(query);
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                combo_autorizo.addItem(rs.getString("NOMBRE_COMPLETO"));
            }
            conexion.cerrar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    // METODO PARA CARGAR JCOMBOBOX GUARDA
    public void cargar_tabla_guarda() {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String query = "";

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT * FROM GUARDAS ";

        System.out.println(query);
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                combo_guarda.addItem(rs.getString("NOMBRE_COMPLETO"));
            }
            conexion.cerrar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    // METODO PARA CARGAR JCOMBOBOX GUARDA
    public int validacion_ficha_repetida(String ficha) {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String query = "";
        int contador = 0;

        ConexioSQLite con = new ConexioSQLite();
        Connection cn = con.Conectar();

        query = "SELECT COUNT(N_FICHA) AS FICHA FROM REGISTRO_SEGURIDAD WHERE N_FICHA = '" + ficha + "' AND ESTADO = 'INGRESO'; ";

        System.out.println(query);
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                contador = Integer.parseInt(rs.getString("FICHA"));
            }
            conexion.cerrar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return contador;
    }

    // METODO PARA CARGAR JCOMBOBOX GUARDA
    public void ancho_columnas() {
        tabla_registro.getColumnModel().getColumn(0).setPreferredWidth(30);
        tabla_registro.getColumnModel().getColumn(1).setPreferredWidth(130);
        tabla_registro.getColumnModel().getColumn(2).setPreferredWidth(40);
        tabla_registro.getColumnModel().getColumn(3).setPreferredWidth(150);
        tabla_registro.getColumnModel().getColumn(4).setPreferredWidth(100);
        tabla_registro.getColumnModel().getColumn(5).setPreferredWidth(70);
        tabla_registro.getColumnModel().getColumn(6).setPreferredWidth(70);
        tabla_registro.getColumnModel().getColumn(7).setPreferredWidth(120);
        tabla_registro.getColumnModel().getColumn(8).setPreferredWidth(120);
        tabla_registro.getColumnModel().getColumn(9).setPreferredWidth(50);
        tabla_registro.getColumnModel().getColumn(10).setPreferredWidth(100);
    }

    // METODO PARA CARGAR JCOMBOBOX GUARDA
    public void centrar_datos() {
        Alinear = new DefaultTableCellRenderer();
        Alinear.setHorizontalAlignment(SwingConstants.CENTER);
        tabla_registro.getColumnModel().getColumn(0).setCellRenderer(Alinear);
        tabla_registro.getColumnModel().getColumn(2).setCellRenderer(Alinear);
        tabla_registro.getColumnModel().getColumn(5).setCellRenderer(Alinear);
        tabla_registro.getColumnModel().getColumn(6).setCellRenderer(Alinear);
        tabla_registro.getColumnModel().getColumn(9).setCellRenderer(Alinear);
    }

}
