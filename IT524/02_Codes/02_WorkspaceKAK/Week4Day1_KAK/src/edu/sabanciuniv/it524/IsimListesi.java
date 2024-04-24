package edu.sabanciuniv.it524;

public class IsimListesi {
	
	private int index = 0;
	private String[] info = new String[4];
	

	public void isimEkle(String isim) {
		
		System.out.println(isim + "  " + index + " nolu Index e eklenecek ");
		
		if (index == this.info.length) {		//this. her zaman class field'larını alır
			String[] newArray = new String[this.info.length+4];
			for(int i = 0;i<this.info.length;i++) {
				newArray[i] = this.info[i];
			}
			this.info = newArray;
		}
		this.info[index] = isim;
		index++;
	}

	
	public void listeyiGoster() {
		for (int i=0; i<this.info.length; i++) {
			if (this.info[i] != null) {
				System.out.println(i + " ---> " + info[i]);
			}
		}
	}
}
