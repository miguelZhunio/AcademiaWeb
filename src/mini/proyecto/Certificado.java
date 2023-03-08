/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini.proyecto;
import java.util.Date;
import clases.Certifica;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author jose
 */
public class Certificado extends javax.swing.JFrame {

    private String cod_cer;
    private String cod_car;
    private String ced_est;
    private Date fecha_cer;
    private String mensaje;
    public Certificado() {
        initComponents();
        
        txtfechaCertificado.setVisible(fechaActual());
    }   
    @SuppressWarnings("unchecked")
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtcc = new javax.swing.JTextField();
        txtcca = new javax.swing.JTextField();
        txtce = new javax.swing.JTextField();
        txtfechaCertificado = new javax.swing.JTextField();
        txtMensaje = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Insertar = new javax.swing.JButton();
        Consultar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        txtEliminar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Certificar");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Codigo Certificado:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Codigo Carrera:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Cedula Estudiante:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Fecha Certificado:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Mensaje:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, -1));

        txtcc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtccKeyTyped(evt);
            }
        });
        jPanel1.add(txtcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 140, -1));

        txtcca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtccaKeyTyped(evt);
            }
        });
        jPanel1.add(txtcca, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 140, -1));

        txtce.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtceKeyTyped(evt);
            }
        });
        jPanel1.add(txtce, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 140, -1));
        jPanel1.add(txtfechaCertificado, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 140, -1));
        jPanel1.add(txtMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 140, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo Certificado", "Codigo Carrera", "Codigo Estudiante", "Fecha Certificado:", "Mensaje"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, 740, 90));

        Insertar.setText("Insertar");
        Insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertarActionPerformed(evt);
            }
        });
        jPanel1.add(Insertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, -1, -1));

        Consultar.setText("Consultar");
        jPanel1.add(Consultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, -1, -1));

        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        jPanel1.add(Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, -1, -1));

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        jPanel1.add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, -1, 30));

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 80, 140, 30));
        jPanel1.add(txtEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 150, 140, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 956, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void txtccKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtccKeyTyped
        // TODO add your handling code here:
        char aux = evt.getKeyChar();
        boolean numeros = aux>= '0' && aux <= '9';
        if (!numeros){
            JOptionPane.showMessageDialog(this,"CARACTER INCORRECTO: "+evt.getKeyChar());
            evt.consume();
        }else if(txtcc.getText().length()>=4){
            evt.consume();
        }                               
    }//GEN-LAST:event_txtccKeyTyped

    private void txtccaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtccaKeyTyped
        // TODO add your handling code here:
        char aux = evt.getKeyChar();
        boolean numeros = aux>= '0' && aux <= '9';
        if (!numeros){
            JOptionPane.showMessageDialog(this,"CARACTER INCORRECTO: "+evt.getKeyChar());
            evt.consume();
        }else if(txtcca.getText().length()>=4){
            evt.consume();
        }                
    }//GEN-LAST:event_txtccaKeyTyped

    private void txtceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtceKeyTyped
        // TODO add your handling code here:
        char aux = evt.getKeyChar();
        boolean numeros = aux>= '0' && aux <= '9';
        if (!numeros){
            JOptionPane.showMessageDialog(this,"CARACTER INCORRECTO: "+evt.getKeyChar());
            evt.consume();
        }else if(txtce.getText().length()>=4){
            evt.consume();
        }       
    }//GEN-LAST:event_txtceKeyTyped

    private void InsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarActionPerformed
        // TODO add your handling code here:
        ObjectContainer BaseD = Db4o.openFile("E:\\Proyecto final Base de datos\\Mini-Proyecto\\MiniProyecto");
        Crear_Certificado(BaseD);
        Cerrar_BD(BaseD);   
    }//GEN-LAST:event_InsertarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        ObjectContainer BaseD = Db4o.openFile("E:\\Proyecto final Base de datos\\Mini-Proyecto\\MiniProyecto");
        
        Cerrar_BD(BaseD);
        //////////////////////////////////////////////////////////////////////////////Crear
    }//GEN-LAST:event_EliminarActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModificarActionPerformed
     public static String fechaActual(){
         
         Date fecha_cer = new Date();
         SimpleDateFormat formatoFecha= new SimpleDateFormat("dd/MM/YYYY");
         return formatoFecha.format(fecha_cer);
     }
     public void Crear_Certificado(ObjectContainer basep) {
        asignarVariables(basep);
       
            if (Comprobar_Certificado(basep, cod_cer) == 0) {
                Certifica Cernueva = new Certifica(cod_cer, cod_car, ced_est,  fecha_cer,  mensaje);
                basep.set(Cernueva);
                JOptionPane.showMessageDialog(null, "Asignatura registrada correctamente");
                LimpiarCampos();
            } else {
                JOptionPane.showMessageDialog(this, "La asignatura ya existe", "ERROR", 0);
//                JOptionPane.showMessageDialog(this, "La asignatura ya existe");
            }
        
    }
       public static int Comprobar_Certificado(ObjectContainer basep, String cod_cer) {
        Certifica cerbuscar = new Certifica(cod_cer, null, null,null,null);
        ObjectSet result = basep.get(cerbuscar);
        return result.size();
    }
     public void asignarVariables(ObjectContainer basep) {
        cod_cer = txtcc.getText();
        cod_car = txtcca.getText();
        ced_est = txtce.getText();
        //fecha_cer= txtfechaCertificado.getLocation(rv);
        mensaje=txtMensaje.getText();
    }
    
    
    public void LimpiarCampos() {
        txtcc.setText("");
        txtcca.setText("");
    //fecha
        txtce.setText("");
        txtMensaje.setText("");
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////Eliminar
   
    
    public static void Cerrar_BD(ObjectContainer basep) {
        basep.close();
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Consultar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Insertar;
    private javax.swing.JButton Modificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField txtEliminar;
    private javax.swing.JTextField txtMensaje;
    private javax.swing.JTextField txtcc;
    private javax.swing.JTextField txtcca;
    private javax.swing.JTextField txtce;
    private javax.swing.JTextField txtfechaCertificado;
    // End of variables declaration//GEN-END:variables
}
