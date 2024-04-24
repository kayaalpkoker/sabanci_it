package edu.sabanciuniv.it524.genericclass;

public class MainClass {

	public static void main(String[] args) {
		
		/* Generic class
		 * 
		 * Önce Kutu class'ını yaptık
		 * Kutu objesine koyduğumuz Object'leri kullanmak istediğimizde typecasting yapmak zorunda kalıyoruz
		 * 
		 * Typecasting yapmadan doğrudan kutu içindekini kullanabilmek için yeni GENERIC class yarattık: Box
		 * 		public class Box <T> {}
		 * 
		 * Bu tür class'lara generic class deniyor; generic denmesinin sebebi herhangi bir Type kullanılabilmesi
		 * koda bak*
		 * 
		 * 
		 * Collection'ların hepsi generic class'tır!
		 */
		
		Kutu kutu1 = new Kutu();
		kutu1.kutuyaEkle(333); //int ekle
		System.out.println(kutu1.kutudaNevar());
		
		Kutu kutu2 = new Kutu();
		kutu2.kutuyaEkle("ahmet"); //String ekle
		System.out.println(kutu2.kutudaNevar());
		kutu2.kutudanSil();
		System.out.println(kutu2.kutudaNevar());
						
		Kutu kutu3 = new Kutu();
		Student student = new Student("Melis", "Desidero");
		kutu3.kutuyaEkle(student); //Student object ekle
		System.out.println(kutu3.kutudaNevar());
		
		kutu3.kutudanSil();
		System.out.println(kutu3.kutudaNevar());
		
		
		kutu3.kutuyaEkle(new Student("Albert", "Einstein"));
		
		Student s = (Student)kutu3.kutudaNevar(); //Generic class olmayınca sıkıntı burada yaşanıyor
												  //Kutu'da ne olduğunu bilip onun type'ına cast etmek gerek!
		
		System.out.println(s.getLastname());
		
		
		
	}

}
