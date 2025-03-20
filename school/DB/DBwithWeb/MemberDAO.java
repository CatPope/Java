package ssss;
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
	
	// 회원 검색하여 검색결과를 반환하는 메소드
	public ArrayList<MemberVO> selectMember(String id){
		// 변수 선언
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		String sql="";

		try{
			// sql문 만들고 stmt에 담기 
			// id가 비어 있으면 회원 전체 검색
			// id가 있으면 해당 아이디만 검색함.

			if(id.equals("")) {
				sql = "select * from member";
				stmt = conn.prepareStatement(sql);
			}else {
				sql = "select * from member where id=?";
				stmt = conn.prepareStatement(sql);
				stmt.setString(1, id);
			}
			
			// 쿼리 검색수행 후 검색결과 ArrayList에 담기
			rs = stmt.executeQuery();
						
			while(rs.next()) {
				list.add( new MemberVO(rs.getString(1), rs.getString(2), 
						rs.getString(3), rs.getString(4),rs.getString(5) ));
			}
			
			// db연결 종료
			closeDB();
			
		}catch(SQLException e){
			System.err.println("회원 검색 오류!!!" + e.toString() );
		}
		
		return list;
		
	}
	
	// 회원정보를 받아 테이블에 추가하기
	public boolean insertMember(MemberVO vo){
		// 변수 선언
		boolean ret = false;
		String sql="";
		
		try{
			// sql문 만들고 실행시키고 뒤처리
			sql = "insert into member values(?,?,?,?,?)";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, vo.getId());
			stmt.setString(2, vo.getName());
			stmt.setString(3, vo.getPass());
			stmt.setString(4, vo.getAddr());
			stmt.setString(5, vo.getJoinday());
			if( stmt.executeUpdate() > 0 ) ret = true;
			
			// db연결 종료
			closeDB();
			
		}catch(SQLException e){
			System.err.println("회원 등록 오류!!" + e.toString() );
		}
		
		return ret;
	}
	
	// 회원 삭제하기
	public boolean deleteMember(String id){
		// 변수 선언
		boolean ret = false;
		String sql="";
		
		try{
			sql = "delete from member where id=?";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, id);
			if( stmt.executeUpdate() > 0 ) ret = true;
			
			// db연결 종료
			closeDB();
			
		}catch(SQLException e){
			System.err.println("회원 삭제 오류!!" + e.toString() );
		}
		return ret;
	}
	
}










