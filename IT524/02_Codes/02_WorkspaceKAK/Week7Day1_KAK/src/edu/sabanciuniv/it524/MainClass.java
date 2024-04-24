package edu.sabanciuniv.it524;

public class MainClass {

	public static void main(String[] args) {

	}

}
/*
Veritabanları 2 tipte kurulur:
	1. OLTP
	2. OLAP?

*Veritabanı verileri = diskte tutulan veriler


OLTP
Insert-update-delete çok fazla olduğu zaman kullanılan veritabanı tipi
Trendyol, vb ecommerce gibi çok fazla işlem olan iş modellerinde kullanılıyor


OLAP
A = Analytic
Çok fazla insert-update sevmez, dolayısyla analitik işlemler için kullanılır (SELECT kullanırsınız)
Bir kez yazıp veriyi okumak için kullanırsınız
OLAP veritabanı data warehouse'lar içerisindedir


Ana operasyonu için OLTP kullanan şirketler her gün (operasyonun aktif olmadığı saatlerde -gece 3-) OLTP db'den
OLAP db'lerine veriyi yedeklerler


---


API = uygulamalar arası iletişim için kullanılan service/uygulama aslında


Örnek:
Bir java class'ı düşünün (örn. EFT service)
Bu servis tek bir class ile yazılabilir
eftGonder metodu; bunu internetten erişilebilir hale getirirsem API oluyor
	= başka bir uygulama, herhangi bir human interaction olmadan, benim uygulamamdan bilgi
	
İki API türü var:
	1. Ya JSON gönderip alacaksınız --> RESTful api
	2. Ya XML gönderip alacaksınız --> XML veya SOAP (xml'in bir türü) api


Microservice'lerin hepsi API'dir


---

2. ders

1. MySQL server kur
2. MySQL server'da tablo yarat
3. 











*/