/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asignacion.vista;

import asignacion.datos.CertificacionCursoDAO;
import asignacion.datos.ListadoalumnoscursoDAO;
import asignacion.dominio.CertificacionCurso;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author linri
 */
public class Listadoalumnoscurso extends javax.swing.JInternalFrame {

    private static List<Listadoalumnoscurso> select(){
        throw new UnsupportedOperationException("not supported yet, ");
    }
    
    public void llenadoDeTablas(){
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("ID Listadoo");
    modelo.addColumn("Nombre");
    modelo.addColumn("Apellido");
    modelo.addColumn("Carnet");
    modelo.addColumn("Semestre");
    modelo.addColumn("Año");
    modelo.addColumn("Carrera");
    modelo.addColumn("Facultad");
    
    ListadoalumnoscursoDAO listadoalumnoscursoDAO = new ListadoalumnoscursoDAO();
    
    List<asignacion.dominio.Listadoalumnoscurso> listado = listadoalumnoscursoDAO.select();
    jTablecertificado.setModel(modelo);
    String[] dato = new String[6];
    for(int i = 0; i < listado.size(); i++){
        dato[0] = listado.get(i).getIdlistado();
        dato[1] = listado.get(i).getIdAlumno();
        dato[2] = listado.get(i).getApellidos();
        dato[3] = listado.get(i).getCarnet();
        dato[4] = listado.get(i).getSemestre();
        dato[5] = listado.get(i).getAño();
        dato[6] = listado.get(i).getIdcarrera();
        dato[7] = listado.get(i).getIdfacultades();
        
        
        modelo.addRow(dato);
    }
 }
 
    public void Buscar(){
    
        Listadoalumnoscurso listadoalumnoscursoconsultar = new Listadoalumnoscurso();
        ListadoalumnoscursoDAO listadoalumnoscursoDAO = new ListadoalumnoscursoDAO();

        
        listadoalumnoscursoconsultar = listadoalumnoscursoDAO.query(listadoalumnoscursoconsultar);

        jTextnombre1.setText(listadoalumnoscursoconsultar.getIdAlumno());
        jTextFielda.setText(listadoalumnoscursoconsultar.getApellidos());
        jTextcarnet.setText(listadoalumnoscursoconsultar.getCarnet());
        jTextSemestre.setText(listadoalumnoscursoconsultar.getSemestre());
        jTextaño.setText(listadoalumnoscursoconsultar.getAño());
        jTextFieldr.setText(listadoalumnoscursoconsultar.getIdcarrera());
        jTextFacultad.setText(listadoalumnoscursoconsultar.getIdfacultades());

    }

