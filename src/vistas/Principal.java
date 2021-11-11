/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import DAO.EnProcesoDAO;
import DAO.PendientesDAO;
import DAO.TerminadasDAO;
import DragnDrop.TableRowTransferHandler;
import java.awt.Graphics;
import java.awt.Image;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JTable;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import objetosNegocio.Tarea;
import org.bson.types.ObjectId;

/**
 *
 * @author Abrahan Barrios
 */
public class Principal extends javax.swing.JFrame {

    private PendientesDAO pDAO = null;
    private EnProcesoDAO epDAO = null;
    private TerminadasDAO tDAO = null;
    Fondopanel fondo = new Fondopanel();
    
    /**
     * Creates new form Principal
     */
    public Principal() {
        this.setContentPane(fondo);
        this.pDAO = new PendientesDAO();
        this.epDAO = new EnProcesoDAO();
        this.tDAO = new TerminadasDAO();
        initComponents();
        conTablaPend();
        refreshTPend();
        conTablaEP();
        refreshTEP();
        conTablaTerm();
        refreshTT();
        this.setLocationRelativeTo(this);
        setResizable(false);
        this.setTitle("Tecnica Pomodoro");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegistrarTarea = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
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
        jLabel4 = new javax.swing.JLabel();
        lblTemporizador = new javax.swing.JLabel();
        brnCancelar = new javax.swing.JButton();
        btnTerminar = new javax.swing.JButton();
        btnPausar = new javax.swing.JButton();
        btnIniciar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnRegistrarTarea.setBackground(new java.awt.Color(0, 0, 0));
        btnRegistrarTarea.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnRegistrarTarea.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarTarea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/registros.png"))); // NOI18N
        btnRegistrarTarea.setText("Registrar Tarea");
        btnRegistrarTarea.setAlignmentX(0.5F);
        btnRegistrarTarea.setAlignmentY(0.1F);
        btnRegistrarTarea.setBorder(null);
        btnRegistrarTarea.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnRegistrarTareaMouseMoved(evt);
            }
        });
        btnRegistrarTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarTareaActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(130, 47, 157,80));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 153, 204), null, java.awt.Color.lightGray));
        jPanel3.setForeground(new java.awt.Color(130, 47, 157));

        pnlPendientes.setBackground(new java.awt.Color(255, 51, 51,80));
        pnlPendientes.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        pnlPendientes.setPreferredSize(new java.awt.Dimension(232, 48));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText(" Pendientes");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(54, 54, 54))
            .addGroup(pnlPendientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(barra1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlPendientesLayout.setVerticalGroup(
            pnlPendientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPendientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barra1, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlEnProgreso.setBackground(new java.awt.Color(255, 255, 102));
        pnlEnProgreso.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
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
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlTerminadas.setBackground(new java.awt.Color(51, 255, 51,80));
        pnlTerminadas.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
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
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTerminadasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(50, 50, 50))
        );
        pnlTerminadasLayout.setVerticalGroup(
            pnlTerminadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTerminadasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tareas");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(pnlPendientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlEnProgreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlTerminadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlEnProgreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlPendientes, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                    .addComponent(pnlTerminadas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        lblTemporizador.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblTemporizador.setText("12:00:00");
        lblTemporizador.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblTemporizadorMouseMoved(evt);
            }
        });

        brnCancelar.setBackground(new java.awt.Color(0, 0, 0));
        brnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        brnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Cancelar.png"))); // NOI18N
        brnCancelar.setBorder(null);
        brnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        brnCancelar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                brnCancelarMouseMoved(evt);
            }
        });
        brnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnCancelarActionPerformed(evt);
            }
        });

        btnTerminar.setBackground(new java.awt.Color(0, 0, 0));
        btnTerminar.setForeground(new java.awt.Color(255, 255, 255));
        btnTerminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/comprobado (1).png"))); // NOI18N
        btnTerminar.setText("Terminar");
        btnTerminar.setBorder(null);
        btnTerminar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnTerminarMouseMoved(evt);
            }
        });
        btnTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminarActionPerformed(evt);
            }
        });

        btnPausar.setBackground(new java.awt.Color(0, 0, 0));
        btnPausar.setForeground(new java.awt.Color(255, 255, 255));
        btnPausar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/boton-de-pausa (1).png"))); // NOI18N
        btnPausar.setText("Pausar");
        btnPausar.setBorder(null);
        btnPausar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnPausarMouseMoved(evt);
            }
        });
        btnPausar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPausarActionPerformed(evt);
            }
        });

        btnIniciar.setBackground(new java.awt.Color(0, 0, 0));
        btnIniciar.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/jugar (1).png"))); // NOI18N
        btnIniciar.setText("Iniciar");
        btnIniciar.setBorder(null);
        btnIniciar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnIniciarMouseMoved(evt);
            }
        });
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator2.setBackground(new java.awt.Color(130, 47, 157));
        jSeparator2.setForeground(new java.awt.Color(130, 47, 157));
        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(130, 47, 157)));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Actualizar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnPausar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(btnTerminar, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                                    .addComponent(jSeparator1)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(btnRegistrarTarea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jSeparator2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jSeparator3)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(lblTemporizador)
                                                .addGap(76, 76, 76)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(brnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jSeparator4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(99, 99, 99)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrarTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(brnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addComponent(lblTemporizador)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTerminar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPausar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(124, 124, 124))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void brnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnCancelarActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_brnCancelarActionPerformed

    private void brnCancelarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_brnCancelarMouseMoved
        // TODO add your handling code here:
        String texto="Cancelar temporizador";
        brnCancelar.setToolTipText(texto);

    }//GEN-LAST:event_brnCancelarMouseMoved

    private void lblTemporizadorMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTemporizadorMouseMoved
        // TODO add your handling code here:
        String texto="Tiempo restante";
        lblTemporizador.setToolTipText(texto);
    }//GEN-LAST:event_lblTemporizadorMouseMoved

    private void btnTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTerminarActionPerformed

    private void btnTerminarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTerminarMouseMoved
        // TODO add your handling code here:
        String texto="Marcar como tarea terminada";
        btnTerminar.setToolTipText(texto);
    }//GEN-LAST:event_btnTerminarMouseMoved

    private void btnPausarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPausarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPausarActionPerformed

    private void btnPausarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPausarMouseMoved
        // TODO add your handling code here:
        String texto="Pausear el temporizador";
        btnPausar.setToolTipText(texto);
    }//GEN-LAST:event_btnPausarMouseMoved

    private void btnIniciarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarMouseMoved
        // TODO add your handling code here:
        String texto="Inicia el temporizador";
        btnIniciar.setToolTipText(texto);
    }//GEN-LAST:event_btnIniciarMouseMoved

    private void btnRegistrarTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarTareaActionPerformed
        refreshTPend();
        
        registrarTarea regTarea = new registrarTarea();
        regTarea.setVisible(true);
        dispose();
       
    }//GEN-LAST:event_btnRegistrarTareaActionPerformed

    private void btnRegistrarTareaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarTareaMouseMoved
        // TODO add your handling code here:
         String texto="Agregar tarea";
        btnRegistrarTarea.setToolTipText(texto);
    }//GEN-LAST:event_btnRegistrarTareaMouseMoved

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        // TODO add your handling code here:
        iniciar();
        refreshTPend();
        refreshTEP();
    }//GEN-LAST:event_btnIniciarActionPerformed

    public void refreshTPend(){
        this.tblPendientes.updateUI();
        this.tblPendientes.repaint();
    }
    
    public void refreshTEP(){
        this.tblProgreso.updateUI();
        this.tblProgreso.repaint();
    }
    
    public void refreshTT(){
        this.tblTerminadas.updateUI();
        this.tblTerminadas.repaint();
    }
    
    public String[][] tareasP(){
        ArrayList<Tarea> listTareas = this.pDAO.consultar();
        String pend [][] = new String[listTareas.size()][1];
        for (int i = 0; i < listTareas.size(); i++) {
            pend[i][0] = listTareas.get(i).getNombre();
        }
        return pend;
    }
    
    public String[][] tareasEP(){
        ArrayList<Tarea> listTareas = this.epDAO.consultar();
        String enpro [][] = new String[listTareas.size()][1];
        for (int i = 0; i < listTareas.size(); i++) {
            enpro[i][0] = listTareas.get(i).getNombre();
        }
        return enpro;
    }
    
    public String[][] tareasT(){
        ArrayList<Tarea> listTareas = this.tDAO.consultar();
        String term [][] = new String[listTareas.size()][1];
        for (int i = 0; i < listTareas.size(); i++) {
            term[i][0] = listTareas.get(i).getNombre();
        }
        return term;
    }
    
    public void conTablaPend(){
        String title[] = {"Nombre"};
        String info[][] = tareasP();
        DefaultTableModel model =  new DefaultTableModel(info,title){
            public boolean isCellEditable(int fila, int cols){
               return false;
            }
        };
        model.setRowCount(0);
        model.setDataVector(info, title);
        tblPendientes.setModel(model);
        this.tblPendientes.setEnabled(true);
        ArrayList<Tarea> listTareas = this.pDAO.consultar();
        this.tblPendientes.setRowSelectionAllowed(true);
//        isSelectionEditable(tblPendientes);
//        
        this.tblPendientes.setDragEnabled(true);
        this.tblPendientes.setDropMode(DropMode.INSERT_ROWS);
        this.tblPendientes.setTransferHandler(new TableRowTransferHandler(this.tblPendientes));
    }
    
    public void conTablaEP(){
        String title[] = {"Nombre"};
        String info[][] = tareasEP();
        DefaultTableModel model = (DefaultTableModel) this.tblProgreso.getModel();
        model.setRowCount(0);
        model.setDataVector(info, title);
        this.tblProgreso.setEnabled(true);
//        ArrayList<Tarea> listTareas = this.pDAO.consultar();
//        for (int i = 0; i < listTareas.size(); i++) {
//            modeloTabla.isCellEdit(i, 0);
//        }
//        this.tblPendientes.setDragEnabled(true);
//        this.tblPendientes.setDropMode(DropMode.INSERT_ROWS);
//        this.tblPendientes.setTransferHandler(new TableRowTransferHandler(this.tblPendientes));
    }
    
    public void conTablaTerm(){
        String title[] = {"Nombre"};
        String info[][] = tareasT();
        DefaultTableModel model = (DefaultTableModel) this.tblTerminadas.getModel();
        model.setRowCount(0);
        model.setDataVector(info, title);
        this.tblTerminadas.setEnabled(true);
//        ArrayList<Tarea> listTareas = this.pDAO.consultar();
//        for (int i = 0; i < listTareas.size(); i++) {
//            modeloTabla.isCellEdit(i, 0);
//        }
//        this.tblPendientes.setDragEnabled(true);
//        this.tblPendientes.setDropMode(DropMode.INSERT_ROWS);
//        this.tblPendientes.setTransferHandler(new TableRowTransferHandler(this.tblPendientes));
    }
    
    protected boolean isSelectionEditable( JTable table ) {
	if( table.getRowSelectionAllowed() ) {
		int columnCount = table.getColumnCount();
		int[] selectedRows = table.getSelectedRows();
		for( int selectedRow : selectedRows ) {
			for( int column = 0; column < columnCount; column++ ) {
				if( table.isCellEditable( selectedRow, column ) )
					return true;
			}
		}
	}

	if( table.getColumnSelectionAllowed() ) {
		int rowCount = table.getRowCount();
		int[] selectedColumns = table.getSelectedColumns();
		for( int selectedColumn : selectedColumns ) {
			for( int row = 0; row < rowCount; row++ ) {
				if( table.isCellEditable( row, selectedColumn ) )
					return true;
			}
		}
	}

	return false;
}
    
    public void iniciar(){
        ObjectId id;
        String name = "", desc= "", status = "En Proceso";
        int fila = this.tblPendientes.getSelectedRow();
        String valor = this.tblPendientes.getValueAt(fila, 0).toString();
        ArrayList<Tarea> listaTareaS = this.pDAO.consultar();
        for (int i = fila; i < listaTareaS.size(); i++) {
            name = listaTareaS.get(fila).getNombre();
            desc = listaTareaS.get(fila).getDescripcion();
            id = listaTareaS.get(fila).getId();
        }
        Tarea tareaEP = new Tarea(name, desc, status);
        epDAO.agregar(tareaEP);
        DefaultTableModel tareasP = (DefaultTableModel) this.tblPendientes.getModel();
        tareasP.removeRow(fila);
        pDAO.eliminar(tareaEP);
        conTablaEP();
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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblTemporizador;
    private javax.swing.JPanel pnlEnProgreso;
    private javax.swing.JPanel pnlPendientes;
    private javax.swing.JPanel pnlTerminadas;
    public javax.swing.JTable tblPendientes;
    private javax.swing.JTable tblProgreso;
    private javax.swing.JTable tblTerminadas;
    // End of variables declaration//GEN-END:variables

    class Fondopanel extends JPanel{
    
        private Image imagen; 
    
    public void paint(Graphics g){
        imagen = new ImageIcon(getClass().getResource("/iconos/54336.png")).getImage();
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(),this);
        setOpaque(false);
        super.paint(g);
    }
}

}
