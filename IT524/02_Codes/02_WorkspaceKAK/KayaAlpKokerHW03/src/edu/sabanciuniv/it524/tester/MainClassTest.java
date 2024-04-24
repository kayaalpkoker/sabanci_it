package edu.sabanciuniv.it524.tester;

public class MainClassTest {

	public static void main(String[] args) {
		
		String text = "1 El Ataberko Henriquez de Gama Vasquez Varol\n"
				+ "2 Aylanur Tulga\n"
				+ "3 Batuhan Kahvecioğlu\n"
				+ "4 Caner Ahmet Başdoğan\n"
				+ "5 Caner Eminogullari\n"
				+ "6 Dilge Karakaş\n"
				+ "7 Duhan Uğurlu\n"
				+ "8 Efe Çavuşoğlu\n"
				+ "9 Faik Coşkun Çakır\n"
				+ "10 Fatih Üstün\n"
				+ "11 Fatma Betül Gülçam\n"
				+ "12 Fatma Zehra Güneş\n"
				+ "13 Ferhat Tuncel\n"
				+ "14 Güney Kuba\n"
				+ "15 Hasan Furkan Coşkun\n"
				+ "16 İlayda Balık\n"
				+ "17 Kaya Alp Köker\n"
				+ "18 Kerem Lütfi Kılınç\n"
				+ "19 Onur Cem Işik\n"
				+ "20 Osman Serhat Karaman\n"
				+ "21 Özden Nazlı Servi\n"
				+ "22 Özden Sayalan\n"
				+ "23 Sedanur Erganiş\n"
				+ "24 Yener Yumlu\n"
				+ "25 Yiğit Turan\n"
				+ "26 Yusuf İslam Tuncer\n"
				+ "27 Zehra Durmus";
		
		
		String[] lines = text.split("\n");
/*		
		for (String line : lines) {
			String [] lineValues = line.split(" ");
			for (String value : lineValues) {
				System.out.println(value);
			}
		}
*/	
		
		for (String line : lines) {
			String [] lineValues = line.split(" ");
	
			String name = "";
			for (int i = 1; i < lineValues.length-1; i++) {
				name += lineValues[i] + " ";
			}
			name = name.trim();
		
			String lastName = lineValues[lineValues.length-1];
			
			System.out.print(name);
			System.out.println(lastName);
		
		}
	
	}
}