    public void limpiar() {
        
        jTextnombre1.setText("");
        jTextFielda.setText("");
        jTextcarnet.setText("");
        jTextSemestre.setText("");
        jTextaño.setText("");
        jTextFieldr.setText("");
        jTextFacultad.setText("");
    }
       
    
    public Listadoalumnoscurso() {
        initComponents();
        llenadoDeTablas();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablecertificado = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTextFieldl = new javax.swing.JTextField();
        jTextnombre1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextaño = new javax.swing.JTextField();
        jTextFacultad = new javax.swing.JTextField();
        jTextFielda = new javax.swing.JTextField();
        jTextSemestre = new javax.swing.JTextField();
        jTextcarnet = new javax.swing.JTextField();
        jTextFieldr = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Listado de alumnos por curso");

        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jTablecertificado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "No.", "Carnet", "Nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTablecertificado);

        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Salida");

        jButton5.setText("Buscar");

        jTextnombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextnombre1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre");

        jLabel3.setText("Carnet");

        jLabel4.setText("Apellido");

        jLabel5.setText("Facultad");

        jLabel6.setText("Carrera");

        jLabel7.setText("Semestre");

        jLabel8.setText("Año");

        jLabel9.setText("Listado");

        jTextaño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextañoActionPerformed(evt);
            }
        });

        jTextFacultad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFacultadActionPerformed(evt);
            }
        });

        jTextFielda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldaActionPerformed(evt);
            }
        });

        jTextSemestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextSemestreActionPerformed(evt);
            }
        });

        jTextcarnet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextcarnetActionPerformed(evt);
            }
        });

        jTextFieldr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldrActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldl, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFielda, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextcarnet, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextnombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(118, 118, 118)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextaño, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldr, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(43, 43, 43)
                        .addComponent(jTextFacultad, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFielda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextnombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFacultad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextcarnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(474, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(234, 234, 234))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jButton2)
                        .addGap(69, 69, 69)
                        .addComponent(jButton3)
                        .addGap(47, 47, 47)
                        .addComponent(jButton5)
                        .addGap(39, 39, 39)
                        .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(166, 166, 166)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 903, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton5)
                    .addComponent(jButtonGuardar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextnombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextnombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextnombre1ActionPerformed

    private void jTextañoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextañoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextañoActionPerformed

    private void jTextFacultadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFacultadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFacultadActionPerformed

    private void jTextFieldaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldaActionPerformed

    private void jTextSemestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextSemestreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextSemestreActionPerformed

    private void jTextcarnetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextcarnetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextcarnetActionPerformed

    private void jTextFieldrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldrActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        ListadoalumnoscursoDAO listadoalumnoscursoDAO = new ListadoalumnoscursoDAO();
        
        ListadoalumnoscursoDAO listadoalumnoscursoAInsertar = new ListadoalumnoscursoDAO(); 
        
        
        listadoalumnoscursoAInsertar.setIdAlumno(jTextnombre1.getText());
        listadoalumnoscursoAInsertar.setApellidos(jTextFielda.getText());
        listadoalumnoscursoAInsertar.setCarnet(jTextcarnet.getText());
        listadoalumnoscursoAInsertar.setSemestre(jTextSemestre.getText());
        listadoalumnoscursoAInsertar.setAño(jTextaño.getText());
        listadoalumnoscursoAInsertar.setIdcarrera(jTextFieldr.getText());
        listadoalumnoscursoAInsertar.setIdfacultades(jTextFacultad.getText());
        
        listadoalumnoscursoDAO.insert(listadoalumnoscursoAInsertar);
        
        llenadoDeTablas();
        limpiar();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       ListadoalumnoscursoDAO listadoalumnoscursoDAO = new ListadoalumnoscursoDAO();
        
       ListadoalumnoscursoDAO listadoalumnoscursoActualizar = new ListadoalumnoscursoDAO(); 
        
        listadoalumnoscursoActualizar.setIdAlumno(jTextnombre1.getText());
        listadoalumnoscursoActualizar.setApellidos(jTextFielda.getText());
        listadoalumnoscursoActualizar.setCarnet(jTextcarnet.getText());
        listadoalumnoscursoActualizar.setSemestre(jTextSemestre.getText());
        listadoalumnoscursoActualizar.setAño(jTextaño.getText());
        listadoalumnoscursoActualizar.setIdcarrera(jTextFieldr.getText());
        listadoalumnoscursoActualizar.setIdfacultades(jTextFacultad.getText());
         
        JOptionPane.showMessageDialog(null, "Modificacion exitosa");
        
        llenadoDeTablas();
        limpiar();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                
        ListadoalumnoscursoDAO listadoalumnoscursoDAO = new ListadoalumnoscursoDAO();
        
        ListadoalumnoscursoDAO listadoalumnoscursoEliminar = new ListadoalumnoscursoDAO(); 
        
        llenadoDeTablas();
        limpiar();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Listadoalumnoscurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Listadoalumnoscurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Listadoalumnoscurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Listadoalumnoscurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Listadoalumnoscurso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablecertificado;
    private javax.swing.JTextField jTextFacultad;
    private javax.swing.JTextField jTextFielda;
    private javax.swing.JTextField jTextFieldl;
    private javax.swing.JTextField jTextFieldr;
    private javax.swing.JTextField jTextSemestre;
    private javax.swing.JTextField jTextaño;
    private javax.swing.JTextField jTextcarnet;
    private javax.swing.JTextField jTextnombre1;
    // End of variables declaration//GEN-END:variables

    private String getIdAlumno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getApellidos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getCarnet() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getSemestre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getAño() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getIdcarrera() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getIdfacultades() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
