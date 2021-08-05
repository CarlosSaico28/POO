/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Controlador.EntradaControlador;
import Controlador.VehiculoControlador;
import Modelo.ComprobanteEntrada;
import archivo.ArchivosBinariosAleatorio;
import java.io.IOException;
import java.util.Date;

/**
 *
 * @author GAMER I7 10TH GEN
 */
public class EntradaVista extends javax.swing.JInternalFrame {
    public VehiculoControlador vehiculoControlador;
    public EntradaControlador entradaControlador;
    public TablaEntradaModelo tablaEntradaModelo;
    public ArchivosBinariosAleatorio archivosBinariosAleatorio;
            
    public EntradaVista(VehiculoControlador vehiculoControlador,EntradaControlador entradaControlador,ArchivosBinariosAleatorio archivosBinariosAleatorio) {
        initComponents();
        this.vehiculoControlador= vehiculoControlador;
        this.entradaControlador= entradaControlador;
        this.archivosBinariosAleatorio= archivosBinariosAleatorio;
        entradaControlador.setDatos(archivosBinariosAleatorio.leer(vehiculoControlador));
        tablaEntradaModelo= new TablaEntradaModelo(entradaControlador, vehiculoControlador);
        tblEntrada.setModel(tablaEntradaModelo);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblEntrada = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Entrada");

        tblEntrada.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Vehiculo", "Hora Entrada"
            }
        ));
        jScrollPane1.setViewportView(tblEntrada);

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        boolean resultado=entradaControlador.crear(new Date(),null);
        System.out.println(resultado);
        tablaEntradaModelo.fireTableDataChanged();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        ComprobanteEntrada comprobanteEntrada= entradaControlador.getDatos().get(tblEntrada.getSelectedRow());
        entradaControlador.eliminar(comprobanteEntrada.getHoraEntrada());
        tablaEntradaModelo.fireTableDataChanged();
    }//GEN-LAST:event_btnEliminarActionPerformed
    private void guardarDatos(javax.swing.event.InternalFrameEvent evt) throws IOException{
        this.archivosBinariosAleatorio.escribir(entradaControlador.getDatos());
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEntrada;
    // End of variables declaration//GEN-END:variables
}
