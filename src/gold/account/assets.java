/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gold.account;

import DataBase.ConectionDataBase;
import DataBase.Tools;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mosta
 */
public class assets extends javax.swing.JFrame {

    /**
     * Creates new form assets
     */
    private String id_daily;
    public assets() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtid = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtdate = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtnote = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        comwork = new javax.swing.JComboBox();
        txtDaily = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAssets = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        btnEixt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("اساسيات و تجهيزات");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("رقم");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtid.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("التاريخ");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtdate.setDateFormatString("dd\\MM\\yyyy");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("المبلغ");
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtprice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtprice.setText("0.00");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("البيان");
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtnote.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("المجموعة");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        comwork.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtDaily.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDaily.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtprice)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtDaily, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comwork, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtdate, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtnote))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(txtid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtprice)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(txtnote, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(comwork, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(txtDaily, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tableAssets.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "المجموعة", "البيان", "المبلغ", "التاريخ", "رقم", "قيد اليومية"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableAssets.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableAssetsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableAssets);
        if (tableAssets.getColumnModel().getColumnCount() > 0) {
            tableAssets.getColumnModel().getColumn(0).setResizable(false);
            tableAssets.getColumnModel().getColumn(0).setPreferredWidth(100);
            tableAssets.getColumnModel().getColumn(1).setResizable(false);
            tableAssets.getColumnModel().getColumn(1).setPreferredWidth(200);
            tableAssets.getColumnModel().getColumn(2).setResizable(false);
            tableAssets.getColumnModel().getColumn(2).setPreferredWidth(100);
            tableAssets.getColumnModel().getColumn(3).setResizable(false);
            tableAssets.getColumnModel().getColumn(3).setPreferredWidth(100);
            tableAssets.getColumnModel().getColumn(4).setResizable(false);
            tableAssets.getColumnModel().getColumn(4).setPreferredWidth(50);
            tableAssets.getColumnModel().getColumn(5).setResizable(false);
            tableAssets.getColumnModel().getColumn(5).setPreferredWidth(70);
        }

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add_1.png"))); // NOI18N
        btnNew.setText("جديد");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/save.png"))); // NOI18N
        btnSave.setText("حفظ");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pencil (1).png"))); // NOI18N
        btnEdit.setText("تعديل");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/exchange.png"))); // NOI18N
        btnUpdate.setText("تحديث");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.png"))); // NOI18N
        btnDel.setText("حذف");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/printer.png"))); // NOI18N
        btnPrint.setText("طباعة");

        btnEixt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/exit.png"))); // NOI18N
        btnEixt.setText("خروج");
        btnEixt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEixtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEixt, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEixt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        SetNew();
        
    }//GEN-LAST:event_btnNewActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        SetNew();
    }//GEN-LAST:event_formWindowOpened

    private void btnEixtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEixtActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnEixtActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
    // Set All String 
        String id , date , price , notes , Sql;
        id = txtid.getText();
        price = txtprice.getText();
        notes = txtnote.getText();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        date = format.format(txtdate.getDate());
        String id_work = ConectionDataBase.getIdFrmName("workgroup", comwork.getSelectedItem().toString());
        Sql = "INSERT INTO assets VALUES("+id+","+price+",'"+notes+"','"+date+"',"+id_work+",0,null,"+id_daily+");";
        boolean isSaved = ConectionDataBase.ExecuteAnyQuery(Sql);
        if(isSaved){
            Tools.MasgBox("تم الحفظ");
            String tableName = "تجهيزات"+" "+comwork.getSelectedItem().toString();
            String sqlDaily ="INSERT INTO daily VALUES("+id_daily+","+id+",'"+date+"',"+price+",'"+notes+"','"+tableName+"');";
            ConectionDataBase.ExecuteAnyQuery(sqlDaily);
            SetNew();
        }else{
            Tools.ErorBox("خطأ");
        }
        
        
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        btnDel.setEnabled(false);
        btnEdit.setEnabled(false);
        btnNew.setEnabled(false);
        btnPrint.setEnabled(false);
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);
        
        txtdate.setEnabled(true);
        txtid.setEnabled(false);
        txtnote.setEnabled(true);
        txtprice.setEnabled(true);
        comwork.setEnabled(true);
        
    }//GEN-LAST:event_btnEditActionPerformed

    private void tableAssetsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableAssetsMouseClicked
        // TODO add your handling code here:
        int row = tableAssets.getSelectedRow();
        comwork.setSelectedItem(tableAssets.getValueAt(row, 0));
        txtnote.setText(tableAssets.getValueAt(row, 1).toString());
        txtprice.setText(tableAssets.getValueAt(row, 2).toString());
        txtid.setText(tableAssets.getValueAt(row, 4).toString());
        txtDaily.setText(tableAssets.getValueAt(row, 5).toString());
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = format.parse(tableAssets.getValueAt(row, 3).toString());
            txtdate.setDate(date);
        } catch (ParseException ex) {
            Logger.getLogger(assets.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Enable Buuttons
        btnNew.setEnabled(true);
        btnEdit.setEnabled(true);
        btnDel.setEnabled(true);
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(false);
        btnPrint.setEnabled(true);
        //Disable All txt
        txtdate.setEnabled(false);
        txtid.setEnabled(false);
        txtnote.setEnabled(false);
        comwork.setEnabled(false);
        txtprice.setEnabled(false);
        
    }//GEN-LAST:event_tableAssetsMouseClicked

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        // TODO add your handling code here:
        String id , sql ;
        id = txtid.getText();
        id_daily = txtDaily.getText();
        sql = "DELETE FROM assets WHERE id_assets="+id+";";
        boolean isDel = ConectionDataBase.ExecuteAnyQuery(sql);
        if(isDel){
            Tools.MasgBox("تم الحذف ");
            String sqlDaily ="delete FROM daily WHERE id_daily = "+id_daily+";";
            ConectionDataBase.ExecuteAnyQuery(sqlDaily);
            SetNew();
        }
        else{
            Tools.ErorBox("خطأ");
        }
    }//GEN-LAST:event_btnDelActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String id , date , notes , price ,sql;
        id = txtid.getText();
        notes = txtnote.getText();
        price = txtprice.getText();
        id_daily = txtDaily.getText();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        date = format.format(txtdate.getDate());
        String id_wg = ConectionDataBase.getIdFrmName("workgroup", comwork.getSelectedItem().toString());
        sql = "UPDATE assets SET price_assets="+price+" , notes='"+notes+"' , date_assets='"+date +"', id_workgroup ="+id_wg+" WHERE id_assets="+id +";";
        boolean isUpdate = ConectionDataBase.ExecuteAnyQuery(sql);
        if(isUpdate){
            Tools.MasgBox("تم تحديث البيانات");
            String tableName = "تجهيزات"+" "+comwork.getSelectedItem().toString();
            String sqlDaily ="UPDATE daily SET date_day='"+date+"', price = "+price+",note = '"+notes+"' , name_table = '"+tableName+"' WHERE id_daily = "+id_daily+";";
            ConectionDataBase.ExecuteAnyQuery(sqlDaily);
            SetNew();
        }else{
            Tools.ErorBox("خطأ");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed
    private void SetNew(){
        //Button set Disable
        btnDel.setEnabled(false);
        btnEdit.setEnabled(false);
        btnNew.setEnabled(false);
        btnPrint.setEnabled(false);
        btnSave.setEnabled(true);
        btnUpdate.setEnabled(false);
        id_daily = ConectionDataBase.AutoId("daily", "id_daily");
        txtdate.setEnabled(true);
        txtid.setEnabled(false);
        txtnote.setEnabled(true);
        txtprice.setEnabled(true);
        // txt set
        txtid.setText(ConectionDataBase.AutoId("assets", "id_assets"));
        txtdate.setDate(new Date());
        txtDaily.setText(id_daily);
        txtnote.setText("");
        txtprice.setText("0.00");
        ConectionDataBase.NewfillCombo("workgroup WHERE isActive = 0", "name_workgroup", comwork);
        String sql ="SELECT workgroup.name_workgroup , assets.notes , assets.price_assets , assets.date_assets , assets.id_assets , assets.id_daily FROM assets INNER JOIN workgroup ON assets.id_workgroup = workgroup.id_workgroup ORDER BY id_assets DESC ;";
        String[]coulmnName =   new String [] {
                "المجموعة", "البيان", "المبلغ", "التاريخ", "رقم", "قيد اليومية"
            };
        ConectionDataBase.fillAndCenterTable(sql, tableAssets, coulmnName);
    
    }
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
            java.util.logging.Logger.getLogger(assets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(assets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(assets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(assets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new assets().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnEixt;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox comwork;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableAssets;
    private javax.swing.JLabel txtDaily;
    private com.toedter.calendar.JDateChooser txtdate;
    private javax.swing.JLabel txtid;
    private javax.swing.JTextField txtnote;
    private javax.swing.JTextField txtprice;
    // End of variables declaration//GEN-END:variables
}
