package prova.age.thiago.Struts.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ExameDAO {

	public static Connection getConnection() throws Exception {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3300/examedb", 
					"root", "Thi290717");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
