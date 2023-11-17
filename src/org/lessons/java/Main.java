package org.lessons.java;

import org.lessons.java.pojo.CicloInteri;

public class Main {

	public static void main(String[] args) {
		
		int[] elencoNumeri = {1, 2, 3, 4, 5};
		
		CicloInteri c = new CicloInteri(elencoNumeri);
		
		while (c.hasAncoraElementi()) {
			System.out.println(c.getElementoSuccessivo());
		}
		
		
		// EXTRA
		
		System.out.println("\n---------------\n");
		
		CicloInteri c1 = new CicloInteri();
		
		c1.addElemento(6);
		c1.addElemento(7);
		c1.addElemento(8);
		c1.addElemento(9);
		c1.addElemento(10);
		
		while (c1.hasAncoraElementi()) {
			System.out.println(c1.getElementoSuccessivo());
		}
	}
}
