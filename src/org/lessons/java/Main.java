package org.lessons.java;

import org.lessons.java.pojo.CicloInteri;

public class Main {

	public static void main(String[] args) {
		
		int[] elencoNumeri = {1, 2, 3, 4, 5};
		
		CicloInteri c = new CicloInteri(elencoNumeri);
		
		while (c.hasAncoraElementi()) {
			System.out.println(c.getElementoSuccessivo());
		}
	}
}
