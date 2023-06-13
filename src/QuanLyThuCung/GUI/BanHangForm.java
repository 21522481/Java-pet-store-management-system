package QuanLyThuCung.GUI;

import QuanLyThuCung.Swing.RoundJPanel;
import SQL.DataAccess;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.DefaultCellEditor;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.RowFilter;
import javax.swing.table.TableColumn;
import javax.swing.table.TableRowSorter;

public class BanHangForm extends javax.swing.JInternalFrame {
    private DataAccess dataAccess;
    private DefaultTableModel gioHangModel;
    
    public BanHangForm() {
        initComponents();
        setOpaque(false);
        
        dataAccess = new DataAccess();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        
        gioHangModel = (DefaultTableModel) tbGioHang.getModel();
        
        DefaultTableModel model = (DefaultTableModel) tbSanPham.getModel();
        dataAccess.fetchDANHMUC(model);
        dataAccess.closeConnection();
    }
    //hàm tính tổng cộng giá tiền
    private void calculateTotal() {
        double total = 0;
        for (int i = 0; i < gioHangModel.getRowCount(); i++) {
            double thanhTien = Double.parseDouble(gioHangModel.getValueAt(i, 4).toString());
            total += thanhTien;
        }
        lbTongCong.setText(String.valueOf(total));
    }
    //Hàm xóa 1 dòng
    private void deleteSelectedRow() {
    int selectedRow = tbGioHang.getSelectedRow();
    if (selectedRow >= 0) {
        gioHangModel.removeRow(selectedRow);
        calculateTotal();
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new RoundJPanel();
        placeholderText1 = new QuanLyThuCung.Swing.PlaceholderText();
        btXuatHD = new QuanLyThuCung.Swing.RoundJButton2();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbSanPham = new QuanLyThuCung.Swing.CustomTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbGioHang = new QuanLyThuCung.Swing.CustomTable();
        jLabel3 = new javax.swing.JLabel();
        lbTongCong = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1100, 680));

        jDesktopPane1.setOpaque(false);
        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setPreferredSize(new java.awt.Dimension(0, 680));

        placeholderText1.setPlaceholder("Tìm kiếm");
        placeholderText1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                placeholderText1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(placeholderText1, javax.swing.GroupLayout.DEFAULT_SIZE, 1040, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(placeholderText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btXuatHD.setText("Xuất");
        btXuatHD.setRadius(45);
        btXuatHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXuatHDActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(5, 69, 89, 68));
        jLabel1.setText("Danh sách sản phẩm");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(5, 69, 89, 68));
        jLabel2.setText("Giỏ hàng");

