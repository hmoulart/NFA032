package fr.lecnam.nfa032.chapitre2;

public class TestDepot {

	public static void main(String[] args) {
		Compte c1 = new Compte();
		c1.solde = 100;
		c1.numero = 218;
		c1.titulaire="Dupont";
		c1.afficher();
		c1.deposer(800);
		c1.afficher();
	}
}