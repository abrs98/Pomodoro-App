/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import DAO.EnProcesoDAO;
import DAO.PendientesDAO;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import objetosNegocio.Tarea;
import org.bson.types.ObjectId;

/**
 *
 * @author Michelle Naffate
 */
public class editarEnProgreso extends javax.swing.JFrame {

    /**
     * Creates new form editarEnProgreso
     */
    Principal ventana = new Principal();
    editarEnProgreso.Fondopanel fondo = new editarEnProgreso.Fondopanel();
    Principal principal;
 
    private Tarea tM = null;
    private EnProcesoDAO epDAO = null;


    public editarEnProgreso() {
        this.setContentPane(fondo);
         this.epDAO = new EnProcesoDAO();
       
        this.principal = new Principal();
        initComponents();
        this.setLocationRelativeTo(this);
        setResizable(false);
        ventana.setVisible(true);
        this.setTitle("Registrar tarea");
       
        conTablaPend();
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
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taNombre = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taDesc = new javax.swing.JTextArea();
        btnActualizar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        pnlEnProgreso = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblProgreso = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255,80));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 0, 204), null, java.awt.Color.lightGray));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");

        taNombre.setColumns(20);
        taNombre.setRows(5);
        taNombre.setBorder(null);
        taNombre.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                taNombreMouseMoved(evt);
            }
        });
        jScrollPane1.setViewportView(taNombre);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Descripción:");

        taDesc.setColumns(20);
        taDesc.setRows(5);
        taDesc.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                taDescMouseMoved(evt);
            }
        });
        jScrollPane2.setViewportView(taDesc);

        btnActualizar.setBackground(new java.awt.Color(0, 0, 0));
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/garrapata.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.setBorder(null);
        btnActualizar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnActualizarMouseMoved(evt);
            }
        });
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Cancelar.png"))); // NOI18N
        btnCerrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCerrar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnCerrarMouseMoved(evt);
            }
        });
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/limpiar.png"))); // NOI18N
        btnLimpiar.setBorder(null);
        btnLimpiar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseMoved(evt);
            }
        });
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(0, 0, 0));
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(null);
        btnEliminar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnEliminarMouseMoved(evt);
            }
        });
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(213, 213, 213)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnCerrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pnlEnProgreso.setBackground(new java.awt.Color(255, 255, 102));
        pnlEnProgreso.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("En Progreso");

        jScrollPane3.setHorizontalScrollBar(null);
        jScrollPane3.setMaximumSize(new java.awt.Dimension(200, 380));
        jScrollPane3.setMinimumSize(new java.awt.Dimension(200, 380));
        jScrollPane3.setPreferredSize(new java.awt.Dimension(200, 380));

        tblProgreso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblProgreso.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblProgreso.setMaximumSize(new java.awt.Dimension(190, 380));
        tblProgreso.setMinimumSize(new java.awt.Dimension(190, 380));
        tblProgreso.setPreferredSize(new java.awt.Dimension(180, 380));
        tblProgreso.setUpdateSelectionOnSort(false);
        tblProgreso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProgresoMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblProgreso);

        jScrollPane3.setViewportView(jScrollPane4);

        javax.swing.GroupLayout pnlEnProgresoLayout = new javax.swing.GroupLayout(pnlEnProgreso);
        pnlEnProgreso.setLayout(pnlEnProgresoLayout);
        pnlEnProgresoLayout.setHorizontalGroup(
            pnlEnProgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEnProgresoLayout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(jLabel4)
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
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenuBar1.setPreferredSize(new java.awt.Dimension(142, 31));

        jMenu1.setText("Pendientes");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(204, 0, 204));
        jMenu2.setText("En progreso");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlEnProgreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlEnProgreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public ObjectId obtenerID() {
        Tarea homework = this.tM;
        return epDAO.consultarId(homework);
    }

    public void ActualizarTareaPend() {
        ArrayList<Tarea> listaTareaPend = this.epDAO.consultar();
        for (Tarea tAE : listaTareaPend) {
            if (tAE.getId().equals(this.obtenerID())) {
                tAE.setNombre(taNombre.getText());
                tAE.setDescripcion(taDesc.getText());
                this.epDAO.actualizar(tAE);
            }
        }
    }

    public boolean nombreValido(String nombre) {
        if (this.taNombre.getText().length() > 0 && this.taNombre.getText().length() <= 100) {
            return true;
        }
        return false;
    }

    public boolean descValida(String Desc) {
        if (this.taDesc.getText().length() > 0 && this.taDesc.getText().length() <= 100) {
            return true;
        }
        return false;
    }

    private boolean tareaRepetida(String tarea) {
        ArrayList<Tarea> listaPend = this.epDAO.consultar();
        for (Tarea t : listaPend) {
            if (t.getNombre().equalsIgnoreCase(tarea)) {
                return true;
            }
        }

        ArrayList<Tarea> listaProgreso = this.epDAO.consultar();
        for (Tarea t : listaProgreso) {
            if (t.getNombre().equalsIgnoreCase(tarea)) {
                return true;
            }
        }

        return false;
    }

    public void eliminarTareaProgreso() {
        int fila2 = this.tblProgreso.getSelectedRow();
        DefaultTableModel tareasProg = (DefaultTableModel) this.tblProgreso.getModel();
        tareasProg.removeRow(fila2);
        ArrayList<Tarea> listaTareaProg = this.epDAO.consultar();
        for (Tarea tAE : listaTareaProg) {
            if (tAE.getId().equals(this.obtenerID())) {
                this.epDAO.eliminar(tAE);
            }
        }
    }

    public Object[][] tareasP() { //Se actualizo este metodo
        ArrayList<Tarea> listTareas = this.epDAO.consultar();
        Object[][] pend = new Object[listTareas.size()][2];
        for (int i = 0; i < listTareas.size(); i++) {
            pend[i][0] = listTareas.get(i).getNombre();
          
        }
        return pend;
    }

    public void conTablaPend() { //Se actualizo este metodo para que agreugue el boton eliminar
        Object title[] = {"Nombre"};
        Object info[][] = tareasP();

        DefaultTableModel model = new DefaultTableModel(info, title) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        model.setRowCount(0);
        model.setDataVector(info, title);
        tblProgreso.setModel(model);
       
        TableColumnModel cm = (TableColumnModel) tblProgreso.getColumnModel();
        cm.getColumn(0).setPreferredWidth(130);
        
        tblProgreso.setColumnModel(cm);
        tblProgreso.setRowHeight(34);
    }

    private void taNombreMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_taNombreMouseMoved
        String texto = "Nombre de la tarea";
        taNombre.setToolTipText(texto);
    }//GEN-LAST:event_taNombreMouseMoved

    private void taDescMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_taDescMouseMoved
        String texto = "Descripcion de la tarea";
        taDesc.setToolTipText(texto);
    }//GEN-LAST:event_taDescMouseMoved

    private void btnActualizarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseMoved
        String texto = "Registrar tarea en la lista de pendiente";
        btnActualizar.setToolTipText(texto);
    }//GEN-LAST:event_btnActualizarMouseMoved
    public void limpiarCampos() {
        this.taNombre.setText("");
        this.taDesc.setText("");
    }
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if (nombreValido(taNombre.getText()) && descValida(taDesc.getText())) {
            if (tareaRepetida(taNombre.getText()) != true) {
                ActualizarTareaPend();
                JOptionPane.showMessageDialog(null, "La tarea se actualizo exitosamente");
                this.principal.conTablaEP();
                this.dispose();
               
                principal.setVisible(true);
                limpiarCampos();
            } else {
                JOptionPane.showMessageDialog(this, "La tarea ya existe",
                        "Error al querer registrar tarea", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "El campo de nombre y/o descripción se encuentran vacios",
                    "Error al registrar tarea", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnCerrarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseMoved
        String texto = "Regresar inicio";
        btnCerrar.setToolTipText(texto);
    }//GEN-LAST:event_btnCerrarMouseMoved

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        int eleccion = JOptionPane.showConfirmDialog(null, "Si regresa no se guardaran los cambios. ¿Desea salir?", "Confirmar salida", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (JOptionPane.YES_OPTION == eleccion) {
            this.dispose();

        }
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnLimpiarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseMoved
        // TODO add your handling code here:
        String texto = "Limpiar campos";
        btnLimpiar.setToolTipText(texto);
    }//GEN-LAST:event_btnLimpiarMouseMoved

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEliminarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarMouseMoved

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int eleccion = JOptionPane.showConfirmDialog(null, "Si elimna esta tarea no podra recuperarla. ¿Desea eliminarla?", "Confirmar eliminacion", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (JOptionPane.YES_OPTION == eleccion) {
            eliminarTareaProgreso();
            this.principal.conTablaPend();
            this.dispose();
            ventana.dispose();
            principal.setVisible(true);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked


    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        editarTarea editar = new editarTarea();
        editar.setVisible(true);
        ventana.dispose();
        dispose();       
    }//GEN-LAST:event_jMenu1MouseClicked

    private void tblProgresoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProgresoMouseClicked
 if (tblProgreso.getSelectedRow() != -1) {
            int p = tblProgreso.getSelectedRow();
            taNombre.setText(tblProgreso.getValueAt(p, 0).toString());
             ArrayList<Tarea> listaTareaProgreso = this.epDAO.consultar();
        for (int i = p; i < listaTareaProgreso.size(); i++) {
            taDesc.setText(listaTareaProgreso.get(p).getDescripcion());
        }
        } else {
            JOptionPane.showMessageDialog(null, "Al seleccionar una fila puede ocasionar cambios");
 }
    }//GEN-LAST:event_tblProgresoMouseClicked

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
            java.util.logging.Logger.getLogger(editarEnProgreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editarEnProgreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editarEnProgreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editarEnProgreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editarEnProgreso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCerrar;
    public javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    public javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel pnlEnProgreso;
    private javax.swing.JTextArea taDesc;
    private javax.swing.JTextArea taNombre;
    private javax.swing.JTable tblProgreso;
    // End of variables declaration//GEN-END:variables
class Fondopanel extends JPanel {

        private Image imagen;

        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/iconos/fondo.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }
}
