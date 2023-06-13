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
   
//    /**
//     * Phương thức readDB dùng để lấy data của một bảng bất kỳ trong CSDL
//     * 
//     * @param tableName Muốn lấy thông tin của bảng nào thì truyền tên của bảng đó
//     *                  vào 
//     */
//    public void readDB(String tableName) {
//        // Tạo câu SQL để truy vấn dữ liệu từ bảng tableName được truyền vào
//        String sql = "SELECT * FROM" + tableName;
//
//        try {
//            // Thực thi câu SQL và lấy ra ResultSet chứa kết quả truy vấn
//            ResultSet resultSet = connection.prepareStatement(sql).executeQuery();
//            /*
//             * while (resultSet.next()) là một vòng lặp while được sử dụng để duyệt qua tất
//             * cả các hàng của ResultSet.
//             * 
//             * Trong Java, ResultSet là một đối tượng chứa tập hợp các kết quả truy vấn từ
//             * CSDL. Khi chúng ta thực thi câu truy vấn bằng method executeQuery() từ
//             * PreparedStatement, nó trả về một ResultSet.
//             * 
//             * Với mỗi hàng trong ResultSet, method next() được gọi để chuyển con trỏ đến
//             * hàng tiếp theo và kiểm tra xem hàng đó có tồn tại hay không. Nếu có thì
//             * method next() trả về giá trị true, và nếu không thì nó trả về false.
//             * 
//             * Do đó, trong vòng lặp while này, nó sẽ duyệt qua từng hàng của ResultSet cho
//             * đến khi không còn dữ liệu. Mỗi lần lặp, nó sẽ lấy ra các giá trị của các cột
//             * trong hàng hiện tại của ResultSet. Dùng các giá trị này, chương trình sẽ in
//             * ra màn hình thông tin của hàng đó.
//             * 
//             * Tóm lại, vòng lặp while (resultSet.next()) được sử dụng để lặp qua tất cả các
//             * hàng của ResultSet và hiển thị thông tin của mỗi hàng.
//             */
//            while (resultSet.next()) {
//                // Các số từ 1 tới 10 tương ứng với thứ tự của các cột của bảng trong CSDL
//                System.out.println(resultSet.getInt(1) + "  "
//                        + resultSet.getString(2) + "  "
//                        + resultSet.getString(3) + "  "
//                        + resultSet.getDate(4)
//                        + resultSet.getDate(5)
//                        + resultSet.getString(6)
//                        + resultSet.getInt(7)
//                        + resultSet.getString(8)
//                        + resultSet.getInt(9)
//                        + resultSet.getInt(10));
//            }
//        } catch (SQLException e) {
//            // Nếu có lỗi xảy ra, in exception stack trace ra màn hình
//            e.printStackTrace();
//        }
////    public void fetchProduct() {}
//    }
//    
    private PreparedStatement pst;
    private ResultSet rs;
    public void fetchProduct(DefaultTableModel tableModel){
        
        String sql = "SELECT MADM, LOAI, TEN, NSX, HSD, KL, NG_GOC, SL, GIA FROM DANHMUC WHERE GT IS NULL";
        try {
            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();
            String row[] = new String[9];
            DefaultTableModel df;
            df = (DefaultTableModel)tableModel;
            
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            
            while(rs.next()){
                row[0] = rs.getString(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
//                row[3] = rs.getString(4);
//                row[4] = rs.getString(5);Date nsxDate = rs.getDate(4);
                // Bỏ đi giờ, phút và giây của cột NSX
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
                row[9] = rs.getString(10);
                
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
