package QuanLyThuCung.GUI;

import SQL.DataAccess;
import com.itextpdf.text.Paragraph;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JPanel;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Desktop;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.text.SimpleDateFormat;
import java.util.Date;



public class XuatHoaDonForm extends javax.swing.JFrame {
    private DataAccess dataAccess;
    private int total;
    private DefaultTableModel gioHangModel;
    private String idNV;
    private int SOHD;

    public XuatHoaDonForm(int total, DefaultTableModel gioHangModel, String idne) {
        initComponents();
        setTitle("Xuất hóa đơn");
        setVisible(true);
        this.total=total;
        this.gioHangModel=gioHangModel;
        this.idNV = idne;
        txtTongTien.setText(String.valueOf(total));
        tbGioHang.setModel(gioHangModel);
        
         // Đặt chế độ tự động thay đổi kích thước cột
        tbGioHang.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    
    public class PanelCircle extends JPanel { 
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setColor(new Color(129, 203, 156));
            g2d.fillOval(0, 0, 22, 22);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        roundJPanel2 = new QuanLyThuCung.Swing.RoundJPanel();
        txtTongTien = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        roundJPanel1 = new QuanLyThuCung.Swing.RoundJPanel();
        txtSDT = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btXacNhanHD = new QuanLyThuCung.Swing.RoundJButton2();
        BtInHD = new QuanLyThuCung.Swing.RoundJButton2();
        btHuyHD = new QuanLyThuCung.Swing.RoundJButton2();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new PanelCircle();
        roundJPanel3 = new QuanLyThuCung.Swing.RoundJPanel();
        txtMaGG = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        roundJPanel5 = new QuanLyThuCung.Swing.RoundJPanel();
        txtTenKH = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbGioHang = new QuanLyThuCung.Swing.CustomTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(5, 69, 89, 68));
        jLabel3.setText("Thông tin xuất hóa đơn");

        txtTongTien.setOpaque(false);
        txtTongTien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTongTien.setForeground(new java.awt.Color(5, 69, 89, 68));
        txtTongTien.setBorder(null);
        txtTongTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTongTienActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout roundJPanel2Layout = new javax.swing.GroupLayout(roundJPanel2);
        roundJPanel2.setLayout(roundJPanel2Layout);
        roundJPanel2Layout.setHorizontalGroup(
            roundJPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundJPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTongTien, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundJPanel2Layout.setVerticalGroup(
            roundJPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTongTien)
                .addContainerGap())
        );

        // Không cho phép chỉnh sửa trên trường văn bản jTextField
        txtTongTien.setEditable(false);

