/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Tanvir
 */
public class Invoice extends javax.swing.JFrame {

    /**
     * Creates new form Invoice
     */
    public Invoice() {
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

        jLabel1 = new javax.swing.JLabel();
        Invoice_Img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1275, 1650));
        setMinimumSize(new java.awt.Dimension(1275, 1650));
        setUndecorated(true);
        getContentPane().setLayout(null);

        Invoice_name.setFont(new java.awt.Font("Montserrat Medium", 1, 16)); // NOI18N
        Invoice_name.setText("jLabel2");
        getContentPane().add(Invoice_name);
        Invoice_name.setBounds(170, 380, 350, 30);

        Invoice_mobile.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        Invoice_mobile.setText("jLabel3");
        getContentPane().add(Invoice_mobile);
        Invoice_mobile.setBounds(170, 420, 350, 30);

        Invoice_email.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        Invoice_email.setText("jLabel1");
        getContentPane().add(Invoice_email);
        Invoice_email.setBounds(170, 460, 350, 30);

        Invoice_address.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        Invoice_address.setText("jLabel4");
        getContentPane().add(Invoice_address);
        Invoice_address.setBounds(170, 500, 350, 30);

        Invoice_Invoice_Id.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        Invoice_Invoice_Id.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Invoice_Invoice_Id.setText("jLabel5");
        getContentPane().add(Invoice_Invoice_Id);
        Invoice_Invoice_Id.setBounds(940, 380, 160, 30);

        Invoice_date.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        Invoice_date.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Invoice_date.setText("jLabel6");
        getContentPane().add(Invoice_date);
        Invoice_date.setBounds(940, 420, 160, 30);

        jLabel7.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jLabel7.setText("Seat Rent");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(190, 660, 160, 30);

        jLabel8.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jLabel8.setText("Doctor's Fee");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(190, 720, 160, 30);

        jLabel9.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jLabel9.setText("Medicine Cost");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(190, 780, 160, 30);

        jLabel10.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jLabel10.setText("Report Fee");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(190, 840, 160, 30);

        Invoice_Price1.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        Invoice_Price1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Invoice_Price1.setText("00");
        getContentPane().add(Invoice_Price1);
        Invoice_Price1.setBounds(930, 660, 160, 30);

        Invoice_Price2.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        Invoice_Price2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Invoice_Price2.setText("00");
        getContentPane().add(Invoice_Price2);
        Invoice_Price2.setBounds(930, 720, 160, 30);

        Invoice_Price3.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        Invoice_Price3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Invoice_Price3.setText("00");
        getContentPane().add(Invoice_Price3);
        Invoice_Price3.setBounds(930, 780, 160, 30);

        Invoice_Price4.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        Invoice_Price4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Invoice_Price4.setText("00");
        getContentPane().add(Invoice_Price4);
        Invoice_Price4.setBounds(930, 840, 160, 30);

        Invoice_SubTotal.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        Invoice_SubTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Invoice_SubTotal.setText("00");
        getContentPane().add(Invoice_SubTotal);
        Invoice_SubTotal.setBounds(930, 950, 160, 30);

        Invoice_Tax.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        Invoice_Tax.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Invoice_Tax.setText("00");
        getContentPane().add(Invoice_Tax);
        Invoice_Tax.setBounds(930, 1000, 160, 30);

        Invoice_Total.setFont(new java.awt.Font("Montserrat Medium", 1, 18)); // NOI18N
        Invoice_Total.setForeground(new java.awt.Color(0, 0, 102));
        Invoice_Total.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Invoice_Total.setText("00");
        getContentPane().add(Invoice_Total);
        Invoice_Total.setBounds(930, 1056, 160, 30);

        Invoice_Admin.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        Invoice_Admin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Invoice_Admin.setText("jLabel18");
        getContentPane().add(Invoice_Admin);
        Invoice_Admin.setBounds(900, 1300, 160, 30);

        Invoice_PaymentWay.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        Invoice_PaymentWay.setText("jLabel19");
        getContentPane().add(Invoice_PaymentWay);
        Invoice_PaymentWay.setBounds(270, 1350, 160, 30);

        Invoice_Discount.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        Invoice_Discount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Invoice_Discount.setText("00");
        getContentPane().add(Invoice_Discount);
        Invoice_Discount.setBounds(930, 900, 160, 30);

        print_invoice.setBorder(null);
        print_invoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print_invoiceActionPerformed(evt);
            }
        });
        getContentPane().add(print_invoice);
        print_invoice.setBounds(1032, 1562, 20, 20);

        jLabel1.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel1.setText("Payment with:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 1350, 120, 30);

        Invoice_Img.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Invoice_Img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/All_Dashboard_Image/Invoice1.png"))); // NOI18N
        Invoice_Img.setAutoscrolls(true);
        getContentPane().add(Invoice_Img);
        Invoice_Img.setBounds(0, 0, 1275, 1650);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void print_invoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print_invoiceActionPerformed
        // TODO add your handling code here:
        PrinterJob job = PrinterJob.getPrinterJob();
    job.setJobName("Print Form");

    job.setPrintable(new Printable() {
        public int print(Graphics pg, PageFormat pf, int pageNum) {
            pf.setOrientation(PageFormat.LANDSCAPE);
            if (pageNum > 0) {
                return Printable.NO_SUCH_PAGE;
            }

            Graphics2D g2 = (Graphics2D) pg;
            g2.translate(pf.getImageableX(), pf.getImageableY());
            g2.scale(0.47, 0.47);

            // Print the entire JFrame form
            JButton button = (JButton) evt.getSource();
            JPanel panel = (JPanel) button.getParent();
            panel.print(g2);

            return Printable.PAGE_EXISTS;

        }
    });

    boolean ok = job.printDialog();
    if (ok) {
        try {

            job.print();
        } catch (PrinterException ex) {
            ex.printStackTrace();
        }
    } 
    }//GEN-LAST:event_print_invoiceActionPerformed

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
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Invoice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static final javax.swing.JLabel Invoice_Admin = new javax.swing.JLabel();
    public static final javax.swing.JLabel Invoice_Discount = new javax.swing.JLabel();
    private javax.swing.JLabel Invoice_Img;
    public static final javax.swing.JLabel Invoice_Invoice_Id = new javax.swing.JLabel();
    public static final javax.swing.JLabel Invoice_PaymentWay = new javax.swing.JLabel();
    public static final javax.swing.JLabel Invoice_Price1 = new javax.swing.JLabel();
    public static final javax.swing.JLabel Invoice_Price2 = new javax.swing.JLabel();
    public static final javax.swing.JLabel Invoice_Price3 = new javax.swing.JLabel();
    public static final javax.swing.JLabel Invoice_Price4 = new javax.swing.JLabel();
    public static final javax.swing.JLabel Invoice_SubTotal = new javax.swing.JLabel();
    public static final javax.swing.JLabel Invoice_Tax = new javax.swing.JLabel();
    public static final javax.swing.JLabel Invoice_Total = new javax.swing.JLabel();
    public static final javax.swing.JLabel Invoice_address = new javax.swing.JLabel();
    public static final javax.swing.JLabel Invoice_date = new javax.swing.JLabel();
    public static final javax.swing.JLabel Invoice_email = new javax.swing.JLabel();
    public static final javax.swing.JLabel Invoice_mobile = new javax.swing.JLabel();
    public static final javax.swing.JLabel Invoice_name = new javax.swing.JLabel();
    private javax.swing.JLabel jLabel1;
    public static final javax.swing.JLabel jLabel10 = new javax.swing.JLabel();
    public static final javax.swing.JLabel jLabel7 = new javax.swing.JLabel();
    public static final javax.swing.JLabel jLabel8 = new javax.swing.JLabel();
    public static final javax.swing.JLabel jLabel9 = new javax.swing.JLabel();
    public static final javax.swing.JButton print_invoice = new javax.swing.JButton();
    // End of variables declaration//GEN-END:variables
}