package org.generation.italy.geometria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Base: ");
		int base = scan.nextInt();
		System.out.print("Altezza: ");
		int altezza = scan.nextInt();
		
		Rettangolo r1 = new Rettangolo(base, altezza);
		System.out.println("Perimetro: " + r1.calcolaPerimetro());
		System.out.println("Area: " + r1.calcolaArea());
		
		scan.close();

	}

}
