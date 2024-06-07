/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import AccesoADatos.ColectivoData;
import AccesoADatos.PasajeData;
import AccesoADatos.PasajeroData;
import AccesoADatos.RutaData;
import Entidades.Colectivo;
import Entidades.Pasaje;
import Entidades.Pasajero;
import Entidades.Ruta;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author debor
 */
public class FormularioPasaje extends javax.swing.JInternalFrame {

    private PasajeData pasaData;
    private ColectivoData colData;
    private RutaData rutaData;
    private PasajeroData pasajeroData;
    private List<Pasajero> pasajeros;
    private List<Colectivo> colectivos;
    private List<Ruta> rutas;
    private final String expRegHora = "^(0?[1-9]|1[0-9]|2[0-3])$";
    private final String expRegMin = "^(0?[1-9]|[0-5][0-9])$";
    private final String expRegNum = "^[1-9]+\\d*$";

    public FormularioPasaje() {
        initComponents();
        pasaData = new PasajeData();
        pasajeroData = new PasajeroData();
        colData = new ColectivoData();
        rutaData = new RutaData();
        cargarCombos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfAsiento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jbVenderpasaje = new javax.swing.JButton();
        jcbRuta = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jcbPasajero = new javax.swing.JComboBox<>();
        jcbColectivo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jCalendar = new com.toedter.calendar.JDateChooser();
        jbSalir = new javax.swing.JButton();
        jlRuta = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jlPasajero = new javax.swing.JLabel();
        jtfMin = new javax.swing.JTextField();
        jtfHora = new javax.swing.JTextField();
        jlPrecio = new javax.swing.JLabel();
        jtfPrecio = new javax.swing.JTextField();

        setFocusable(false);
        setPreferredSize(new java.awt.Dimension(590, 342));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText(":");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Horario:");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Número de asiento:");

