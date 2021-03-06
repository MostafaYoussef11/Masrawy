/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gold.account;

import DataBase.ConectionDataBase;
import DataBase.Tools;
import DataBase.savedData;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;


/**
 *
 * @author Mostafa Youssef 
 */
public class MainFrame extends javax.swing.JFrame {


    /**
     * Creates new form MainFrame
     */
    private final String userName;
    private final String Server;
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    public MainFrame(String userName , String Server) {
        initComponents();
        jProgressBar1.setVisible(false);
        this.userName = userName;
        this.Server = Server;
        //
        txtServer.setText(savedData.getServer());
        txtUser.setText(savedData.getUserName());
        jPanel2.setSize(dim.width,34);
        jLabel4.setSize(dim);
        jLabel4.setPreferredSize(dim);
        ImageIcon icon = new ImageIcon(new ImageIcon(Toolkit.getDefaultToolkit().getClass().getResource("/icons/bgr.jpg")).getImage().getScaledInstance(dim.width, dim.height, Image.SCALE_DEFAULT));
        jLabel4.setLocation(0, 0); 
        jLabel4.setIcon(icon);
        int x = dim.width - 190;
        jPanel1.setLocation(x, 10);
        jPanel3.setLocation(x, 200);
        jPanel5.setLocation(x, 390);
        jPanel4.setLocation(x-190, 10);
        jPanel6.setLocation(5, 5);

    }
/*
     SELECT name_table , note , price , date_day ,id_daily FROM daily ORDER BY id_daily DESC; 
    
    */
    private MainFrame() {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtLastUpdate = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtServer = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUser = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        txtImport1 = new javax.swing.JLabel();
        txtImport = new javax.swing.JLabel();
        txtexport = new javax.swing.JLabel();
        txtexpen = new javax.swing.JLabel();
        txtassition = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        totalD = new javax.swing.JLabel();
        txtDassition = new javax.swing.JLabel();
        txtDexpen = new javax.swing.JLabel();
        txtDexport = new javax.swing.JLabel();
        txtDImport = new javax.swing.JLabel();
        txtImportD1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtASuppliers = new javax.swing.JLabel();
        txtDSuplier = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("برنامج ادارة الحسابات");
        setIconImage(new ImageIcon(Toolkit.getDefaultToolkit().getClass().getResource("/icons/calculator.png")).getImage());
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.05f));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "شغل الجبل", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        jPanel1.setOpaque(false);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hierarchy.png"))); // NOI18N
        jButton1.setText("مجموعات العمل");
        jButton1.setToolTipText("اضافة و تعديل مجموعات العمل");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/account.png"))); // NOI18N
        jButton2.setText("الحسابات");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/diagram.png"))); // NOI18N
        jButton8.setText("تصفية حساب مجموعة");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/supplier.png"))); // NOI18N
        jButton12.setText("موردين");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jButton8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(1020, 10, 189, 190);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        txtLastUpdate.setForeground(new java.awt.Color(0, 51, 255));
        txtLastUpdate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel1.setText("اخر تحديث");

        jLabel2.setText("السيرفر");

        txtServer.setForeground(new java.awt.Color(0, 51, 255));
        txtServer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel3.setText("المستخدم");

        txtUser.setForeground(new java.awt.Color(0, 51, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(txtLastUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 638, Short.MAX_VALUE)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtServer, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLastUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtServer, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 680, 1220, 34);

        jPanel3.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.05f));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "مدفوعات", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        jPanel3.setOpaque(false);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/wallet.png"))); // NOI18N
        jButton3.setText("صادر للحسابات");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/expenses.png"))); // NOI18N
        jButton4.setText("مصروفات");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/work.png"))); // NOI18N
        jButton5.setText("اساسيات وتجهيزات");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/payment.png"))); // NOI18N
        jButton13.setText("مدفوعات الموردين");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(1020, 200, 189, 190);

        jPanel4.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.05f));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "تقارير", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        jPanel4.setOpaque(false);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/business-report.png"))); // NOI18N
        jButton7.setText("تقرير مصروفات اليوم");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/report.png"))); // NOI18N
        jButton9.setText("تقرير مصروفات بتاريخ");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/report.png"))); // NOI18N
        jButton10.setText("كشف حساب ");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/budget.png"))); // NOI18N
        jButton11.setText("تصفية حساب");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/seo-report.png"))); // NOI18N
        jButton15.setText("كشف حساب مورد");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(830, 10, 189, 240);

        jPanel5.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.05f));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "الواردات", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        jPanel5.setOpaque(false);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ingots.png"))); // NOI18N
        jButton6.setText("الوارد");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/loader.png"))); // NOI18N
        jButton14.setText("سركي معدة");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5);
        jPanel5.setBounds(1020, 390, 189, 115);

        jPanel6.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.00f));
        jPanel6.setOpaque(false);

        txtImport1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtImport1.setText("كامل");
        txtImport1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtImport.setBackground(java.awt.Color.white);
        txtImport.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtImport.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtImport.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtexport.setBackground(java.awt.Color.white);
        txtexport.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtexport.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtexport.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtexpen.setBackground(java.awt.Color.white);
        txtexpen.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtexpen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtexpen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtassition.setBackground(java.awt.Color.white);
        txtassition.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtassition.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtassition.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        total.setBackground(java.awt.Color.white);
        total.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        total.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        total.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        totalD.setBackground(java.awt.Color.white);
        totalD.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        totalD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtDassition.setBackground(java.awt.Color.white);
        txtDassition.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtDassition.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDassition.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtDexpen.setBackground(java.awt.Color.white);
        txtDexpen.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtDexpen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDexpen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtDexport.setBackground(java.awt.Color.white);
        txtDexport.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtDexport.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDexport.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtDImport.setBackground(java.awt.Color.white);
        txtDImport.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtDImport.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDImport.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtImportD1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtImportD1.setText("اليوم");
        txtImportD1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("اجمالي الوارد");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("الصادر");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("مصروفات");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("موردين");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("الاجمالي");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("تجهيزات");
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtASuppliers.setBackground(java.awt.Color.white);
        txtASuppliers.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtASuppliers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtASuppliers.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtDSuplier.setBackground(java.awt.Color.white);
        txtDSuplier.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtDSuplier.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDSuplier.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jProgressBar1.setOpaque(true);
        jProgressBar1.setStringPainted(true);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(txtImportD1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtImport1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(131, 131, 131))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(txtDImport, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtImport, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(txtDexport, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(txtexport, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(txtDexpen, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(txtexpen, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(txtDassition, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(txtassition, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(txtDSuplier, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(txtASuppliers, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(totalD, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(10, 10, 10)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtImport1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtImportD1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDImport, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtImport, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDexport, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtexport, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDexpen, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtexpen, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDassition, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtassition, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDSuplier, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtASuppliers, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalD, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel6);
        jPanel6.setBounds(10, 10, 370, 260);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.setMaximumSize(new java.awt.Dimension(1024, 640));
        jLabel4.setMinimumSize(new java.awt.Dimension(1024, 640));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 0, 0);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        workGroupFrame wgf = new workGroupFrame();
        Tools.OpenFrame(wgf, "مجموعات العمل", "meeting");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Accounts ac = new Accounts();
        Tools.OpenFrame(ac, "الحسابات", "account");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      Export ex = new Export();
      Tools.OpenFrame(ex, "مدفوعات للعاملين", "money");         
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Expens ex = new Expens();
        Tools.OpenFrame(ex, "مصروفات التشغيل", "expense");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        assets as = new assets();
        Tools.OpenFrame(as, "أصول ثابتة", "work");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Imports i = new Imports();
        Tools.OpenFrame(i, "فواتير", "ingots");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        new MyThread("upGrasd").start(); 
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-dd");
        Date day = new Date();
        String date = format.format(day);
        InputStream stream =getClass().getResourceAsStream("/Rebort/dayReport.jrxml");
        Tools.PrintRebort(date, stream);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Clearing c = new Clearing();
        Tools.OpenFrame(c, "تصفية الشغل", "navigation");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        RebortAnyDay r = new RebortAnyDay();
        r.setLocationRelativeTo(null);
        r.setVisible(true);
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
       chooseAccount c = new chooseAccount();
       c.setLocationRelativeTo(null);
       c.setBackground(Color.magenta);
       c.setVisible(true);
        
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        Filttering f = new Filttering();
        Tools.OpenFrame(f, "تصفية حساب", "budget_1");
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        suppliers sp = new suppliers();
        Tools.OpenFrame(sp, "الموردين", "supplier"); 
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        exSuppliers esp = new exSuppliers();
        Tools.OpenFrame(esp, "مدفوعات الموردين", "payment");
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        cirky c = new cirky();
        Tools.OpenFrame(c, "ساعات معدة", "loader");
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
       chooseSupplier c = new chooseSupplier();
       c.setLocationRelativeTo(null);
       c.setBackground(Color.PINK);
       c.setVisible(true);
    }//GEN-LAST:event_jButton15ActionPerformed
   
    
   public class MyThread extends Thread {
       
    public MyThread(String name) {
        super(name);
        jProgressBar1.setVisible(true);
    }

    @Override
    public void run() {
        SimpleDateFormat TimeFormat = new SimpleDateFormat("hh:mm:ss a");
        Date now = new Date();
        String time = TimeFormat.format(now);
        txtLastUpdate.setText("");
       // System.out.println("MyThread - START "+Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
            doDBProcessing();
        } catch (InterruptedException e) {
            Tools.ErorBox(e.getMessage());
        }
       // System.out.println("MyThread - END "+Thread.currentThread().getName());
        txtLastUpdate.setText(time);
    }

    private void doDBProcessing() throws InterruptedException {
        Thread.sleep(1000);
        String update= "جاري تحديث البيانات ";
        jProgressBar1.setValue(20);
        txtLastUpdate.setText(update+".");
        try{
            SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-dd");
            Date day = new Date();
            String date = format.format(day);
            String assets = ConectionDataBase.getSum("assets", "price_assets");
            Thread.sleep(1000);
            jProgressBar1.setValue(30);
            txtLastUpdate.setText(update+"..");
            String expens = ConectionDataBase.getSum("expens WHERE id_Suppliers = 1 ", "price_expens");
            Thread.sleep(1000);
            jProgressBar1.setValue(40);
            txtLastUpdate.setText(update+"...");
            String exports = ConectionDataBase.getSum("exports WHERE id_Suppliers = 1 ", "price_export");
            Thread.sleep(1000);
            jProgressBar1.setValue(50);
            txtLastUpdate.setText(update+"....");
            String imports = ConectionDataBase.getSum("imports", "amount_imports");
            Thread.sleep(1000);
            jProgressBar1.setValue(60);
            txtLastUpdate.setText(update+".....");
            String exSuppliers = ConectionDataBase.getSum("exsuppliers", "price_exSuppliers"); 
            Thread.sleep(1000);
            jProgressBar1.setValue(70);
            txtLastUpdate.setText(update+"......");
            String assetsD = ConectionDataBase.getSumOnDay("assets", "price_assets",date);
            Thread.sleep(1000);
            jProgressBar1.setValue(80);
            txtLastUpdate.setText(update+".......");
            String expensDay = ConectionDataBase.getSum("SELECT SUM(price_expens) AS sum FROM expens WHERE date_expens='"+date+"' AND id_Suppliers = 1 ;");
            Thread.sleep(1000);
            jProgressBar1.setValue(90);
            txtLastUpdate.setText(update+"........");
            String exportsD = ConectionDataBase.getSum("SELECT SUM(price_export) AS sum FROM exports WHERE date_exports='"+date+"' AND id_Suppliers = 1 ;");//"exports", "price_export",date
            Thread.sleep(1000);
            jProgressBar1.setValue(100);
            txtLastUpdate.setText(update+".........");
            String importsD = ConectionDataBase.getSumOnDay("imports", "amount_imports",date);
            Thread.sleep(1000);
            txtLastUpdate.setText(update+".........");
            String exSupplierD = ConectionDataBase.getSumOnDay("exsuppliers", "price_exSuppliers", date);
            // Convert To Double
             double D_imports , D_expens , D_exports , D_assets ,D_exSuppliers , D_importsD , D_expensD , D_exportsD , D_assetsD ,D_exSuppliersD ;
//             if(imports == null || importsD == null || expens == null||expensDay == null || exports == null || exportsD == null || assets == null || assetsD == null || exSuppliers == null || exSupplierD == null  ){
//                 doDBProcessing();
//             }
//             else{
                 txtassition.setText(assets);
                 txtexpen.setText(expens);
                 txtexport.setText(exports);
                 txtImport.setText(imports);
                 txtASuppliers.setText(exSuppliers);
                 txtDassition.setText(assetsD);
                 txtDImport.setText(importsD);
                 txtDSuplier.setText(exSupplierD);
                 txtDexport.setText(exportsD);
                 txtDexpen.setText(expensDay);
                 D_imports = Double.valueOf(imports);
                 D_importsD = Double.valueOf(importsD);
                 D_expens = Double.valueOf(expens);
                 D_expensD = Double.valueOf(expensDay);
                 D_exports = Double.valueOf(exports) ;
                 D_exportsD =  Double.valueOf(exportsD) ;
                 D_assets = Double.valueOf(assets) ; 
                 D_assetsD = Double.valueOf(assetsD) ;
                 D_exSuppliers = Double.valueOf(exSuppliers) ; 
                 D_exSuppliersD = Double.valueOf(exSupplierD);
                //Sum Total
                 double Sumtotal = D_imports - D_expens - D_exports - D_assets - D_exSuppliers;
                 double SumtotalD = D_importsD - D_expensD - D_exportsD - D_assetsD  - D_exSuppliersD ;
                //Set Tootal 
                totalD.setText(String.valueOf(SumtotalD));
                total.setText(String.valueOf(Sumtotal));
                jProgressBar1.setVisible(false);
//             }

        }catch(NumberFormatException ex){
            System.err.println(ex.getMessage());
        }
    }
    
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

//frame.setSize(dim.width / 2, dim.height / 2);
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel total;
    private javax.swing.JLabel totalD;
    private javax.swing.JLabel txtASuppliers;
    private javax.swing.JLabel txtDImport;
    private javax.swing.JLabel txtDSuplier;
    private javax.swing.JLabel txtDassition;
    private javax.swing.JLabel txtDexpen;
    private javax.swing.JLabel txtDexport;
    private javax.swing.JLabel txtImport;
    private javax.swing.JLabel txtImport1;
    private javax.swing.JLabel txtImportD1;
    private javax.swing.JLabel txtLastUpdate;
    private javax.swing.JLabel txtServer;
    private javax.swing.JLabel txtUser;
    private javax.swing.JLabel txtassition;
    private javax.swing.JLabel txtexpen;
    private javax.swing.JLabel txtexport;
    // End of variables declaration//GEN-END:variables
}
