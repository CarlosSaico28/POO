/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Controlador.ClienteControlador;
import Controlador.VehiculoControlador;
import Modelo.Cliente;
import Modelo.Vehiculo;
import archivo.ArchivoObjeto;
import archivo.ArchivosBinarios;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GAMER I7 10TH GEN
 */
public class VehiculoVista extends javax.swing.JInternalFrame {
    public VehiculoControlador vehiculoControlador;
    public ClienteControlador clienteControlador;
    public ArchivosBinarios archivosBinarios ;
    public DefaultTableModel tblModelVehiculos;
    public DefaultComboBoxModel cmbModelCliente;

    public VehiculoVista( VehiculoControlador vehiculoControlador,ClienteControlador clienteControlador,ArchivosBinarios archivosBinarios) {
        initComponents();
        this.vehiculoControlador= vehiculoControlador;
        this.clienteControlador= clienteControlador;
        this.archivosBinarios= archivosBinarios;
        tblModelVehiculos= (DefaultTableModel)tblVehiculos.getModel();
        cmbModelCliente=(DefaultComboBoxModel)cmbCliente.getModel();
        tblVehiculos.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent lse) {
                if(tblVehiculos.getSelectedRow()>=0){
                vehiculoControlador.setSeleccionado(vehiculoControlador.getListaVehiculo().get(tblVehiculos.getSelectedRow()));
                cargarValores();
            }else{
                limpiarDatos();
                }
            }
        });
        cargarDatosCombo();
        cargarDatosTabla();
    }
    public void limpiarDatos(){
        txtPlaca.setText("");
        txtMarca.setText("");
        txtModelo.setText("");
        cmbCliente.setSelectedIndex(0);
        vehiculoControlador.setSeleccionado(null);
    }
    
    public void cargarValores(){
        txtPlaca.setText(vehiculoControlador.getSeleccionado().getPlaca());
        txtMarca.setText(vehiculoControlador.getSeleccionado().getMarca());
        txtModelo.setText(vehiculoControlador.getSeleccionado().getModelo());
        cmbCliente.setSelectedItem(vehiculoControlador.getSeleccionado().getPropietario().getNombre());
    }
    
    
    public void cargarDatosTabla(){
        tblModelVehiculos.setRowCount(0);
        for(Vehiculo dato: vehiculoControlador.getListaVehiculo()){
            String datos[]={String.valueOf(dato.getId()),dato.getPlaca(), dato.getMarca(), dato.getModelo(),dato.getPropietario().getNombre()};
            tblModelVehiculos.addRow(datos);
        }
    
    }
    public void cargarDatosCombo(){
        for(Cliente propietario:clienteControlador.getDatos())
        cmbModelCliente.addElement(propietario.getNombre());       
       }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        cmbCliente = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVehiculos = new javax.swing.JTable();
        btnCargarDatossss = new javax.swing.JButton();
        btnGuardarDatos = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Vehiculos");

        jLabel1.setText("Placa");

        jLabel2.setText("Marca");

        jLabel3.setText("Modelo");

        jLabel4.setText("Propietario");

        txtPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlacaActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        tblVehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Placa", "Marca", "Modelo", "Propietario"
            }
        ));
        jScrollPane1.setViewportView(tblVehiculos);

        btnCargarDatossss.setText("Cargar Dtos");
        btnCargarDatossss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarDatossssActionPerformed(evt);
            }
        });

        btnGuardarDatos.setText("Guardar DaTos");
        btnGuardarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(cmbCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(34, 34, 34)
                                .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGuardar)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEliminar)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCargarDatossss)
                                    .addComponent(btnGuardarDatos))))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(btnEliminar)
                            .addComponent(cmbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardarDatos)))
                    .addComponent(btnCargarDatossss))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlacaActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
    Cliente propietario= clienteControlador.getDatos().get(cmbCliente.getSelectedIndex());
        if(vehiculoControlador.getSeleccionado()!=null){
            boolean resultado =vehiculoControlador.actualizar(txtPlaca.getText(), txtMarca.getText(), txtModelo.getText(),propietario);
            System.out.println(resultado);
        }else{
        boolean resultado =vehiculoControlador.crear(txtPlaca.getText(), txtMarca.getText(), txtModelo.getText(),propietario);
            System.out.println(resultado);       
        }
        cargarDatosTabla();
        limpiarDatos();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(vehiculoControlador.getSeleccionado()!=null){
        boolean resultado= vehiculoControlador.eliminar(vehiculoControlador.getSeleccionado().getPlaca());
            System.out.println(resultado);
            cargarDatosTabla();
            limpiarDatos();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnGuardarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarDatosActionPerformed
        JFileChooser directorio = new JFileChooser();
        int resultado = directorio.showOpenDialog(this);
        if(resultado == JFileChooser.APPROVE_OPTION){
            File seleccionado = directorio.getSelectedFile();
            archivosBinarios.setRuta(seleccionado);
            try {
                archivosBinarios.escribir(vehiculoControlador.getListaVehiculo());
            } catch (IOException ex) {
                Logger.getLogger(VehiculoVista.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnGuardarDatosActionPerformed

    private void btnCargarDatossssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarDatossssActionPerformed
        JFileChooser directorio= new JFileChooser();
        int resultado=directorio.showOpenDialog(this);
        if(resultado==JFileChooser.APPROVE_OPTION){
        File seleccionado= directorio.getSelectedFile();
        archivosBinarios.setRuta(seleccionado);
        vehiculoControlador.setListaVehiculo(archivosBinarios.leer(clienteControlador));
        cargarDatosTabla();
        }
        
    }//GEN-LAST:event_btnCargarDatossssActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargarDatossss;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardarDatos;
    private javax.swing.JComboBox<String> cmbCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblVehiculos;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
}
