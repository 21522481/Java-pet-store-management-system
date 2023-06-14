package SQL;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class DataAccess {
    private Connection connection;
    
    public DataAccess(){
        try {  
            Class.forName("oracle.jdbc.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:orcl";
            String username = "c##ThuCungFinal";
//            String username = "ThuCungFinal";
            String password = "userpass";
            
            connection = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void closeConnection(){
        try {
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   

    private PreparedStatement pst;
    private ResultSet rs;
    public void fetchProduct(DefaultTableModel tableModel){
        tableModel.setRowCount(0);
        String sql = "SELECT MADM, LOAI, TEN, NSX, HSD, KL, NG_GOC, SL, GIA FROM DANHMUC WHERE GT IS NULL";
        try {
            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();
            String row[] = new String[9];
            DefaultTableModel df;
            df = (DefaultTableModel)tableModel;
            
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            
            while(rs.next()){
                row[0] = rs.getString(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);

                Date nsxDate = rs.getDate(4);
                String nsxValue = dateFormat.format(nsxDate);
                row[3] = nsxValue;

                // Bỏ đi giờ, phút và giây của cột HSD
                Date hsdDate = rs.getDate(5);
                String hsdValue = dateFormat.format(hsdDate);
                row[4] = hsdValue;

                
                row[5] = rs.getString(6);
                row[6] = rs.getString(7);
                row[7] = rs.getString(8);
                row[8] = rs.getString(9);
            
                df.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}
    public void fetchDANHMUC(DefaultTableModel tableModel){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        tableModel.setRowCount(0);
        String sql = "SELECT * FROM DANHMUC";
        try {
            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();
            String row[] = new String[10];
            DefaultTableModel df;
            df = (DefaultTableModel)tableModel;
            while(rs.next()){
                row[0] = rs.getString(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                row[5] = rs.getString(6);
                row[6] = rs.getString(7);
                row[7] = rs.getString(8);
                row[8] = rs.getString(9);
                row[9] = rs.getString(10);
                
                df.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void fetchDichVu(DefaultTableModel tableModel) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        tableModel.setRowCount(0);
        String sql = "SELECT * FROM GUITHUCUNG";
        try {
            //SOPHIEUNHAP, MAKH, TEN, LOAI, GIOITINH, NGAYGUI, NGAYTRA, GIA
            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();
            String row[] = new String[10];
            DefaultTableModel df;
            df = (DefaultTableModel)tableModel;
            while(rs.next()){
                row[0] = rs.getString(1);
                row[1] = rs.getString(2);
                Date nsxDate = rs.getDate(3);
                String nsxValue = dateFormat.format(nsxDate);
                row[2] = nsxValue;
                Date hsdDate = rs.getDate(4);
                String hsdValue = dateFormat.format(hsdDate);
                row[3] = hsdValue;
                row[4] = rs.getString(5);
                row[5] = rs.getString(6);
                row[6] = rs.getString(7);
                
                row[7] = rs.getString(8);
                
                
                df.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void fetchCustomer(DefaultTableModel tableModel){
        tableModel.setRowCount(0);
        String sql = "SELECT * FROM KHACHHANG";
        try {
            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();
            String row[] = new String[7];
            DefaultTableModel df;
            df = (DefaultTableModel)tableModel;
            
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            
            while(rs.next()){
                row[0] = rs.getString(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);

                Date birthDate = rs.getDate(4);
                String birthValue = dateFormat.format(birthDate);
                row[3] = birthValue;
                row[4] = rs.getString(5);
                row[5] = rs.getString(6);
                row[6] = rs.getString(7);

                df.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}
    

    public String fetchTenKH(String SDT) throws SQLException {
        String sql = "SELECT HOTEN FROM KHACHHANG WHERE SDT = ?";
        String tenKH = "";

        try (PreparedStatement pst = connection.prepareStatement(sql)) {
            pst.setString(1, SDT);
            try (ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    tenKH = rs.getString("HOTEN");
                }
            }
        } catch (SQLException ex) {
            throw ex;
        }
            return tenKH;
        }
    public String fetchLoaiKH(String SDT) throws SQLException {
        String sql = "SELECT Loai FROM KHACHHANG WHERE SDT = ?";
        String loaiKH = "";

        try (PreparedStatement pst = connection.prepareStatement(sql)) {
            pst.setString(1, SDT);
            try (ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    loaiKH = rs.getString("LOAI");
                }
            }
        } catch (SQLException ex) {
            throw ex;
        }
            return loaiKH;
        }

    
    public void fetchThuCung(DefaultTableModel tableModel) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        tableModel.setRowCount(0);
        String sql = "SELECT MADM, TEN, LOAI, KL, GT, NG_GOC, SL, GIA FROM DANHMUC WHERE GT IS NOT NULL";
        try {
            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();
            String row[] = new String[10];
            DefaultTableModel df;
            df = (DefaultTableModel)tableModel;
            while(rs.next()){
                row[0] = rs.getString(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                row[5] = rs.getString(6);
                row[6] = rs.getString(7);
                row[7] = rs.getString(8);
                
                df.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public void fetchAccount(DefaultTableModel tableModel){
        String sql = "SELECT * FROM TAIKHOAN";
        tableModel.setRowCount(0);
        try {
            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();
            String row[] = new String[3];
            DefaultTableModel df;
            df = (DefaultTableModel) tableModel;
            while (rs.next()) {
                row[0] = rs.getString(1);
                row[1] = rs.getString(1);
                row[2] = rs.getString(2);
                
                df.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    public void fetchStaff(DefaultTableModel tableModel) {
         tableModel.setRowCount(0);
             SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        
        String sql = "SELECT * FROM NHANVIEN";
        try {
            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();
            String row[] = new String[7];
            DefaultTableModel df;
            df = (DefaultTableModel)tableModel;
            while(rs.next()){
                row[0] = rs.getString(1);
                row[1] = rs.getString(2);
                 Date birthDate = rs.getDate(3);
                String birthValue = dateFormat.format(birthDate);
                row[2] = birthValue.toString();
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                row[5] = rs.getString(6);
                row[6] = rs.getString(7);
              
                
                df.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
     

}
    public void fetchBill(DefaultTableModel tableModel){
        String sql = "SELECT * FROM HOADON";
        tableModel.setRowCount(0);
        try {
            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();
            String row[] = new String[7];
            DefaultTableModel df;
            df = (DefaultTableModel) tableModel;
            while (rs.next()) {
                row[0] = rs.getString(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                row[5] = rs.getString(6);
                row[6] = rs.getString(7);
                df.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
        
    public Connection getConnection() {
        return connection;
    }
}
