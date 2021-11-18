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
import java.util.TimerTask;
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

    private Tarea tM = null;

    Fondopanel fondo = new Fondopanel();
    private boolean INICIA = false;
    private boolean CANCELA = false;
    private boolean TERMINA = false;
    private boolean PAUSA = false;
    private int segundos = 0;
    private int minutos = 0;
    Tarea tarea = null;
    private String min, seg;

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
        this.tblTerminadas.setEnabled(false);
        this.btnTermIsEnable();
        this.btnIniciarIsEnable();
        this.btnPausaIsEnable();
        this.btnCancelarIsEnable();

    }

    public Principal(Tarea tareita) {
        this.setContentPane(fondo);
        this.pDAO = new PendientesDAO();
        this.epDAO = new EnProcesoDAO();
        this.tDAO = new TerminadasDAO();
        this.tM = tareita;
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
        this.tblTerminadas.setEnabled(false);
        this.btnTermIsEnable();
        this.btnIniciarIsEnable();
        this.btnPausaIsEnable();
        this.btnCancelarIsEnable();
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
        bntEditarTarea = new javax.swing.JButton();

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

        lblTemporizador.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblTemporizador.setForeground(new java.awt.Color(204, 204, 204));
        lblTemporizador.setText("00:00");
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
        btnTerminar.setEnabled(false);
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
        btnPausar.setEnabled(false);
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
        btnIniciar.setEnabled(false);
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
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/boton-actualizar.png"))); // NOI18N
        jButton1.setText("Actualizar");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        bntEditarTarea.setBackground(new java.awt.Color(0, 0, 0));
        bntEditarTarea.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        bntEditarTarea.setForeground(new java.awt.Color(255, 255, 255));
        bntEditarTarea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/editar (1).png"))); // NOI18N
        bntEditarTarea.setText("Editar tareas");
        bntEditarTarea.setBorder(null);
        bntEditarTarea.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                bntEditarTareaMouseMoved(evt);
            }
        });
        bntEditarTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntEditarTareaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bntEditarTarea, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(btnPausar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnTerminar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6))
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(btnRegistrarTarea, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE))
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jSeparator3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(112, 112, 112)
                                                .addComponent(lblTemporizador)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addComponent(brnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                .addGap(18, 18, 18)
                .addComponent(bntEditarTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(brnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTemporizador)
                        .addGap(45, 45, 45)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPausar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTerminar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void brnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnCancelarActionPerformed
        // TODO add your handling code here:
        if (tblProgreso.getSelectedRow() != -1) {
            int dialog = JOptionPane.showConfirmDialog(this, "¿Seguro que desea cancelar esta tarea?",
                    "Confirmación", JOptionPane.YES_NO_OPTION);
            if (dialog == JOptionPane.YES_OPTION) {
                Cancelar();
                eliminarTareaProgreso();
                conTablaPend();
                btnIniciarIsEnable();
                JOptionPane.showConfirmDialog(this, "¡La tarea fue cancelada!",
                        "Mensaje", JOptionPane.PLAIN_MESSAGE);
            } else {
                JOptionPane.showConfirmDialog(this, "La tarea no fue cancelada",
                        "Mensaje", JOptionPane.PLAIN_MESSAGE);
            }
        } else {
            JOptionPane.showConfirmDialog(this, "Ninguna tarea ha sido seleccionada",
                    "Advertencia", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_brnCancelarActionPerformed

    private void brnCancelarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_brnCancelarMouseMoved
        // TODO add your handling code here:
        String texto = "Cancelar temporizador";
        brnCancelar.setToolTipText(texto);

    }//GEN-LAST:event_brnCancelarMouseMoved

    private void lblTemporizadorMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTemporizadorMouseMoved
        // TODO add your handling code here:
        String texto = "Tiempo restante";
        lblTemporizador.setToolTipText(texto);
    }//GEN-LAST:event_lblTemporizadorMouseMoved

    private void btnTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminarActionPerformed
        // TODO add your handling code here:
        if (tblProgreso.getSelectedRow() != -1) {
            int dialog = JOptionPane.showConfirmDialog(this, "¿Seguro que desea terminar esta tarea?",
                    "Confirmación", JOptionPane.YES_NO_OPTION);
            if (dialog == JOptionPane.YES_OPTION) {
                Terminar();
                eliminarTareaProgreso();
                JOptionPane.showConfirmDialog(this, "¡La tarea fue terminada con exito!",
                        "Mensaje", JOptionPane.PLAIN_MESSAGE);
            } else {
                JOptionPane.showConfirmDialog(this, "La tarea no fue marcada como terminada",
                        "Mensaje", JOptionPane.PLAIN_MESSAGE);
            }
        } else {
            JOptionPane.showConfirmDialog(this, "Ninguna tarea ha sido seleccionada",
                    "Advertencia", JOptionPane.PLAIN_MESSAGE);
        }


    }//GEN-LAST:event_btnTerminarActionPerformed

    private void btnTerminarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTerminarMouseMoved
        // TODO add your handling code here:
        String texto = "Marcar como tarea terminada";
        btnTerminar.setToolTipText(texto);
    }//GEN-LAST:event_btnTerminarMouseMoved

    private void btnPausarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPausarActionPerformed
        // TODO add your handling code here:
        INICIA = false;
        PAUSA = true;
        btnIniciar.setEnabled(true);
        btnPausar.setEnabled(false);
        btnIniciar.setText("Reanudar");
    }//GEN-LAST:event_btnPausarActionPerformed

    private void btnPausarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPausarMouseMoved
        // TODO add your handling code here:
        String texto = "Pausear el temporizador";
        btnPausar.setToolTipText(texto);
    }//GEN-LAST:event_btnPausarMouseMoved

    private void btnIniciarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarMouseMoved
        // TODO add your handling code here:
        String texto = "Inicia el temporizador";
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
        String texto = "Agregar tarea";
        btnRegistrarTarea.setToolTipText(texto);
    }//GEN-LAST:event_btnRegistrarTareaMouseMoved

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        // TODO add your handling code here:\
        if (tblProgreso.getRowCount() != 1) {
            if (tblPendientes.getSelectedRow() != -1) {
                INICIA = true;
                checkTime();
                btnIniciar.setEnabled(false);
                iniciar();
                eliminarTareaPend();
                conTablaEP();
                btnCancelarIsEnable();
            } else if (PAUSA = true) {
                INICIA = true;
                checkTime();
                btnIniciar.setEnabled(false);
                PAUSA = false;
                btnPausaIsEnable();

            } else {
                JOptionPane.showConfirmDialog(this, "Ninguna tarea ha sido seleccionada",
                        "Advertencia", JOptionPane.PLAIN_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "No puedes ejecutar otra tarea!!!");
        }
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void bntEditarTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntEditarTareaActionPerformed
        // TODO add your handling code here:
        refreshTPend();
        editarTarea editar = new editarTarea();
        editar.setVisible(true);
        dispose();
    }//GEN-LAST:event_bntEditarTareaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        conTablaEP();
        conTablaPend();
        conTablaTerm();
        btnIniciarIsEnable();
        btnPausaIsEnable();
        btnCancelarIsEnable();
        btnTermIsEnable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bntEditarTareaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntEditarTareaMouseMoved
        String texto = "Editar tareas pendientes";
        bntEditarTarea.setToolTipText(texto);
    }//GEN-LAST:event_bntEditarTareaMouseMoved

    public ObjectId obtenerID() {
        Tarea homework = this.tM;
        return pDAO.consultarId(homework);
    }

    public ObjectId obtenerID2() {
        Tarea homework2 = this.tM;
        return epDAO.consultarId(homework2);
    }

    public void refreshTPend() {
        this.tblPendientes.updateUI();
        this.tblPendientes.repaint();
    }

    public void refreshTEP() {
        this.tblProgreso.updateUI();
        this.tblProgreso.repaint();
    }

    public void refreshTT() {
        this.tblTerminadas.updateUI();
        this.tblTerminadas.repaint();
    }

    public String[][] tareasP() {
        ArrayList<Tarea> listTareas = this.pDAO.consultar();
        String pend[][] = new String[listTareas.size()][1];
        for (int i = 0; i < listTareas.size(); i++) {
            pend[i][0] = listTareas.get(i).getNombre();
        }
        return pend;
    }

    public String[][] tareasEP() {
        ArrayList<Tarea> listTareas = this.epDAO.consultar();
        String enpro[][] = new String[listTareas.size()][1];
        for (int i = 0; i < listTareas.size(); i++) {
            enpro[i][0] = listTareas.get(i).getNombre();
        }
        return enpro;
    }

    public String[][] tareasT() {
        ArrayList<Tarea> listTareas = this.tDAO.consultar();
        String term[][] = new String[listTareas.size()][1];
        for (int i = 0; i < listTareas.size(); i++) {
            term[i][0] = listTareas.get(i).getNombre();
        }
        return term;
    }

    public void conTablaPend() {
        String title[] = {"Nombre"};
        String info[][] = tareasP();
        DefaultTableModel model = new DefaultTableModel(info, title) {
            public boolean isCellEditable(int fila, int cols) {
                return false;
            }
        };
        model.setRowCount(0);
        model.setDataVector(info, title);
        tblPendientes.setModel(model);
        this.tblPendientes.setEnabled(true);
    }

    public void conTablaEP() {
        String title[] = {"Nombre"};
        String info[][] = tareasEP();
        DefaultTableModel model = new DefaultTableModel(info, title) {
            public boolean isCellEditable(int fila, int cols) {
                return false;
            }
        };
        model.setRowCount(0);
        model.setDataVector(info, title);
        tblProgreso.setModel(model);
        this.tblProgreso.setEnabled(true);
    }

    public void conTablaTerm() {
        String title[] = {"Nombre"};
        String info[][] = tareasT();
        DefaultTableModel model = new DefaultTableModel(info, title) {
            public boolean isCellEditable(int fila, int cols) {
                return false;
            }
        };
        model.setRowCount(0);
        model.setDataVector(info, title);
        tblTerminadas.setModel(model);
        this.tblTerminadas.setEnabled(false);
    }

    public void btnTermIsEnable() {
        DefaultTableModel tabVacia = (DefaultTableModel) tblProgreso.getModel();
        if (tabVacia.getRowCount() >= 1) {
            btnTerminar.setEnabled(true);
        } else {
            btnTerminar.setEnabled(false);
        }
    }

    public void btnIniciarIsEnable() {
        DefaultTableModel tabVacia = (DefaultTableModel) tblPendientes.getModel();
        if (tabVacia.getRowCount() >= 1) {
            btnIniciar.setEnabled(true);
        } else {
            btnIniciar.setEnabled(false);
        }
    }

    public void btnCancelarIsEnable() {
        DefaultTableModel tabVacia = (DefaultTableModel) tblProgreso.getModel();
        if (tabVacia.getRowCount() >= 1) {
            brnCancelar.setEnabled(true);
        } else {
            brnCancelar.setEnabled(false);
        }
    }

    public void btnPausaIsEnable() {
        if (INICIA==true) {
            btnPausar.setEnabled(true);
        } 
        
        if(INICIA==false){
            btnPausar.setEnabled(false);
        }
    }

    public void iniciar() {
        String name = "", desc = "", status = "En Progreso";
        int fila = this.tblPendientes.getSelectedRow();
        String valor = this.tblPendientes.getValueAt(fila, 0).toString();
        ArrayList<Tarea> listaTareaS = this.pDAO.consultar();
        for (int i = fila; i < listaTareaS.size(); i++) {
            name = listaTareaS.get(fila).getNombre();
            desc = listaTareaS.get(fila).getDescripcion();
        }
        Tarea tareaEP = new Tarea(name, desc, status);
        epDAO.agregar(tareaEP);
        conTablaEP();
        btnTermIsEnable();
    }

    public void Terminar() {
        String name = "", desc = "", status = "Terminada";
        int fila = this.tblProgreso.getSelectedRow();
        String valor = this.tblProgreso.getValueAt(fila, 0).toString();
        ArrayList<Tarea> listaTareaS = this.epDAO.consultar();
        for (int i = fila; i < listaTareaS.size(); i++) {
            name = listaTareaS.get(fila).getNombre();
            desc = listaTareaS.get(fila).getDescripcion();
        }
        Tarea tareaTer = new Tarea(name, desc, status);
        tDAO.agregar(tareaTer);
        conTablaTerm();
        lblTemporizador.setText("00:00");
    }

    public void Cancelar() {
        String name = "", desc = "", status = "En Progreso";
        int fila = this.tblProgreso.getSelectedRow();
        String valor = this.tblProgreso.getValueAt(fila, 0).toString();
        ArrayList<Tarea> listaTareaS = this.epDAO.consultar();
        for (int i = fila; i < listaTareaS.size(); i++) {
            name = listaTareaS.get(fila).getNombre();
            desc = listaTareaS.get(fila).getDescripcion();
        }
        Tarea tareaPen = new Tarea(name, desc, status);
        pDAO.agregar(tareaPen);
        conTablaTerm();
    }

    public void eliminarTareaPend() {
        int fila = this.tblPendientes.getSelectedRow();
        DefaultTableModel tareasP = (DefaultTableModel) this.tblPendientes.getModel();
        tareasP.removeRow(fila);
        ArrayList<Tarea> listaTareaPend = this.pDAO.consultar();
        for (Tarea tAE : listaTareaPend) {
            if (tAE.getId().equals(this.obtenerID())) {
                this.pDAO.eliminar(tAE);
            }
        }
    }

    public void eliminarTareaProgreso() {
        int fila2 = this.tblProgreso.getSelectedRow();
        DefaultTableModel tareasProg = (DefaultTableModel) this.tblProgreso.getModel();
        tareasProg.removeRow(fila2);
        ArrayList<Tarea> listaTareaProg = this.epDAO.consultar();
        for (Tarea tAE : listaTareaProg) {
            if (tAE.getId().equals(this.obtenerID2())) {
                this.epDAO.eliminar(tAE);
            }
        }
    }

    public void checkTime() {
        java.util.Timer timer = new java.util.Timer();

        btnPausar.setEnabled(true);
        timer.scheduleAtFixedRate(new TimerTask() {

            public void run() {

                if (INICIA) {
                    min = String.format("%02d", minutos);
                    seg = String.format("%02d", segundos);
                    lblTemporizador.setText(min + ":" + seg);
                    segundos++;

                    if (segundos > 59) {
                        minutos++;
                        segundos = 0;
                    }
                } else if (PAUSA) {
                    JOptionPane.showMessageDialog(null, "Se ha pausado el temporizador");
                    cancel();
                }

            }
        }, 0, 1000);
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
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton bntEditarTarea;
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

    class Fondopanel extends JPanel {

        private Image imagen;

        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/iconos/54336.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }

}
