package edu.sabanciuniv.it524.dynamicarrayyaratma;

public class Kutuphane {
	
	private Kitap[] raf = new Kitap[5];	//Bu bir obje array'i, data tipi obje
	private int kitapSayisi = 0; // Bunu index olarak kullanacağım
	
	private String kutuphaneAd;

	
	public Kutuphane(String kutuphaneAd) {
		this.kutuphaneAd = kutuphaneAd;
	}
	
	
	// Biz aşağıda bir "dynamic array" yazmış olduk
	// Bu işlem için hazır bir library de var
	// bunu yazmak advanced bir işlem, işe alınılır
	
	public void kitapEkle(Kitap yeniKitap) {	
		if (this.raf.length == kitapSayisi) {
			//System.out.println("Kitap eklenemez!");	>> Normalde raf array boyutu 5 olduğu için 5'in üzerine IndexOutOfBoundsException hatası aldım
			//return;
			dahaBuyukBirRafAl();		// Eğer array length'i dolduysa bu array'i genişletmek için bir metod yazacağım
		}
		this.raf[kitapSayisi] = yeniKitap; //array'in ilgili index'ine (kitapSayisi) yeniKitabı ekle!
		this.kitapSayisi ++; // Her kitap eklendiğinde index'i artır
		System.out.println("Kitap eklendi!");
	}
	
	
	private void dahaBuyukBirRafAl() { // Dikkat: metod private, public değil. Bu metod sadece kitapEkle() tarafından kullanılabilir. Public olma ihtiyacı yok!
		Kitap[] dahaBuyukRaf = new Kitap[kitapSayisi+5];	// Yeni bir array yarat ve size'ını mevcuttan 5 daha büyüt
		System.out.println("Yeni raf alındı");
		
		for (int i = 0; i<this.raf.length; i++) { 
			dahaBuyukRaf[i] = this.raf[i]; //Yeni array'e eski array'deki objeleri ekle
		}
		
		this.raf = dahaBuyukRaf; //Yeni array eşittir güncel array diyerek eski array objesini yok etmiş oluyoruz
		
		System.out.println("Kitaplar yeni rafa aktarıldı");
		System.out.println("Yeni raf kullanılmaya başlandı");
	}


	public void kacKitapVar() {
		System.out.println("Kitap sayısı: " + this.kitapSayisi);
	}
	
	public void hangiKitaplarVar() {
		for (Kitap k : this.raf) {		//for döngüsünü bu şekilde yazıyoruz
			if (k != null) {
				System.out.println(k.getAd());
			}
		}
	}
	
	
	
}
