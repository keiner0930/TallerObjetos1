/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.DenominadorCeroException;
import clases.Fraccion;
import javax.swing.JOptionPane;

/**
 *
 * @author sony
 */
public class Principal1 extends javax.swing.JFrame {

    /**
     * Creates new form Principal1
     */
    public Principal1() {
        initComponents();
        cmdCalcular.setEnabled(true);
        cmdLimpiar.setEnabled(true);
        cmdConvertir.setEnabled(false);
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
        jLabel1 = new javax.swing.JLabel();
        txtNumerador1 = new javax.swing.JTextField();
        txtDenominador1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        cmbOperacion = new javax.swing.JComboBox<>();
        txtDenominador2 = new javax.swing.JTextField();
        txtNumerador2 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtDenominador3 = new javax.swing.JTextField();
        txtNumerador3 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        cmdCalcular = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        cmdConvertir = new javax.swing.JButton();
        txtNumeroMixto = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        txtDenominadorMixto = new javax.swing.JTextField();
        txtNumeradorMixto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setText("Operaciones con Fraccionarios ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        txtNumerador1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumerador1KeyTyped(evt);
            }
        });
        jPanel1.add(txtNumerador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 50, 30));

        txtDenominador1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDenominador1KeyTyped(evt);
            }
        });
        jPanel1.add(txtDenominador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 50, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 70, 10));

        cmbOperacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Suma", "Resta", "Multiplicacion", "Division" }));
        jPanel1.add(cmbOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 80, 30));

        txtDenominador2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDenominador2KeyTyped(evt);
            }
        });
        jPanel1.add(txtDenominador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 50, 30));

        txtNumerador2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumerador2KeyTyped(evt);
            }
        });
        jPanel1.add(txtNumerador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 50, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 70, 10));

        txtDenominador3.setEditable(false);
        jPanel1.add(txtDenominador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 50, 30));

        txtNumerador3.setEditable(false);
        jPanel1.add(txtNumerador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 50, 30));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 70, 10));

        jLabel2.setText("=");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 10, -1));

        cmdCalcular.setText("Calcular");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 70, -1));

        cmdConvertir.setText("Convertir Resultado A Numero Mixto");
        cmdConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdConvertirActionPerformed(evt);
            }
        });
        jPanel1.add(cmdConvertir, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, -1, -1));

        txtNumeroMixto.setEditable(false);
        jPanel1.add(txtNumeroMixto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 50, 30));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 70, 10));

        txtDenominadorMixto.setEditable(false);
        jPanel1.add(txtDenominadorMixto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 50, 30));

        txtNumeradorMixto.setEditable(false);
        jPanel1.add(txtNumeradorMixto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 50, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
        int op, n1, n2, d1, d2;
        Fraccion f1, f2, f3 = null;

        if (txtNumerador1.getText().isEmpty()) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(this, "Digite El Numerador 1", "Error", JOptionPane.ERROR_MESSAGE);
            txtNumerador1.requestFocusInWindow();
            cmdConvertir.setEnabled(false);
        } else if (txtDenominador1.getText().isEmpty()) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(this, "Digite El Denominador 1", "Error", JOptionPane.ERROR_MESSAGE);
            txtDenominador1.requestFocusInWindow();
            cmdConvertir.setEnabled(false);
        } else if (txtNumerador2.getText().isEmpty()) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(this, "Digite El Numerador 2", "Error", JOptionPane.ERROR_MESSAGE);
            txtNumerador2.requestFocusInWindow();
            cmdConvertir.setEnabled(false);
        } else if (txtDenominador2.getText().isEmpty()) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(this, "Digite El Denominador 2", "Error", JOptionPane.ERROR_MESSAGE);
            txtDenominador2.requestFocusInWindow();
            cmdConvertir.setEnabled(false);
        } else {

            op = cmbOperacion.getSelectedIndex();

            n1 = Integer.parseInt((txtNumerador1).getText());
            d1 = Integer.parseInt((txtDenominador1).getText());
            n2 = Integer.parseInt((txtNumerador2).getText());
            d2 = Integer.parseInt((txtDenominador2).getText());
            try {
                f1 = new Fraccion(n1, d1);
                f2 = new Fraccion(n2, d2);

                switch (op) {
                    case 0:
                        f3 = f1.sumar(f2);

                        break;

                    case 1:
                        f3 = f1.restar(f2);
                        break;

                    case 2:
                        f3 = f1.multiplicar(f2);
                        break;

                    case 3:
                        f3 = f1.dividir(f2);
                        break;
                }
                txtNumerador3.setText("" + f3.getNumerador());
                txtDenominador3.setText("" + f3.getDenominador());

            } catch (DenominadorCeroException e) {
               cmdConvertir.setEnabled(false); 
                getToolkit().beep();
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
           
            }
            cmdCalcular.setEnabled(true);
            cmdLimpiar.setEnabled(true);
            cmdConvertir.setEnabled(true);
        }
    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        txtNumerador1.setText("");
        txtNumerador2.setText("");
        txtNumerador3.setText("");
        txtDenominador1.setText("");
        txtDenominador2.setText("");
        txtDenominador3.setText("");
        txtNumeroMixto.setText("");
        txtNumeradorMixto.setText("");
        txtDenominadorMixto.setText("");
        txtNumerador1.requestFocusInWindow();
        cmbOperacion.setSelectedIndex(0);

        cmdCalcular.setEnabled(true);
        cmdLimpiar.setEnabled(true);
        cmdConvertir.setEnabled(false);
    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void cmdConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdConvertirActionPerformed

        int cociente, residuo, n1, n2, num, dem;

        num = Integer.parseInt((txtNumerador3).getText());
        dem = Integer.parseInt((txtDenominador3).getText());

        if (num >= dem) {
            String res1, res2, res3;
            n1 = Integer.parseInt((txtNumerador3).getText());
            n2 = Integer.parseInt((txtDenominador3).getText());

            cociente = n1 / n2;
            residuo = n1 % n2;

            res1 = String.valueOf(cociente);
            res2 = String.valueOf(residuo);
            res3 = String.valueOf(n2);

            txtNumeroMixto.setText(res1);
            txtNumeradorMixto.setText(res2);
            txtDenominadorMixto.setText(res3);

            cmdCalcular.setEnabled(true);
            cmdLimpiar.setEnabled(true);
            cmdConvertir.setEnabled(true);
        } else {
            getToolkit().beep();
            JOptionPane.showMessageDialog(this, "La Fraccion resultante no es impropia", "Mensaje", JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_cmdConvertirActionPerformed

    private void txtNumerador1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumerador1KeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNumerador1KeyTyped

    private void txtDenominador1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDenominador1KeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtDenominador1KeyTyped

    private void txtNumerador2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumerador2KeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNumerador2KeyTyped

    private void txtDenominador2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDenominador2KeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtDenominador2KeyTyped

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
            java.util.logging.Logger.getLogger(Principal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbOperacion;
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JButton cmdConvertir;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField txtDenominador1;
    private javax.swing.JTextField txtDenominador2;
    private javax.swing.JTextField txtDenominador3;
    private javax.swing.JTextField txtDenominadorMixto;
    private javax.swing.JTextField txtNumerador1;
    private javax.swing.JTextField txtNumerador2;
    private javax.swing.JTextField txtNumerador3;
    private javax.swing.JTextField txtNumeradorMixto;
    private javax.swing.JTextField txtNumeroMixto;
    // End of variables declaration//GEN-END:variables
}
