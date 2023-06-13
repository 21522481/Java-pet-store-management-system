package QuanLyThuCung.GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;

public class LoginForm extends javax.swing.JFrame {


    public LoginForm() {
        initComponents();
        setTitle("Đăng nhập");
        setVisible(true);
    }
    
    public class createCircle1 extends JPanel { 
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setColor(new Color(129, 203, 156));
            g2d.fillOval(0, 0, 25, 25);
        }
    }
    
    public class createCircle2 extends JPanel { 
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setColor(new Color(169, 218, 187));
            g2d.fillOval(0, 0, 25, 25);
        }
    }
    
    public class createCircle3 extends JPanel { 
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setColor(new Color(185, 222, 199));
            g2d.fillOval(0, 0, 25, 25);
        }
    }
    
    public class RoundJButton extends JButton {
        public RoundJButton() {
            setOpaque(false);
        }
        @Override
        public void paintComponent(Graphics g) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setColor(getBackground());
            g2d.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, 45,45);
            super.paintComponent(g2d);
        }
    }
    
    public class RoundJPanel extends JPanel {
        public RoundJPanel() {
            setOpaque(false);
        }
        @Override
        public void paintComponent(Graphics g) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setColor(new Color(225, 237, 232, 200));
            g2d.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, 25,25);
            super.paintComponent(g2d);
        }
    }
    
    public void addPlaceholder(JTextField txt) {
        Font font = txt.getFont();
        txt.setFont(font);
    }
    
    public void removePlaceholder(JTextField txt) {
        Font font = txt.getFont();
        txt.setFont(font);
        txt.setForeground(new Color(5, 69, 89, 68));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btLogin = new RoundJButton();
        cbSavePW = new javax.swing.JCheckBox();
        jPanel2 = new RoundJPanel();
        txtID = new JTextField();
        lbForgotPW = new javax.swing.JLabel();
        jPanel5 = new RoundJPanel();
        txtPassword = new JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1112, 760));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btLogin.setContentAreaFilled(false);
        btLogin.setFocusable(false);
        btLogin.setBackground(new java.awt.Color(58, 169, 169));
        btLogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btLogin.setForeground(new java.awt.Color(255, 255, 255));
        btLogin.setText("Login");
        btLogin.setBorder(null);
        btLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btLogin.setMargin(new java.awt.Insets(2, 14, 2, 14));
        btLogin.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btLogin.setBackground(new Color(64, 172, 167, 230));
                btLogin.setFont(btLogin.getFont().deriveFont(Font.BOLD));
            }
            @Override
            public void mouseExited(MouseEvent e) {
                btLogin.setBackground(new java.awt.Color(58, 169, 169));
                btLogin.setForeground(new java.awt.Color(255, 255, 255));
            }
        });
        btLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btLoginMouseClicked(evt);
            }
        });
        btLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 540, 100, 45));

        cbSavePW.setFocusPainted(false);
        cbSavePW.setBackground(new java.awt.Color(255, 255, 255));
        cbSavePW.setForeground(new java.awt.Color(5, 69, 89));
        cbSavePW.setText("Save your password?");
        cbSavePW.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbSavePW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSavePWActionPerformed(evt);
            }
        });
        jPanel1.add(cbSavePW, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 480, -1, -1));

        jPanel2.setPreferredSize(new java.awt.Dimension(410, 45));

        txtID.setOpaque(false);
        txtID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtID.setForeground(new java.awt.Color(5, 69, 89, 68));
        txtID.setText("ID");
        txtID.setBorder(null);
        txtID.setPreferredSize(new java.awt.Dimension(400, 40));
        txtID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtIDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIDFocusLost(evt);
            }
        });
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtID, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 360, -1, -1));

        lbForgotPW.setForeground(new java.awt.Color(5, 69, 89, 100));
        lbForgotPW.setText("Forgot your password?");
        lbForgotPW.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbForgotPW.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbForgotPWMouseClicked(evt);
            }
        });
        jPanel1.add(lbForgotPW, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 490, -1, -1));

        jPanel5.setPreferredSize(new java.awt.Dimension(410, 45));

        txtPassword.setOpaque(false);
        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(5, 69, 89, 68));
        txtPassword.setText("Password");
        txtPassword.setBorder(null);
        txtPassword.setEchoChar('\u0000');
        txtPassword.setPreferredSize(new java.awt.Dimension(400, 40));
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswordFocusLost(evt);
            }
        });
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 430, -1, -1));
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLoginActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyThuCung/GUI/background.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 1120, 760));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, -1, 960));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLoginActionPerformed
        String ID = txtID.getText();
    char[] pass = txtPassword.getPassword();
    
   try{
          Class.forName("oracle.jdbc.OracleDriver");
          String url = "jdbc:oracle:thin:@localhost:1521:orcl";
          String username="ThuCungFinal";
          String password="userpass";
          Connection conn= DriverManager.getConnection(url, username, password);
          String sqlquery = "SELECT * FROM TAIKHOAN WHERE \"MANV\"=? AND \"MK\"=?";
          PreparedStatement pst = conn.prepareStatement(sqlquery);
          pst.setString(1,ID);
          pst.setString(2, String.valueOf(pass));
          ResultSet rs=pst.executeQuery();
          if(!rs.next()){
              JOptionPane.showMessageDialog(null, "sai ID và Mật khẩu");
          }else{
              this.dispose();
                new MainForm();
          }
      }catch(Exception e){
          JOptionPane.showMessageDialog(null, e);
      }
    }//GEN-LAST:event_btLoginActionPerformed

    private void cbSavePWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSavePWActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSavePWActionPerformed

    private void txtIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIDFocusGained
        if (txtID.getText().equals("ID")) {
            txtID.setText(null);
            txtID.requestFocus();
            removePlaceholder(txtID);
        }
    }//GEN-LAST:event_txtIDFocusGained

    private void txtIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIDFocusLost
        if (txtID.getText().length() == 0) {
            addPlaceholder(txtID);
            txtID.setText("ID");
        }
    }//GEN-LAST:event_txtIDFocusLost

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void lbForgotPWMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbForgotPWMouseClicked
        JOptionPane.showMessageDialog(null, "Vui lòng liên hệ "
            + "với người quản lý hệ thống", "Quên mật khẩu",
            JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_lbForgotPWMouseClicked

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        if (txtPassword.getText().equals("Password")) {
            txtPassword.setText(null);
            txtPassword.requestFocus();
            txtPassword.setEchoChar('*');
            removePlaceholder(txtPassword);
        }
    }//GEN-LAST:event_txtPasswordFocusGained

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
        if (txtPassword.getText().length() == 0) {
            addPlaceholder(txtPassword);
            txtPassword.setText("Password");
            txtPassword.setEchoChar('\u0000');
        }
    }//GEN-LAST:event_txtPasswordFocusLost

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btLoginMouseClicked
//        this.dispose();
    }//GEN-LAST:event_btLoginMouseClicked

    public static void main(String args[]) {}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLogin;
    private javax.swing.JCheckBox cbSavePW;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lbForgotPW;
    private javax.swing.JTextField txtID;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
