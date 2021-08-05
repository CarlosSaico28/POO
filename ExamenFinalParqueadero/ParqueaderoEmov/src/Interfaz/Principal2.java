/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Controlador.ClienteControlador;
import Controlador.EntradaControlador;
import Controlador.SalidaControlador;
import Controlador.VehiculoControlador;
import archivo.ArchivoObjeto;
import archivo.ArchivosBinarios;
import archivo.ArchivosBinariosAleatorio;
import archivo.ArchivosBinariosAleatorio2;

/**
 *
 * @author GAMER I7 10TH GEN
 */
public class Principal2 extends javax.swing.JFrame {
    private ClienteControlador clienteControlador;
    private VehiculoControlador vehiculoControlador;
    private EntradaControlador entradaControlador;
    private SalidaControlador salidaControlador;
    private ArchivosBinarios archivosBinarios;
    private ArchivosBinariosAleatorio archivosBinariosAleatorio;
    private ArchivosBinariosAleatorio2 archivosBinariosAleatorio2;

    /**
     * Creates new form logueo
     */
    public Principal2() {
        initComponents();
        clienteControlador= new ClienteControlador();
        vehiculoControlador= new VehiculoControlador();
        entradaControlador= new EntradaControlador();
        salidaControlador= new SalidaControlador();
        archivosBinarios= new ArchivosBinarios();
        archivosBinariosAleatorio= new ArchivosBinariosAleatorio("ComprobanteEntrada.dat");
        archivosBinariosAleatorio2= new ArchivosBinariosAleatorio2("ComprobanteSalida.dat");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel2 = new javax.swing.JPanel();
        dtpPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuCliente = new javax.swing.JMenu();
        mnuOperaciones = new javax.swing.JMenuItem();
        mnuVehiculo = new javax.swing.JMenu();
        mniGestion = new javax.swing.JMenuItem();
        mnuEntrada = new javax.swing.JMenu();
        mniComprobante = new javax.swing.JMenuItem();
        mnuSalida = new javax.swing.JMenu();
        btnSalida = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Parqueadero EMOV-EP");
        setAutoRequestFocus(false);

        javax.swing.GroupLayout dtpPrincipalLayout = new javax.swing.GroupLayout(dtpPrincipal);
        dtpPrincipal.setLayout(dtpPrincipalLayout);
        dtpPrincipalLayout.setHorizontalGroup(
            dtpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 956, Short.MAX_VALUE)
        );
        dtpPrincipalLayout.setVerticalGroup(
            dtpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 499, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(dtpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dtpPrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        mnuCliente.setText("Cliente");

        mnuOperaciones.setText("Operaciones");
        mnuOperaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuOperacionesActionPerformed(evt);
            }
        });
        mnuCliente.add(mnuOperaciones);

        jMenuBar1.add(mnuCliente);

        mnuVehiculo.setText("Vehiculo");

        mniGestion.setText("Gestión");
        mniGestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniGestionActionPerformed(evt);
            }
        });
        mnuVehiculo.add(mniGestion);

        jMenuBar1.add(mnuVehiculo);

        mnuEntrada.setText("ComprobanteEntrada");

        mniComprobante.setText("Comprobante ");
        mniComprobante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniComprobanteActionPerformed(evt);
            }
        });
        mnuEntrada.add(mniComprobante);

        jMenuBar1.add(mnuEntrada);

        mnuSalida.setText("ComprobanteSalida");

        btnSalida.setText("Salida");
        btnSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalidaActionPerformed(evt);
            }
        });
        mnuSalida.add(btnSalida);

        jMenuBar1.add(mnuSalida);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuOperacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuOperacionesActionPerformed
        ClienteVista cliente= new ClienteVista(clienteControlador);
        dtpPrincipal.add(cliente);
        cliente.show();
    }//GEN-LAST:event_mnuOperacionesActionPerformed

    private void mniGestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniGestionActionPerformed
    VehiculoVista vehiculoVista= new VehiculoVista(vehiculoControlador, clienteControlador,archivosBinarios);
    dtpPrincipal.add(vehiculoVista);
    vehiculoVista.show();
    }//GEN-LAST:event_mniGestionActionPerformed

    private void mniComprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniComprobanteActionPerformed
    EntradaVista entradaVista= new EntradaVista(vehiculoControlador, entradaControlador,archivosBinariosAleatorio);
    dtpPrincipal.add(entradaVista);
    entradaVista.show();
    }//GEN-LAST:event_mniComprobanteActionPerformed

    private void btnSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalidaActionPerformed
    SalidaVista salidaVista= new SalidaVista(entradaControlador, salidaControlador,archivosBinariosAleatorio2);
    dtpPrincipal.add(salidaVista);
    salidaVista.show();
    }//GEN-LAST:event_btnSalidaActionPerformed

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
            java.util.logging.Logger.getLogger(Principal2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnSalida;
    private javax.swing.JDesktopPane dtpPrincipal;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuItem mniComprobante;
    private javax.swing.JMenuItem mniGestion;
    private javax.swing.JMenu mnuCliente;
    private javax.swing.JMenu mnuEntrada;
    private javax.swing.JMenuItem mnuOperaciones;
    private javax.swing.JMenu mnuSalida;
    private javax.swing.JMenu mnuVehiculo;
    // End of variables declaration//GEN-END:variables
}
