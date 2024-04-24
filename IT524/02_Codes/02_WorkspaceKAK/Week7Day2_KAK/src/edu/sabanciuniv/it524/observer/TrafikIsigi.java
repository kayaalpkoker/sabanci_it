package edu.sabanciuniv.it524.observer;

import java.util.ArrayList;
import java.util.List;

public class TrafikIsigi {
	
	//Observer'lar için bir liste oluşturuyorum
	//Bu liste observe edilecek class içinde olmalı
	private List<TrafikIsigiBekleyicisi> isigaBakanlar = new ArrayList<>();
	private String renk;

	
	public TrafikIsigi(String renk) {
		super();
		this.renk = renk;
	}

	
	//Objelerin observer olmak için kullanacağı "isigaBak" metodunda çalışacak alt metod
	public void isigaBakanlaraEkle(TrafikIsigiBekleyicisi bekleyen) {
		this.isigaBakanlar.add(bekleyen);	
	}
	
	
	public void yesilOl() {
		this.renk = "Yeşil";
		
		//ışığı bekleyen herkes aksiyon alıyor > git()
		for(TrafikIsigiBekleyicisi bekleyen : this.isigaBakanlar)
		{
			bekleyen.git();
		}
		
	}

	//ışığı bekleyen herkes aksiyon alıyor > dur()
	public void kirmiziOl() {
		this.renk = "Kırmızı";
		for(TrafikIsigiBekleyicisi bekleyen : this.isigaBakanlar)
		{
			bekleyen.dur();
		}
	}

	
	
	
}
