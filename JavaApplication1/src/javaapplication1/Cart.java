/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1;

import java.text.SimpleDateFormat;
import static javaapplication1.Lab_Report.Reporting_time;
import static javaapplication1.Payment.Pay1;
import static javaapplication1.Payment.Pay2;
import static javaapplication1.Payment.Pay3;
import static javaapplication1.Payment.Pay4;
import javax.swing.JOptionPane;
import project.ConnectionProvider;

/**
 *
 * @author Tanvir
 */
public class Cart extends javax.swing.JFrame {

    /**
     * Creates new form Cart
     */
    public Cart() {
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

        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setLocation(new java.awt.Point(1000, 490));
        setMinimumSize(new java.awt.Dimension(400, 300));
        setUndecorated(true);
        getContentPane().setLayout(null);

        Price44.setText("00");
        getContentPane().add(Price44);
        Price44.setBounds(100, 60, 90, 22);

        Price1.setText("00");
        getContentPane().add(Price1);
        Price1.setBounds(100, 90, 90, 22);

        Price2.setText("00");
        getContentPane().add(Price2);
        Price2.setBounds(100, 120, 90, 22);

        Price3.setText("00");
        Price3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Price3ActionPerformed(evt);
            }
        });
        getContentPane().add(Price3);
        Price3.setBounds(100, 150, 90, 22);

        Payment_from_Cart.setText("Payment");
        Payment_from_Cart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Payment_from_CartActionPerformed(evt);
            }
        });
        getContentPane().add(Payment_from_Cart);
        Payment_from_Cart.setBounds(100, 210, 90, 23);

        Clear_My_Cart.setText("Clear");
        Clear_My_Cart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clear_My_CartActionPerformed(evt);
            }
        });
        getContentPane().add(Clear_My_Cart);
        Clear_My_Cart.setBounds(100, 180, 90, 23);

        jLabel2.setFont(new java.awt.Font("Montserrat Medium", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("My Cart");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 0, 140, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Price3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Price3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Price3ActionPerformed

    private void Payment_from_CartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Payment_from_CartActionPerformed

        Pay1.setText(Price44.getText());
        Pay2.setText(Price1.getText());
        Pay3.setText(Price2.getText());
        Pay4.setText(Price3.getText());
    }//GEN-LAST:event_Payment_from_CartActionPerformed

    private void Clear_My_CartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clear_My_CartActionPerformed
        // TODO add your handling code here:
        Price44.setText("00");
        Price1.setText("00");
        Price2.setText("00");
        Price3.setText("00");
        
    }//GEN-LAST:event_Clear_My_CartActionPerformed

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
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static final javax.swing.JButton Clear_My_Cart = new javax.swing.JButton();
    public static final javax.swing.JButton Payment_from_Cart = new javax.swing.JButton();
    public static final javax.swing.JTextField Price1 = new javax.swing.JTextField();
    public static final javax.swing.JTextField Price2 = new javax.swing.JTextField();
    public static final javax.swing.JTextField Price3 = new javax.swing.JTextField();
    public static final javax.swing.JTextField Price44 = new javax.swing.JTextField();
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
