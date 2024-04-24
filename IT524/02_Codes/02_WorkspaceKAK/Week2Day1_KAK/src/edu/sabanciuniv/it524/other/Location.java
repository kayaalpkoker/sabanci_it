package edu.sabanciuniv.it524.other;

public class Location {

	/*
	 * Class içine sırayla şunlar yazılır: 
	 * 		1. Değişkenler > State
	 * 		2. Constructor'lar
	 * 		3. Metodlar > Behavior
	 */

	public double enlem;
	public double boylam;

	/*
	 * Şimdi bir constructor yaratıyorum Constructor bir metoddur, ancak özel bir metoddur
	 * Constructor metodunun adı class adı ile aynı olmak zorundadır!
	 * Constructor başında bir şey yazmaz (bir tek public yazacağız)
	 */

	// Empty veya Default constructor
	public Location() {
		enlem = 0;
		boylam = 0;

	}

	// Full constructor
	public Location(double d1, double d2) {
		enlem = d1;
		boylam = d2;
	}

	// Empty veya full constructor dışında tüm parametrelerini yazmadığım constructor da tanımlayabilirim
	// Parametreler = class field'ları
	public Location(double d1) {
		enlem = d1;
		boylam = 0;

	}
	
	
	public void bilgiGoster() {
		System.out.println(enlem + " - " + boylam);
	}

	/*
	 * Java sertifikasyon sorusu: Eğer hiç constructor yazılmamışsa Java bu şekilde
	 * kullanıma izin verir Ama 1 tane bile constructor yazmışsanız Java bundan
	 * sonra boş şekilde çağırmaya izin vermez
	 * 
	 */

}
