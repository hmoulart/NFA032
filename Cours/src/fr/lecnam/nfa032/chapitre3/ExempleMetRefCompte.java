package fr.lecnam.nfa032.chapitre3;

public class ExempleMetRefCompte {

	public static void main(String[] args) {
		Compte comp1 = new Compte();
		comp1.deposer(50);
		System.out.println(comp1.solde);
	}
}