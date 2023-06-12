package QuanLyThuCung.GUI;

import SQL.DataAccess;
import com.sun.jdi.connect.spi.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class SanPhamForm extends javax.swing.JInternalFrame {

    private DataAccess dataAccess;
    
    public SanPhamForm() {
        initComponents();
        
        dataAccess = new DataAccess();
        setOpaque(false);
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);      
        
        DefaultTableModel model = (DefaultTableModel) tbSanPham.getModel();
//        dataAccess.fetchProduct(model);
//        dataAccess.closeConnection();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        roundJPanel1 = new QuanLyThuCung.Swing.RoundJPanel();
        txtLoaiSP = new QuanLyThuCung.Swing.PlaceholderText();
        roundJPanel2 = new QuanLyThuCung.Swing.RoundJPanel();
        dcNSX = new com.toedter.calendar.JDateChooser();
        roundJPanel3 = new QuanLyThuCung.Swing.RoundJPanel();
        txtNguonGoc = new QuanLyThuCung.Swing.PlaceholderText();
        roundJPanel4 = new QuanLyThuCung.Swing.RoundJPanel();
        txtTenSP = new QuanLyThuCung.Swing.PlaceholderText();
        roundJPanel5 = new QuanLyThuCung.Swing.RoundJPanel();
        txtTrongLuong = new QuanLyThuCung.Swing.PlaceholderText();
        roundJPanel6 = new QuanLyThuCung.Swing.RoundJPanel();
        txtGia = new QuanLyThuCung.Swing.PlaceholderText();
        BtThemSP = new QuanLyThuCung.Swing.RoundJButton2();
        BtSuaSP = new QuanLyThuCung.Swing.RoundJButton2();
        roundJPanel7 = new QuanLyThuCung.Swing.RoundJPanel();
        dcHSD = new com.toedter.calendar.JDateChooser();
        roundJPanel8 = new QuanLyThuCung.Swing.RoundJPanel();
        txtSoLuong = new QuanLyThuCung.Swing.PlaceholderText();
        BtXoaSP = new QuanLyThuCung.Swing.RoundJButton2();
        roundJPanel9 = new QuanLyThuCung.Swing.RoundJPanel();
        txtMaSP = new QuanLyThuCung.Swing.PlaceholderText();
        roundJPanel25 = new QuanLyThuCung.Swing.RoundJPanel();
        placeholderText9 = new QuanLyThuCung.Swing.PlaceholderText();
        BtTimKiemSP = new QuanLyThuCung.Swing.RoundJButton1();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbSanPham = new QuanLyThuCung.Swing.CustomTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setOpaque(true);
        setPreferredSize(new java.awt.Dimension(1100, 680));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtLoaiSP.setPlaceholder("Loại sản phẩm");

        javax.swing.GroupLayout roundJPanel1Layout = new javax.swing.GroupLayout(roundJPanel1);
        roundJPanel1.setLayout(roundJPanel1Layout);
        roundJPanel1Layout.setHorizontalGroup(
            roundJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundJPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtLoaiSP, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundJPanel1Layout.setVerticalGroup(
            roundJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout roundJPanel2Layout = new javax.swing.GroupLayout(roundJPanel2);
        roundJPanel2.setLayout(roundJPanel2Layout);
        roundJPanel2Layout.setHorizontalGroup(
            roundJPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundJPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dcNSX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundJPanel2Layout.setVerticalGroup(
            roundJPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dcNSX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        txtNguonGoc.setPlaceholder("Nguồn gốc");

        javax.swing.GroupLayout roundJPanel3Layout = new javax.swing.GroupLayout(roundJPanel3);
        roundJPanel3.setLayout(roundJPanel3Layout);
        roundJPanel3Layout.setHorizontalGroup(
            roundJPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtNguonGoc, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        roundJPanel3Layout.setVerticalGroup(
            roundJPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtNguonGoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        txtTenSP.setPlaceholder("Tên sản phẩm");

        javax.swing.GroupLayout roundJPanel4Layout = new javax.swing.GroupLayout(roundJPanel4);
        roundJPanel4.setLayout(roundJPanel4Layout);
        roundJPanel4Layout.setHorizontalGroup(
            roundJPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTenSP, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundJPanel4Layout.setVerticalGroup(
            roundJPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        txtTrongLuong.setPlaceholder("Trọng lượng");

        javax.swing.GroupLayout roundJPanel5Layout = new javax.swing.GroupLayout(roundJPanel5);
        roundJPanel5.setLayout(roundJPanel5Layout);
        roundJPanel5Layout.setHorizontalGroup(
            roundJPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTrongLuong, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundJPanel5Layout.setVerticalGroup(
            roundJPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtTrongLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        txtGia.setPlaceholder("Giá");

        javax.swing.GroupLayout roundJPanel6Layout = new javax.swing.GroupLayout(roundJPanel6);
        roundJPanel6.setLayout(roundJPanel6Layout);
        roundJPanel6Layout.setHorizontalGroup(
            roundJPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtGia, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundJPanel6Layout.setVerticalGroup(
            roundJPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        BtThemSP.setText("Thêm");
        BtThemSP.setRadius(40);
        BtThemSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtThemSPActionPerformed(evt);
            }
        });

        BtSuaSP.setText("Sửa");
        BtSuaSP.setRadius(40);

        javax.swing.GroupLayout roundJPanel7Layout = new javax.swing.GroupLayout(roundJPanel7);
        roundJPanel7.setLayout(roundJPanel7Layout);
        roundJPanel7Layout.setHorizontalGroup(
            roundJPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundJPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dcHSD, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundJPanel7Layout.setVerticalGroup(
            roundJPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dcHSD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        txtSoLuong.setPlaceholder("Số lượng");

        javax.swing.GroupLayout roundJPanel8Layout = new javax.swing.GroupLayout(roundJPanel8);
        roundJPanel8.setLayout(roundJPanel8Layout);
        roundJPanel8Layout.setHorizontalGroup(
            roundJPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSoLuong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundJPanel8Layout.setVerticalGroup(
            roundJPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        BtXoaSP.setText("Xóa");
        BtXoaSP.setRadius(40);

        txtMaSP.setPlaceholder("Mã sản phẩm");

        javax.swing.GroupLayout roundJPanel9Layout = new javax.swing.GroupLayout(roundJPanel9);
        roundJPanel9.setLayout(roundJPanel9Layout);
        roundJPanel9Layout.setHorizontalGroup(
            roundJPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtMaSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundJPanel9Layout.setVerticalGroup(
            roundJPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(roundJPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundJPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundJPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(roundJPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(roundJPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(289, 289, 289)
                                    .addComponent(roundJPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(97, 97, 97)
                                    .addComponent(BtThemSP, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(BtXoaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(BtSuaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(roundJPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(192, 192, 192)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(roundJPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(roundJPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(281, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(roundJPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(roundJPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(roundJPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(roundJPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundJPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundJPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundJPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(roundJPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(roundJPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtThemSP, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtXoaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtSuaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        placeholderText9.setPlaceholder("Tìm kiếm");

        javax.swing.GroupLayout roundJPanel25Layout = new javax.swing.GroupLayout(roundJPanel25);
        roundJPanel25.setLayout(roundJPanel25Layout);
        roundJPanel25Layout.setHorizontalGroup(
            roundJPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(placeholderText9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundJPanel25Layout.setVerticalGroup(
            roundJPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel25Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(placeholderText9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        BtTimKiemSP.setText("Tìm kiếm");
        BtTimKiemSP.setRadius(45);
        BtTimKiemSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtTimKiemSPActionPerformed(evt);
            }
        });

        tbSanPham.fixTable(jScrollPane1);
        tbSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sản phẩm", "Loại sản phẩm", "Tên sản phẩm", "Ngày sản xuất", "Hạn sử dụng", "Khối lượng", "Nguồn gốc", "Số lượng", "Giá"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbSanPham);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(roundJPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(BtTimKiemSP, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1046, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 68, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtTimKiemSP, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roundJPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



    private PreparedStatement pst;
    private Connection con;
    
    private void BtThemSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtThemSPActionPerformed
            DataAccess data = new DataAccess();
            // TODO add your handling code here:
//            String row[] = new String[8];
//            row[0] = txtTenSP.getText();
//            row[1] = txtLoaiSP.getText();
//            row[2] = txtNSX.getText();
//            row[3] = txtHSD.getText();
//            row[4] = txtTrongLuong.getText();
//            row[5] = txtNguonGoc.getText();
//            row[6] = txtSoLuong.getText();
//            row[7] = txtGia.getText();
            
            DefaultTableModel model = (DefaultTableModel) tbSanPham.getModel();
            //model.addRow(row);
        try {
            String ten = txtTenSP.getText();
            String loai = txtLoaiSP.getText();
//            String nsx = txtNSX.getText();
//            String hsd = txtHSD.getText();
            String trongluong = txtTrongLuong.getText();
            String nguongoc = txtNguonGoc.getText();
            String sl = txtSoLuong.getText();
            String gia = txtGia.getText();
            
            
            pst = data.getConnection().prepareStatement("INSERT INTO DANHMUC (LOAI, TEN, NSX, HSD, KL, NG_GOC, SL, GIA) VALUES (?,?,?,?,?,?,?,?)");
            
            pst.setString(1, ten);
            pst.setString(2, loai);
//            pst.setString(3, nsx);
//            pst.setString(4, hsd);
            pst.setString(5, trongluong);
            pst.setString(6, nguongoc);
            pst.setString(7, sl);
            pst.setString(8, gia);
           
            int k = pst.executeUpdate();
            if(k==1){
                JOptionPane.showMessageDialog(this, "Đã thêm mới vào cơ sở dữ liệu");
                txtTenSP.setText("");
                txtLoaiSP.setText("");
//                txtNSX.setText("");
//                txtHSD.setText("");
                txtTrongLuong.setText("");
                txtNguonGoc.setText("");
                txtSoLuong.setText("");
                txtGia.setText("");
            }
            else{
                JOptionPane.showMessageDialog(this, "Lỗi khi thêm mới");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        data.fetchProduct(model);
            data.closeConnection();
    }//GEN-LAST:event_BtThemSPActionPerformed

    private void BtTimKiemSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtTimKiemSPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtTimKiemSPActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private QuanLyThuCung.Swing.RoundJButton2 BtSuaSP;
    private QuanLyThuCung.Swing.RoundJButton2 BtThemSP;
    private QuanLyThuCung.Swing.RoundJButton1 BtTimKiemSP;
    private QuanLyThuCung.Swing.RoundJButton2 BtXoaSP;
    private com.toedter.calendar.JDateChooser dcHSD;
    private com.toedter.calendar.JDateChooser dcNSX;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private QuanLyThuCung.Swing.PlaceholderText placeholderText9;
    private QuanLyThuCung.Swing.RoundJPanel roundJPanel1;
    private QuanLyThuCung.Swing.RoundJPanel roundJPanel2;
    private QuanLyThuCung.Swing.RoundJPanel roundJPanel25;
    private QuanLyThuCung.Swing.RoundJPanel roundJPanel3;
    private QuanLyThuCung.Swing.RoundJPanel roundJPanel4;
    private QuanLyThuCung.Swing.RoundJPanel roundJPanel5;
    private QuanLyThuCung.Swing.RoundJPanel roundJPanel6;
    private QuanLyThuCung.Swing.RoundJPanel roundJPanel7;
    private QuanLyThuCung.Swing.RoundJPanel roundJPanel8;
    private QuanLyThuCung.Swing.RoundJPanel roundJPanel9;
    private QuanLyThuCung.Swing.CustomTable tbSanPham;
    private QuanLyThuCung.Swing.PlaceholderText txtGia;
    private QuanLyThuCung.Swing.PlaceholderText txtLoaiSP;
    private QuanLyThuCung.Swing.PlaceholderText txtMaSP;
    private QuanLyThuCung.Swing.PlaceholderText txtNguonGoc;
    private QuanLyThuCung.Swing.PlaceholderText txtSoLuong;
    private QuanLyThuCung.Swing.PlaceholderText txtTenSP;
    private QuanLyThuCung.Swing.PlaceholderText txtTrongLuong;
    // End of variables declaration//GEN-END:variables
}
