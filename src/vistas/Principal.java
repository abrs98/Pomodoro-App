/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import DAO.EnProcesoDAO;
import DAO.PendientesDAO;
import DAO.TerminadasDAO;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JTable;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import objetosNegocio.Tarea;

/**
 *
 * @author Abrahan Barrios
 */
public class Principal extends javax.swing.JFrame {

    String hora, minutos, segundos;
    Thread h1;

    private PendientesDAO pendientesDAO = null;
    private EnProcesoDAO enProcesoDAO = null;
    private TerminadasDAO tdao = null;
    Tarea tarea = null;
    
    /**
     * Creates new form Principal
     */
    public Principal() {
        this.pendientesDAO = new PendientesDAO();
        this.enProcesoDAO = new EnProcesoDAO();
        this.tdao = new TerminadasDAO();
        this.tarea = new Tarea();
        initComponents();
        conTabla();
        refresh();
    }
    
    public void refresh(){
        tblPendientes.updateUI();
        tblPendientes.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlPendientes = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        barra1 = new javax.swing.JScrollPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblPendientes = new javax.swing.JTable();
        pnlEnProgreso = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProgreso = new javax.swing.JTable();
        pnlTerminadas = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblTerminadas = new javax.swing.JTable();
        btnRegistrarTarea = new javax.swing.JButton();
        lblTemporizador = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        btnPausar = new javax.swing.JButton();
        brnCancelar = new javax.swing.JButton();
        btnTerminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setForeground(new java.awt.Color(153, 153, 255));

        pnlPendientes.setBackground(new java.awt.Color(255, 0, 0));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText(" Pendientes");

        tblPendientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblPendientes.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblPendientes.setMaximumSize(new java.awt.Dimension(180, 380));
        tblPendientes.setMinimumSize(new java.awt.Dimension(180, 380));
        tblPendientes.setPreferredSize(new java.awt.Dimension(180, 380));
        jScrollPane5.setViewportView(tblPendientes);
        if (tblPendientes.getColumnModel().getColumnCount() > 0) {
            tblPendientes.getColumnModel().getColumn(0).setResizable(false);
            tblPendientes.getColumnModel().getColumn(0).setHeaderValue("Nombre");
        }

        barra1.setViewportView(jScrollPane5);

        javax.swing.GroupLayout pnlPendientesLayout = new javax.swing.GroupLayout(pnlPendientes);
        pnlPendientes.setLayout(pnlPendientesLayout);
        pnlPendientesLayout.setHorizontalGroup(
            pnlPendientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPendientesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(54, 54, 54))
            .addGroup(pnlPendientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(barra1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlPendientesLayout.setVerticalGroup(
            pnlPendientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPendientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barra1)
                .addContainerGap())
        );

        pnlEnProgreso.setBackground(new java.awt.Color(255, 255, 51));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("En Progreso");

        tblProgreso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblProgreso.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblProgreso.setMaximumSize(new java.awt.Dimension(180, 380));
        tblProgreso.setMinimumSize(new java.awt.Dimension(180, 380));
        tblProgreso.setPreferredSize(new java.awt.Dimension(180, 380));
        tblProgreso.setUpdateSelectionOnSort(false);
        jScrollPane1.setViewportView(tblProgreso);
        if (tblProgreso.getColumnModel().getColumnCount() > 0) {
            tblProgreso.getColumnModel().getColumn(0).setResizable(false);
            tblProgreso.getColumnModel().getColumn(0).setHeaderValue("Nombre");
        }

        jScrollPane3.setViewportView(jScrollPane1);

        javax.swing.GroupLayout pnlEnProgresoLayout = new javax.swing.GroupLayout(pnlEnProgreso);
        pnlEnProgreso.setLayout(pnlEnProgresoLayout);
        pnlEnProgresoLayout.setHorizontalGroup(
            pnlEnProgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEnProgresoLayout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(58, 58, 58))
            .addGroup(pnlEnProgresoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlEnProgresoLayout.setVerticalGroup(
            pnlEnProgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEnProgresoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3)
                .addContainerGap())
        );

