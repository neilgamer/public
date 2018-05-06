package com.zxh.job;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test1 {
	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		
		try(
				Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/parttime?"
						+ "useUnicode=true&characterEncoding=utf8","root","233123");
				Statement s=c.createStatement();
				) {
			for (int i = 1; i <=10; i++) {
				String sqlFormat="insert into admin values (null,'测试管理员%d','1')";
				String sql = String.format(sqlFormat, i);
				s.execute(sql);
			}
			System.out.println("已经成功创建10条分类测试数据");
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
