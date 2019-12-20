package �ھ���;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class E9_1 {
	public static void main(String[] args) throws SQLException{
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/xyf";
			String username="root";
			String password="123456";
			conn=DriverManager.getConnection(url,username,password);
			stmt=conn.createStatement();
			String sql="select * from xyf";
			rs=stmt.executeQuery(sql);
			System.out.println("id  |   name   |   sex"+"   |   email   |   birthday");
			while (rs.next()) {
				int id=rs.getInt("id");
				String name=rs.getString("name");
				String sex=rs.getString("sex");
				String email=rs.getString("email");
				Date birthday=rs.getDate("birthday");
				System.out.println(id+"   |   "+name+"   |   "+sex+"   |   "+email+"   |   "+birthday);
		}
	}catch(Exception e){
		e.printStackTrace();
		}finally {
			if(rs!=null) {rs.close();}
			if(stmt!=null) {stmt.close();}
			if(conn!=null) {conn.close();}
		}
	}
}
