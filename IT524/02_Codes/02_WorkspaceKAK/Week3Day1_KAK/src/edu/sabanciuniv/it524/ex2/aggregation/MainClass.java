package edu.sabanciuniv.it524.ex2.aggregation;

public class MainClass {

	public static void main(String[] args) {

		Traktor traktor = new Traktor("John Deere");
		
		traktor.gazaBas();  //Burada traktör çalışmıyor yazısını ekrana basmalı
		
		traktor.calistir();
		traktor.gazaBas();  //Burada gidiyor olması lazım
		
		traktor.gazaBas();
		traktor.gazaBas();
		traktor.gazaBas();
		
		traktor.freneBas();
		
		Romorkor romorkor = new Romorkor(10);
		traktor.romorkorTak(romorkor);
		
		traktor.gazaBas();
		traktor.gazaBas();

		
	}

}
