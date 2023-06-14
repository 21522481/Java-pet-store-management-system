package QuanLyThuCung.GUI;

import SQL.DataAccess;
import com.sun.jdi.connect.spi.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class NhanVienForm extends javax.swing.JInternalFrame {

      SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd    HH:mm:ss");
    
    public NhanVienForm() {
        DataAccess dataAccess = new DataAccess();
        initComponents();
        setOpaque(false);
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        dcNgaySinh.setDateFormatString("dd-MM-yyyy");
        
           DefaultTableModel model = (DefaultTableModel) tbNhanVien.getModel();
        dataAccess.fetchStaff(model);
        dataAccess.closeConnection();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundJPanel25 = new QuanLyThuCung.Swing.RoundJPanel();
        txtTimKiem = new QuanLyThuCung.Swing.PlaceholderText();
        jPanel1 = new javax.swing.JPanel();
        roundJPanel1 = new QuanLyThuCung.Swing.RoundJPanel();
        txtSĐT = new QuanLyThuCung.Swing.PlaceholderText();
        roundJPanel4 = new QuanLyThuCung.Swing.RoundJPanel();
        txtMaNV = new QuanLyThuCung.Swing.PlaceholderText();
        BtThemNV = new QuanLyThuCung.Swing.RoundJButton2();
        BtLuuNV = new QuanLyThuCung.Swing.RoundJButton2();
        BtXoaNV = new QuanLyThuCung.Swing.RoundJButton2();
        cbGioiTinh = new javax.swing.JComboBox<>();
        cbChucVu = new javax.swing.JComboBox<>();
        dcNgaySinh = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        roundJPanel2 = new QuanLyThuCung.Swing.RoundJPanel();
        txtDiaChi = new QuanLyThuCung.Swing.PlaceholderText();
        roundJPanel5 = new QuanLyThuCung.Swing.RoundJPanel();
        txtHoTen = new QuanLyThuCung.Swing.PlaceholderText();
        BtClear = new QuanLyThuCung.Swing.RoundJButton2();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbNhanVien = new QuanLyThuCung.Swing.CustomTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1100, 680));

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
                .addComponent(txtTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, 895, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundJPanel25Layout.setVerticalGroup(
            roundJPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel25Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtSĐT.setPlaceholder("SĐT");

        javax.swing.GroupLayout roundJPanel1Layout = new javax.swing.GroupLayout(roundJPanel1);
        roundJPanel1.setLayout(roundJPanel1Layout);
        roundJPanel1Layout.setHorizontalGroup(
            roundJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundJPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSĐT, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundJPanel1Layout.setVerticalGroup(
            roundJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtSĐT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        txtMaNV.setPlaceholder("Mã nhân viên");

        javax.swing.GroupLayout roundJPanel4Layout = new javax.swing.GroupLayout(roundJPanel4);
        roundJPanel4.setLayout(roundJPanel4Layout);
        roundJPanel4Layout.setHorizontalGroup(
            roundJPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtMaNV, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundJPanel4Layout.setVerticalGroup(
            roundJPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        BtThemNV.setText("Thêm");
        BtThemNV.setRadius(40);
        BtThemNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtThemNVActionPerformed(evt);
            }
        });

        BtLuuNV.setText("Lưu");
        BtLuuNV.setRadius(40);
        BtLuuNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtLuuNVActionPerformed(evt);
            }
        });

        BtXoaNV.setText("Xóa");
        BtXoaNV.setRadius(40);
        BtXoaNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtXoaNVActionPerformed(evt);
            }
        });

        cbGioiTinh.setOpaque(false);
        cbGioiTinh.setBackground(new java.awt.Color(225, 237, 232));
        cbGioiTinh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn giới tính", "Nam", "Nữ" }));
        cbGioiTinh.setBorder(null);
        cbGioiTinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGioiTinhActionPerformed(evt);
            }
        });

        cbGioiTinh.setOpaque(false);
        cbChucVu.setBackground(new java.awt.Color(225, 237, 232));
        cbChucVu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbChucVu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn chức vụ", "àdsd", "sdfsdf" }));
        cbChucVu.setBorder(null);
        cbChucVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbChucVuActionPerformed(evt);
            }
        });

        dcNgaySinh.setBackground(new java.awt.Color(255, 255, 255));
        dcNgaySinh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(82, 109, 130));
        jLabel1.setText("Ngày sinh");

        txtDiaChi.setPlaceholder("Địa chỉ");

        javax.swing.GroupLayout roundJPanel2Layout = new javax.swing.GroupLayout(roundJPanel2);
        roundJPanel2.setLayout(roundJPanel2Layout);
        roundJPanel2Layout.setHorizontalGroup(
            roundJPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtDiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundJPanel2Layout.setVerticalGroup(
            roundJPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundJPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtHoTen.setPlaceholder("Họ và tên");

        javax.swing.GroupLayout roundJPanel5Layout = new javax.swing.GroupLayout(roundJPanel5);
        roundJPanel5.setLayout(roundJPanel5Layout);
        roundJPanel5Layout.setHorizontalGroup(
            roundJPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtHoTen, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundJPanel5Layout.setVerticalGroup(
            roundJPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        BtClear.setText("Clear");
        BtClear.setRadius(40);
        BtClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbChucVu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(roundJPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(roundJPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(roundJPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(83, 83, 83)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(BtThemNV, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(BtXoaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtLuuNV, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dcNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(roundJPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtClear, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(191, 191, 191))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(roundJPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(roundJPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(roundJPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(cbGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(roundJPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(cbChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(dcNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtThemNV, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtLuuNV, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtXoaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtClear, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        tbNhanVien.fixTable(jScrollPane3);
        tbNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Chức năng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tbNhanVien);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1044, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roundJPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(roundJPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private PreparedStatement pst;
    private Connection conn;
    private void cbGioiTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGioiTinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbGioiTinhActionPerformed

    private void cbChucVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbChucVuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbChucVuActionPerformed

    private void BtClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtClearActionPerformed
        txtMaNV.setText("");
        txtHoTen.setText("");
        dcNgaySinh.setDate(null);
        txtSĐT.setText("");
        txtDiaChi.setText("");
        cbGioiTinh.setSelectedItem("Chọn giới tính");
        cbChucVu.setSelectedItem("Chọn chức vụ");
    }//GEN-LAST:event_BtClearActionPerformed

    private void BtThemNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtThemNVActionPerformed
     DataAccess data = new DataAccess();
            
            DefaultTableModel model = (DefaultTableModel) tbNhanVien.getModel();
            
        try {
            String hoten = txtHoTen.getText();
            
            Date ngsinh = dcNgaySinh.getDate();
              String gioitinh = cbGioiTinh.getSelectedItem().toString();
              String chucvu = cbGioiTinh.getSelectedItem().toString();
            String diachi = txtDiaChi.getText();
            String sdt = txtSĐT.getText();
           
            
            SimpleDateFormat oracleDateFormat = new SimpleDateFormat("dd-MMM-yyyy");
            String ngsinhString = oracleDateFormat.format(ngsinh);
            
            
            
            pst = data.getConnection().prepareStatement("INSERT INTO NHANVIEN (HOTEN, NGSINH, GIOITINH, SDT, DIACHI, CHUCVU) VALUES (?,?,?,?,?,?)");
            
            pst.setString(1, hoten);
            pst.setString(2, ngsinhString);
//            pst.setString(3, nsx);
//            pst.setString(4, hsd);
            pst.setString(3, gioitinh);
            pst.setString(6, chucvu);
            pst.setString(5, diachi);
            pst.setString(4, sdt);
         
           
            int k = pst.executeUpdate();
            if(k==1){
                JOptionPane.showMessageDialog(this, "Đã thêm mới vào cơ sở dữ liệu");
        txtMaNV.setText("");
        txtHoTen.setText("");
        dcNgaySinh.setDate(null);
        txtSĐT.setText("");
        txtDiaChi.setText("");
        cbGioiTinh.setSelectedItem("Chọn giới tính");
        cbChucVu.setSelectedItem("Chọn chức vụ");
            }
            else{
                JOptionPane.showMessageDialog(this, "Lỗi khi thêm mới");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        data.fetchStaff(model);
        data.closeConnection();
    }//GEN-LAST:event_BtThemNVActionPerformed

    private void BtXoaNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtXoaNVActionPerformed
   // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tbNhanVien.getModel();
        int indexTB = tbNhanVien.getSelectedRow();
        
        DataAccess a = new DataAccess();
        
        
        int ret = JOptionPane.showConfirmDialog(null,"Bạn chắc chắn xóa chưa", "Chắn chắn chưa", JOptionPane.YES_NO_OPTION);
        if (ret == JOptionPane.YES_OPTION){
            if(indexTB < model.getRowCount() && indexTB >= 0)
                 model.removeRow(indexTB);
            String sql = "DELETE FROM NHANVIEN WHERE MANV = ?";
            try {
                PreparedStatement pst = a.getConnection().prepareStatement(sql);
                pst.setString(1, txtMaNV.getText());
                pst.executeUpdate();
                a.closeConnection();
            } catch (SQLException ex) {
                Logger.getLogger(SanPhamForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
       txtMaNV.setText("");
        txtHoTen.setText("");
        dcNgaySinh.setDate(null);
        txtSĐT.setText("");
        txtDiaChi.setText("");
        cbGioiTinh.setSelectedItem("Chọn giới tính");
        cbChucVu.setSelectedItem("Chọn chức vụ");
        
        a.closeConnection();        // TODO add your handling code here:
    }//GEN-LAST:event_BtXoaNVActionPerformed

    private void BtLuuNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtLuuNVActionPerformed
     // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tbNhanVien.getModel();
        DataAccess a = new DataAccess();

        String sql = "UPDATE NHANVIEN SET HOTEN = ?, NGSINH = ?, GIOITINH = ?, SDT = ?, DIACHI = ?, CHUCVU=? WHERE MANV = ? ";
        
        int index = tbNhanVien.getSelectedRow();
        SimpleDateFormat oracleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        
        try {
            PreparedStatement pst = a.getConnection().prepareStatement(sql);
            pst.setString(1, txtHoTen.getText());
           
            
            Date nsinhUtilDate = dcNgaySinh.getDate();
            java.sql.Date ngsinhSqlDate = new java.sql.Date(nsinhUtilDate.getTime());
            pst.setDate(2, ngsinhSqlDate);
             pst.setString(3, cbGioiTinh.getSelectedItem().toString());
            pst.setString(5, txtDiaChi.getText());
            pst.setString(4, txtSĐT.getText());
              pst.setString(6, cbChucVu.getSelectedItem().toString());
            pst.setInt(7, Integer.parseInt(txtMaNV.getText()));
//            pst.executeUpdate();
            
            int k = pst.executeUpdate();
            if(k==1){
                JOptionPane.showMessageDialog(this, "Đã sửa thành công");
                if (index < tbNhanVien.getRowCount() && index >= 0) {
                model.setValueAt(txtHoTen.getText(), index, 1);
                model.setValueAt(cbGioiTinh.getSelectedItem(), index, 3);
                model.setValueAt(oracleDateFormat.format(dcNgaySinh.getDate()), index, 2);
                model.setValueAt(txtDiaChi.getText(), index, 5);
                model.setValueAt(txtSĐT.getText(), index, 4);
                  model.setValueAt(cbGioiTinh.getSelectedItem(), index, 6);
                
                tbNhanVien.setModel(model);
        
                  txtMaNV.setText("");
        txtHoTen.setText("");
        dcNgaySinh.setDate(null);
        txtSĐT.setText("");
        txtDiaChi.setText("");
        cbGioiTinh.setSelectedItem("Chọn giới tính");
        cbChucVu.setSelectedItem("Chọn chức vụ");
                
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
    }//GEN-LAST:event_BtLuuNVActionPerformed
private void clearFields() {
    txtMaNV.setText("");
    txtHoTen.setText("");
    dcNgaySinh.setDate(null);
    txtSĐT.setText("");
    txtDiaChi.setText("");
    cbGioiTinh.setSelectedItem("Chọn giới tính");
    cbChucVu.setSelectedItem("Chọn chức vụ");
}
    public void search(String str) {
    DefaultTableModel model = (DefaultTableModel) tbNhanVien.getModel();
    TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
    tbNhanVien.setRowSorter(trs);

    // Chuyển đổi chuỗi tìm kiếm và dữ liệu trong bảng thành chữ thường
    String lowercaseSearchString = str.toLowerCase();
    trs.setRowFilter(RowFilter.regexFilter("(?i)" + lowercaseSearchString));

    // Xóa thông tin đang hiển thị trên giao diện
    clearFields();
}
    private void txtTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyReleased
         String searchString = txtTimKiem.getText();
        search(searchString);
    }//GEN-LAST:event_txtTimKiemKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private QuanLyThuCung.Swing.RoundJButton2 BtClear;
    private QuanLyThuCung.Swing.RoundJButton2 BtLuuNV;
    private QuanLyThuCung.Swing.RoundJButton2 BtThemNV;
    private QuanLyThuCung.Swing.RoundJButton2 BtXoaNV;
    private javax.swing.JComboBox<String> cbChucVu;
    private javax.swing.JComboBox<String> cbGioiTinh;
    private com.toedter.calendar.JDateChooser dcNgaySinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private QuanLyThuCung.Swing.RoundJPanel roundJPanel1;
    private QuanLyThuCung.Swing.RoundJPanel roundJPanel2;
    private QuanLyThuCung.Swing.RoundJPanel roundJPanel25;
    private QuanLyThuCung.Swing.RoundJPanel roundJPanel4;
    private QuanLyThuCung.Swing.RoundJPanel roundJPanel5;
    private QuanLyThuCung.Swing.CustomTable tbNhanVien;
    private QuanLyThuCung.Swing.PlaceholderText txtDiaChi;
    private QuanLyThuCung.Swing.PlaceholderText txtHoTen;
    private QuanLyThuCung.Swing.PlaceholderText txtMaNV;
    private QuanLyThuCung.Swing.PlaceholderText txtSĐT;
    private QuanLyThuCung.Swing.PlaceholderText txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