        tbSanPham.fixTable(jScrollPane3);
        tbSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã danh mục", "Loại", "Tên", "Ngày sản xuất", "Hạn sử dụng", "Khối lượng", "Giới tính", "Nguồn gốc", "Số lượng", "Giá"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbSanPhamMouseClicked(evt);
            }
        });
        tbSanPham.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                tbSanPhamComponentShown(evt);
            }
        });
        jScrollPane3.setViewportView(tbSanPham);

        tbGioHang.fixTable(jScrollPane4);
        tbGioHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Đơn giá", "Số lượng", "Thành tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        // Tạo comboBox cho cột số lượng
        TableColumn quantityColumn = tbGioHang.getColumnModel().getColumn(3);
        JComboBox<Integer> quantityComboBox = new JComboBox<>();
        for (int i = 1; i <= 10; i++) {
            quantityComboBox.addItem(i);
        }
        quantityComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Xử lý sự kiện khi số lượng được chọn
                int selectedQuantity = (int) quantityComboBox.getSelectedItem();
                // Thực hiện hành động của bạn ở đây
                // Ví dụ: Cập nhật dữ liệu trong bảng theo số lượng được chọn
                int selectedRow=tbGioHang.getSelectedRow();
                String StrGiaban = tbGioHang.getValueAt(selectedRow, 2).toString();

                int Giaban= Integer.parseInt(StrGiaban);

                String ThanhTien= String.valueOf(selectedQuantity*Giaban);

                DefaultTableModel gioHangModel = (DefaultTableModel) tbGioHang.getModel();
                gioHangModel.setValueAt(ThanhTien, selectedRow, 4);
                // Tính tổng các thành tiền sau khi cập nhật
                calculateTotal();
            }
        });
        quantityColumn.setCellEditor(new DefaultCellEditor(quantityComboBox));
        tbGioHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbGioHangMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tbGioHang);
        if (tbGioHang.getColumnModel().getColumnCount() > 0) {
            tbGioHang.getColumnModel().getColumn(0).setHeaderValue("Mã sản phẩm");
            tbGioHang.getColumnModel().getColumn(1).setHeaderValue("Tên sản phẩm");
            tbGioHang.getColumnModel().getColumn(2).setHeaderValue("Đơn giá");
            tbGioHang.getColumnModel().getColumn(3).setHeaderValue("Số lượng");
            tbGioHang.getColumnModel().getColumn(4).setHeaderValue("Thành tiền");
        }
        tbGioHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbGioHangMouseClicked(evt);
            }
        });

        tbGioHang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                int keyCode = evt.getKeyCode();
                if (keyCode == KeyEvent.VK_DELETE || keyCode == KeyEvent.VK_BACK_SPACE) {
                    deleteSelectedRow();
                }
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Tổng cộng:");

        lbTongCong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbTongCong.setText("0");

        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btXuatHD, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lbTongCong, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbTongCong, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btXuatHD, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane3))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btXuatHD, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbTongCong, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1097, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btXuatHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXuatHDActionPerformed
        new XuatHoaDonForm();
    }//GEN-LAST:event_btXuatHDActionPerformed

    private void tbSanPhamComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tbSanPhamComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_tbSanPhamComponentShown
    
    private void tbSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbSanPhamMouseClicked
        // TODO add your handling code here:
        int selectedRow = tbSanPham.getSelectedRow();
            if (selectedRow >= 0) {
                // Lấy thông tin từ dòng đã chọn trong bảng tbSanPham
                String maSanPham = tbSanPham.getValueAt(selectedRow, 0).toString();
                String tenSanPham = tbSanPham.getValueAt(selectedRow, 2).toString();
                String StrGiaban = tbSanPham.getValueAt(selectedRow, 9).toString();
              
              
                //Chuyển StrGiaBan sang số nguyên
              //  int Giaban=Integer.parseInt(StrGiaban);
                
                //Tính toán thành tiền= số lượng * giá bán
                String ThanhTien = StrGiaban;
                
                
                // Thêm thông tin vào bảng tbGioHang
                // Kiểm tra xem sản phẩm đã có trong giỏ hàng chưa
            boolean exists = false;
            for (int i = 0; i < gioHangModel.getRowCount(); i++) {
                String maSP = gioHangModel.getValueAt(i, 0).toString();
                if (maSP.equals(maSanPham)) {
                    exists = true;
                    break;
                }
            }
            
            if (!exists) {
                gioHangModel.addRow(new Object[]{maSanPham, tenSanPham, StrGiaban, 1, ThanhTien});
                //Cập nhật lại tổng cộng
                calculateTotal();     
            }
            }
    }//GEN-LAST:event_tbSanPhamMouseClicked

    private void tbGioHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbGioHangMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbGioHangMouseClicked
    
    public void search(String str){
        DefaultTableModel model = (DefaultTableModel)tbSanPham.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        tbSanPham.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
    }
    
    private void placeholderText1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_placeholderText1KeyReleased
        // TODO add your handling code here:
        String searchString = placeholderText1.getText();
        search(searchString);
    }//GEN-LAST:event_placeholderText1KeyReleased

    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private QuanLyThuCung.Swing.RoundJButton2 btXuatHD;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lbTongCong;
    private QuanLyThuCung.Swing.PlaceholderText placeholderText1;
    private QuanLyThuCung.Swing.CustomTable tbGioHang;
    private QuanLyThuCung.Swing.CustomTable tbSanPham;
    // End of variables declaration//GEN-END:variables
}
