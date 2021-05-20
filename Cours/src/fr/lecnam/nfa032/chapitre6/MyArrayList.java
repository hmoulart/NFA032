package fr.lecnam.nfa032.chapitre6;

public class MyArrayList<UnType> {
	private UnType[] tab;
	private int nb = 0;
	
	public MyArrayList() {
		tab = (UnType[]) new Object[100];
	}
	
	/**
	 * Méthode qui me permet d'ajouter un élément dans mon array list
	 * @param e
	 */
	public void add(UnType e) {
		tab[nb] = e;
		nb++;
	}
	
	/**
	 * Méthode qui me permet de modifier une case de mon array list à une position précisé en paramètre et retourne la valeur avant la modification
	 * @param i La position de la case à modifier
	 * @param e La valeur qui sera modifier dans mon tableau
	 * @return La valeur avant la modification
	 */
	public UnType set(int i, UnType e) {
		checkParam(i);
		UnType resultat = tab[i];
		tab[i] = e;
		return resultat;
	}
	
	/**
	 * Méthode qui recupère une case du tableau en position X
	 * @param i La position de la case à récupérer
	 * @return La valeur en case X
	 */
	public UnType get(int i) {
		return tab[i];
	}

	public UnType remove(int i) {
		checkParam(i);
		UnType resultat = tab[i];
		for(int j = i ; j < nb - 1; j++) {
			tab[j] = tab[j+1];
		}
		nb--;
		return resultat;
	}
	
	public int size() {
		return nb;
	}
	
	private void checkParam(int i) {
		if (i < 0 || i >= nb) {
			throw new IndexOutOfBoundsException();
		}
	}
}
