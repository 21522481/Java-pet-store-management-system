package QuanLyThuCung.GUI;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainForm extends javax.swing.JFrame {

    private BanHangForm bh;
    private SanPhamForm sp;
    private NhanVienForm nv;
    private KhachHangForm kh;
    private HoaDonForm hd;
    private ThuCungForm gt;
    private DichVuForm dv;
    private TaiKhoanForm tk;
    
    Color DefaultColor, PressedColor, TextPressedColor;
    
    public MainForm() {
        initComponents();
        setVisible(true);
        
        
        DefaultColor = new Color(255, 255, 255);
        PressedColor = new Color(58,169,169);
        TextPressedColor = new Color(148,212,152);
        
        lbMenu1.setBackground(PressedColor);
        lbMenu1.setForeground(new Color(255, 255, 255));
        bh = new BanHangForm();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(bh).setVisible(true);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new PanelCircle();
        roundJButton21 = new QuanLyThuCung.Swing.RoundJButton2();
        jPanel5 = new javax.swing.JPanel();
        lbMenu1 = new javax.swing.JLabel();
        lbMenu2 = new javax.swing.JLabel();
        lbMenu3 = new javax.swing.JLabel();
        lbMenu4 = new javax.swing.JLabel();
        lbMenu5 = new javax.swing.JLabel();
        lbMenu6 = new javax.swing.JLabel();
        lbMenu7 = new javax.swing.JLabel();
        jPanel6 = new PanelCircle();
        jPanel7 = new PanelCircle1();
        jPanel8 = new PanelCircle2();
        lbMenu8 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(148, 212, 152)));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(129, 203, 156));
        jLabel1.setText("OH MY PET");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(24, 24));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        roundJButton21.setText("ĐĂNG XUẤT");
        roundJButton21.setRadius(30);
        roundJButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundJButton21ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(roundJButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(roundJButton21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        lbMenu1.setOpaque(true);
        lbMenu1.setBackground(new java.awt.Color(255, 255, 255));
        lbMenu1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lbMenu1.setForeground(new java.awt.Color(129, 203, 156));
        lbMenu1.setText("    Bán hàng");
        lbMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbMenu1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbMenu1MousePressed(evt);
            }
        });

        lbMenu2.setOpaque(true);
        lbMenu2.setBackground(new java.awt.Color(255, 255, 255));
        lbMenu2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lbMenu2.setForeground(new java.awt.Color(129, 203, 156));
        lbMenu2.setText("    Sản phẩm");
        lbMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbMenu2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbMenu2MousePressed(evt);
            }
        });

        lbMenu3.setOpaque(true);
        lbMenu3.setBackground(new java.awt.Color(255, 255, 255));
        lbMenu3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lbMenu3.setForeground(new java.awt.Color(129, 203, 156));
        lbMenu3.setText("    Nhân viên");
        lbMenu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbMenu3MousePressed(evt);
            }
        });

        lbMenu4.setOpaque(true);
        lbMenu4.setBackground(new java.awt.Color(255, 255, 255));
        lbMenu4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lbMenu4.setForeground(new java.awt.Color(129, 203, 156));
        lbMenu4.setText("    Khách hàng");
        lbMenu4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbMenu4MousePressed(evt);
            }
        });

        lbMenu5.setOpaque(true);
        lbMenu5.setBackground(new java.awt.Color(255, 255, 255));
        lbMenu5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lbMenu5.setForeground(new java.awt.Color(129, 203, 156));
        lbMenu5.setText("    Hóa đơn");
        lbMenu5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbMenu5MousePressed(evt);
            }
        });

        lbMenu6.setOpaque(true);
        lbMenu6.setBackground(new java.awt.Color(255, 255, 255));
        lbMenu6.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lbMenu6.setForeground(new java.awt.Color(129, 203, 156));
        lbMenu6.setText("    Thú cưng");
        lbMenu6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbMenu6MousePressed(evt);
            }
        });

        lbMenu7.setOpaque(true);
        lbMenu7.setBackground(new java.awt.Color(255, 255, 255));
        lbMenu7.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lbMenu7.setForeground(new java.awt.Color(129, 203, 156));
        lbMenu7.setText("    Dịch vụ");
        lbMenu7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbMenu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbMenu7MousePressed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(24, 24));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setPreferredSize(new java.awt.Dimension(24, 24));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setPreferredSize(new java.awt.Dimension(24, 24));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        lbMenu8.setOpaque(true);
        lbMenu8.setBackground(new java.awt.Color(255, 255, 255));
        lbMenu8.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lbMenu8.setForeground(new java.awt.Color(129, 203, 156));
        lbMenu8.setText("    Tài khoản");
        lbMenu8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbMenu8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbMenu8MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbMenu8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbMenu2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbMenu1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbMenu4, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(lbMenu3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbMenu5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbMenu6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbMenu7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbMenu2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbMenu3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbMenu4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbMenu5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbMenu6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbMenu7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbMenu8))
        );

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setOpaque(false);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbMenu1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbMenu1MousePressed
        lbMenu1.setBackground(PressedColor);
        lbMenu2.setBackground(DefaultColor);
        lbMenu3.setBackground(DefaultColor);
        lbMenu4.setBackground(DefaultColor);
        lbMenu5.setBackground(DefaultColor);
        lbMenu6.setBackground(DefaultColor);
        lbMenu7.setBackground(DefaultColor);
        lbMenu8.setBackground(DefaultColor);
        
        lbMenu1.setForeground(DefaultColor);
        lbMenu2.setForeground(TextPressedColor);
        lbMenu3.setForeground(TextPressedColor);
        lbMenu4.setForeground(TextPressedColor);
        lbMenu5.setForeground(TextPressedColor);
        lbMenu6.setForeground(TextPressedColor);
        lbMenu7.setForeground(TextPressedColor);
        lbMenu8.setForeground(TextPressedColor);
        
        bh = new BanHangForm();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(bh).setVisible(true);
    }//GEN-LAST:event_lbMenu1MousePressed

    private void lbMenu2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbMenu2MousePressed
        lbMenu1.setBackground(DefaultColor);
        lbMenu2.setBackground(PressedColor);
        lbMenu3.setBackground(DefaultColor);
        lbMenu4.setBackground(DefaultColor);
        lbMenu5.setBackground(DefaultColor);
        lbMenu6.setBackground(DefaultColor);
        lbMenu7.setBackground(DefaultColor);
        lbMenu8.setBackground(DefaultColor);
        
        lbMenu1.setForeground(TextPressedColor);
        lbMenu2.setForeground(DefaultColor);
        lbMenu3.setForeground(TextPressedColor);
        lbMenu4.setForeground(TextPressedColor);
        lbMenu5.setForeground(TextPressedColor);
        lbMenu6.setForeground(TextPressedColor);
        lbMenu7.setForeground(TextPressedColor);
        lbMenu8.setForeground(TextPressedColor);
        
        sp = new SanPhamForm();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(sp).setVisible(true);
    }//GEN-LAST:event_lbMenu2MousePressed

    private void lbMenu3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbMenu3MousePressed
        lbMenu1.setBackground(DefaultColor);
        lbMenu2.setBackground(DefaultColor);
        lbMenu3.setBackground(PressedColor);
        lbMenu4.setBackground(DefaultColor);
        lbMenu5.setBackground(DefaultColor);
        lbMenu6.setBackground(DefaultColor);
        lbMenu7.setBackground(DefaultColor);
        lbMenu8.setBackground(DefaultColor);
        
        lbMenu1.setForeground(TextPressedColor);
        lbMenu2.setForeground(TextPressedColor);
        lbMenu3.setForeground(DefaultColor);
        lbMenu4.setForeground(TextPressedColor);
        lbMenu5.setForeground(TextPressedColor);
        lbMenu6.setForeground(TextPressedColor);
        lbMenu7.setForeground(TextPressedColor);
        lbMenu8.setForeground(TextPressedColor);
        
        nv = new NhanVienForm();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(nv).setVisible(true);
    }//GEN-LAST:event_lbMenu3MousePressed

    private void lbMenu4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbMenu4MousePressed
        lbMenu1.setBackground(DefaultColor);
        lbMenu2.setBackground(DefaultColor);
        lbMenu3.setBackground(DefaultColor);
        lbMenu4.setBackground(PressedColor);
        lbMenu5.setBackground(DefaultColor);
        lbMenu6.setBackground(DefaultColor);
        lbMenu7.setBackground(DefaultColor);
        lbMenu8.setBackground(DefaultColor);
        
        lbMenu1.setForeground(TextPressedColor);
        lbMenu2.setForeground(TextPressedColor);
        lbMenu3.setForeground(TextPressedColor);
        lbMenu4.setForeground(DefaultColor);
        lbMenu5.setForeground(TextPressedColor);
        lbMenu6.setForeground(TextPressedColor);
        lbMenu7.setForeground(TextPressedColor);
        lbMenu8.setForeground(TextPressedColor);
        
        kh = new KhachHangForm();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(kh).setVisible(true);
    }//GEN-LAST:event_lbMenu4MousePressed

    private void lbMenu5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbMenu5MousePressed
        lbMenu1.setBackground(DefaultColor);
        lbMenu2.setBackground(DefaultColor);
        lbMenu3.setBackground(DefaultColor);
        lbMenu4.setBackground(DefaultColor);
        lbMenu5.setBackground(PressedColor);
        lbMenu6.setBackground(DefaultColor);
        lbMenu7.setBackground(DefaultColor);
        lbMenu8.setBackground(DefaultColor);
        
        lbMenu1.setForeground(TextPressedColor);
        lbMenu2.setForeground(TextPressedColor);
        lbMenu3.setForeground(TextPressedColor);
        lbMenu4.setForeground(TextPressedColor);
        lbMenu5.setForeground(DefaultColor);
        lbMenu6.setForeground(TextPressedColor);
        lbMenu7.setForeground(TextPressedColor);
        lbMenu8.setForeground(TextPressedColor);
        
        hd = new HoaDonForm();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(hd).setVisible(true);
    }//GEN-LAST:event_lbMenu5MousePressed

    private void lbMenu6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbMenu6MousePressed
        lbMenu1.setBackground(DefaultColor);
        lbMenu2.setBackground(DefaultColor);
        lbMenu3.setBackground(DefaultColor);
        lbMenu4.setBackground(DefaultColor);
        lbMenu5.setBackground(DefaultColor);
        lbMenu6.setBackground(PressedColor);
        lbMenu7.setBackground(DefaultColor);
        lbMenu8.setBackground(DefaultColor);
        
        lbMenu1.setForeground(TextPressedColor);
        lbMenu2.setForeground(TextPressedColor);
        lbMenu3.setForeground(TextPressedColor);
        lbMenu4.setForeground(TextPressedColor);
        lbMenu5.setForeground(TextPressedColor);
        lbMenu6.setForeground(DefaultColor);
        lbMenu7.setForeground(TextPressedColor);
        lbMenu8.setForeground(TextPressedColor);
        
        gt = new ThuCungForm();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(gt).setVisible(true);
    }//GEN-LAST:event_lbMenu6MousePressed

    private void lbMenu7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbMenu7MousePressed
        lbMenu1.setBackground(DefaultColor);
        lbMenu2.setBackground(DefaultColor);
        lbMenu3.setBackground(DefaultColor);
        lbMenu4.setBackground(DefaultColor);
        lbMenu5.setBackground(DefaultColor);
        lbMenu6.setBackground(DefaultColor);
        lbMenu7.setBackground(PressedColor);
        lbMenu8.setBackground(DefaultColor);
        
        lbMenu1.setForeground(TextPressedColor);
        lbMenu2.setForeground(TextPressedColor);
        lbMenu3.setForeground(TextPressedColor);
        lbMenu4.setForeground(TextPressedColor);
        lbMenu5.setForeground(TextPressedColor);
        lbMenu6.setForeground(TextPressedColor);
        lbMenu7.setForeground(DefaultColor);
        lbMenu8.setForeground(TextPressedColor);
        
        dv = new DichVuForm();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(dv).setVisible(true);
    }//GEN-LAST:event_lbMenu7MousePressed

    private void lbMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbMenu1MouseClicked
        
    }//GEN-LAST:event_lbMenu1MouseClicked

    private void roundJButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundJButton21ActionPerformed
        this.dispose();
        new LoginForm();
    }//GEN-LAST:event_roundJButton21ActionPerformed

    private void lbMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbMenu2MouseClicked
        
    }//GEN-LAST:event_lbMenu2MouseClicked

    private void lbMenu8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbMenu8MousePressed
        lbMenu1.setBackground(DefaultColor);
        lbMenu2.setBackground(DefaultColor);
        lbMenu3.setBackground(DefaultColor);
        lbMenu4.setBackground(DefaultColor);
        lbMenu5.setBackground(DefaultColor);
        lbMenu6.setBackground(DefaultColor);
        lbMenu7.setBackground(DefaultColor);
        lbMenu8.setBackground(PressedColor);
        
        lbMenu1.setForeground(TextPressedColor);
        lbMenu2.setForeground(TextPressedColor);
        lbMenu3.setForeground(TextPressedColor);
        lbMenu4.setForeground(TextPressedColor);
        lbMenu5.setForeground(TextPressedColor);
        lbMenu6.setForeground(TextPressedColor);
        lbMenu7.setForeground(TextPressedColor);
        lbMenu8.setForeground(DefaultColor);
        
        tk = new TaiKhoanForm();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(tk).setVisible(true);
    }//GEN-LAST:event_lbMenu8MousePressed

    public class RoundJLabel extends JLabel {
        public RoundJLabel() {
            setOpaque(false);
        }
        public void paintComponent(Graphics g) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            Color color1 = new Color(58, 169, 169);
            Color color2 = new Color(159, 217, 150);
            GradientPaint gd = new GradientPaint(0, 0, color1, getWidth(), getHeight(), color2, true);
            g2d.setPaint(gd);
            g2d.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, 40,40);
            super.paintComponent(g2d);
        }
    }
    
    public class PanelCircle extends JPanel { 
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setColor(new Color(129, 203, 156));
            g2d.fillOval(0, 0, 22, 22);
        }
    }
    
    public class PanelCircle1 extends JPanel { 
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setColor(new Color(169, 218, 187));
            g2d.fillOval(0, 0, 22, 22);
        }
    }
    
    public class PanelCircle2 extends JPanel { 
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setColor(new Color(185, 222, 199));
            g2d.fillOval(0, 0, 22, 22);
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel lbMenu1;
    private javax.swing.JLabel lbMenu2;
    private javax.swing.JLabel lbMenu3;
    private javax.swing.JLabel lbMenu4;
    private javax.swing.JLabel lbMenu5;
    private javax.swing.JLabel lbMenu6;
    private javax.swing.JLabel lbMenu7;
    private javax.swing.JLabel lbMenu8;
    private QuanLyThuCung.Swing.RoundJButton2 roundJButton21;
    // End of variables declaration//GEN-END:variables
}
