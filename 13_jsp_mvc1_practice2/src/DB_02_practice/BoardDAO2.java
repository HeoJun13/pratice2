package DB_02_practice;

import java.sql.Connection;
import java.sql.ResultSet;

import com.mysql.cj.jdbc.PreparedStatementWrapper;

public class BoardDAO2 {
	
	private BoardDAO2() {}
	private BoardDAO2 instance = new BoardDAO2();
	private BoardDAO2 getInstance() {
		return instance;
		
	}
	
	private Connection conn = null;
	private PreparedStatementWrapper pstmt = null;
	private ResultSet rs = null;
	
	public void getConnection () {
		
	}
	
	

}
