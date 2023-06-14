package QuanLyThuCung.GUI;

import SQL.DataAccess;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class DichVuForm extends javax.swing.JInternalFrame {

    private DataAccess dataAccess;
    private PreparedStatement pst;
    private Connection con;
    
    public DichVuForm() {
        initComponents();
        setOpaque(false);
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        
        dataAccess = new DataAccess();
        
        DefaultTableModel model = (DefaultTableModel) tbDichVu.getModel();
        String tieude[] = {"Số phiếu gửi", "Tên pet", "Ngày gửi", "Ngày trả", "Loại pet", "Giới tính", "Tiền dịch vụ", "Mã khách hàng"};
        model.setColumnIdentifiers(tieude);
        tbDichVu.setModel(model);
        
        dcNgayGui.setDateFormatString("yyyy-MM-dd");
        dcNgayTra.setDateFormatString("yyyy-MM-dd");
        
        dataAccess.fetchDichVu(model);
        dataAccess.closeConnection();
        
    }
    
    public void search(String str){
        DefaultTableModel model = (DefaultTableModel)tbDichVu.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        tbDichVu.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundJPanel25 = new QuanLyThuCung.Swing.RoundJPanel();
        txtTimKiem = new QuanLyThuCung.Swing.PlaceholderText();
        jPanel1 = new javax.swing.JPanel();
        roundJPanel1 = new QuanLyThuCung.Swing.RoundJPanel();
        txtTenPet = new QuanLyThuCung.Swing.PlaceholderText();
        roundJPanel2 = new QuanLyThuCung.Swing.RoundJPanel();
        txtLoaiPet = new QuanLyThuCung.Swing.PlaceholderText();
        roundJPanel4 = new QuanLyThuCung.Swing.RoundJPanel();
        txtMaKH = new QuanLyThuCung.Swing.PlaceholderText();
        BtThemDV = new QuanLyThuCung.Swing.RoundJButton2();
        BtSuaDV = new QuanLyThuCung.Swing.RoundJButton2();
        roundJPanel3 = new QuanLyThuCung.Swing.RoundJPanel();
        txtTienDichVu = new QuanLyThuCung.Swing.PlaceholderText();
        BtXoaDV = new QuanLyThuCung.Swing.RoundJButton2();
        dcNgayGui = new com.toedter.calendar.JDateChooser();
        dcNgayTra = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbGioiTinh = new javax.swing.JComboBox<>();
        roundJPanel5 = new QuanLyThuCung.Swing.RoundJPanel();
        txtSoPhieuGui = new QuanLyThuCung.Swing.PlaceholderText();
        BtClear = new QuanLyThuCung.Swing.RoundJButton2();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbDichVu = new QuanLyThuCung.Swing.CustomTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);

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
                .addComponent(txtTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, 985, Short.MAX_VALUE)
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

        txtTenPet.setPlaceholder("Tên pet");

        javax.swing.GroupLayout roundJPanel1Layout = new javax.swing.GroupLayout(roundJPanel1);
        roundJPanel1.setLayout(roundJPanel1Layout);
        roundJPanel1Layout.setHorizontalGroup(
            roundJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundJPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTenPet, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundJPanel1Layout.setVerticalGroup(
            roundJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtTenPet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        txtLoaiPet.setPlaceholder("Loại pet");

        javax.swing.GroupLayout roundJPanel2Layout = new javax.swing.GroupLayout(roundJPanel2);
        roundJPanel2.setLayout(roundJPanel2Layout);
        roundJPanel2Layout.setHorizontalGroup(
            roundJPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtLoaiPet, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundJPanel2Layout.setVerticalGroup(
            roundJPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtLoaiPet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        txtMaKH.setPlaceholder("Mã khách hàng");

        javax.swing.GroupLayout roundJPanel4Layout = new javax.swing.GroupLayout(roundJPanel4);
        roundJPanel4.setLayout(roundJPanel4Layout);
        roundJPanel4Layout.setHorizontalGroup(
            roundJPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtMaKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundJPanel4Layout.setVerticalGroup(
            roundJPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        BtThemDV.setText("Thêm");
        BtThemDV.setRadius(40);
        BtThemDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtThemDVActionPerformed(evt);
            }
        });

        BtSuaDV.setText("Sửa");
        BtSuaDV.setRadius(40);
        BtSuaDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSuaDVActionPerformed(evt);
            }
        });

        txtTienDichVu.setPlaceholder("Tiền dịch vụ");

        javax.swing.GroupLayout roundJPanel3Layout = new javax.swing.GroupLayout(roundJPanel3);
        roundJPanel3.setLayout(roundJPanel3Layout);
        roundJPanel3Layout.setHorizontalGroup(
            roundJPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTienDichVu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundJPanel3Layout.setVerticalGroup(
            roundJPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtTienDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        BtXoaDV.setText("Xóa");
        BtXoaDV.setRadius(40);
        BtXoaDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtXoaDVActionPerformed(evt);
            }
        });

        dcNgayGui.setForeground(new java.awt.Color(82, 109, 130));

        dcNgayTra.setForeground(new java.awt.Color(82, 109, 130));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(82, 109, 130));
        jLabel1.setText("Ngày gửi");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(82, 109, 130));
        jLabel2.setText("Ngày trả");

        cbGioiTinh.setOpaque(false);
        cbGioiTinh.setBackground(new java.awt.Color(225, 237, 232));
        cbGioiTinh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbGioiTinh.setForeground(new java.awt.Color(5, 69, 89, 68));
        cbGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn giới tính", "Nam", "Nữ" }));
        cbGioiTinh.setBorder(null);

        txtSoPhieuGui.setPlaceholder("Số phiếu nhập");
        txtSoPhieuGui.setEditable(false);

        javax.swing.GroupLayout roundJPanel5Layout = new javax.swing.GroupLayout(roundJPanel5);
        roundJPanel5.setLayout(roundJPanel5Layout);
        roundJPanel5Layout.setHorizontalGroup(
            roundJPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSoPhieuGui, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundJPanel5Layout.setVerticalGroup(
            roundJPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtSoPhieuGui, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(roundJPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(roundJPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(roundJPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbGioiTinh, javax.swing.GroupLayout.Alignment.TRAILING, 0, 150, Short.MAX_VALUE)))
                    .addComponent(roundJPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(343, 343, 343)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dcNgayTra, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(158, 158, 158)
                                .addComponent(BtThemDV, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BtXoaDV, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BtSuaDV, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(dcNgayGui, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(roundJPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtClear, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(163, 163, 163))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(roundJPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(dcNgayTra, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dcNgayGui, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roundJPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtThemDV, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtSuaDV, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtXoaDV, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtClear, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        tbDichVu.fixTable(jScrollPane3);
        tbDichVu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Chức năng", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbDichVu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDichVuMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbDichVu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1094, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1046, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(31, 31, 31)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtThemDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtThemDVActionPerformed
        DataAccess data = new DataAccess();
            
            DefaultTableModel model = (DefaultTableModel) tbDichVu.getModel();
            
        try {
            String ten = txtTenPet.getText();
            java.util.Date ngui  = dcNgayGui.getDate();
            java.util.Date nnhan  = dcNgayTra.getDate();
            String loai  = txtLoaiPet.getText();
            String gioiTinh = cbGioiTinh.getSelectedItem().toString();
            String gia = txtTienDichVu.getText();
            String ma = txtMaKH.getText();
            
            SimpleDateFormat oracleDateFormat = new SimpleDateFormat("dd-MMM-yyyy");
            String ngString = oracleDateFormat.format(ngui);
            String nnString = oracleDateFormat.format(nnhan);
            
            
            pst = data.getConnection().prepareStatement("INSERT INTO GUITHUCUNG (TEN, NGAYGUI, NGAYTRA, LOAI, GIOITINH, GIA, MAKH) VALUES (?,?,?,?,?,?,?)");
            
            pst.setString(1, ten);
            pst.setString(2, ngString);
            pst.setString(3, nnString);
            pst.setString(4, loai);
            pst.setString(5, gioiTinh);
            pst.setString(6, gia);
            pst.setString(7, ma);
           
            int k = pst.executeUpdate();
            if(k==1){
                JOptionPane.showMessageDialog(this, "Đã thêm mới vào cơ sở dữ liệu");
                txtTenPet.setText("");
                dcNgayGui.setDate(null);
                dcNgayTra.setDate(null);

                txtLoaiPet.setText("");
                cbGioiTinh.setSelectedItem("Chọn giới tính");
                txtTienDichVu.setText("");
                txtMaKH.setText("");
            }
            else{
                JOptionPane.showMessageDialog(this, "Lỗi khi thêm mới");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        data.fetchDichVu(model);
        data.closeConnection();
    }//GEN-LAST:event_BtThemDVActionPerformed

    private void tbDichVuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDichVuMouseClicked
//        txtTenPet.setText("");
//        dcNgayGui.setDate(null);        
//        dcNgayTra.setDate(null);
//        txtLoaiPet.setText("");
//        cbGioiTinh.setSelectedItem("Chọn giới tính");
//        txtTienDichVu.setText("");
//        txtMaKH.setText("");
        
        DefaultTableModel tblModel = (DefaultTableModel) tbDichVu.getModel();
        
        int indexTB = tbDichVu.getSelectedRow();
        
        if(indexTB < tblModel.getRowCount() && indexTB >=0 ){
            txtSoPhieuGui.setText(tbDichVu.getValueAt(indexTB, 0).toString());
            txtTenPet.setText(tbDichVu.getValueAt(indexTB, 1).toString());
        
             // Chuyển đổi chuỗi ngày tháng thành đối tượng Date
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            try {
                java.util.Date ngGui = dateFormat.parse(tbDichVu.getValueAt(indexTB, 2).toString());
                java.util.Date ngTra = dateFormat.parse(tbDichVu.getValueAt(indexTB, 3).toString());

                // Đặt giá trị ngày tháng lên JDateChooser
                dcNgayGui.setDate(ngGui);
                dcNgayTra.setDate(ngTra);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            
            txtLoaiPet.setText(tbDichVu.getValueAt(indexTB, 4).toString());
            cbGioiTinh.setSelectedItem(tbDichVu.getValueAt(indexTB, 5).toString());
            txtTienDichVu.setText(tbDichVu.getValueAt(indexTB, 6).toString());
            txtMaKH.setText(tbDichVu.getValueAt(indexTB, 7).toString());
        }
    }//GEN-LAST:event_tbDichVuMouseClicked

    private void BtSuaDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSuaDVActionPerformed
        DefaultTableModel model = (DefaultTableModel) tbDichVu.getModel();
        DataAccess a = new DataAccess();

        String sql = "UPDATE GUITHUCUNG SET TEN = ?, NGAYGUI = ?, NGAYTRA = ?, LOAI = ?, GIOITINH = ?, GIA = ? WHERE MAKH = ? ";
        
        int index = tbDichVu.getSelectedRow();
        SimpleDateFormat oracleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        
        try {
            PreparedStatement pst = a.getConnection().prepareStatement(sql);
            pst.setString(1, txtTenPet.getText());
            
            java.util.Date nsxUtilDate = dcNgayGui.getDate();
            java.sql.Date nsxSqlDate = new java.sql.Date(nsxUtilDate.getTime());
            pst.setDate(2, nsxSqlDate);

            java.util.Date hsdUtilDate = dcNgayTra.getDate();
            java.sql.Date hsdSqlDate = new java.sql.Date(hsdUtilDate.getTime());
            pst.setDate(3, hsdSqlDate);

            pst.setString(4, txtLoaiPet.getText());
            pst.setString(5, cbGioiTinh.getSelectedItem().toString());
            pst.setInt(6, Integer.parseInt(txtTienDichVu.getText()));
            pst.setString(7, txtMaKH.getText());
            pst.executeUpdate();
            
//            if (index < tbDichVu.getRowCount() && index >= 0) {
//                model.setValueAt(txtTenPet.getText(), index, 1);
//                model.setValueAt(oracleDateFormat.format(dcNgayGui.getDate()), index, 2);
//                model.setValueAt(oracleDateFormat.format(dcNgayTra.getDate()), index, 3);
//                model.setValueAt(txtLoaiPet.getText(), index, 4);
//                model.setValueAt(cbGioiTinh.getSelectedItem(), index, 5);
//                model.setValueAt(txtTienDichVu.getText(), index, 6);
//                model.setValueAt(txtMaKH.getText(), index, 7);
//            }
            int k = pst.executeUpdate();
            if(k==1){
                JOptionPane.showMessageDialog(this, "Đã sửa thành công");
                
                a.fetchDichVu(model);
                
                tbDichVu.setModel(model);
        
                txtSoPhieuGui.setText("");
                txtTenPet.setText("");
                dcNgayGui.setDate(null);
                dcNgayTra.setDate(null);
                txtLoaiPet.setText("");
                cbGioiTinh.setSelectedItem("Chọn giới tính");
                txtTienDichVu.setText("");
                txtMaKH.setText("");
            }

            
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        a.closeConnection();
    }//GEN-LAST:event_BtSuaDVActionPerformed

    private void BtXoaDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtXoaDVActionPerformed
        DefaultTableModel model = (DefaultTableModel)tbDichVu.getModel();
        int indexTB = tbDichVu.getSelectedRow();
        
        DataAccess a = new DataAccess();
        
        
        int ret = JOptionPane.showConfirmDialog(null,"M chắc chắn xóa chưa", "Chắn chắn chưa", JOptionPane.YES_NO_OPTION);
        if (ret == JOptionPane.YES_OPTION){
            if(indexTB < model.getRowCount() && indexTB >= 0)
                 model.removeRow(indexTB);
            String sql = "DELETE FROM GUITHUCUNG WHERE SOPHIEUGUI = ?";
            try {
                PreparedStatement pst = a.getConnection().prepareStatement(sql);
                pst.setString(1, txtSoPhieuGui.getText());
                pst.executeUpdate();
                a.fetchDichVu(model);
                a.closeConnection();
            } catch (SQLException ex) {
                Logger.getLogger(SanPhamForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            txtSoPhieuGui.setText("");
            txtTenPet.setText("");
            dcNgayGui.setDate(null);        
            dcNgayTra.setDate(null);
            txtLoaiPet.setText("");
            cbGioiTinh.setSelectedItem("Chọn giới tính");
            txtTienDichVu.setText("");
            txtMaKH.setText("");
        }
        
        
        a.closeConnection();
    }//GEN-LAST:event_BtXoaDVActionPerformed

    private void txtTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyReleased
        String searchString = txtTimKiem.getText();
        search(searchString);
    }//GEN-LAST:event_txtTimKiemKeyReleased

    private void BtClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtClearActionPerformed
        txtSoPhieuGui.setText("");
        txtTenPet.setText("");
        dcNgayGui.setDate(null);        
        dcNgayTra.setDate(null);
        txtLoaiPet.setText("");
        cbGioiTinh.setSelectedItem("Chọn giới tính");
        txtTienDichVu.setText("");
        txtMaKH.setText("");
    }//GEN-LAST:event_BtClearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private QuanLyThuCung.Swing.RoundJButton2 BtClear;
    private QuanLyThuCung.Swing.RoundJButton2 BtSuaDV;
    private QuanLyThuCung.Swing.RoundJButton2 BtThemDV;
    private QuanLyThuCung.Swing.RoundJButton2 BtXoaDV;
    private javax.swing.JComboBox<String> cbGioiTinh;
    private com.toedter.calendar.JDateChooser dcNgayGui;
    private com.toedter.calendar.JDateChooser dcNgayTra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private QuanLyThuCung.Swing.RoundJPanel roundJPanel1;
    private QuanLyThuCung.Swing.RoundJPanel roundJPanel2;
    private QuanLyThuCung.Swing.RoundJPanel roundJPanel25;
    private QuanLyThuCung.Swing.RoundJPanel roundJPanel3;
    private QuanLyThuCung.Swing.RoundJPanel roundJPanel4;
    private QuanLyThuCung.Swing.RoundJPanel roundJPanel5;
    private QuanLyThuCung.Swing.CustomTable tbDichVu;
    private QuanLyThuCung.Swing.PlaceholderText txtLoaiPet;
    private QuanLyThuCung.Swing.PlaceholderText txtMaKH;
    private QuanLyThuCung.Swing.PlaceholderText txtSoPhieuGui;
    private QuanLyThuCung.Swing.PlaceholderText txtTenPet;
    private QuanLyThuCung.Swing.PlaceholderText txtTienDichVu;
    private QuanLyThuCung.Swing.PlaceholderText txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
