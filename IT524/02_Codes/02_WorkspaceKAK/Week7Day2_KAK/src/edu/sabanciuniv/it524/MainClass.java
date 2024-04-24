package edu.sabanciuniv.it524;

import java.util.List;

import edu.sabanciuniv.it524.dao.StudentDAO;
import edu.sabanciuniv.it524.domain.Student;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 * Veritabanı bağlantısı
		 * 
		 * 1) Bağlanacağınız DB tedarikçisinin farklı kanallardan bağlantıyı mümkün kılması gerekiyor
		 * Bunu driver'lar ile sağlıyorlar
		 * İlgili driver'ı web'den indirip içinde bulunan jar dosyasını proje klasörü içine eklemeliyim
		 * 		> proje klasörü içine yeni klasör aç "lib"
		 * 		> lib içine .jar dosyasını ekle
		 * 		> sağ click > build path > add to build path
		 * 
		 * 2) DB'nizdeki her tablo için bir class olması gerekiyor
		 * bunlar domain class'larıdır (ya da entity'ler)
		 * 
		 * Tablodaki her sütun ilgili class'ın field'larıdır
		 * Her bir row da benim için bir obje (bir instance)
		 * 
		 */
		
		
		//id'yi constructor'a eklememiştim çünkü id auto-increment olacak şekilde tablomu yarattım
		Student student1 = new Student ("Christiano", "Ronaldo");
		Student student2 = new Student ("Johnny", "Bobbins");
		Student student3 = new Student ("Ahmet", "Demirelli");
		
		
		/*
		 * DAO = Data access object
		 * Student objelerini (bilgileri) DB'ye 1) kaydedecek ve 2) DB'den çekecek obje = DAO
		 * Bunun için ayrı bir class olur (package adı da "dao")
		 */ 
		 
		StudentDAO sDao = new StudentDAO();
		
		sDao.insert(student1);
		sDao.insert(student2);
		sDao.insert(student3);
		 
		sDao.delete(102);
		
		Student studentX = sDao.findById(5);
		System.out.println("FindBy ID 'user input' " + studentX);
		
		List<Student> all = sDao.findAll();
		System.out.println("---- ALL ----");
		for (Student s : all)
		{
			System.out.println(s);
		}
		
		
		 
		/* Neden böyle bir katman koyuyoruz peki? Bir önceki derste PreparedStatement ile işlem yapmıştık?
		 * 
		 * ppt çiziyoruz:
		 * Java (Object world) ve Database (Table world) var
		 * DB dünyasındaki her şey tablolar ve tablolar arası ilişkilerden oluşuyor (PK, FK, vs)
		 * Object dünyasında ise objeler var
		 * Bu iki dünya arasına bir de "DAO classes" dünyası ekliyorum
		 * DAO dünyasında DAO objeleri var (örn. StudentDAO)
		 * Java-DB dünyası arası
		 * 
		 * 
		 * Peki neden? 
		 * Bu bir mimari gereklilik
		 * MySQL DB'si kullanırken bir gün MongoDB veya başka bir DB'ye geçmek zorunda kalabilirim.
		 * Eğer DAO'ları kullanırsam DB değişikliği olduğunda sadece bu ara katmanda değişiklik yaparım,
		 * kod üzerinde başka yerlerde değişiklik yapmama gerek kalmayacak.
		 * Ekleme: Sadece DB değişikliğine gerek yok, DB ile ilgili genel işlemleri yaparken de eğer DAO kullanırsam, yani
		 * DB ile ilgili create-insert-update vs işlemleri farklı yerlere dağıtmazsam, sadece DAO class'ını güncelleceğim
		 */
		
		

		/* 
		 * Bugün yaptığımız örnekte DAO metodlarını biz manuel olarak yazacağız > insert/save-update-delete-findBy...
		 * Ancak bunu Spring, veya birtakım diğer framework'ler otomatik generate ediyor
		 * Siz custom query'ler için ancak sıfırdan metod yazarsınız
		 * 
		 * ORM = Object-relational mapping
		 * DAO'ların yerine konulacak ORM framework'leri var > Hibernate, JPA
		 */
		
		
		
		
		
		
		
	}

}