        pnlTerminadas.setBackground(new java.awt.Color(0, 204, 0));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Terminadas");

        tblTerminadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblTerminadas.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblTerminadas.setMaximumSize(new java.awt.Dimension(180, 380));
        tblTerminadas.setMinimumSize(new java.awt.Dimension(180, 380));
        tblTerminadas.setPreferredSize(new java.awt.Dimension(180, 380));
        jScrollPane6.setViewportView(tblTerminadas);
        if (tblTerminadas.getColumnModel().getColumnCount() > 0) {
            tblTerminadas.getColumnModel().getColumn(0).setResizable(false);
            tblTerminadas.getColumnModel().getColumn(0).setHeaderValue("Nombre");
        }

        jScrollPane2.setViewportView(jScrollPane6);

        javax.swing.GroupLayout pnlTerminadasLayout = new javax.swing.GroupLayout(pnlTerminadas);
        pnlTerminadas.setLayout(pnlTerminadasLayout);
        pnlTerminadasLayout.setHorizontalGroup(
            pnlTerminadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTerminadasLayout.createSequentialGroup()
                .addGroup(pnlTerminadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTerminadasLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel3))
                    .addGroup(pnlTerminadasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTerminadasLayout.setVerticalGroup(
            pnlTerminadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTerminadasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        btnRegistrarTarea.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnRegistrarTarea.setText("Registrar Tarea");
        btnRegistrarTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarTareaActionPerformed(evt);
            }
        });

        lblTemporizador.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblTemporizador.setText("12:00:00");

        btnIniciar.setText("Iniciar");

        btnPausar.setText("Pausar");
        btnPausar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPausarActionPerformed(evt);
            }
        });

        brnCancelar.setText("Cancelar");

        btnTerminar.setText("Terminar");
        btnTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(pnlPendientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(pnlEnProgreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(pnlTerminadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(lblTemporizador))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnRegistrarTarea)
                        .addGap(105, 105, 105)
                        .addComponent(btnIniciar)
                        .addGap(18, 18, 18)
                        .addComponent(btnPausar)
                        .addGap(18, 18, 18)
                        .addComponent(brnCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(btnTerminar)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTemporizador)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlTerminadas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlEnProgreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlPendientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarTarea)
                    .addComponent(btnIniciar)
                    .addComponent(btnPausar)
                    .addComponent(brnCancelar)
                    .addComponent(btnTerminar))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPausarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPausarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPausarActionPerformed

    private void btnTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTerminarActionPerformed

    private void btnRegistrarTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarTareaActionPerformed
        refresh();
        dispose();
        this.setVisible(false);
        registrarTarea regTarea = new registrarTarea();
        regTarea.setVisible(true);
    }//GEN-LAST:event_btnRegistrarTareaActionPerformed

    
    
    protected void conTabla(){
        String title[] = {"Nombre"};
        String info[][] = obtMatriz();
        this.tblPendientes = new JTable(info,title);
        this.barra1.setViewportView(this.tblPendientes);
    }
    
    protected String[][] obtMatriz(){
        ArrayList<Tarea> listaPendientes = this.pendientesDAO.consultar();
        String pends [][] =  new String[listaPendientes.size()][1];
        for (int i = 0; i < listaPendientes.size(); i++) {
            pends[i][0] = listaPendientes.get(i).getNombre();
        }
        return pends;
    }
    
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane barra1;
    private javax.swing.JButton brnCancelar;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnPausar;
    private javax.swing.JButton btnRegistrarTarea;
    private javax.swing.JButton btnTerminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel lblTemporizador;
    private javax.swing.JPanel pnlEnProgreso;
    private javax.swing.JPanel pnlPendientes;
    private javax.swing.JPanel pnlTerminadas;
    private javax.swing.JTable tblPendientes;
    private javax.swing.JTable tblProgreso;
    private javax.swing.JTable tblTerminadas;
    // End of variables declaration//GEN-END:variables
}
