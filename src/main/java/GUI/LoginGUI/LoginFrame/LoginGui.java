package GUI.LoginGUI.LoginFrame;

import javax.swing.JOptionPane;

import com.formdev.flatlaf.FlatLightLaf;

import BUS.AccountServices.LoginAction;
import GUI.ManageGroup.ManageItem.ManagerFrame.ManageFrame;


public class LoginGui extends javax.swing.JFrame {
    public LoginGui() {
        initComponents();
        init();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        backGroundLoginGUI1 = new GUI.LoginGUI.Background.backGroundLoginGUI();
        phoneGui1 = new GUI.LoginGUI.Background.PhoneGui();
        phoneGui21 = new GUI.LoginGUI.Background.PhoneGui2();
        button1 = new GUI.LoginGUI.Component.Button();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        imagePanel1 = new GUI.LoginGUI.Background.ImagePanel();
        imagePanel3 = new GUI.LoginGUI.Background.ImagePanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        imagePanel2 = new GUI.LoginGUI.Background.ImagePanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backGroundLoginGUI1.setBackground(new java.awt.Color(255, 111, 111));

        button1.setBackground(new java.awt.Color(255, 255, 255));
        button1.setForeground(new java.awt.Color(255, 111, 111));
        button1.setText("ĐĂNG NHẬP");
        button1.setAlignmentY(0.0F);
        button1.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        button1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button1.setMargin(new java.awt.Insets(10, 14, 10, 14));
        button1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jPasswordField1.setMargin(new java.awt.Insets(5, 15, 5, 15));
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TÊN TÀI KHOẢN");
        jLabel1.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ĐĂNG NHẬP");

        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Lưu trạng thái đăng nhập");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("MẬT KHẨU");
        jLabel6.setToolTipText("");

        javax.swing.GroupLayout phoneGui21Layout = new javax.swing.GroupLayout(phoneGui21);
        phoneGui21.setLayout(phoneGui21Layout);
        phoneGui21Layout.setHorizontalGroup(
                phoneGui21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(phoneGui21Layout.createSequentialGroup()
                                .addContainerGap(60, Short.MAX_VALUE)
                                .addGroup(phoneGui21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, phoneGui21Layout.createSequentialGroup()
                                                .addGroup(phoneGui21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jPasswordField1, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jTextField1)
                                                        .addComponent(jLabel6)
                                                        .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))
                                                .addGap(29, 29, 29))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, phoneGui21Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(75, 75, 75))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, phoneGui21Layout.createSequentialGroup()
                                                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(66, 66, 66))))
        );
        phoneGui21Layout.setVerticalGroup(
                phoneGui21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, phoneGui21Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox1)
                                .addGap(18, 18, 18)
                                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout phoneGui1Layout = new javax.swing.GroupLayout(phoneGui1);
        phoneGui1.setLayout(phoneGui1Layout);
        phoneGui1Layout.setHorizontalGroup(
                phoneGui1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, phoneGui1Layout.createSequentialGroup()
                                .addContainerGap(30, Short.MAX_VALUE)
                                .addComponent(phoneGui21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28))
        );
        phoneGui1Layout.setVerticalGroup(
                phoneGui1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(phoneGui1Layout.createSequentialGroup()
                                .addComponent(phoneGui21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 24, Short.MAX_VALUE))
        );

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); 
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("QUẢN LÝ SIÊU THỊ MINI");

        imagePanel1.setBackground(new java.awt.Color(252, 220, 169));
        imagePanel1.setImage(new javax.swing.ImageIcon(getClass().getResource("/GUI/LoginGUI/Image/miniMart.png"))); 

        javax.swing.GroupLayout imagePanel1Layout = new javax.swing.GroupLayout(imagePanel1);
        imagePanel1.setLayout(imagePanel1Layout);
        imagePanel1Layout.setHorizontalGroup(
                imagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 394, Short.MAX_VALUE)
        );
        imagePanel1Layout.setVerticalGroup(
                imagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 278, Short.MAX_VALUE)
        );

        imagePanel3.setBackground(new java.awt.Color(252, 220, 169));
        imagePanel3.setImage(new javax.swing.ImageIcon(getClass().getResource("/GUI/LoginGUI/Image/icons8-support-100.png"))); 

        javax.swing.GroupLayout imagePanel3Layout = new javax.swing.GroupLayout(imagePanel3);
        imagePanel3.setLayout(imagePanel3Layout);
        imagePanel3Layout.setHorizontalGroup(
                imagePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 93, Short.MAX_VALUE)
        );
        imagePanel3Layout.setVerticalGroup(
                imagePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 86, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Phần mềm được thiết kế và xây dựng bởi ");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 2, 14)); 
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Phát, Cường, Hùng, Nhất");

        jLabel8.setBackground(new java.awt.Color(102, 102, 102));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); 
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("PTIT HỌC VIỆN HOÀNG GIA");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 2, 14)); 
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Dễ Dàng - Bảo Mật - Nhanh Chóng");

        imagePanel2.setBackground(new java.awt.Color(129, 0, 0));
        imagePanel2.setImage(new javax.swing.ImageIcon(getClass().getResource("/GUI/LoginGUI/Image/icons8-user-100.png"))); 

        javax.swing.GroupLayout imagePanel2Layout = new javax.swing.GroupLayout(imagePanel2);
        imagePanel2.setLayout(imagePanel2Layout);
        imagePanel2Layout.setHorizontalGroup(
                imagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 84, Short.MAX_VALUE)
        );
        imagePanel2Layout.setVerticalGroup(
                imagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 81, Short.MAX_VALUE)
        );

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("<html>TRUY CẬP CỬA HÀNG THÔNG QUA TÀI KHOẢN CỦA BẠN");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Nếu bạn gặp khó khăn hay hệ thống xảy ra lỗi");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Liên hệ: 0123.456.789");

        javax.swing.GroupLayout backGroundLoginGUI1Layout = new javax.swing.GroupLayout(backGroundLoginGUI1);
        backGroundLoginGUI1.setLayout(backGroundLoginGUI1Layout);
        backGroundLoginGUI1Layout.setHorizontalGroup(
                backGroundLoginGUI1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(backGroundLoginGUI1Layout.createSequentialGroup()
                                .addGroup(backGroundLoginGUI1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(backGroundLoginGUI1Layout.createSequentialGroup()
                                                .addGroup(backGroundLoginGUI1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(backGroundLoginGUI1Layout.createSequentialGroup()
                                                                .addGap(176, 176, 176)
                                                                .addComponent(jLabel9))
                                                        .addGroup(backGroundLoginGUI1Layout.createSequentialGroup()
                                                                .addGap(77, 77, 77)
                                                                .addComponent(imagePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(288, 288, 288))
                                        .addGroup(backGroundLoginGUI1Layout.createSequentialGroup()
                                                .addGap(143, 143, 143)
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(imagePanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backGroundLoginGUI1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(backGroundLoginGUI1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel11)
                                        .addGroup(backGroundLoginGUI1Layout.createSequentialGroup()
                                                .addComponent(imagePanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(backGroundLoginGUI1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel3)
                                                        .addGroup(backGroundLoginGUI1Layout.createSequentialGroup()
                                                                .addGap(55, 55, 55)
                                                                .addComponent(jLabel7))
                                                        .addGroup(backGroundLoginGUI1Layout.createSequentialGroup()
                                                                .addGap(71, 71, 71)
                                                                .addComponent(jLabel8)))
                                                .addGroup(backGroundLoginGUI1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(backGroundLoginGUI1Layout.createSequentialGroup()
                                                                .addGap(200, 200, 200)
                                                                .addComponent(phoneGui1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backGroundLoginGUI1Layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel12)
                                                                .addGap(86, 86, 86)))))
                                .addGap(151, 151, 151))
        );
        backGroundLoginGUI1Layout.setVerticalGroup(
                backGroundLoginGUI1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(backGroundLoginGUI1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(backGroundLoginGUI1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(backGroundLoginGUI1Layout.createSequentialGroup()
                                                .addComponent(imagePanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(1, 1, 1))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backGroundLoginGUI1Layout.createSequentialGroup()
                                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)))
                                .addComponent(phoneGui1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addContainerGap(29, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backGroundLoginGUI1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9)
                                .addGap(37, 37, 37)
                                .addComponent(imagePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(backGroundLoginGUI1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(imagePanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(backGroundLoginGUI1Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel3)
                                                .addGap(3, 3, 3)
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel8)))
                                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(backGroundLoginGUI1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(backGroundLoginGUI1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:

        String username = jTextField1.getText();
        String password = String.valueOf(jPasswordField1.getPassword());
        boolean isSaved = jCheckBox1.isSelected();
        boolean isAccess = loginAct.loginInput(username, password, isSaved);
        if (!isAccess){
            JOptionPane.showMessageDialog(this, "Login fail, your password or username is wrong");
        }
        else {
            //Remove login frame
            setVisible(false);
            dispose();
            loginAct.showFrame();
        }
    }//GEN-LAST:event_button1ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed


    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        FlatLightLaf.setup();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginGui();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.LoginGUI.Background.backGroundLoginGUI backGroundLoginGUI1;
    private GUI.LoginGUI.Component.Button button1;
    private GUI.LoginGUI.Background.ImagePanel imagePanel1;
    private GUI.LoginGUI.Background.ImagePanel imagePanel2;
    private GUI.LoginGUI.Background.ImagePanel imagePanel3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private GUI.LoginGUI.Background.PhoneGui phoneGui1;
    private GUI.LoginGUI.Background.PhoneGui2 phoneGui21;
    private ManageFrame managerFrame = new ManageFrame(null, this);
    private LoginAction loginAct = new LoginAction(managerFrame);

    private void init(){
        managerFrame.setLogAct(loginAct);
        //Kiểm tra authkey
        if(loginAct.checkAuthKey()){
            loginAct.showFrame();
        }else{
            this.setVisible(true);
        }

    }
}