package QuanLyThuCung.GUI;

import SQL.DataAccess;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowFilter;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class HoaDonForm extends javax.swing.JInternalFrame {


    public HoaDonForm() {
        DataAccess a = new DataAccess();
        connection = a.getConnection();
        initComponents();
        setOpaque(false);
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        
        DefaultTableModel model = (DefaultTableModel)customTable1.getModel();
        a.fetchBill(model);
        a.closeConnection();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        BtTimKiemHD = new QuanLyThuCung.Swing.RoundJButton2();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        customTable1 = new QuanLyThuCung.Swing.CustomTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        customTable3 = new QuanLyThuCung.Swing.CustomTable();
        roundJPanel1 = new QuanLyThuCung.Swing.RoundJPanel();
        txtTimKiem = new QuanLyThuCung.Swing.PlaceholderText();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1100, 680));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(5, 69, 89, 68));
        jLabel7.setText("Thông tin hóa đơn");

        BtTimKiemHD.setText("Tìm kiếm");
        BtTimKiemHD.setRadius(45);
        BtTimKiemHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtTimKiemHDActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(5, 69, 89, 68));
        jLabel8.setText("Chi tiết hóa đơn");

        customTable1.fixTable(jScrollPane3);
        customTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SOHD", "Ngày", "Phương thức thanh toán", "Giảm giá", "Trị Giá", "Tổng cộng", "Mã NV"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        customTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customTable1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(customTable1);

        customTable3.fixTable(jScrollPane1);
        customTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SP", "Tên SP", "SL", "Đơn giá", "Thành tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(customTable3);

        txtTimKiem.setPlaceholder("Tìm kiếm");
        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout roundJPanel1Layout = new javax.swing.GroupLayout(roundJPanel1);
        roundJPanel1.setLayout(roundJPanel1Layout);
        roundJPanel1Layout.setHorizontalGroup(
            roundJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundJPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        roundJPanel1Layout.setVerticalGroup(
            roundJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel7))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(roundJPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtTimKiemHD, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(216, 216, 216))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(roundJPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BtTimKiemHD, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtTimKiemHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtTimKiemHDActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_BtTimKiemHDActionPerformed

    private PreparedStatement pst;
    private ResultSet rs;
    Connection connection;
    
    private void customTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customTable1MouseClicked
        // TODO add your handling code here:
//        txtTimKiem.setText("");
        
        DataAccess a = new DataAccess();
        connection = a.getConnection();
        
        DefaultTableModel model = (DefaultTableModel)customTable1.getModel();
        DefaultTableModel modelCTHD = (DefaultTableModel)customTable3.getModel();
        
        modelCTHD.setRowCount(0);
        
        int index = customTable1.getSelectedRow();
        String SOHD;
        String sql = "SELECT ID, TEN, CTHD.SL, GIA, THANHTIEN FROM CTHD JOIN DANHMUC DM ON CTHD.ID = DM.MADM WHERE SOHD = ?";
        
        if(index < customTable1.getRowCount() && index >=0 ){
            SOHD = customTable1.getValueAt(index, 0).toString();
            
            try {
                int parsedSOHD = Integer.parseInt(SOHD);
                pst = connection.prepareStatement(sql);
                pst.setInt(1, parsedSOHD);
                
                rs = pst.executeQuery();
                String row[] = new String[5];
                
                while(rs.next()){
                    row[0] = rs.getString(1);
                    row[1] = rs.getString(2);
                    row[2] = rs.getString(3);
                    row[3] = rs.getString(4);
                    row[4] = rs.getString(5);
                    
                    modelCTHD.addRow(row);
                }
                a.closeConnection();
            } catch (SQLException ex) {
                Logger.getLogger(HoaDonForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        
        
    }//GEN-LAST:event_customTable1MouseClicked

    public void search(String str) {
        DefaultTableModel model = (DefaultTableModel) customTable1.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        customTable1.setRowSorter(trs);

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
    private QuanLyThuCung.Swing.RoundJButton2 BtTimKiemHD;
    private QuanLyThuCung.Swing.CustomTable customTable1;
    private QuanLyThuCung.Swing.CustomTable customTable3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private QuanLyThuCung.Swing.RoundJPanel roundJPanel1;
    private QuanLyThuCung.Swing.PlaceholderText txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
