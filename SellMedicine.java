
import Comman.Openpdf;
import Connections.Connectionprovider;
import Connections.pharmacyUtils;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.PdfPTable;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.table.TableModel;
import java.util.Calendar;
import java.util.Date;
import java.lang.Math;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author MAYUR K
 */
public class SellMedicine extends javax.swing.JFrame {

    private String numberPattern = "^[0-9]*$";
    private int finalTotalPrice = 0;
    private double billId =Math.ceil(Math.random()*1000);
    private String username = "";

    /**
     * Creates new form SellMedicine
     */
    public SellMedicine() {
        initComponents();

    }

    public SellMedicine(String tempusername) {
        initComponents();
        username = tempusername;
        setLocationRelativeTo(null);
    }

    public void MedicineName(String NameorUniqId) {
        DefaultTableModel model = (DefaultTableModel) medicinetable.getModel();
        model.setRowCount(0);
        try {
            Connection con = Connectionprovider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from medicine where name like '" + NameorUniqId + "%' or unique_id like '" + NameorUniqId + "'");
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString("unique_id") + "-" + rs.getString("name")});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void clearMedicineField() {
        txtmed.setText("");
        txtname.setText("");
        txtcompany.setText("");
        txtppu.setText("");
        txtprice.setText("");
        txtnoofu.setText("");
    }

    public String getUniqueId(String prefix) {
        return prefix + System.nanoTime();
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
        jLabel2 = new javax.swing.JLabel();
        txtmed = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtcompany = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtppu = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtnoofu = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtsearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        medicinetable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        carttable = new javax.swing.JTable();
        btAdd = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        lblfinal = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Sell Medicine");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Medicine Id");

        txtmed.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtmed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmedActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Name");

        txtname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Company Name");

        txtcompany.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtcompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcompanyActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Price PerUnit");

        txtppu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtppu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtppuActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("No of unit");

        txtnoofu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtnoofu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnoofuKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Total price");

        txtprice.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Search");

