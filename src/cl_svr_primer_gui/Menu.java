/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cl_svr_primer_gui;

/**
 *
 * @author nando
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        ///colocar en el centro:
        this.setLocationRelativeTo(null);
        ///lo hacemos visible
        this.setVisible(true);

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
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mtConsultarClientes = new javax.swing.JMenuItem();
        mtverClientes = new javax.swing.JMenuItem();
        mtEliminarCliente = new javax.swing.JMenuItem();
        mtingresarCliente = new javax.swing.JMenuItem();
        mtConsultAlim = new javax.swing.JMenuItem();
        Salir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Peliculas = new javax.swing.JMenuItem();
        mtReservas = new javax.swing.JMenuItem();
        Salir_02 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        Salir_03 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CINEMANÍA");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cine.jpg"))); // NOI18N

        jMenu1.setText("Opciones");

        mtConsultarClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_UP, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mtConsultarClientes.setText("Consultar Clientes");
        mtConsultarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mtConsultarClientesActionPerformed(evt);
            }
        });
        jMenu1.add(mtConsultarClientes);

        mtverClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DOWN, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mtverClientes.setText("Ver clientes (procedure/cursor)");
        mtverClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mtverClientesActionPerformed(evt);
            }
        });
        jMenu1.add(mtverClientes);

        mtEliminarCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_RIGHT, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mtEliminarCliente.setText("Eliminar cliente");
        mtEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mtEliminarClienteActionPerformed(evt);
            }
        });
        jMenu1.add(mtEliminarCliente);

        mtingresarCliente.setText("Ingresar Cliente");
        mtingresarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mtingresarClienteActionPerformed(evt);
            }
        });
        jMenu1.add(mtingresarCliente);

        mtConsultAlim.setText("Consultar alimentos");
        mtConsultAlim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mtConsultAlimActionPerformed(evt);
            }
        });
        jMenu1.add(mtConsultAlim);

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jMenu1.add(Salir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Cartelera");

        Peliculas.setText("Películas");
        Peliculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PeliculasActionPerformed(evt);
            }
        });
        jMenu2.add(Peliculas);

        mtReservas.setText("Reservas");
        mtReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mtReservasActionPerformed(evt);
            }
        });
        jMenu2.add(mtReservas);

        Salir_02.setText("Salir");
        Salir_02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Salir_02ActionPerformed(evt);
            }
        });
        jMenu2.add(Salir_02);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Contacto");

        jMenuItem4.setText("Correo y teléfono");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        Salir_03.setText("Salir");
        Salir_03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Salir_03ActionPerformed(evt);
            }
        });
        jMenu3.add(Salir_03);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mtConsultarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mtConsultarClientesActionPerformed
        // TODO add your handling code here:

        Conexion.consultarInfo();
    }//GEN-LAST:event_mtConsultarClientesActionPerformed

    private void mtverClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mtverClientesActionPerformed
        // TODO add your handling code here:
        Conexion.verClientes();
    }//GEN-LAST:event_mtverClientesActionPerformed

    private void mtEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mtEliminarClienteActionPerformed
        // TODO add your handling code here:
        Conexion.eliminarInfo();
        Conexion.consultarInfo();
    }//GEN-LAST:event_mtEliminarClienteActionPerformed

    private void mtingresarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mtingresarClienteActionPerformed
        // TODO add your handling code here:
        Conexion.insertarInfo();
        Conexion.consultarInfo();
    }//GEN-LAST:event_mtingresarClienteActionPerformed

    private void PeliculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PeliculasActionPerformed
        // TODO add your handling code here:
        Conexion.consultarPeli();
    }//GEN-LAST:event_PeliculasActionPerformed

    private void mtReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mtReservasActionPerformed
        // TODO add your handling code here:
        Conexion.consultarReservas();
    }//GEN-LAST:event_mtReservasActionPerformed

    private void Salir_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Salir_02ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_Salir_02ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void Salir_03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Salir_03ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_Salir_03ActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void mtConsultAlimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mtConsultAlimActionPerformed
        // TODO add your handling code here:
         Conexion.consultarAlimentos();
    }//GEN-LAST:event_mtConsultAlimActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Peliculas;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JMenuItem Salir_02;
    private javax.swing.JMenuItem Salir_03;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem mtConsultAlim;
    private javax.swing.JMenuItem mtConsultarClientes;
    private javax.swing.JMenuItem mtEliminarCliente;
    private javax.swing.JMenuItem mtReservas;
    private javax.swing.JMenuItem mtingresarCliente;
    private javax.swing.JMenuItem mtverClientes;
    // End of variables declaration//GEN-END:variables
}
