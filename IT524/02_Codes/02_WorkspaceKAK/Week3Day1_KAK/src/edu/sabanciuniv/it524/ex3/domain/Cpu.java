package edu.sabanciuniv.it524.ex3.domain;

public class Cpu {
	
	private int cpuHiz;
	private int cpuCekirdek;
	
	public Cpu () {
	}
	
	public Cpu(int hiz, int cekirdek) {
		this.cpuHiz = hiz;
		this.cpuCekirdek = cekirdek;
	}

	public int getCpuHiz() {
		return cpuHiz;
	}

	public void setCpuHiz(int cpuHiz) {
		this.cpuHiz = cpuHiz;
	}

	public int getCpuCekirdek() {
		return cpuCekirdek;
	}

	public void setCpuCekirdek(int cpuCekirdek) {
		this.cpuCekirdek = cpuCekirdek;
	}
	
	
	
}
