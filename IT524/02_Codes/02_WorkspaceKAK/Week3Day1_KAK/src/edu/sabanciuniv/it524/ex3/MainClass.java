package edu.sabanciuniv.it524.ex3;

import edu.sabanciuniv.it524.ex3.domain.Cpu;
import edu.sabanciuniv.it524.ex3.domain.Harddisk;
import edu.sabanciuniv.it524.ex3.domain.Laptop;
import edu.sabanciuniv.it524.ex3.domain.Ram;

public class MainClass {

	public static void main(String[] args) {

		Laptop laptop1 = new Laptop("Mac Air");
		laptop1.bilgiGoster1();
		
		/*
		
		Constructor bilgileri aşağıdaki gibi:
		
		public Laptop(String marka, int cpuHiz, int cpuCekirdek, int ramKapasite,
				int hdKapasite, String hdMarka) {
			this.marka = marka;
			this.cpu = new Cpu(cpuHiz, cpuCekirdek);
			this.ram = new Ram(ramKapasite);
			this.harddisk = new Harddisk(hdKapasite, hdMarka);
		}
		*/
		
		Laptop laptop2 = new Laptop("Dell", 8, 10, 16, 256, "WD");
		
		laptop2.bilgiGoster2();
		
	}

}
