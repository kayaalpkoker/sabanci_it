package edu.sabanciuniv.it524.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MainClass {

	public static void main(String[] args) {
		
		/* 
		 * Collection'ların hepsi generic class'tır!
		 * 
		 * Collection framework
		 * 		> Framework dememizin sebebi kullanılan package'ın adı Collection 
		 * 		> Ve bu framework altındaki interface'ler özelleştirilebilir, özelleştirilebildiği için framework denir
		 * Collection dahil Collection altındaki tüm class'lar birer interface!
		 * 
		 * Bilmeniz gereken:
		 * 1) List
		 * 		Insertion order korunur
		 * 		.add() ile eleman eklenir
		 * 
		 * 2) Set
		 * 		Insertion order korunmaz, fakat List'ten hızlı çalışır
		 * 		Aynı eleman birden fazla kez eklenemez
		 * 		.add() ile eleman eklenir
		 * 
		 * 3) Map (Python'daki dictionary)
		 * 		.put() ile eleman eklenir
		 */
		
		
		
		//List
		
		//Insertion order korunur
		List<String> aList = new ArrayList<>();
		aList.add("www");
		aList.add("rrrr");
		aList.add("yyy");
		for(String a : aList)
		{
			System.out.println(a);
		}
		
		//Set
		
		Set<Integer> sayilar = new HashSet<>();
		for (int i = 0;i <5 ;i++)
		{
			sayilar.add(i*i);
		}
		
		sayilar.add(0);
		sayilar.add(0);
		sayilar.add(0);
		for (int x : sayilar)
		{
			System.out.println(x);
		}
		
		
		//Map
		
		Map<String, Integer> plakalar = new LinkedHashMap<>();
		
		plakalar.put("Istanbul", 34);
		plakalar.put("Izmir", 35);
		plakalar.put("Ankara", 6);
		
		
		System.out.println(plakalar.get("Istanbul"));
		
		System.out.println("-----");
		System.out.println(plakalar);
		for (Integer val : plakalar.values())
		{
			System.out.println(val);
		}
		
		
		
	}

}
