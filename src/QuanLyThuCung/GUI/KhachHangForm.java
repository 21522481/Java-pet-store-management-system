package QuanLyThuCung.GUI;

import SQL.DataAccess;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class KhachHangForm extends javax.swing.JInternalFrame {

    public KhachHangForm() {
        DataAccess dataAccess = new DataAccess();
        initComponents();
        setOpaque(false);
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        
        dcNgaySinh.setDateFormatString("dd-MM-yyyy");
        
        DefaultTableModel model = (DefaultTableModel) tbKhachHang.getModel();
        dataAccess.fetchCustomer(model);
        dataAccess.closeConnection();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        roundJPanel1 = new QuanLyThuCung.Swing.RoundJPanel();
        txtDiaChi = new QuanLyThuCung.Swing.PlaceholderText();
        roundJPanel2 = new QuanLyThuCung.Swing.RoundJPanel();
        txtSDT = new QuanLyThuCung.Swing.PlaceholderText();
        roundJPanel3 = new QuanLyThuCung.Swing.RoundJPanel();
        txtEmail = new QuanLyThuCung.Swing.PlaceholderText();
        roundJPanel4 = new QuanLyThuCung.Swing.RoundJPanel();
        txtHoTen = new QuanLyThuCung.Swing.PlaceholderText();
        BtXoaKH = new QuanLyThuCung.Swing.RoundJButton2();
        BtSuaKH = new QuanLyThuCung.Swing.RoundJButton2();
        BtThemKH = new QuanLyThuCung.Swing.RoundJButton2();
        dcNgaySinh = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        roundJPanel5 = new QuanLyThuCung.Swing.RoundJPanel();
        txtMaKH = new QuanLyThuCung.Swing.PlaceholderText();
        BtClear = new QuanLyThuCung.Swing.RoundJButton2();
        roundJPanel6 = new QuanLyThuCung.Swing.RoundJPanel();
        txtLoai = new QuanLyThuCung.Swing.PlaceholderText();
        roundJPanel25 = new QuanLyThuCung.Swing.RoundJPanel();
        txtTimKiem = new QuanLyThuCung.Swing.PlaceholderText();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbKhachHang = new QuanLyThuCung.Swing.CustomTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1100, 680));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtDiaChi.setPlaceholder("Địa chỉ");

        javax.swing.GroupLayout roundJPanel1Layout = new javax.swing.GroupLayout(roundJPanel1);
        roundJPanel1.setLayout(roundJPanel1Layout);
        roundJPanel1Layout.setHorizontalGroup(
            roundJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundJPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtDiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundJPanel1Layout.setVerticalGroup(
            roundJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        txtSDT.setPlaceholder("SĐT");

        javax.swing.GroupLayout roundJPanel2Layout = new javax.swing.GroupLayout(roundJPanel2);
        roundJPanel2.setLayout(roundJPanel2Layout);
        roundJPanel2Layout.setHorizontalGroup(
            roundJPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        roundJPanel2Layout.setVerticalGroup(
            roundJPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel2Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        txtEmail.setPlaceholder("Email");

        javax.swing.GroupLayout roundJPanel3Layout = new javax.swing.GroupLayout(roundJPanel3);
        roundJPanel3.setLayout(roundJPanel3Layout);
        roundJPanel3Layout.setHorizontalGroup(
            roundJPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundJPanel3Layout.setVerticalGroup(
            roundJPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        txtHoTen.setPlaceholder("Họ và tên");

        javax.swing.GroupLayout roundJPanel4Layout = new javax.swing.GroupLayout(roundJPanel4);
        roundJPanel4.setLayout(roundJPanel4Layout);
        roundJPanel4Layout.setHorizontalGroup(
            roundJPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtHoTen, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundJPanel4Layout.setVerticalGroup(
            roundJPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        BtXoaKH.setText("Xóa");
        BtXoaKH.setRadius(40);
        BtXoaKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtXoaKHActionPerformed(evt);
            }
        });

        BtSuaKH.setText("Sửa");
        BtSuaKH.setRadius(40);
        BtSuaKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSuaKHActionPerformed(evt);
            }
        });

        BtThemKH.setText("Thêm");
        BtThemKH.setRadius(40);
        BtThemKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtThemKHActionPerformed(evt);
            }
        });

        dcNgaySinh.setBorder(null);
        dcNgaySinh.setBackground(new java.awt.Color(255, 255, 255));
        dcNgaySinh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(82, 109, 130));
        jLabel1.setText("Ngày sinh");

        txtMaKH.setPlaceholder("Mã khách hàng");

        javax.swing.GroupLayout roundJPanel5Layout = new javax.swing.GroupLayout(roundJPanel5);
        roundJPanel5.setLayout(roundJPanel5Layout);
        roundJPanel5Layout.setHorizontalGroup(
            roundJPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundJPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtMaKH, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundJPanel5Layout.setVerticalGroup(
            roundJPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        BtClear.setText("Clear");
        BtClear.setRadius(40);
        BtClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtClearActionPerformed(evt);
            }
        });

        txtSDT.setPlaceholder("SĐT");

        javax.swing.GroupLayout roundJPanel6Layout = new javax.swing.GroupLayout(roundJPanel6);
        roundJPanel6.setLayout(roundJPanel6Layout);
        roundJPanel6Layout.setHorizontalGroup(
            roundJPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundJPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtLoai, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundJPanel6Layout.setVerticalGroup(
            roundJPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundJPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(roundJPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(roundJPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(roundJPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(roundJPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(roundJPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(91, 91, 91)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BtThemKH, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(BtXoaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtSuaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtClear, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(280, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dcNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(roundJPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(roundJPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundJPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundJPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(roundJPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dcNgaySinh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)))
                    .addComponent(roundJPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtXoaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtSuaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtThemKH, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtClear, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(roundJPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtTimKiem.setPlaceholder("Tìm kiếm");
        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout roundJPanel25Layout = new javax.swing.GroupLayout(roundJPanel25);
        roundJPanel25.setLayout(roundJPanel25Layout);
        roundJPanel25Layout.setHorizontalGroup(
            roundJPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, 912, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundJPanel25Layout.setVerticalGroup(
            roundJPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel25Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tbKhachHang.fixTable(jScrollPane3);
        tbKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã khách hàng", "Họ tên", "Loại", "Ngày sinh", "Địa chỉ", "SĐT", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbKhachHangMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbKhachHang);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1045, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roundJPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(roundJPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbKhachHangMouseClicked
        // TODO add your handling code here:
        Date now = new Date();
        
        txtMaKH.setText("");
        txtLoai.setText("");
        txtHoTen.setText("");
        txtDiaChi.setText("");
        txtSDT.setText("");
        dcNgaySinh.setDate(null);
        txtEmail.setText("");
        
        DefaultTableModel tblModel = (DefaultTableModel) tbKhachHang.getModel();
        
        int indexTB = tbKhachHang.getSelectedRow();
        
        if(indexTB < tbKhachHang.getRowCount() && indexTB >=0 ){
            txtMaKH.setText(tbKhachHang.getValueAt(indexTB, 0).toString());
            txtHoTen.setText(tbKhachHang.getValueAt(indexTB, 1).toString());
            txtLoai.setText(tbKhachHang.getValueAt(indexTB, 2).toString());
        
             // Chuyển đổi chuỗi ngày tháng thành đối tượng Date
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            try {
                Date birthDate = dateFormat.parse(tbKhachHang.getValueAt(indexTB, 3).toString());

                // Đặt giá trị ngày tháng lên JDateChooser
                dcNgaySinh.setDate(birthDate);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            
            txtDiaChi.setText(tbKhachHang.getValueAt(indexTB, 4).toString());
            txtSDT.setText(tbKhachHang.getValueAt(indexTB, 5).toString());
            txtEmail.setText(tbKhachHang.getValueAt(indexTB, 6).toString());
        }
    }//GEN-LAST:event_tbKhachHangMouseClicked

    
    private PreparedStatement pst;
    private void BtThemKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtThemKHActionPerformed
        // TODO add your handling code here:
        
        DataAccess data = new DataAccess();
            
            DefaultTableModel model = (DefaultTableModel) tbKhachHang.getModel();
            
        try {
            String ten = txtHoTen.getText();
            String loai = txtLoai.getText();
            Date ngaysinh = dcNgaySinh.getDate();
            
            String diaChi = txtDiaChi.getText();
            String sdt = txtSDT.getText();
            String email = txtEmail.getText();
            
            
            SimpleDateFormat oracleDateFormat = new SimpleDateFormat("dd-MMM-yyyy");
            String ngaysinhString = oracleDateFormat.format(ngaysinh);
           
            
            
            pst = data.getConnection().prepareStatement("INSERT INTO KHACHHANG (HOTEN, LOAI, NGSINH, DIACHI, SDT, EMAIL) VALUES (?,?,?,?,?,?)");
            
            pst.setString(1, ten);
            pst.setString(2, loai);
            pst.setString(3, ngaysinhString);
            pst.setString(4, diaChi);
            pst.setString(5, sdt);
            pst.setString(6, email);
           
            int k = pst.executeUpdate();
            if(k==1){
                JOptionPane.showMessageDialog(this, "Đã thêm mới vào cơ sở dữ liệu");
                txtHoTen.setText("");
                txtLoai.setText("");
                dcNgaySinh.setDate(null);
                txtDiaChi.setText("");
                txtSDT.setText("");
                txtEmail.setText("");
            }
            else{
                JOptionPane.showMessageDialog(this, "Lỗi khi thêm mới");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        data.fetchCustomer(model);
        data.closeConnection();
        
    }//GEN-LAST:event_BtThemKHActionPerformed

    private void BtClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtClearActionPerformed
        txtMaKH.setText("");
        txtLoai.setText("");
        txtHoTen.setText("");
        txtDiaChi.setText("");
        txtSDT.setText("");
        dcNgaySinh.setDate(null);
        txtEmail.setText("");
    }//GEN-LAST:event_BtClearActionPerformed

    private void BtXoaKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtXoaKHActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tbKhachHang.getModel();
        int indexTB = tbKhachHang.getSelectedRow();
        
        DataAccess a = new DataAccess();
        
        
        int ret = JOptionPane.showConfirmDialog(null,"Bạn chắc chắn xóa chưa", "Chắn chắn chưa", JOptionPane.YES_NO_OPTION);
        if (ret == JOptionPane.YES_OPTION){
            if(indexTB < model.getRowCount() && indexTB >= 0)
                 model.removeRow(indexTB);
            String sql = "DELETE FROM KHACHHANG WHERE MAKH = ?";
            try {
                PreparedStatement pst = a.getConnection().prepareStatement(sql);
                pst.setString(1, txtMaKH.getText());
                pst.executeUpdate();
                a.closeConnection();
            } catch (SQLException ex) {
                Logger.getLogger(SanPhamForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        txtMaKH.setText("");
        txtLoai.setText("");
        txtHoTen.setText("");
        txtDiaChi.setText("");
        txtSDT.setText("");
        dcNgaySinh.setDate(null);
        txtEmail.setText("");
        
        a.closeConnection();
    }//GEN-LAST:event_BtXoaKHActionPerformed

    private void BtSuaKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSuaKHActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tbKhachHang.getModel();
        DataAccess a = new DataAccess();

        String sql = "UPDATE KHACHHANG SET HOTEN = ?, LOAI = ?, NGSINH = ?, DIACHI = ?, SDT = ?, EMAIL = ? WHERE MAKH = ? ";
        
        int index = tbKhachHang.getSelectedRow();
        SimpleDateFormat oracleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        
        try {
            PreparedStatement pst = a.getConnection().prepareStatement(sql);
            pst.setString(1, txtHoTen.getText());
            pst.setString(2, txtLoai.getText());
            
            Date nsinhUtilDate = dcNgaySinh.getDate();
            java.sql.Date ngsinhSqlDate = new java.sql.Date(nsinhUtilDate.getTime());
            pst.setDate(3, ngsinhSqlDate);

            pst.setString(4, txtDiaChi.getText());
            pst.setString(5, txtSDT.getText());
            pst.setString(6,txtEmail.getText());
            pst.setInt(7, Integer.parseInt(txtMaKH.getText()));
//            pst.executeUpdate();
            
            int k = pst.executeUpdate();
            if(k==1){
                JOptionPane.showMessageDialog(this, "Đã sửa thành công");
                if (index < tbKhachHang.getRowCount() && index >= 0) {
                model.setValueAt(txtHoTen.getText(), index, 1);
                model.setValueAt(txtLoai.getText(), index, 2);
                model.setValueAt(oracleDateFormat.format(dcNgaySinh.getDate()), index, 3);
                model.setValueAt(txtDiaChi.getText(), index, 4);
                model.setValueAt(txtSDT.getText(), index, 5);
                model.setValueAt(txtEmail.getText(), index, 6);
                
                tbKhachHang.setModel(model);
        
                txtMaKH.setText("");
                txtLoai.setText("");
                txtHoTen.setText("");
                txtDiaChi.setText("");
                txtSDT.setText("");
                dcNgaySinh.setDate(null);
                txtEmail.setText("");
                
                }
                
                
            }
            else{
                JOptionPane.showMessageDialog(this, "Lỗi khi thêm mới");
            }
            
//            if (index < tbKhachHang.getRowCount() && index >= 0) {
//                model.setValueAt(txtHoTen.getText(), index, 1);
//                model.setValueAt(txtLoai.getText(), index, 2);
//                model.setValueAt(oracleDateFormat.format(dcNgaySinh.getDate()), index, 3);
//                model.setValueAt(txtDiaChi.getText(), index, 4);
//                model.setValueAt(txtSDT.getText(), index, 5);
//                model.setValueAt(txtEmail.getText(), index, 6);
//            }
            
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        a.closeConnection();
    }//GEN-LAST:event_BtSuaKHActionPerformed

    public void search(String str) {
        DefaultTableModel model = (DefaultTableModel) tbKhachHang.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        tbKhachHang.setRowSorter(trs);

        // Chuyển đổi chuỗi tìm kiếm và dữ liệu trong bảng thành chữ thường
        String lowercaseSearchString = str.toLowerCase();
        trs.setRowFilter(RowFilter.regexFilter("(?i)" + lowercaseSearchString));
    }
    private void txtTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyReleased
        // TODO add your handling code here:
        String searchString = txtTimKiem.getText();
        search(searchString);
    }//GEN-LAST:event_txtTimKiemKeyReleased

    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private QuanLyThuCung.Swing.RoundJButton2 BtClear;
    private QuanLyThuCung.Swing.RoundJButton2 BtSuaKH;
    private QuanLyThuCung.Swing.RoundJButton2 BtThemKH;
    private QuanLyThuCung.Swing.RoundJButton2 BtXoaKH;
    private com.toedter.calendar.JDateChooser dcNgaySinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private QuanLyThuCung.Swing.RoundJPanel roundJPanel1;
    private QuanLyThuCung.Swing.RoundJPanel roundJPanel2;
    private QuanLyThuCung.Swing.RoundJPanel roundJPanel25;
    private QuanLyThuCung.Swing.RoundJPanel roundJPanel3;
    private QuanLyThuCung.Swing.RoundJPanel roundJPanel4;
    private QuanLyThuCung.Swing.RoundJPanel roundJPanel5;
    private QuanLyThuCung.Swing.RoundJPanel roundJPanel6;
    private QuanLyThuCung.Swing.CustomTable tbKhachHang;
    private QuanLyThuCung.Swing.PlaceholderText txtDiaChi;
    private QuanLyThuCung.Swing.PlaceholderText txtEmail;
    private QuanLyThuCung.Swing.PlaceholderText txtHoTen;
    private QuanLyThuCung.Swing.PlaceholderText txtLoai;
    private QuanLyThuCung.Swing.PlaceholderText txtMaKH;
    private QuanLyThuCung.Swing.PlaceholderText txtSDT;
    private QuanLyThuCung.Swing.PlaceholderText txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
