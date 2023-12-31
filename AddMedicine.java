
import javax.swing.JOptionPane;
import java.sql.*;
import Connections.Connectionprovider;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author MAYUR K
 */
public class AddMedicine extends javax.swing.JFrame {
public String NumberPattern ="^[0-9]*$";
    /**
     * Creates new form AddMedicine
     */
    public AddMedicine() {
        initComponents();
        setLocationRelativeTo(null);
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
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtuniqueid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtcompany = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtquantity = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtpp = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Add Medicine");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 6, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 56, 838, 10));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(804, 17, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Medicine ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 108, 91, -1));

        txtuniqueid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(txtuniqueid, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 141, 300, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 186, 83, -1));

        txtname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 228, 300, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Company Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 276, 107, -1));

        txtcompany.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(txtcompany, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 320, 300, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Quantity");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 375, 98, -1));

        txtquantity.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(txtquantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 418, 300, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Price Per Unit");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 108, 97, -1));

        txtpp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(txtpp, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 141, 300, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        jButton2.setText("save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/all_pages_background.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String uniqueid = txtuniqueid.getText();
        String name = txtname.getText();
        String companyname = txtcompany.getText();
        String quantity = txtquantity.getText();
        String priceperunit = txtpp.getText();
        
        if(uniqueid.equals(""))
        {
            JOptionPane.showMessageDialog(null, "unique id required");
        }
        else if(name.equals(""))
        {
            JOptionPane.showMessageDialog(null, " name field required");
        }
        else if(companyname.equals(""))
        {
            JOptionPane.showMessageDialog(null, " companyname field required");
        }
        else if(quantity.equals(""))
        {
            JOptionPane.showMessageDialog(null, " Quantity field required");
        }
        else if(priceperunit.equals(""))
        {
            JOptionPane.showMessageDialog(null, " priceperunit field required");
        } 
        else if(! priceperunit.matches(NumberPattern))
        {
            JOptionPane.showMessageDialog(null, " price perunit should be in number formate");
        }
        else{
        try{
        Connection con = Connectionprovider.getCon();
        PreparedStatement ps = con.prepareStatement("insert into medicine (unique_id,name,companyName,quantity,price) values(?,?,?,?,?)");
        ps.setString(1,uniqueid);
        ps.setString(2,name);
        ps.setString(3,companyname);
        ps.setString(4,quantity);
        ps.setString(5,priceperunit);
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, " Medicine Added Sucessfully");
        setVisible(true);
        new AddMedicine().setVisible(true);
        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(null, e);
        }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(AddMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddMedicine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtcompany;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtpp;
    private javax.swing.JTextField txtquantity;
    private javax.swing.JTextField txtuniqueid;
    // End of variables declaration//GEN-END:variables
}
