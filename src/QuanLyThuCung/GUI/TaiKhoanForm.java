package QuanLyThuCung.GUI;

import SQL.DataAccess;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;


public class TaiKhoanForm extends javax.swing.JInternalFrame {


    public TaiKhoanForm() {
        DataAccess a = new DataAccess();
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        
        DefaultTableModel model = (DefaultTableModel) tbTaiKhoan.getModel();
        
        a.fetchAccount(model);
        a.closeConnection();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundJPanel4 = new QuanLyThuCung.Swing.RoundJPanel();
        txtMaNV = new QuanLyThuCung.Swing.PlaceholderText();
        roundJPanel6 = new QuanLyThuCung.Swing.RoundJPanel();
        txtPassword = new QuanLyThuCung.Swing.PlaceholderText();
        BtThemTK = new QuanLyThuCung.Swing.RoundJButton2();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbTaiKhoan = new QuanLyThuCung.Swing.CustomTable();
        BtXoaTK = new QuanLyThuCung.Swing.RoundJButton2();
        BtClear = new QuanLyThuCung.Swing.RoundJButton2();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);

        txtMaNV.setPlaceholder("Mã nhân viên");

        javax.swing.GroupLayout roundJPanel4Layout = new javax.swing.GroupLayout(roundJPanel4);
        roundJPanel4.setLayout(roundJPanel4Layout);
        roundJPanel4Layout.setHorizontalGroup(
            roundJPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundJPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtMaNV, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundJPanel4Layout.setVerticalGroup(
            roundJPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundJPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtPassword.setPlaceholder("Password");

        javax.swing.GroupLayout roundJPanel6Layout = new javax.swing.GroupLayout(roundJPanel6);
        roundJPanel6.setLayout(roundJPanel6Layout);
        roundJPanel6Layout.setHorizontalGroup(
            roundJPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundJPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundJPanel6Layout.setVerticalGroup(
            roundJPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundJPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BtThemTK.setText("Thêm");
        BtThemTK.setRadius(45);
        BtThemTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtThemTKActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(5, 69, 89, 68));
        jLabel1.setText("Danh sách tài khoản");

        tbTaiKhoan.fixTable(jScrollPane3);
        tbTaiKhoan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã nhân viên", "Tên đăng nhập", "Mật khẩu"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbTaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTaiKhoanMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbTaiKhoan);

        BtXoaTK.setText("Xóa");
        BtXoaTK.setRadius(45);
        BtXoaTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtXoaTKActionPerformed(evt);
            }
        });

        BtClear.setText("Clear");
        BtClear.setRadius(45);
        BtClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(roundJPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(67, 67, 67)
                            .addComponent(BtThemTK, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(BtXoaTK, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(BtClear, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(roundJPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(477, 477, 477))))
                .addGap(0, 50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(roundJPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(roundJPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtThemTK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtXoaTK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private PreparedStatement pst;
    private void BtThemTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtThemTKActionPerformed
        // TODO add your handling code here:
        DataAccess data = new DataAccess();
            
            DefaultTableModel model = (DefaultTableModel) tbTaiKhoan.getModel();
            
        try {
            String tenDN = txtMaNV.getText();
            String matKhau = txtPassword.getText();
            
            pst = data.getConnection().prepareStatement("INSERT INTO TAIKHOAN VALUES (?,?)");
            
            pst.setString(1, tenDN);
            pst.setString(2, matKhau);
          
           
            int k = pst.executeUpdate();
            if(k==1){
                JOptionPane.showMessageDialog(this, "Đã thêm mới vào cơ sở dữ liệu");
                txtMaNV.setText("");
                txtPassword.setText("");
            }
            else{
                JOptionPane.showMessageDialog(this, "Lỗi khi thêm mới");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(TaiKhoanForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        data.fetchAccount(model);
        data.closeConnection();
    }//GEN-LAST:event_BtThemTKActionPerformed

    private void BtXoaTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtXoaTKActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tbTaiKhoan.getModel();
        int indexTB = tbTaiKhoan.getSelectedRow();
        
        DataAccess a = new DataAccess();
        
        
        int ret = JOptionPane.showConfirmDialog(null,"M chắc chắn xóa chưa", "Chắn chắn chưa", JOptionPane.YES_NO_OPTION);
        if (ret == JOptionPane.YES_OPTION){
            if(indexTB < model.getRowCount() && indexTB >= 0)
                 model.removeRow(indexTB);
            String sql = "DELETE FROM TAIKHOAN WHERE MANV = ?";
            try {
                PreparedStatement pst = a.getConnection().prepareStatement(sql);
                pst.setString(1, txtMaNV.getText());
                pst.executeUpdate();
                a.closeConnection();
            } catch (SQLException ex) {
                Logger.getLogger(TaiKhoanForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        txtMaNV.setText("");
        txtPassword.setText("");
        
        a.closeConnection();
        
    }//GEN-LAST:event_BtXoaTKActionPerformed

    private void tbTaiKhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTaiKhoanMouseClicked
        // TODO add your handling code here:
        txtMaNV.setText("");
        txtPassword.setText("");
        
        DefaultTableModel tblModel = (DefaultTableModel) tbTaiKhoan.getModel();
        
        int indexTB = tbTaiKhoan.getSelectedRow();
        
        if(indexTB < tbTaiKhoan.getRowCount() && indexTB >=0 ){
            txtMaNV.setText(tbTaiKhoan.getValueAt(indexTB, 0).toString());
            txtPassword.setText(tbTaiKhoan.getValueAt(indexTB, 2).toString());
        }
    }//GEN-LAST:event_tbTaiKhoanMouseClicked

    private void BtClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtClearActionPerformed
        txtMaNV.setText("");
        txtPassword.setText("");
    }//GEN-LAST:event_BtClearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private QuanLyThuCung.Swing.RoundJButton2 BtClear;
    private QuanLyThuCung.Swing.RoundJButton2 BtThemTK;
    private QuanLyThuCung.Swing.RoundJButton2 BtXoaTK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane3;
    private QuanLyThuCung.Swing.RoundJPanel roundJPanel4;
    private QuanLyThuCung.Swing.RoundJPanel roundJPanel6;
    private QuanLyThuCung.Swing.CustomTable tbTaiKhoan;
    private QuanLyThuCung.Swing.PlaceholderText txtMaNV;
    private QuanLyThuCung.Swing.PlaceholderText txtPassword;
    // End of variables declaration//GEN-END:variables
}
