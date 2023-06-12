package QuanLyThuCung.GUI;

import QuanLyThuCung.Swing.TableActionEvent;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;


public class ThuCungForm extends javax.swing.JInternalFrame {


    public ThuCungForm() {
        initComponents();
        setOpaque(false);
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        
        TableActionEvent event = new TableActionEvent() {
            @Override
            public void onAdd(int row) {}
            
            @Override
            public void onEdit(int row) {}

            @Override
            public void onDelete(int row) {
                if (tbGuiThu.isEditing()) {
                    tbGuiThu.getCellEditor().stopCellEditing();
                }
                DefaultTableModel model = (DefaultTableModel) tbGuiThu.getModel();
                model.removeRow(row);
            }
        };
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        roundJPanel1 = new QuanLyThuCung.Swing.RoundJPanel();
        txtGiong = new QuanLyThuCung.Swing.PlaceholderText();
        roundJPanel2 = new QuanLyThuCung.Swing.RoundJPanel();
        txtGioTinh = new QuanLyThuCung.Swing.PlaceholderText();
        roundJPanel4 = new QuanLyThuCung.Swing.RoundJPanel();
        txtLoaiThuCung = new QuanLyThuCung.Swing.PlaceholderText();
        roundJPanel5 = new QuanLyThuCung.Swing.RoundJPanel();
        txtNguonGoc = new QuanLyThuCung.Swing.PlaceholderText();
        BtThemGui = new QuanLyThuCung.Swing.RoundJButton2();
        BtSuaGui = new QuanLyThuCung.Swing.RoundJButton2();
        roundJPanel6 = new QuanLyThuCung.Swing.RoundJPanel();
        txtCanNang = new QuanLyThuCung.Swing.PlaceholderText();
        roundJPanel8 = new QuanLyThuCung.Swing.RoundJPanel();
        txtSoLuong = new QuanLyThuCung.Swing.PlaceholderText();
        roundJPanel3 = new QuanLyThuCung.Swing.RoundJPanel();
        txtGia = new QuanLyThuCung.Swing.PlaceholderText();
        roundJPanel25 = new QuanLyThuCung.Swing.RoundJPanel();
        placeholderText9 = new QuanLyThuCung.Swing.PlaceholderText();
        BtTimKiemGui = new QuanLyThuCung.Swing.RoundJButton1();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbGuiThu = new QuanLyThuCung.Swing.CustomTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1100, 680));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtGiong.setPlaceholder("Giống loài");

        javax.swing.GroupLayout roundJPanel1Layout = new javax.swing.GroupLayout(roundJPanel1);
        roundJPanel1.setLayout(roundJPanel1Layout);
        roundJPanel1Layout.setHorizontalGroup(
            roundJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundJPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtGiong, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundJPanel1Layout.setVerticalGroup(
            roundJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtGiong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        txtGioTinh.setPlaceholder("Giới tính");

        javax.swing.GroupLayout roundJPanel2Layout = new javax.swing.GroupLayout(roundJPanel2);
        roundJPanel2.setLayout(roundJPanel2Layout);
        roundJPanel2Layout.setHorizontalGroup(
            roundJPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtGioTinh, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundJPanel2Layout.setVerticalGroup(
            roundJPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtGioTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        txtLoaiThuCung.setPlaceholder("Loại thú cưng");

        javax.swing.GroupLayout roundJPanel4Layout = new javax.swing.GroupLayout(roundJPanel4);
        roundJPanel4.setLayout(roundJPanel4Layout);
        roundJPanel4Layout.setHorizontalGroup(
            roundJPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtLoaiThuCung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundJPanel4Layout.setVerticalGroup(
            roundJPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtLoaiThuCung, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        BtThemGui.setText("Thêm");
        BtThemGui.setRadius(40);

        BtSuaGui.setText("Sửa");
        BtSuaGui.setRadius(40);

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(roundJPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(roundJPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(roundJPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(roundJPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(93, 93, 93)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(BtThemGui, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtSuaGui, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(roundJPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(roundJPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(roundJPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(313, 313, 313))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(roundJPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundJPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(roundJPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundJPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundJPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundJPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roundJPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtThemGui, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtSuaGui, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        placeholderText9.setPlaceholder("Tìm kiếm");

        javax.swing.GroupLayout roundJPanel25Layout = new javax.swing.GroupLayout(roundJPanel25);
        roundJPanel25.setLayout(roundJPanel25Layout);
        roundJPanel25Layout.setHorizontalGroup(
            roundJPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(placeholderText9, javax.swing.GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundJPanel25Layout.setVerticalGroup(
            roundJPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel25Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(placeholderText9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        BtTimKiemGui.setText("Tìm kiếm");
        BtTimKiemGui.setRadius(45);

        tbGuiThu.fixTable(jScrollPane3);
        tbGuiThu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Chức năng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tbGuiThu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(roundJPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BtTimKiemGui, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1045, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 49, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtTimKiemGui, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roundJPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private QuanLyThuCung.Swing.RoundJButton2 BtSuaGui;
    private QuanLyThuCung.Swing.RoundJButton2 BtThemGui;
    private QuanLyThuCung.Swing.RoundJButton1 BtTimKiemGui;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private QuanLyThuCung.Swing.PlaceholderText placeholderText9;
    private QuanLyThuCung.Swing.RoundJPanel roundJPanel1;
    private QuanLyThuCung.Swing.RoundJPanel roundJPanel2;
    private QuanLyThuCung.Swing.RoundJPanel roundJPanel25;
    private QuanLyThuCung.Swing.RoundJPanel roundJPanel3;
    private QuanLyThuCung.Swing.RoundJPanel roundJPanel4;
    private QuanLyThuCung.Swing.RoundJPanel roundJPanel5;
    private QuanLyThuCung.Swing.RoundJPanel roundJPanel6;
    private QuanLyThuCung.Swing.RoundJPanel roundJPanel8;
    private QuanLyThuCung.Swing.CustomTable tbGuiThu;
    private QuanLyThuCung.Swing.PlaceholderText txtCanNang;
    private QuanLyThuCung.Swing.PlaceholderText txtGia;
    private QuanLyThuCung.Swing.PlaceholderText txtGioTinh;
    private QuanLyThuCung.Swing.PlaceholderText txtGiong;
    private QuanLyThuCung.Swing.PlaceholderText txtLoaiThuCung;
    private QuanLyThuCung.Swing.PlaceholderText txtNguonGoc;
    private QuanLyThuCung.Swing.PlaceholderText txtSoLuong;
    // End of variables declaration//GEN-END:variables
}
