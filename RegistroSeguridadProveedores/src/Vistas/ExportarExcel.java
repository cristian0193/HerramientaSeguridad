package Vistas;

import Conexion.ConexioSQLite;
import Conexion.export_excel;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExportarExcel extends javax.swing.JDialog {

    DefaultTableModel modelo;
    ConexioSQLite conexion;
    private JFileChooser FileChooser = new JFileChooser();
    public JDialog jDialog = new JDialog();
    Vector columna = new Vector();
    Vector filas = new Vector();

    public ExportarExcel(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        cargar_tabla_general();
    }

    ExportarExcel() {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ubic = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btn_cargar = new javax.swing.JButton();
        btn_exportar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_datos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EXPORTAR A EXCEL");

        ubic.setToolTipText("Ruta donde se guardara la informacion en EXCEL");

        jLabel2.setText("Ruta :");

        btn_cargar.setBackground(new java.awt.Color(153, 255, 51));
        btn_cargar.setText("Cargar");
        btn_cargar.setToolTipText("Permite realizar el cargue de la ruta donde se exportará la informacion");
        btn_cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cargarActionPerformed(evt);
            }
        });

        btn_exportar.setBackground(new java.awt.Color(255, 153, 51));
        btn_exportar.setText("Exportar");
        btn_exportar.setToolTipText("Permite Exportar archivo a Excel");
        btn_exportar.setEnabled(false);
        btn_exportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exportarActionPerformed(evt);
            }
        });

        tabla_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla_datos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 888, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ubic)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_cargar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_exportar)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ubic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(btn_exportar))
                    .addComponent(btn_cargar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cargarActionPerformed
        // TODO add your handling code here:
        JFileChooser dialog = new JFileChooser();
        int opcion = dialog.showSaveDialog(this);

        if (opcion == JFileChooser.APPROVE_OPTION) {

            File dir = dialog.getSelectedFile();
            String fl = dir.toString();

            ubic.setText(fl);
            this.btn_exportar.setEnabled(true);
        }
    }//GEN-LAST:event_btn_cargarActionPerformed

    private void btn_exportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exportarActionPerformed
        // TODO add your handling code here:
        if (ubic.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "SELECCIONE LA RUTA DESTINO");
        } else {
            try {
                List<JTable> tb = new ArrayList<JTable>();
                tb.add(tabla_datos);
                //-------------------
                export_excel excelExporter = new export_excel(tb, new File(ubic.getText() + ".xls"));
                if (excelExporter.export()) {
                    JOptionPane.showMessageDialog(null, "TABLAS EXPORTADOS CON EXITOS!");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            llama_excel();
        }

    }//GEN-LAST:event_btn_exportarActionPerformed

    public void llama_excel() {
        try {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + ubic.getText() + ".xls");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void CrearTabla(File file) throws IOException {

        Workbook workbook = null;

        try {
            workbook = Workbook.getWorkbook(file);

            Sheet sheet = workbook.getSheet(0);
            columna.clear();

            for (int i = 0; i < sheet.getColumns(); i++) {
                Cell cell1 = sheet.getCell(i, 0);
                columna.add(cell1.getContents());
            }
            filas.clear();

            for (int j = 1; j < sheet.getRows(); j++) {

                Vector d = new Vector();

                for (int i = 0; i < sheet.getColumns(); i++) {

                    Cell cell = sheet.getCell(i, j);
                    d.add(cell.getContents());
                }
                d.add("\n");
                filas.add(d);
            }

        } catch (BiffException e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cargar;
    private javax.swing.JButton btn_exportar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_datos;
    private javax.swing.JTextField ubic;
    // End of variables declaration//GEN-END:variables

    void cargar_tabla_general() {

        conexion = new ConexioSQLite();
        conexion.coneccionbase();

        String[] titulos = {"ID", "INGRESO", "SALIDA", "FICHA", "CONDUCTOR", "CEDULA", "EMPRESA", "PLACA", "AUTORIZO", "GUARDA", "ESTADO", "OBSERVACION"};
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
                + "CEDULA AS CEDULA, " 
                + "EMPRESA AS EMPRESA, "                 
                + "PLACA AS PLACA, "
                + "AUTORIZADO AS AUTORIZADO, "
                + "GUARDA AS GUARDA, "
                + "ESTADO AS ESTADOS, "
                + "OBSERVACIONES AS OBSERVACION "
                + "FROM "
                + "REGISTRO_SEGURIDAD "
                + "ORDER BY ID_REGISTRO ASC;";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                registro[0] = rs.getString("ID");
                registro[1] = rs.getString("ENTRADA");
                registro[2] = rs.getString("SALIDA");
                registro[3] = rs.getString("FICHA");
                registro[4] = rs.getString("NOMBRE");
                registro[5] = rs.getString("CEDULA");
                registro[6] = rs.getString("EMPRESA");
                registro[7] = rs.getString("PLACA");
                registro[8] = rs.getString("AUTORIZADO");
                registro[9] = rs.getString("GUARDA");
                registro[10] = rs.getString("ESTADOS");
                registro[11] = rs.getString("OBSERVACION");

                modelo.addRow(registro);
            }
            tabla_datos.setModel(modelo);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex);

        }
    }

}
