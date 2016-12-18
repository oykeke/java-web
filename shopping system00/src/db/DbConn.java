package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by 11981 on 2016/12/10.
 */
public class DbConn {
    // JDBC ���������� �����ݿ��ַ
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";

    static final String DB_URL = "jdbc:mysql://localhost/shopping?" +
            "useUnicode=true&characterEncoding=utf-8&useSSL=false";
    //����һ�п�������һ��warning
    //warning:����ssl���ӣ����Ƿ�����û�������֤�����ַ�ʽ���Ƽ�ʹ��

    //  ���ݿ��û�������
    static final String USER = "root";

    static final String PASSWORD = "root";

    public static Connection getconn()
    {
        Connection conn = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASSWORD);
        }catch (SQLException se)
        {
            se.printStackTrace();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return conn;
    }
}