        txtsearch.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearchKeyReleased(evt);
            }
        });

        medicinetable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicine"
            }
        ));
        medicinetable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                medicinetableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(medicinetable);

        carttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MedicineI ID", "name", "company name", "price per unit", "no of unit ", "total price"
            }
        ));
        carttable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carttableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(carttable);

        btAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add to cart.png"))); // NOI18N
        btAdd.setText("Add to cart");
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel9.setText("RS:-");

        lblfinal.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblfinal.setText("00");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/generate bill & print.png"))); // NOI18N
        jButton3.setText("Print Recipt");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(558, 558, 558)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtsearch)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 192, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(lblfinal, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(260, 260, 260))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtmed)
                                        .addComponent(txtname)
                                        .addComponent(txtcompany, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel4))
                                    .addGap(111, 111, 111)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtppu)
                                        .addComponent(txtnoofu)
                                        .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(btAdd)
                                            .addGap(45, 45, 45)))))
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(81, 81, 81))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtmed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtppu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnoofu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(btAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lblfinal))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtmedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmedActionPerformed

    private void txtppuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtppuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtppuActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void txtcompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcompanyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcompanyActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if (finalTotalPrice != 0) {
            DefaultTableModel dtm = (DefaultTableModel) carttable.getModel();
            if (carttable.getRowCount() != 0) {
                for (int i = 100; i <= carttable.getRowCount(); i++) {
                    try {
                        Connection con = Connectionprovider.getCon();
                        Statement st = con.createStatement();
                       // ResultSet rs = st.executeUpdate("Update medicine set quantity = quantity-"+Integer.parseInt(dtm.getValueAt(i, 4).toString())+"where unique_id ="+Integer.parseInt(dtm.getValueAt(i, 0).toString()));
                        st.executeUpdate("update medicine set quantity = quantity-" + Integer.valueOf(dtm.getValueAt(i, 4).toString()) + "where unique_id = " + Integer.valueOf(dtm.getValueAt(i, 0).toString()));
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            }
            try {
                SimpleDateFormat dformat = new SimpleDateFormat("dd-mm-yyyy");
                Calendar cal = Calendar.getInstance();
                Connection con = Connectionprovider.getCon();
                PreparedStatement ps = con.prepareStatement("insert into bill(billId,billDate,totalPaid,generatedBy) values(?,?,?,?)");
                ps.setDouble(1, billId);
                ps.setString(2, dformat.format(cal.getTime()));
                ps.setInt(3, finalTotalPrice);
                ps.setString(4, username);
                ps.executeUpdate();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            //create bill pdf
            com.itextpdf.text.Document doc;
            //var doc = new com.itextpdf.text.Document();
            try {
               
                String filename=pharmacyUtils.billPath +billId+".pdf";
                
                doc = new com.itextpdf.text.Document();
 
                PdfWriter pdfWriter = PdfWriter.getInstance(doc, new FileOutputStream(filename));
                doc.open();
                Paragraph pharmacyname = new Paragraph("                                                           Mayur chemist and druggist\n");
                doc.add(pharmacyname);
                Paragraph starline = new Paragraph(" *************************************************************************************************************");
                doc.add(starline);
                Paragraph details = new Paragraph("\t Bill Id:-" +billId + "\nDate:" + new Date() + "\n Totalpaid:-" +finalTotalPrice);
                doc.add(details);
                doc.add(starline);
                PdfPTable tb1 = new PdfPTable(6);
                tb1.addCell("Medicine Id");
                tb1.addCell("name");
                tb1.addCell("company name");
                tb1.addCell("Price per Unit");
                tb1.addCell("No of Unit");
                tb1.addCell("sub total");
                for (int i = 0; i < carttable.getRowCount(); i++) {
                    String a = carttable.getValueAt(i, 0).toString();
                    String b = carttable.getValueAt(i, 1).toString();
                    String c = carttable.getValueAt(i, 2).toString();
                    String d = carttable.getValueAt(i, 3).toString();
                    String e = carttable.getValueAt(i, 4).toString();
                    String f = carttable.getValueAt(i, 5).toString();
                    tb1.addCell(a);
                    tb1.addCell(b);
                    tb1.addCell(c);
                    tb1.addCell(d);
                    tb1.addCell(e);
                    tb1.addCell(f); 
                }
                doc.add(tb1);
                doc.add(starline);
                Paragraph thanksmsg = new Paragraph("Thank you please visit again");
                doc.add(thanksmsg);
                doc.close();
                //open pdf
              //  Openpdf.openById(filename);

               try {

		File pdfFile = new File(filename);
		if (pdfFile.exists()) {

			if (Desktop.isDesktopSupported()) {
				Desktop.getDesktop().open(pdfFile);
			} else {
				JOptionPane.showMessageDialog(null,"Awt Desktop is not supported!");
			}

		} else {
			JOptionPane.showMessageDialog(null,"File is not exists!");
		}

                } catch (Exception ex) {
                      ex.printStackTrace();
                }
              
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            
            setVisible(false);
            new SellMedicine(username).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "add some medicine to cart");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        MedicineName("");
        txtmed.setEditable(false);
        txtname.setEditable(false);
        txtcompany.setEditable(false);
        txtppu.setEditable(false);
    }//GEN-LAST:event_formComponentShown

    private void txtsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyReleased
        // TODO add your handling code here:
        String search = txtsearch.getText();
        MedicineName(search);
    }//GEN-LAST:event_txtsearchKeyReleased

    private void medicinetableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medicinetableMouseClicked
        // TODO add your handling code here:
        int index = medicinetable.getSelectedRow();
        TableModel model = medicinetable.getModel();
        String nameOrUniqueId = model.getValueAt(index, 0).toString();
        String uniqueid[] = nameOrUniqueId.split("-", 0);
        try {
            Connection con = Connectionprovider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from medicine where unique_id =" + uniqueid[0] + "");
            while (rs.next()) {
                txtmed.setText(uniqueid[0]);
                txtname.setText(rs.getString("name"));
                txtcompany.setText(rs.getString("companyName"));
                txtppu.setText(rs.getString("price"));
                txtnoofu.setText("");
                txtprice.setText("");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_medicinetableMouseClicked

    private void txtnoofuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnoofuKeyReleased
        // TODO add your handling code here:
        String NoOfunits = txtnoofu.getText();
        if (!NoOfunits.equals("")) {
            String price = txtppu.getText();
            if (!NoOfunits.matches(numberPattern)) {
                JOptionPane.showMessageDialog(null, "No of unit canno be null or 0");
            }
            int TotalPrice = Integer.parseInt(NoOfunits) * Integer.parseInt(price);
            txtprice.setText(String.valueOf(TotalPrice));
        } else {
            txtprice.setText("");
        }

    }//GEN-LAST:event_txtnoofuKeyReleased

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        // TODO add your handling code here:
        String NoOfUnits = txtnoofu.getText();
        String MedicineId = txtmed.getText();
        if (!NoOfUnits.equals("") && !MedicineId.equals("")) {
            String name = txtname.getText();
            String Companyname = txtcompany.getText();
            String PricePerUnit = txtppu.getText();
            String TotalPrice = txtprice.getText();
            int CheckStock = 0;
            int MedicineAlreadyExistInCart = 0;
            try {
                Connection con = Connectionprovider.getCon();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select * from medicine where unique_id=" + MedicineId + "");
                while (rs.next()) {
                    if (rs.getInt("quantity") >= Integer.parseInt(NoOfUnits)) {
                        CheckStock = 1;
                    } else {
                        JOptionPane.showMessageDialog(null, "Medicine is not available in sufficient amount. only" + rs.getInt("quantity") + "left");
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

            if (CheckStock == 1) {
                DefaultTableModel dtm = (DefaultTableModel) carttable.getModel();
                //JOptionPane.showMessageDialog(this, carttable.getRowCount()); 
                if (carttable.getRowCount() != 0) {
                    for (int i = 0; i < carttable.getRowCount(); i++) {
                        if (Integer.parseInt(dtm.getValueAt(i, 0).toString()) == Integer.parseInt(MedicineId)) {
                            MedicineAlreadyExistInCart = 1;
                            JOptionPane.showMessageDialog(null, "Medicine already exist in cart");
                        }
                    }
                }
                if (MedicineAlreadyExistInCart == 0) {
                    dtm.addRow(new Object[]{MedicineId, name, Companyname, PricePerUnit, NoOfUnits, TotalPrice});
                    finalTotalPrice = finalTotalPrice + Integer.parseInt(TotalPrice);
                    lblfinal.setText(String.valueOf(finalTotalPrice));
                    JOptionPane.showMessageDialog(null, "Added Succesfuly");
                }
                clearMedicineField();
            } else {
                JOptionPane.showMessageDialog(null, "No of Unit & MedicineId field is required");
            }
        }

    }//GEN-LAST:event_btAddActionPerformed

    private void carttableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carttableMouseClicked
        // TODO add your handling code here:
        int index = carttable.getSelectedRow();
        int a = JOptionPane.showConfirmDialog(null, "do you want to remove this medicibe", "select", JOptionPane.YES_NO_CANCEL_OPTION);
        if (a == 0) {
            TableModel model = carttable.getModel();
            String total = model.getValueAt(index, 5).toString();
            finalTotalPrice = finalTotalPrice - Integer.parseInt(total);
            lblfinal.setText(String.valueOf(finalTotalPrice));
            ((DefaultTableModel) carttable.getModel()).removeRow(index);
        }
    }//GEN-LAST:event_carttableMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
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
            java.util.logging.Logger.getLogger(SellMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SellMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SellMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SellMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SellMedicine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JTable carttable;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblfinal;
    private javax.swing.JTable medicinetable;
    private javax.swing.JTextField txtcompany;
    private javax.swing.JTextField txtmed;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtnoofu;
    private javax.swing.JTextField txtppu;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}
