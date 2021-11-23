package org.generation.italy.geometria;

public class Rettangolo {
	
	// attributi
	int base;
	int altezza;
	
	// costruttore
	Rettangolo(int base, int altezza) {
		this.base = base;
		this.altezza = altezza;
	}
	
	// metodi
	int calcolaArea() {
		int calcolaArea = this.base * this.altezza;
		return calcolaArea;
	}
	
	int calcolaPerimetro() {
		int calcolaPerimetro = 2*(this.base + this.altezza);
		return calcolaPerimetro;
	}
	
}
