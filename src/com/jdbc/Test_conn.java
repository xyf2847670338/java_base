package com.jdbc;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test_conn {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xyf","root","123456");
		Statement yuju=conn.createStatement();
		String sql="update xyf set email='jack@qq.com' where id=1";
		yuju.execute(sql);
	}

}