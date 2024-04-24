package edu.sabanciuniv.it524.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MainClassInsertBadCode {

	public static void main(String[] args) {
		
		//Dosya okuma/yazma işlemlerinde olduğu gibi burada da hep try-catch yapmalısınız
		//Server açık olmayabilir, internet bağlantısı olmayabilir, vs vs
		
		try {
			
			String url = "jdbc:mysql://localhost/IT524";
			String username = "root";
			String password = "Sabanci99!!";
			
			//DB'ye bağlanma
			Connection conn = DriverManager.getConnection(url, username, password);
			
			//Her DB'ye bağlanmak için o DB'nin driver'ını indirip proje dosyasına eklemelisiniz
			//Önce Week7Day1_KAK altında bir folder yaratıyorum, adını "lib" koyuyorum
			//İndirdiğim driver klasöründeki .jar dosyasını lib'e kopyalıyorum
			//.jar dosyası üzerine sağ-click > Build path'e ekliyorum
			
			System.out.println("Şuraya bağlandık: jdbc:mysql://localhost/IT524");
			
			
			//DB'ye SQL query'lerini gönderebilmek için Statement objesi yaratıyorum (alternatif: PreparedStatement objesi)
			Statement statement = conn.createStatement();  //Neden new ile yaratmadık?
			
			//Query'leri Statement objesi metodları ile DB'ye gönderiyorum
			//Burada .execute() kullandım
			String name = "';-- ; drop table students;";
			String lastname = "Desidero";
			
			statement.execute("insert into students (name,lastname) values ('"+name+"','"+lastname+"')");
			System.out.println("Student eklendi");
			
			
			//Yukarıya koyduğumuz kod güvenli değil! SQL Injection'a açık! --> Yanlış query eklemek, table drop ettirmek, vs
			//Statement objesi, kullanıcının DB'ye komut verebilmesine imkan sağlıyor

			/*Örnek: Login'de username yerine "drop table" yazmak
			String name = "';-- ; drop table students;";
			String lastname = "Desidero";			
			*/
			
			//Dolayısıyla hiçbir zaman Statement objesi ile çalışmayacağız, Prepared Statement ile çalışacağız
			//PreparedStatement objeleri DB'ye doğrudan komut verilmesini engelliyor
			//Örneğin bir String verisi DB'ye gidecekse input verinin başına ve sonuna "" ekliyor

			
			//Yeni class yaratıp daha güvenli bir versiyon yaratacağım --> MainClassInsertBetterCode

			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
