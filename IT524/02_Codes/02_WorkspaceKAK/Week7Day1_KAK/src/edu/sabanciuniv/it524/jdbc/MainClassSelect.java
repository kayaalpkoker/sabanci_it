package edu.sabanciuniv.it524.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MainClassSelect {
	
	public static final String url = "jdbc:mysql://localhost/IT524";
	public static final String username = "root";
	public static final String password = "Sabanci99!!";

	
	public static void main(String[] args) {
		
		try {
			//DB'ye bağlanma
			Connection conn = DriverManager.getConnection(url, username, password);
			
			
			PreparedStatement ps = conn.prepareStatement("select * from students where id>?");
			//"where id>?"deki soru işareti (?) frontend'de kullanıcı istediği veriyi girsin ve kod onu değerlendirsin diye
			
			//PreparedStatement.set...() metodlarında ilk değer kaçıncı ? için, ikinci değer o ?'ne atanacak değer
			ps.setInt(1, 0);
			ResultSet resultSet = ps.executeQuery();
			
			/*
			 * 1) InsertBadCode ve BetterCode class'larında .execute() kullanmıştık,
			 * .execute() ile executeQuery() aynı özelliğe sahip, ikisi de kullanılabilir
			 * 
			 * 2) .executeQuery() tek başına kullanılabilirdi --> ps.executeQuery()
			 * Burada .executeQuery()'yi bir referansa (ResultSet'e) eşledik
			 * Update class'ında da bu metodu bir int referansına eşlemiştik
			 * Bu eşleşme ile kullanmamızın sebebi execution bilgisini bir şekilde kullanmak istememiz
			 * 		> Örneğin select'in amacı veri return etmek olduğu için ResultSet diye bir objeye eşlemeliyiz
			 * 			*** ÖNEMLİ: Select ile ResultSet kullanmak ZORUNLU!
			 * 		> Bir diğer örnek Update class'ında, int updatedRowCount'a eşlemiştik, bu zorunlu değildi ama kullandık
			 * 
			 */
			
			
			while(resultSet.next()) {
				int id = resultSet.getInt("id");
				String n = resultSet.getString("name");
				String l = resultSet.getString("lastname");
				System.out.println(id + " --- " + n + " --- " + l);
			}

			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
