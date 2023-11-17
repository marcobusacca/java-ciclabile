package org.lessons.java.pojo;

public class CicloInteri {

	private int[] elencoNumeri;
	private int indice;
	
	
	public CicloInteri(int[] elencoNumeri) {

		setElencoNumeri(elencoNumeri);
		setIndice(0);
	}
	public CicloInteri() {

		setElencoNumeri(new int[0]);
		setIndice(0);
	}
	
	
	public int[] getElencoNumeri() {
		return elencoNumeri;
	}
	public void setElencoNumeri(int[] elencoNumeri) {
		this.elencoNumeri = elencoNumeri;
	}
	public int getIndice() {
		return indice;
	}
	private void setIndice(int indice) {
		this.indice = indice;
	}
	
	
	public int getElementoSuccessivo() {
		
		int[] elencoNumeri = getElencoNumeri();
		
		setIndice(indice + 1);
		
		return elencoNumeri[getIndice() - 1];
	}
	public boolean hasAncoraElementi() {
		return getIndice() < getElencoNumeri().length;
	}
	public void addElemento(int elemento) {
		
		int[] nuovoElenco = new int[getElencoNumeri().length + 1];
		
		System.arraycopy(getElencoNumeri(), 0, nuovoElenco, 0, getElencoNumeri().length);
		
		nuovoElenco[getElencoNumeri().length] = elemento;
		
		setElencoNumeri(nuovoElenco);
	}
}
