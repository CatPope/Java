package s30699;
import java.sql.*;
import java.util.*;

public class MemberDAO {

	private Connection conn;
	PreparedStatement stmt;
	ResultSet rs;
	
	private String url = "jdbc:mariadb://127.0.0.1:3306/mem_db";
	private String id = "root";
	private String pw = "1234";
	
	public MemberDAO() {

		try{
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection(url, id, pw);
		} catch(ClassNotFoundException e){
			System.err.println("JDBC 찾기 오류!!!" + e.toString());
		} catch (SQLException e) {
			System.err.println("db 연결 오류!!!" + e.toString());
		}
				
	}
	
	void closeDB(){
		
		try{
			if( rs!=null )		rs.close();
			if( stmt!=null )	stmt.close();
			if( conn != null ) 	conn.close();
		}catch(SQLException e){
			System.err.println("DB 종류 오류"+e.toString());
		}
	}
	
	
	// =============  여기에 코딩  ==================
	
	
	
}










