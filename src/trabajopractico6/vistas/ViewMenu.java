/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajopractico6.vistas;

import trabajopractico6.entidades.*;

/**
 *
 * @author kevin
 */
public class ViewMenu extends javax.swing.JFrame {
    
    Agenda agenda = new Agenda();

    /**
     * Creates new form ViewMenu
     */
    public ViewMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiAgregarCliente = new javax.swing.JMenuItem();
        jmiBuscarCliente = new javax.swing.JMenuItem();
        jmiBorrarCliente = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmiSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        jMenu1.setText("Opciones");

        jmiAgregarCliente.setText("AgregarClientes");
        jmiAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAgregarClienteActionPerformed(evt);
            }
        });
        jMenu1.add(jmiAgregarCliente);

        jmiBuscarCliente.setText("BuscarCliente");
        jmiBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiBuscarClienteActionPerformed(evt);
            }
        });
        jMenu1.add(jmiBuscarCliente);

        jmiBorrarCliente.setText("BorrarCliente");
        jmiBorrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiBorrarClienteActionPerformed(evt);
            }
        });
        jMenu1.add(jmiBorrarCliente);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Salir");

        jmiSalir.setText("Salir");
        jmiSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSalirActionPerformed(evt);
            }
        });
        jMenu2.add(jmiSalir);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAgregarClienteActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        ViewAgregarClientes ag = new ViewAgregarClientes(agenda);
        ag.setVisible(true);
        escritorio.add(ag);
        escritorio.moveToFront(ag);
    }//GEN-LAST:event_jmiAgregarClienteActionPerformed

    private void jmiBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiBuscarClienteActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        ViewBuscarCliente bc = new ViewBuscarCliente(agenda);
        bc.setVisible(true);
        escritorio.add(bc);
        escritorio.moveToFront(bc);
    }//GEN-LAST:event_jmiBuscarClienteActionPerformed

    private void jmiBorrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiBorrarClienteActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        ViewBorrarCliente bo = new ViewBorrarCliente(agenda);
        bo.setVisible(true);
        escritorio.add(bo);
        escritorio.moveToFront(bo);
    }//GEN-LAST:event_jmiBorrarClienteActionPerformed

    private void jmiSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jmiSalirActionPerformed

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
            java.util.logging.Logger.getLogger(ViewMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmiAgregarCliente;
    private javax.swing.JMenuItem jmiBorrarCliente;
    private javax.swing.JMenuItem jmiBuscarCliente;
    private javax.swing.JMenuItem jmiSalir;
    // End of variables declaration//GEN-END:variables
}
