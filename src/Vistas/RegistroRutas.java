/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import AccesoADatos.HorarioData;
import AccesoADatos.RutaData;
import Entidades.Horario;
import Entidades.Ruta;
import java.sql.Time;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class RegistroRutas extends javax.swing.JInternalFrame {

    /**
     * Creates new form RegistroRutas
     */
    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };
    HorarioData horaData;
    RutaData rutaData;
    List<Horario> horarios;
    List<Ruta> rutas;

    public RegistroRutas() {
        initComponents();
        horaData = new HorarioData();
        rutaData = new RutaData();
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

        jlTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabla = new javax.swing.JTable();
        jbRestaurar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfOrigen = new javax.swing.JTextField();
        jtfDestino = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfDuracion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfId = new javax.swing.JTextField();
        jbModificar = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        jtfBuscarId = new javax.swing.JTextField();
        jbBuscarId = new javax.swing.JButton();
        jbBuscarOrigen = new javax.swing.JButton();
        jbBuscarDestino = new javax.swing.JButton();
        jtfBuscarOrigen = new javax.swing.JTextField();
        jtfBuscarDestino = new javax.swing.JTextField();

        setClosable(true);

        jlTitulo.setBackground(new java.awt.Color(0, 3, 102));
        jlTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jlTitulo.setForeground(new java.awt.Color(0, 0, 125));
        jlTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitulo.setText("Registro de rutas");

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

        jbRestaurar.setBackground(new java.awt.Color(0, 153, 0));
        jbRestaurar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbRestaurar.setForeground(new java.awt.Color(255, 255, 255));
        jbRestaurar.setText("Restaurar");
        jbRestaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRestaurarActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel1.setText("Origen");

        jLabel2.setText("Destino");

        jtfOrigen.setEnabled(false);

        jtfDestino.setEnabled(false);

        jLabel3.setText("Duracion estimada");

        jtfDuracion.setEnabled(false);

        jLabel4.setText("ID");

        jtfId.setEnabled(false);

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

        jbBorrar.setBackground(new java.awt.Color(255, 51, 51));
        jbBorrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbBorrar.setForeground(new java.awt.Color(255, 255, 255));
        jbBorrar.setText("Borrar");
        jbBorrar.setEnabled(false);
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
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

        jbBuscarOrigen.setBackground(new java.awt.Color(0, 102, 204));
        jbBuscarOrigen.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbBuscarOrigen.setForeground(new java.awt.Color(255, 255, 255));
        jbBuscarOrigen.setText("Buscar por origen");
        jbBuscarOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarOrigenActionPerformed(evt);
            }
        });

        jbBuscarDestino.setBackground(new java.awt.Color(0, 102, 204));
        jbBuscarDestino.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbBuscarDestino.setForeground(new java.awt.Color(255, 255, 255));
        jbBuscarDestino.setText("Buscar por destino");
        jbBuscarDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarDestinoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbRestaurar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbBorrar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfDuracion, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfOrigen)
                                    .addComponent(jtfDestino))))
                        .addGap(30, 30, 30)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(jtfBuscarId, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbBuscarId))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jtfBuscarDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jbBuscarDestino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jtfBuscarOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jbBuscarOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTitulo)
                .addGap(12, 12, 12)
                .addComponent(jbRestaurar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1)
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfBuscarId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbBuscarId))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbBuscarOrigen)
                            .addComponent(jtfBuscarOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbBuscarDestino)
                            .addComponent(jtfBuscarDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfOrigen)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfDuracion)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbModificar)
                            .addComponent(jbBorrar))
                        .addGap(23, 23, 23))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRestaurarActionPerformed
        restaurarTabla();
    }//GEN-LAST:event_jbRestaurarActionPerformed

    private void jbBuscarIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarIdActionPerformed
        if (jtfBuscarId.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese un ID para buscar");
            return;
        }
        if (!jtfBuscarId.getText().matches("^\\d+$")) {
            JOptionPane.showMessageDialog(this, "Ingrese un ID valido(numero)");
            return;
        }
        Ruta r;
        int id;
        id = Integer.parseInt(jtfBuscarId.getText());
        r = rutaData.buscarRutaPorId(id);
        if (r != null) {
            borrarFilas();
            modelo.addRow(new Object[]{r.getId_ruta(), r.getOrigen(), r.getDestino(), r.getDuracion_estimada()});
        }
    }//GEN-LAST:event_jbBuscarIdActionPerformed

    private void jbBuscarOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarOrigenActionPerformed
        if (jtfBuscarOrigen.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese un origen para buscar");
            return;
        }
        String origen = jtfBuscarOrigen.getText();
        rutas = rutaData.buscarRutasPorOrigen(origen);
        borrarFilas();
        for (Ruta r : rutas) {
            modelo.addRow(new Object[]{r.getId_ruta(), r.getOrigen(), r.getDestino(), r.getDuracion_estimada()});
        }
    }//GEN-LAST:event_jbBuscarOrigenActionPerformed

    private void jbBuscarDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarDestinoActionPerformed
        if (jtfBuscarDestino.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese un destino para buscar");
            return;
        }
        String destino = jtfBuscarDestino.getText();
        rutas = rutaData.buscarRutasPorDestino(destino);
        borrarFilas();
        for (Ruta r : rutas) {
            modelo.addRow(new Object[]{r.getId_ruta(), r.getOrigen(), r.getDestino(), r.getDuracion_estimada()});
        }
    }//GEN-LAST:event_jbBuscarDestinoActionPerformed

    private void jtTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtTablaMouseClicked
        int fila = jtTabla.getSelectedRow();
        if (fila != -1) {
            jtfOrigen.setText(modelo.getValueAt(fila, 1) + "");
            jtfDestino.setText(modelo.getValueAt(fila, 2) + "");
            jtfDuracion.setText(modelo.getValueAt(fila, 3) + "");
            jtfDestino.setEnabled(true);
            jtfOrigen.setEnabled(true);
            jtfId.setText(modelo.getValueAt(fila, 0) + "");
            jbModificar.setEnabled(true);
            jbBorrar.setEnabled(true);
        }
    }//GEN-LAST:event_jtTablaMouseClicked

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        Ruta ruta = new Ruta();

        if (jtfOrigen.getText().equals("") || jtfDestino.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese un origen y un destino para modificar");
            return;
        }

        ruta.setOrigen(jtfOrigen.getText());
        ruta.setDestino(jtfDestino.getText());
        ruta.setDuracion_estimada(Time.valueOf(jtfDuracion.getText()));
        ruta.setId_ruta(Integer.parseInt(jtfId.getText()));
        rutaData.modificarRuta(ruta);
        terminarManipulacion();
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
        Ruta ruta = rutaData.buscarRutaPorId(Integer.parseInt(jtfId.getText()));
        int c = 0;

        horarios = horaData.buscarHorarioPorRuta(ruta);
        for (Horario h : horarios) {
            horaData.eliminarHorario(h);
            c++;
        }
        if (c != 0) {
            JOptionPane.showMessageDialog(this, "Todos los horarios ligados a la ruta a borrar han sido eliminados exitosamente");
        }

        rutaData.eliminarRuta(ruta);
        terminarManipulacion();
    }//GEN-LAST:event_jbBorrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbBuscarDestino;
    private javax.swing.JButton jbBuscarId;
    private javax.swing.JButton jbBuscarOrigen;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbRestaurar;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JTable jtTabla;
    private javax.swing.JTextField jtfBuscarDestino;
    private javax.swing.JTextField jtfBuscarId;
    private javax.swing.JTextField jtfBuscarOrigen;
    private javax.swing.JTextField jtfDestino;
    private javax.swing.JTextField jtfDuracion;
    private javax.swing.JTextField jtfId;
    private javax.swing.JTextField jtfOrigen;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {
        modelo.addColumn("ID");
        modelo.addColumn("Origen");
        modelo.addColumn("Destino");
        modelo.addColumn("Duracion");
        jtTabla.setModel(modelo);
    }

    private void restaurarTabla() {
        borrarFilas();
        rutas = rutaData.listarRutas();
        for (Ruta r : rutas) {
            modelo.addRow(new Object[]{r.getId_ruta(), r.getOrigen(), r.getDestino(), r.getDuracion_estimada()});
        }
    }

    private void borrarFilas() {
        int filas = modelo.getRowCount() - 1;
        for (int i = filas; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    private void terminarManipulacion() {
        restaurarTabla();
        jbModificar.setEnabled(false);
        jbBorrar.setEnabled(false);
        jtfId.setText("");
        jtfDuracion.setText("");
        jtfOrigen.setText("");
        jtfDestino.setText("");
        jtfDestino.setEnabled(false);
        jtfOrigen.setEnabled(false);
    }

}
