package fr.lecnam.nfa032.chapitre3;

public class ExempleRefs {

	public static void main(String[] args) {
		Entier nomb; // l17
		Entier[] tab;
		EntBool ebx; // l19
		nomb = new Entier(5);
		tab = new Entier[2];
		tab[0] = nomb;
		tab[1] = new Entier(2);
		ebx = new EntBool(nomb, true);
	}
}