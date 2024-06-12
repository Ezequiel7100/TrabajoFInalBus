/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import AccesoADatos.ColectivoData;
import Entidades.Colectivo;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class RegistroColectivos extends javax.swing.JInternalFrame {

    /**
     * Creates new form RegistroColectivos
     */
    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };
    ColectivoData coleData;
    List<Colectivo> colectivos;
    private final String expRegMatricula = "^[A-Z]{2}[0-9]{3}[A-Z]{2}$";

    public RegistroColectivos() {
        initComponents();
        coleData = new ColectivoData();
        armarCabecera();
        restaurarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jbModificar = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jtfId = new javax.swing.JTextField();
        jbRestaurar = new javax.swing.JButton();
        jtfMatricula = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jtfBuscarMatricula = new javax.swing.JTextField();
        jbBuscarMatricula = new javax.swing.JButton();
        jtfBuscarId = new javax.swing.JTextField();
        jbBuscarId = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabla = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfMarca = new javax.swing.JTextField();
        jtfModelo = new javax.swing.JTextField();
        jcbCapacidad = new javax.swing.JComboBox<>();

        setClosable(true);

        jLabel1.setBackground(new java.awt.Color(0, 3, 102));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 125));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro de colectivos");

        jbModificar.setBackground(new java.awt.Color(0, 102, 204));
        jbModificar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbModificar.setForeground(new java.awt.Color(255, 255, 255));
        jbModificar.setText("Modificar");
        jbModificar.setEnabled(false);
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbBorrar.setBackground(new java.awt.Color(255, 51, 0));
        jbBorrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbBorrar.setForeground(new java.awt.Color(255, 255, 255));
        jbBorrar.setText("Borrar");
        jbBorrar.setEnabled(false);
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });

        jLabel9.setText("ID");

        jtfId.setEnabled(false);

        jbRestaurar.setBackground(new java.awt.Color(0, 153, 0));
        jbRestaurar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbRestaurar.setForeground(new java.awt.Color(255, 255, 255));
        jbRestaurar.setText("Restaurar");
        jbRestaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRestaurarActionPerformed(evt);
            }
        });

        jtfMatricula.setEnabled(false);

        jLabel5.setText("Capacidad");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jbBuscarMatricula.setBackground(new java.awt.Color(0, 102, 204));
        jbBuscarMatricula.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbBuscarMatricula.setForeground(new java.awt.Color(255, 255, 255));
        jbBuscarMatricula.setText("Buscar por matricula");
        jbBuscarMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarMatriculaActionPerformed(evt);
            }
        });

        jbBuscarId.setBackground(new java.awt.Color(0, 102, 204));
        jbBuscarId.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbBuscarId.setForeground(new java.awt.Color(255, 255, 255));
        jbBuscarId.setText("Buscar por ID");
        jbBuscarId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarIdActionPerformed(evt);
            }
        });

        jtTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtTablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtTabla);

        jLabel2.setText("Marca");

        jLabel3.setText("Modelo");

        jLabel4.setText("Matricula");

        jtfMarca.setEnabled(false);

        jtfModelo.setEnabled(false);

        jcbCapacidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "30", "40" }));
        jcbCapacidad.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbBorrar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfMatricula))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(jcbCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(28, 28, 28)
                                .addComponent(jtfMarca))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(21, 21, 21)
                                .addComponent(jtfModelo)))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfBuscarMatricula)
                            .addComponent(jtfBuscarId))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbBuscarMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbBuscarId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbRestaurar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbRestaurar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtfMarca)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfModelo))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtfMatricula)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jbBorrar)
                                    .addComponent(jbModificar)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jbBuscarMatricula)
                                    .addComponent(jtfBuscarMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtfBuscarId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbBuscarId))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRestaurarActionPerformed
        restaurarTabla();
    }//GEN-LAST:event_jbRestaurarActionPerformed

    private void jtTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtTablaMouseClicked
        int fila = jtTabla.getSelectedRow();
        if (fila != -1) {
            String capaS;
            int capaI;
            jtfMarca.setText(modelo.getValueAt(fila, 1) + "");
            jtfMarca.setEnabled(true);
            jtfModelo.setText(modelo.getValueAt(fila, 2) + "");
            jtfModelo.setEnabled(true);
            jtfMatricula.setText(modelo.getValueAt(fila, 3) + "");
            jtfMatricula.setEnabled(true);
            capaS = modelo.getValueAt(fila, 4) + "";
            capaI = Integer.parseInt(capaS);
            jcbCapacidad.setEnabled(true);
            if (capaI == 30) {
                jcbCapacidad.setSelectedIndex(0);
            }
            if (capaI == 40) {
                jcbCapacidad.setSelectedIndex(1);
            }
            jtfId.setText(modelo.getValueAt(fila, 0) + "");
            jbModificar.setEnabled(true);
            jbBorrar.setEnabled(true);
        }
    }//GEN-LAST:event_jtTablaMouseClicked

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        Colectivo c = new Colectivo();
        String marca, modeloC, matricula;

        //validar matricula
        if (jtfMatricula.getText().toUpperCase().matches(expRegMatricula)) {
            matricula = jtfMatricula.getText().toUpperCase();
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese una matricula válida (AB123CD)");
            return;
        }
        //validar matricula

        //validar marca
        if (!jtfMarca.getText().equals("")) {
            marca = jtfMarca.getText();
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese una marca");
            return;
        }
        //validar marca

        //validar modelo
        if (!jtfModelo.getText().equals("")) {
            modeloC = jtfModelo.getText();
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese un modelo");
            return;
        }
        //validar modelo

        c.setEstado(true);
        c.setId_colectivo(Integer.parseInt(jtfId.getText()));
        c.setCapacidad(Integer.parseInt(jcbCapacidad.getSelectedItem() + ""));
        c.setMarca(marca);
        c.setModelo(modeloC);
        c.setMatricula(matricula);
        coleData.modificarColectivo(c);
        terminarManipulacion();
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
        int id;
        id = Integer.parseInt(jtfId.getText());
        Colectivo c = new Colectivo();
        c.setId_colectivo(id);
        coleData.EliminarColectivo(c);
        terminarManipulacion();
    }//GEN-LAST:event_jbBorrarActionPerformed

    private void jbBuscarIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarIdActionPerformed
        if (jtfBuscarId.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese un ID para buscar");
            return;
        }
        if (!jtfBuscarId.getText().matches("^\\d+$")) {
            JOptionPane.showMessageDialog(this, "Ingrese un ID valido(numero)");
            return;
        }
        Colectivo c;
        int id;
        id = Integer.parseInt(jtfBuscarId.getText());
        c = coleData.buscarColectivoPorId(id);
        if (c != null) {
            borrarFilas();
            modelo.addRow(new Object[]{c.getId_colectivo(), c.getMarca(), c.getModelo(), c.getMatricula(), c.getCapacidad()});
        }
    }//GEN-LAST:event_jbBuscarIdActionPerformed

    private void jbBuscarMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarMatriculaActionPerformed
        if (jtfBuscarMatricula.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese una matricula para buscar");
            return;
        }
        Colectivo c;
        c = coleData.buscarColectivoPorMatricula(jtfBuscarMatricula.getText());
        if (c != null) {
            borrarFilas();
            modelo.addRow(new Object[]{c.getId_colectivo(), c.getMarca(), c.getModelo(), c.getMatricula(), c.getCapacidad()});
        }
    }//GEN-LAST:event_jbBuscarMatriculaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbBuscarId;
    private javax.swing.JButton jbBuscarMatricula;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbRestaurar;
    private javax.swing.JComboBox<String> jcbCapacidad;
    private javax.swing.JTable jtTabla;
    private javax.swing.JTextField jtfBuscarId;
    private javax.swing.JTextField jtfBuscarMatricula;
    private javax.swing.JTextField jtfId;
    private javax.swing.JTextField jtfMarca;
    private javax.swing.JTextField jtfMatricula;
    private javax.swing.JTextField jtfModelo;
    // End of variables declaration//GEN-END:variables

    private void restaurarTabla() {
        borrarFilas();
        colectivos = coleData.listarColectivos();
        for (Colectivo c : colectivos) {
            modelo.addRow(new Object[]{c.getId_colectivo(), c.getMarca(), c.getModelo(), c.getMatricula(), c.getCapacidad()});
        }
    }

    private void armarCabecera() {
        modelo.addColumn("ID");
        modelo.addColumn("Marca");
        modelo.addColumn("Modelo");
        modelo.addColumn("Matricula");
        modelo.addColumn("Capacidad");
        jtTabla.setModel(modelo);
    }

    private void borrarFilas() {
        int filas = modelo.getRowCount() - 1;
        for (int i = filas; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    private void terminarManipulacion() {
        restaurarTabla();
        jtfMarca.setEnabled(false);
        jtfMarca.setText("");
        jtfModelo.setEnabled(false);
        jtfModelo.setText("");
        jtfMatricula.setEnabled(false);
        jtfMatricula.setText("");
        jcbCapacidad.setEnabled(false);
        jcbCapacidad.setSelectedIndex(0);
        jtfId.setText("");
        jbModificar.setEnabled(false);
        jbBorrar.setEnabled(false);
    }

}
