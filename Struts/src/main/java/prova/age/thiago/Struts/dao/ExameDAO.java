package prova.age.thiago.Struts.dao;
/**
 * @author trogerio
 */

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ExameDAO {

	public static Connection getConnection() throws Exception {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/examedb", 
					"root", "Thi290717");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public int salvarExame(Long id, String nmExame, Date dtExame, String resExame) throws Exception{
		int i;
		Connection con = getConnection();
		try {
			
			PreparedStatement ps = con.prepareStatement("insert into exames values (?, ?, ?, ?)");
			
			ps.setLong(1, id);
			ps.setString(2, nmExame);
			ps.setDate(3, dtExame);
			ps.setString(4, resExame);
			
			i = ps.executeUpdate();
			return i;
			
		}catch(Exception e) {
			e.printStackTrace();
			return 0;
		}
		finally {
			con.close();
		}
		
	}
	
}
