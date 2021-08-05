/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Controlador.EntradaControlador;
import Controlador.SalidaControlador;
import Modelo.ComprobanteSalida;
import Interfaz.TablaSalidaModelo;
import archivo.ArchivosBinariosAleatorio2;
import java.io.IOException;
import java.util.Date;

/**
 *
 * @author GAMER I7 10TH GEN
 */
public class SalidaVista extends javax.swing.JInternalFrame {
    public EntradaControlador entradaControlador;
    public SalidaControlador salidaControlador;
    public TablaSalidaModelo tablaSalidaModelo;
    public ArchivosBinariosAleatorio2 archivosBinariosAleatorio2;

    public SalidaVista(EntradaControlador entradaControlador,SalidaControlador salidaControlador,ArchivosBinariosAleatorio2 archivosBinariosAleatorio2) {
        initComponents();
        this.entradaControlador= entradaControlador;
        this.salidaControlador= salidaControlador;
        salidaControlador.setDatos(archivosBinariosAleatorio2.leer(entradaControlador));
        tablaSalidaModelo= new TablaSalidaModelo(salidaControlador, entradaControlador);
        tblSalida.setModel(tablaSalidaModelo);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblSalida = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        tblSalida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Hora Entrada", "Hora Entrada", "Hora Salida", "Valor Pagar"
            }
        ));
        jScrollPane1.setViewportView(tblSalida);

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar))
                .addGap(104, 104, 104))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
            boolean resultado= salidaControlador.crear(new Date(), new Date(), 0.0, null);
            System.out.println(resultado);
            tablaSalidaModelo.fireTableDataChanged();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        ComprobanteSalida comprobanteSalida= salidaControlador.getDatos().get(tblSalida.getSelectedRow());
        salidaControlador.eliminar(comprobanteSalida.getHoraEntrada());
        tablaSalidaModelo.fireTableDataChanged();  
    }//GEN-LAST:event_btnEliminarActionPerformed
     private void guardarDatos(javax.swing.event.InternalFrameEvent evt) throws IOException{
        this.archivosBinariosAleatorio2.escribir(salidaControlador.getDatos());
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSalida;
    // End of variables declaration//GEN-END:variables
}