        // Đặt vị trí con trỏ vào vị trí không hợp lệ (ví dụ: đầu văn bản)
        txtTongTien.setCaretPosition(0);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(5, 69, 89, 68));
        jLabel2.setText("Tổng tiền");

        txtSDT.setOpaque(false);
        txtSDT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSDT.setForeground(new java.awt.Color(5, 69, 89, 68));
        txtSDT.setBorder(null);
        txtSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSDTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout roundJPanel1Layout = new javax.swing.GroupLayout(roundJPanel1);
        roundJPanel1.setLayout(roundJPanel1Layout);
        roundJPanel1Layout.setHorizontalGroup(
            roundJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundJPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSDT, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundJPanel1Layout.setVerticalGroup(
            roundJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSDT)
                .addContainerGap())
        );

        txtSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSDTActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(5, 69, 89, 68));
        jLabel1.setText("SĐT");

        btXacNhanHD.setText("Xác nhận");
        btXacNhanHD.setRadius(45);
        btXacNhanHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXacNhanHDActionPerformed(evt);
            }
        });

        BtInHD.setText("In hóa đơn");
        BtInHD.setRadius(45);
        BtInHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtInHDActionPerformed(evt);
            }
        });

        btHuyHD.setText("Hủy");
        btHuyHD.setRadius(45);
        btHuyHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHuyHDActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(148, 212, 152)));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(148, 212, 152));
        jLabel4.setText("OH MY PET");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(24, 24));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 188, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(746, 746, 746))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        txtMaGG.setOpaque(false);
        txtMaGG.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMaGG.setForeground(new java.awt.Color(5, 69, 89, 68));
        txtMaGG.setBorder(null);

        javax.swing.GroupLayout roundJPanel3Layout = new javax.swing.GroupLayout(roundJPanel3);
        roundJPanel3.setLayout(roundJPanel3Layout);
        roundJPanel3Layout.setHorizontalGroup(
            roundJPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundJPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtMaGG)
                .addContainerGap())
        );
        roundJPanel3Layout.setVerticalGroup(
            roundJPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtMaGG)
                .addContainerGap())
        );

        txtMaGG.setEditable(false);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(5, 69, 89, 68));
        jLabel5.setText("Giảm giá");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(5, 69, 89, 68));
        jLabel6.setText("Tên KH");

        txtTenKH.setOpaque(false);
        txtTenKH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTenKH.setForeground(new java.awt.Color(5, 69, 89, 68));
        txtTenKH.setBorder(null);
        txtTenKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenKHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout roundJPanel5Layout = new javax.swing.GroupLayout(roundJPanel5);
        roundJPanel5.setLayout(roundJPanel5Layout);
        roundJPanel5Layout.setHorizontalGroup(
            roundJPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundJPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTenKH)
                .addContainerGap())
        );
        roundJPanel5Layout.setVerticalGroup(
            roundJPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundJPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtTenKH.setEditable(false);

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
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbGioHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbGioHangMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tbGioHang);
        if (tbGioHang.getColumnModel().getColumnCount() > 0) {
            tbGioHang.getColumnModel().getColumn(0).setResizable(false);
            tbGioHang.getColumnModel().getColumn(1).setResizable(false);
            tbGioHang.getColumnModel().getColumn(2).setResizable(false);
            tbGioHang.getColumnModel().getColumn(3).setResizable(false);
            tbGioHang.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(roundJPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BtInHD, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btXacNhanHD, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btHuyHD, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(roundJPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(roundJPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(roundJPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(92, 92, 92)
                        .addComponent(jScrollPane4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel3)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(roundJPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roundJPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(roundJPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(roundJPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtInHD, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btXacNhanHD, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btHuyHD, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(284, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtInHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtInHDActionPerformed
        // TODO add your handling code here:
        try {
    // Tạo một đối tượng Document
    Document document = new Document();

    // Xác định vị trí lưu file PDF hóa đơn
    String filePath = "E:\\Study\\BT_Java\\DoAn\\Java/hoadon.pdf";

    // Tạo một đối tượng PdfWriter để ghi dữ liệu vào file PDF
    PdfWriter.getInstance(document, new FileOutputStream(filePath));

    // Mở tài liệu để bắt đầu ghi
    document.open();

    // Thêm nội dung vào tài liệu PDF
    Paragraph paragraph = new Paragraph("Hoa Don");
    paragraph.setAlignment(Paragraph.ALIGN_CENTER);
    document.add(paragraph);

    // Thêm các thông tin khác vào hóa đơn, ví dụ:
    document.add(new Paragraph("So hoa don: " + SOHD));
    document.add(new Paragraph("Ten khach hang: " + txtTenKH.getText()));
    document.add(new Paragraph("So dien thoai: " + txtSDT.getText()));
    document.add(new Paragraph("-------------------\n"));
    document.add(new Paragraph("Chi tiet hoa don: "));
    document.add(new Paragraph("\n"));
    // Tạo bảng và định dạng cho bảng
    PdfPTable table = new PdfPTable(5); // Số cột của bảng là 5
    table.setWidthPercentage(100); // Chiều rộng bảng chiếm 100% của trang

    // Thêm tiêu đề cho từng cột của bảng
    table.addCell("Mã sản phẩm");
    table.addCell("Ten san pham");
    table.addCell("Don gia");
    table.addCell("So luong");
    table.addCell("Thanh tien");

    // Thêm thông tin từ bảng tbGioHang vào bảng trong tài liệu PDF
    for (int i = 0; i < tbGioHang.getRowCount(); i++) {
        String productCode = tbGioHang.getValueAt(i, 0).toString();
        String productName = tbGioHang.getValueAt(i, 1).toString();
        String unitPrice = tbGioHang.getValueAt(i, 2).toString();
        String quantity = tbGioHang.getValueAt(i, 3).toString();
        String totalPrice = tbGioHang.getValueAt(i, 4).toString();

        // Thêm dòng vào bảng
        table.addCell(productCode);
        table.addCell(productName);
        table.addCell(unitPrice);
        table.addCell(quantity);
        table.addCell(totalPrice);
    }

    // Thêm bảng vào tài liệu PDF
    document.add(table);
    
    // Thêm tổng vào tài liệu PDF
    Paragraph totalParagraph = new Paragraph("Tổng: " + total);
    totalParagraph.setAlignment(Element.ALIGN_RIGHT);
    totalParagraph.setIndentationRight(50);
    document.add(totalParagraph);
    // Thêm ngày hiện tại vào tài liệu PDF
    Date currentDate = new Date();
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    String formattedDate = dateFormat.format(currentDate);
    document.add(new Paragraph("Ngày: " + formattedDate));

    // Đóng tài liệu
    document.close();

    // Mở file PDF hóa đơn bằng ứng dụng mặc định trên máy tính
    File file = new File(filePath);
    Desktop.getDesktop().open(file);

    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Lỗi khi xuất hóa đơn.", "Lỗi", JOptionPane.ERROR_MESSAGE);
    }


    }//GEN-LAST:event_BtInHDActionPerformed

    private void btHuyHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHuyHDActionPerformed
        this.dispose();
    }//GEN-LAST:event_btHuyHDActionPerformed

    private void txtTenKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenKHActionPerformed
        // TODO add your handling code here:
        txtTenKH.setEditable(false);
    }//GEN-LAST:event_txtTenKHActionPerformed

    private void txtTongTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTongTienActionPerformed
        // TODO add your handling code here:
        txtTongTien.setEditable(false);
    }//GEN-LAST:event_txtTongTienActionPerformed
    
    private void txtSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSDTActionPerformed
        // TODO add your handling code here:
        dataAccess = new DataAccess();
        String sdt = txtSDT.getText();
        //Lấy tên khách hàng
        try {
            txtTenKH.setText(dataAccess.fetchTenKH(sdt));
        } catch (SQLException ex) {
            Logger.getLogger(XuatHoaDonForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Lấy loại khách hàng
        try {    
            if ("VIP".equals(dataAccess.fetchLoaiKH(sdt))){
                txtMaGG.setText("30000");
                txtTongTien.setText(String.valueOf(total-30000));
            }
            else{
                txtMaGG.setText("10000");
                txtTongTien.setText(String.valueOf(total-10000));
            }
           // txtMaGG.setText(dataAccess.fetchLoaiKH(sdt));
        } catch (SQLException ex) {
            Logger.getLogger(XuatHoaDonForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        dataAccess.closeConnection();
        
    }//GEN-LAST:event_txtSDTActionPerformed

    private void tbGioHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbGioHangMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbGioHangMouseClicked

    private PreparedStatement pst;
    private ResultSet rs;
    Connection connection;
    
    private void btXacNhanHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXacNhanHDActionPerformed

        // TODO add your handling code here:
        DataAccess data = new DataAccess();
        Connection connection = data.getConnection();

        try {
            String sql = "INSERT INTO HOADON (PHUONGTHUCTT, GIAMGIA, TRIGIA, TONGCONG, MANV) VALUES (?, ?, ?, ?, ?)";
            pst = connection.prepareStatement(sql);
            pst.setString(1, "Tiền mặt");
            String maGG = txtMaGG.getText().trim(); // Lấy giá trị từ trường txtMaGG và loại bỏ khoảng trắng đầu cuối
            if (maGG.isEmpty()) {
                pst.setInt(2, 0);
            } else {
                pst.setInt(2, Integer.parseInt(maGG));
            }

            
            pst.setInt(3, total);

            String tongTien = txtTongTien.getText().trim(); // Lấy giá trị từ trường txtTongTien và loại bỏ khoảng trắng đầu cuối
            pst.setInt(4, Integer.parseInt(tongTien));
            pst.setInt(5, Integer.parseInt(idNV));
            pst.executeUpdate();
            System.out.println("Thêm dòng hóa đơn thành công.");
        } catch (SQLException ex) {
            Logger.getLogger(XuatHoaDonForm.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            String sql = "SELECT MAX(SOHD) FROM HOADON";
            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();

            if (rs.next()) {
                this.SOHD = rs.getInt(1);
            }
            System.out.println("Giá trị maxSoHD: " + this.SOHD);
        } catch (SQLException ex) {
            Logger.getLogger(XuatHoaDonForm.class.getName()).log(Level.SEVERE, null, ex);
        }

        String sqlInsertCTHD = "INSERT INTO CTHD VALUES (?, ?, ?, ?)";
        try {
            pst = connection.prepareStatement(sqlInsertCTHD);

            // Lặp qua các dòng trong DefaultTableModel
            for (int i = 0; i < gioHangModel.getRowCount(); i++) {
                // Lấy giá trị từ DefaultTableModel cho từng cột
                // Lấy giá trị từ DefaultTableModel cho từng cột và chuyển đổi thành String
                String value1 = gioHangModel.getValueAt(i, 0).toString();
                String value2 = gioHangModel.getValueAt(i, 3).toString();
                String value3 = gioHangModel.getValueAt(i, 4).toString();


                // Gán giá trị vào câu lệnh INSERT
                pst.setInt(1, this.SOHD);
                pst.setInt(2, Integer.parseInt(value1));
                pst.setInt(3, Integer.parseInt(value2));
                pst.setInt(4, Integer.parseInt(value3));


                // Thực hiện câu lệnh INSERT
                pst.executeUpdate();
            }

            System.out.println("Thêm dữ liệu vào CTHD thành công.");
            JOptionPane.showMessageDialog(this, "Thêm dữ liệu vào CTHD thành công", "Thành công", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(XuatHoaDonForm.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            data.closeConnection();
        }

        
    }//GEN-LAST:event_btXacNhanHDActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private QuanLyThuCung.Swing.RoundJButton2 BtInHD;
    private QuanLyThuCung.Swing.RoundJButton2 btHuyHD;
    private QuanLyThuCung.Swing.RoundJButton2 btXacNhanHD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private QuanLyThuCung.Swing.RoundJPanel roundJPanel1;
    private QuanLyThuCung.Swing.RoundJPanel roundJPanel2;
    private QuanLyThuCung.Swing.RoundJPanel roundJPanel3;
    private QuanLyThuCung.Swing.RoundJPanel roundJPanel5;
    private QuanLyThuCung.Swing.CustomTable tbGioHang;
    private javax.swing.JTextField txtMaGG;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenKH;
    private javax.swing.JTextField txtTongTien;
    // End of variables declaration//GEN-END:variables
}
