package QuanLyThuCung.GUI;


import SQL.DataAccess;
import java.sql.Connection;
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


public class ThuCungForm extends javax.swing.JInternalFrame {

    private DataAccess dataAccess;
    private PreparedStatement pst;
    private Connection con;

    public ThuCungForm() {
        initComponents();
        setOpaque(false);
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        
        dataAccess = new DataAccess();
        
        DefaultTableModel model = (DefaultTableModel) tbThuCung.getModel();
        String tieude[] = {"Mã danh mục", "Loại", "Tên", "Khối lượng", "Giới tính", "Nguồn gốc", "Số lượng", "Giá"};
        model.setColumnIdentifiers(tieude);
        tbThuCung.setModel(model);
        
        
        
        dataAccess.fetchThuCung(model);
        dataAccess.closeConnection();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        roundJPanel1 = new QuanLyThuCung.Swing.RoundJPanel();
        txtLoaiThuCung = new QuanLyThuCung.Swing.PlaceholderText();
        roundJPanel4 = new QuanLyThuCung.Swing.RoundJPanel();
        txtTenTC = new QuanLyThuCung.Swing.PlaceholderText();
        roundJPanel5 = new QuanLyThuCung.Swing.RoundJPanel();
        txtNguonGoc = new QuanLyThuCung.Swing.PlaceholderText();
        BtXoaTC = new QuanLyThuCung.Swing.RoundJButton2();
        BtSuaTC = new QuanLyThuCung.Swing.RoundJButton2();
        roundJPanel6 = new QuanLyThuCung.Swing.RoundJPanel();
        txtCanNang = new QuanLyThuCung.Swing.PlaceholderText();
        roundJPanel8 = new QuanLyThuCung.Swing.RoundJPanel();
        txtSoLuong = new QuanLyThuCung.Swing.PlaceholderText();
        roundJPanel3 = new QuanLyThuCung.Swing.RoundJPanel();
        txtGia = new QuanLyThuCung.Swing.PlaceholderText();
        BtThemTC = new QuanLyThuCung.Swing.RoundJButton2();
        cbGioiTinh = new javax.swing.JComboBox<>();
        roundJPanel7 = new QuanLyThuCung.Swing.RoundJPanel();
        txtMaTC = new QuanLyThuCung.Swing.PlaceholderText();
        BtClear = new QuanLyThuCung.Swing.RoundJButton2();
        roundJPanel25 = new QuanLyThuCung.Swing.RoundJPanel();
        placeholderText9 = new QuanLyThuCung.Swing.PlaceholderText();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbThuCung = new QuanLyThuCung.Swing.CustomTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1100, 680));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtLoaiThuCung.setPlaceholder("Loại thú cưng");

        javax.swing.GroupLayout roundJPanel1Layout = new javax.swing.GroupLayout(roundJPanel1);
        roundJPanel1.setLayout(roundJPanel1Layout);
        roundJPanel1Layout.setHorizontalGroup(
            roundJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundJPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtLoaiThuCung, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundJPanel1Layout.setVerticalGroup(
            roundJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtLoaiThuCung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        txtTenTC.setPlaceholder("Tên thú cưng");

        javax.swing.GroupLayout roundJPanel4Layout = new javax.swing.GroupLayout(roundJPanel4);
        roundJPanel4.setLayout(roundJPanel4Layout);
        roundJPanel4Layout.setHorizontalGroup(
            roundJPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTenTC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundJPanel4Layout.setVerticalGroup(
            roundJPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtTenTC, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        txtNguonGoc.setPlaceholder("Nguồn gốc");

        javax.swing.GroupLayout roundJPanel5Layout = new javax.swing.GroupLayout(roundJPanel5);
        roundJPanel5.setLayout(roundJPanel5Layout);
        roundJPanel5Layout.setHorizontalGroup(
            roundJPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundJPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNguonGoc, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundJPanel5Layout.setVerticalGroup(
            roundJPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtNguonGoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        BtXoaTC.setText("Xóa");
        BtXoaTC.setRadius(40);
        BtXoaTC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtXoaTCActionPerformed(evt);
            }
        });

        BtSuaTC.setText("Sửa");
        BtSuaTC.setRadius(40);
        BtSuaTC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSuaTCActionPerformed(evt);
            }
        });

        txtCanNang.setPlaceholder("Cân nặng");

        javax.swing.GroupLayout roundJPanel6Layout = new javax.swing.GroupLayout(roundJPanel6);
        roundJPanel6.setLayout(roundJPanel6Layout);
        roundJPanel6Layout.setHorizontalGroup(
            roundJPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCanNang, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundJPanel6Layout.setVerticalGroup(
            roundJPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtCanNang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        txtSoLuong.setPlaceholder("Số lượng");

        javax.swing.GroupLayout roundJPanel8Layout = new javax.swing.GroupLayout(roundJPanel8);
        roundJPanel8.setLayout(roundJPanel8Layout);
        roundJPanel8Layout.setHorizontalGroup(
            roundJPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundJPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSoLuong, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundJPanel8Layout.setVerticalGroup(
            roundJPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        txtGia.setPlaceholder("Giá");

        javax.swing.GroupLayout roundJPanel3Layout = new javax.swing.GroupLayout(roundJPanel3);
        roundJPanel3.setLayout(roundJPanel3Layout);
        roundJPanel3Layout.setHorizontalGroup(
            roundJPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundJPanel3Layout.setVerticalGroup(
            roundJPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        BtThemTC.setText("Thêm");
        BtThemTC.setRadius(40);
        BtThemTC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtThemTCActionPerformed(evt);
            }
        });

        cbGioiTinh.setOpaque(false);
        cbGioiTinh.setBackground(new java.awt.Color(225, 237, 232));
        cbGioiTinh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbGioiTinh.setForeground(new java.awt.Color(5, 69, 89, 68));
        cbGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn giới tính", "Đực", "Cái" }));
        cbGioiTinh.setBorder(null);

        txtMaTC.setPlaceholder("Mã thú cưng");

        javax.swing.GroupLayout roundJPanel7Layout = new javax.swing.GroupLayout(roundJPanel7);
        roundJPanel7.setLayout(roundJPanel7Layout);
        roundJPanel7Layout.setHorizontalGroup(
            roundJPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtMaTC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundJPanel7Layout.setVerticalGroup(
            roundJPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtMaTC, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roundJPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbGioiTinh, 0, 171, Short.MAX_VALUE)
                            .addComponent(roundJPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(roundJPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(roundJPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(91, 91, 91)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(roundJPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(roundJPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(roundJPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BtThemTC, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtXoaTC, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(BtSuaTC, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtClear, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(roundJPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(roundJPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(16, 16, 16))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(roundJPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(roundJPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(roundJPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(roundJPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(cbGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roundJPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtXoaTC, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtSuaTC, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtThemTC, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtClear, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8))
        );

        placeholderText9.setPlaceholder("Tìm kiếm");
        placeholderText9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                placeholderText9KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout roundJPanel25Layout = new javax.swing.GroupLayout(roundJPanel25);
        roundJPanel25.setLayout(roundJPanel25Layout);
        roundJPanel25Layout.setHorizontalGroup(
            roundJPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(placeholderText9, javax.swing.GroupLayout.DEFAULT_SIZE, 944, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundJPanel25Layout.setVerticalGroup(
            roundJPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel25Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(placeholderText9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tbThuCung.fixTable(jScrollPane3);
        tbThuCung.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã thú cưng", "Tên thú cưng", "Loại thú cưng", "Khối lượng", "Giới tính", "Nguồn gốc", "Số lượng", "Giá"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbThuCung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbThuCungMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbThuCung);

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
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbThuCungMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbThuCungMouseClicked
        DefaultTableModel tblModel = (DefaultTableModel) tbThuCung.getModel();
        
        int indexTB = tbThuCung.getSelectedRow();
        
        if(indexTB < tbThuCung.getRowCount() && indexTB >=0 ){
            txtMaTC.setText(tbThuCung.getValueAt(indexTB, 0).toString());
            txtTenTC.setText(tbThuCung.getValueAt(indexTB, 1).toString());
            txtLoaiThuCung.setText(tbThuCung.getValueAt(indexTB, 2).toString());
            txtCanNang.setText(tbThuCung.getValueAt(indexTB, 3).toString());
            cbGioiTinh.setSelectedItem(tbThuCung.getValueAt(indexTB, 4).toString());
            txtNguonGoc.setText(tbThuCung.getValueAt(indexTB, 5).toString());
            txtSoLuong.setText(tbThuCung.getValueAt(indexTB, 6).toString());
            txtGia.setText(tbThuCung.getValueAt(indexTB, 6).toString());
        }
    }//GEN-LAST:event_tbThuCungMouseClicked

    private void BtThemTCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtThemTCActionPerformed
        DataAccess data = new DataAccess();
        DefaultTableModel model = (DefaultTableModel) tbThuCung.getModel();
            
        try {
            String ma = txtMaTC.getText();
            String ten  = txtTenTC.getText();
            String loai = txtLoaiThuCung.getText();
            String kl = txtCanNang.getText();
            String gioiTinh = cbGioiTinh.getSelectedItem().toString();
            String ng = txtNguonGoc.getText();
            String sl = txtSoLuong.getText();
            String gia = txtGia.getText();
                    
            pst = data.getConnection().prepareStatement("INSERT INTO DANHMUC (MADM, TEN, LOAI, KL, GT, NG_GOC, SL, GIA) VALUES (?,?,?,?,?,?,?,?)");
            
            pst.setString(1, ma);
            pst.setString(2, ten);
            pst.setString(3, loai);
            pst.setString(4, kl);
            pst.setString(5, gioiTinh);
            pst.setString(6, ng);
            pst.setString(7, sl);
            pst.setString(8, gia);
            //pst.executeUpdate();
            int k = pst.executeUpdate();
            if(k==1){
                JOptionPane.showMessageDialog(this, "Đã thêm mới vào cơ sở dữ liệu");
                txtMaTC.setText("");
                txtTenTC.setText("");
                txtLoaiThuCung.setText("");
                txtCanNang.setText("");
                cbGioiTinh.setSelectedItem("Chọn giới tính");
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
        data.fetchThuCung(model);
        data.closeConnection();
    }//GEN-LAST:event_BtThemTCActionPerformed

    private void BtSuaTCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSuaTCActionPerformed
        DefaultTableModel model = (DefaultTableModel) tbThuCung.getModel();
        DataAccess a = new DataAccess();

        String sql = "UPDATE DANHMUC SET TEN = ?, LOAI = ?, KL = ?, GT = ?, NG_GOC = ?, SL = ?, GIA = ? WHERE MADM = ? ";
        
        int index = tbThuCung.getSelectedRow();
        SimpleDateFormat oracleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        
        try {
            PreparedStatement pst = a.getConnection().prepareStatement(sql);
            pst.setString(1, txtTenTC.getText());
            pst.setString(2, txtLoaiThuCung.getText());
            pst.setString(3, txtCanNang.getText());
            pst.setString(4, cbGioiTinh.getSelectedItem().toString());
            pst.setString(5, txtNguonGoc.getText());
            pst.setString(6, txtSoLuong.getText());
            pst.setInt(7, Integer.parseInt(txtGia.getText()));
            pst.setString(8, txtMaTC.getText());
//            pst.executeUpdate();
            int k = pst.executeUpdate();
            if(k==1){
                JOptionPane.showMessageDialog(this, "Đã sửa thành công");
                
                a.fetchThuCung(model);
                
                tbThuCung.setModel(model);
        
                txtMaTC.setText("");
                txtTenTC.setText("");
                txtLoaiThuCung.setText("");
                txtCanNang.setText("");
                cbGioiTinh.setSelectedItem("Chọn giới tính");
                txtNguonGoc.setText("");
                txtSoLuong.setText("");
                txtGia.setText("");
            }
//            if (index < tbThuCung.getRowCount() && index >= 0) {
//                model.setValueAt(txtMaTC.getText(), index, 1);
//                model.setValueAt(txtTenTC.getText(), index, 2);
//                model.setValueAt(txtLoaiThuCung.getText(), index, 3);
//                model.setValueAt(txtCanNang.getText(), index, 4);
//                model.setValueAt(cbGioiTinh.getSelectedItem(), index, 5);
//                model.setValueAt(txtNguonGoc.getText(), index, 6);
//                model.setValueAt(txtSoLuong.getText(), index, 7);
//                model.setValueAt(txtGia.getText(), index, 8);
//            }
            
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        tbThuCung.setModel(model);
        
        a.closeConnection();
    }//GEN-LAST:event_BtSuaTCActionPerformed

    private void BtClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtClearActionPerformed
        txtMaTC.setText("");
        txtTenTC.setText("");
        txtLoaiThuCung.setText("");
        txtCanNang.setText("");
        cbGioiTinh.setSelectedItem("Chọn giới tính");
        txtNguonGoc.setText("");
        txtSoLuong.setText("");
        txtGia.setText("");
    }//GEN-LAST:event_BtClearActionPerformed

    private void BtXoaTCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtXoaTCActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tbThuCung.getModel();
        int indexTB = tbThuCung.getSelectedRow();
        
        DataAccess a = new DataAccess();
        
        
        int ret = JOptionPane.showConfirmDialog(null,"Bạn đã chắc chắn xóa chưa", "Chắn chắn chưa", JOptionPane.YES_NO_OPTION);
        if (ret == JOptionPane.YES_OPTION){
            if(indexTB < model.getRowCount() && indexTB >= 0)
                 model.removeRow(indexTB);
            String sql = "DELETE FROM DANHMUC WHERE MADM = ?";
            try {
                PreparedStatement pst = a.getConnection().prepareStatement(sql);
                pst.setString(1, txtMaTC.getText());
                pst.executeUpdate();
                a.fetchThuCung(model);
                a.closeConnection();
            } catch (SQLException ex) {
                Logger.getLogger(SanPhamForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            txtMaTC.setText("");
            txtLoaiThuCung.setText("");
            txtTenTC.setText("");

            txtCanNang.setText("");
            txtNguonGoc.setText("");
            cbGioiTinh.setSelectedItem("Chọn giới tính");
            txtSoLuong.setText("");
            txtGia.setText("");
        }
        
        
        a.closeConnection();
    }//GEN-LAST:event_BtXoaTCActionPerformed

    public void search(String str) {
        DefaultTableModel model = (DefaultTableModel) tbThuCung.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        tbThuCung.setRowSorter(trs);

        // Chuyển đổi chuỗi tìm kiếm và dữ liệu trong bảng thành chữ thường
        String lowercaseSearchString = str.toLowerCase();
        trs.setRowFilter(RowFilter.regexFilter("(?i)" + lowercaseSearchString));
    }
    
    private void placeholderText9KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_placeholderText9KeyReleased
        // TODO add your handling code here:
        String searchString = placeholderText9.getText();
        search(searchString);
    }//GEN-LAST:event_placeholderText9KeyReleased

    

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private QuanLyThuCung.Swing.RoundJButton2 BtClear;
    private QuanLyThuCung.Swing.RoundJButton2 BtSuaTC;
    private QuanLyThuCung.Swing.RoundJButton2 BtThemTC;
    private QuanLyThuCung.Swing.RoundJButton2 BtXoaTC;
    private javax.swing.JComboBox<String> cbGioiTinh;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private QuanLyThuCung.Swing.PlaceholderText placeholderText9;
    private QuanLyThuCung.Swing.RoundJPanel roundJPanel1;
    private QuanLyThuCung.Swing.RoundJPanel roundJPanel25;
    private QuanLyThuCung.Swing.RoundJPanel roundJPanel3;
    private QuanLyThuCung.Swing.RoundJPanel roundJPanel4;
    private QuanLyThuCung.Swing.RoundJPanel roundJPanel5;
    private QuanLyThuCung.Swing.RoundJPanel roundJPanel6;
    private QuanLyThuCung.Swing.RoundJPanel roundJPanel7;
    private QuanLyThuCung.Swing.RoundJPanel roundJPanel8;
    private QuanLyThuCung.Swing.CustomTable tbThuCung;
    private QuanLyThuCung.Swing.PlaceholderText txtCanNang;
    private QuanLyThuCung.Swing.PlaceholderText txtGia;
    private QuanLyThuCung.Swing.PlaceholderText txtLoaiThuCung;
    private QuanLyThuCung.Swing.PlaceholderText txtMaTC;
    private QuanLyThuCung.Swing.PlaceholderText txtNguonGoc;
    private QuanLyThuCung.Swing.PlaceholderText txtSoLuong;
    private QuanLyThuCung.Swing.PlaceholderText txtTenTC;
    // End of variables declaration//GEN-END:variables
}
