package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by 11981 on 2016/12/10.
 */
public final class DbClose {
    /**
     * �ر� ��ӹ��� ��Դ
     * @param pstmt,rs,conn
     */
    public static void addClose(PreparedStatement pstmt, Connection conn)
    {
        /*
	    * ��� try-catch �����㣺��ȫ
		*/
        try{
            if(pstmt != null)
            {
                pstmt.close();
            }
        }catch (SQLException e)
        {
            e.printStackTrace();
        }
        try{
            if(conn != null)
            {
                conn.close();
            }
        }catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
    /**
     * �ر���Դ
     * @param pstmt,rs,conn
     */

    public static void queryClose(PreparedStatement pstmt, ResultSet rs, Connection conn)
    {
        try{
            if(pstmt != null)
            {
                pstmt.close();
            }
        }catch (SQLException e1)
        {
            e1.printStackTrace();
        }
        try{
            if(rs != null)
            {
                rs.close();
            }
        }catch (SQLException e1){
            e1.printStackTrace();
        }
        try{
            if(conn != null){
                conn.close();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