        jbVenderpasaje.setText("Vender pasaje");
        jbVenderpasaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVenderpasajeActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 102));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Venta de pasaje");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Fecha:");

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jlRuta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlRuta.setText("Ruta:");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Colectivo:");

        jlPasajero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlPasajero.setText("Pasajero:");

        jlPrecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlPrecio.setText("Precio:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jbVenderpasaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(31, 31, 31)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbPasajero, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlPasajero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 1, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jtfHora, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtfMin, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(36, 36, 36)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jCalendar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                .addComponent(jcbRuta, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlRuta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(31, 43, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jcbColectivo, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtfAsiento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPasajero)
                    .addComponent(jLabel5)
                    .addComponent(jlRuta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbPasajero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbColectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jtfHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jlPrecio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbVenderpasaje)
                    .addComponent(jbSalir))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbVenderpasajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVenderpasajeActionPerformed
        Pasajero p = new Pasajero();
        Colectivo c = new Colectivo();
        Ruta r = new Ruta();
        Time hora;
        LocalDate fecha, hoy;
        LocalTime ahora,horaLT;
        String h, min;
        int asiento;
        float precio;
        List<Integer> asientosOcupados;
        SimpleDateFormat ff = new SimpleDateFormat("yyyy-MM-dd");

        //validar pasajero
        p = (Pasajero) jcbPasajero.getSelectedItem();
        if (p == null) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar o registrar un pasajero");
            return;
        }
        //validar pasajero

        //validar colectivo
        c = (Colectivo) jcbColectivo.getSelectedItem();
        if (c == null) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar o registrar un colectivo");
            return;
        }
        //validar colectivo

        //validar ruta
        r = (Ruta) jcbRuta.getSelectedItem();
        if (r == null) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar o registrar una ruta");
            return;
        }
        //validar ruta

        //validar fecha y hora
        try {
        if (validarHora()) {
            h = jtfHora.getText();
            min = jtfMin.getText();
            hora = Time.valueOf(h + ":" + min + ":00");
            ahora = LocalTime.now();
            horaLT = hora.toLocalTime();
            fecha = LocalDate.parse(ff.format(jCalendar.getCalendar().getTime()));  
            hoy = LocalDate.now();            
            if((horaLT.isBefore(ahora) && fecha.equals(hoy)) || (fecha.isBefore(hoy))){
                JOptionPane.showMessageDialog(this, "Ingrese una hora y fecha posterior a la actual");
                return;                
            }
        } else {
            return;
        }
            asientosOcupados = pasaData.controlAsientos(fecha, hora, c, r);//asientos ocupados aca para inicializarlo
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Ingrese una fecha válida");
            return;
        }
        //validar fecha y hora
        

        //validar asientos
        if (asientosOcupados.size() >= c.getCapacidad()) {
            JOptionPane.showMessageDialog(this, "No hay lugares disponibles: seleccione otra hora, fecha, colectivo y/o ruta");
            return;
        }
        if (validarNum(jtfAsiento)) {
            if (validarNumAsiento(c)) {
                asiento = Integer.parseInt(jtfAsiento.getText());
                if (asientosOcupados.contains(asiento)) {
                    JOptionPane.showMessageDialog(this, "El asiento seleccionado esta ocupado");
                    return;
                }
            } else {
                return;
            }
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido para el asiento");
            return;
        }
        //validar asientos
        
        //validar precio
        if(validarNum(jtfPrecio)){
            precio = Integer.parseInt(jtfPrecio.getText());
        }else{
            JOptionPane.showMessageDialog(this, "Ingrese un precio válido");
            return;
        }
        //validar precio
        
        //creo el pasaje
        Pasaje pasaje = new Pasaje(p,c,r,fecha,hora,asiento,precio);
        //creo el pasaje
                
        pasaData.GuardarPasaje(pasaje);
    }//GEN-LAST:event_jbVenderpasajeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser jCalendar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jbSalir;
    private javax.swing.JButton jbVenderpasaje;
    private javax.swing.JComboBox<Colectivo> jcbColectivo;
    private javax.swing.JComboBox<Pasajero> jcbPasajero;
    private javax.swing.JComboBox<Ruta> jcbRuta;
    private javax.swing.JLabel jlPasajero;
    private javax.swing.JLabel jlPrecio;
    private javax.swing.JLabel jlRuta;
    private javax.swing.JTextField jtfAsiento;
    private javax.swing.JTextField jtfHora;
    private javax.swing.JTextField jtfMin;
    private javax.swing.JTextField jtfPrecio;
    // End of variables declaration//GEN-END:variables

    private void cargarCombos() {
        pasajeros = pasajeroData.listarPasajeros();
        for (Pasajero pasajero : pasajeros) {
            jcbPasajero.addItem(pasajero);
        }
        rutas = rutaData.listarRutas();
        for (Ruta ruta : rutas) {
            jcbRuta.addItem(ruta);
        }
        colectivos = colData.listarColectivos();
        for (Colectivo cole : colectivos) {
            jcbColectivo.addItem(cole);
        }
    }

    private boolean validarHora() {
        if (jtfHora.getText().equals("") || jtfMin.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Debe ingresar una horario.");
            return false;
        }
        if (!jtfHora.getText().matches(expRegHora)) {
            JOptionPane.showMessageDialog(this, "Debe ingresar una hora válida (1-23).");
            return false;
        }
        if (!jtfMin.getText().matches(expRegMin)) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un minuto válido (00-59).");
            return false;
        }
        return true;
    }

    private boolean validarNumAsiento(Colectivo c) {
        String expReg30 = "^([1-9]|1[0-9]|2[0-9]|30)$";
        String expReg40 = "^([1-9]|1[0-9]|2[0-9]|3[0-9]|40)$";

        switch (c.getCapacidad()) {
            case 30: {
                return validarLimiteAsiento(expReg30, c);
            }
            case 40: {
                return validarLimiteAsiento(expReg40, c);
            }
            default: {
                JOptionPane.showMessageDialog(this, "La capacidad del colectivo no esta registrada");
                return false;
            }
        }
    }

    private boolean validarNum(JTextField jtf) {
        return jtf.getText().matches(expRegNum);
    }

    private boolean validarLimiteAsiento(String expReg, Colectivo c) {
        if (!jtfAsiento.getText().matches(expReg)) {
            JOptionPane.showMessageDialog(this, "Ingrese un numero mayor a 0 que no exceda " + c.getCapacidad());
            return false;
        }
        return true;
    }
}
