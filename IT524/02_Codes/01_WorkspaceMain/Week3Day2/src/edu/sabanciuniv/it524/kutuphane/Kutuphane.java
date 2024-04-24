package edu.sabanciuniv.it524.kutuphane;

public class Kutuphane {
	
	
	private Kitap[] raf = new Kitap[5];
	private int kitapSayisi = 0;
	
	
	private String kutuphaneAd;

	public Kutuphane(String kutuphaneAd) {
		this.kutuphaneAd = kutuphaneAd;
	}

	
	public void kitapEkle(Kitap yeniKitap) {
		
		if(this.raf.length==kitapSayisi)
		{
			//System.out.println("Kitap Eklenemez");
			//return;
			dahaBuyukBirRafAl();
		}
		this.raf[kitapSayisi] = yeniKitap;
		this.kitapSayisi++;
		System.out.println("Kitap Eklendi");
	}
	
	private void dahaBuyukBirRafAl() {
		
		Kitap[] dahaBuyukRaf = new Kitap[kitapSayisi+5];
		System.out.println("Yeni raf alındı");
		for (int i = 0;i<this.raf.length;i++)
		{
			dahaBuyukRaf[i] = this.raf[i];
		}
		System.out.println("Kitaplar yeni rafa aktarıldı");
		this.raf = dahaBuyukRaf;
		System.out.println("Yeni raf kullanılmaya başlandı");
			
	}


	public void kacKitapVar()
	{
		System.out.println("Kitap sayısı : "+this.kitapSayisi);
	}
	
	public void hangiKitaplarVar()
	{
		for (Kitap k : this.raf)
		{
			if (k!=null)
				System.out.println(k.getAd());
		}
	}

}
