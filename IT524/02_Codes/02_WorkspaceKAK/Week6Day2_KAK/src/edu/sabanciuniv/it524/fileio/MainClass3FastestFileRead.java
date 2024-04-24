package edu.sabanciuniv.it524.fileio;

import java.io.FileReader;
import java.nio.file.Files;	//nio = new io
import java.nio.file.Path;
import java.nio.file.Paths;

public class MainClass3FastestFileRead {

	public static void main(String[] args) {

		/* 	3) Dosya boyutu ile FileReader (en hızlısı)

		 * Çok hızlı okumak da mümkün,
		 * ama bunun için dosya boyutunu bilmeniz gerekiyor, FileReader'a X KB'yi doğrudan oku diyorsunuz

		 * 		a) Bu yolu kullanırken önce dosya size'ını buluyorsunuz
		 * 
		 * 		b) Bir char array'i (char[]) yaratıyoruz ve array boyutunu fileSize'a eşliyoruz
		 * 
		 * 		c) read işlemi
		 */
		
		try {
			Path path = Paths.get("syllabus.txt");	//Dosyaya eriş
			int fileSize = (int)Files.size(path);	//Dosya boyutunu bul -- .size() long döndürdüğü için int'e cast et
			
			char[] allText = new char[fileSize];	//Array size'ı fileSize olan bir char array yarat
			
			FileReader rd = new FileReader("syllabus.txt");
			
			rd.read(allText);
			
			System.out.println(allText);

			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
