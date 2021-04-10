package fr.lecnam.nfa032.chapitre3;

public class ExempleComplexe {

	public static void main(String[] args) {
		Entier nomb = new Entier(6);
		EntBool ebx = new EntBool(nomb, true);
		EntBool[] tab = new EntBool[2];
		tab[0] = ebx;
		nomb.val = 7;
		ebx.ent.val = 8;
		tab[0].ent.val = 9;
	}
}