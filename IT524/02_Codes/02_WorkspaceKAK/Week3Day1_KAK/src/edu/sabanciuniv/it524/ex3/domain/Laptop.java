package edu.sabanciuniv.it524.ex3.domain;


public class Laptop {

	private String marka;
	private Cpu cpu;
	private Ram ram;
	private Harddisk harddisk;
	
	public Laptop(String marka) {
		this.marka = marka;
	}

	
	public Laptop(String marka, int cpuHiz, int cpuCekirdek, int ramKapasite,
			int hdKapasite, String hdMarka) {
		this.marka = marka;
		this.cpu = new Cpu(cpuHiz, cpuCekirdek);
		this.ram = new Ram(ramKapasite);
		this.harddisk = new Harddisk(hdKapasite, hdMarka);
	}
	
	
	
	public void bilgiGoster1() {
		System.out.println("İyi günler! Ürünün özellikleri aşağıdadır:");
		System.out.println("-----------------");
		System.out.println("Marka: " + marka);
		System.out.println("CPU: " + cpu);
		System.out.println("RAM: " + ram);
		System.out.println("Harddisk: " + harddisk);
		System.out.println("-----------------");
	}
	
	public void bilgiGoster2() {
		System.out.println("İyi günler! Ürünün özellikleri aşağıdadır:");
		System.out.println("-----------------");
		System.out.println("Marka: " + marka);
		System.out.println("CPU hızı: " + cpu.getCpuHiz());
		System.out.println("CPU çekirdek sayısı: " + cpu.getCpuCekirdek());
		System.out.println("RAM kapasitesi: " + ram.getRamKapasite());
		System.out.println("Harddisk markası: " + harddisk.getHdMarka());
		System.out.println("Harddisk kapasitesi: " + harddisk.getHdKapasite());
		System.out.println("-----------------");
		
	}
	
	
	
	
	
	
}
