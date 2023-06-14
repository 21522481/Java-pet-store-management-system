package QuanLyThuCung.GUI;

import java.text.SimpleDateFormat;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class NhanVienForm extends javax.swing.JInternalFrame {

    SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd    HH:mm:ss");
    
    public NhanVienForm() {
        initComponents();
        setOpaque(false);
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        
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

        BtLuuNV.setText("Lưu");
        BtLuuNV.setRadius(40);

        BtXoaNV.setText("Xóa");
        BtXoaNV.setRadius(40);

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
