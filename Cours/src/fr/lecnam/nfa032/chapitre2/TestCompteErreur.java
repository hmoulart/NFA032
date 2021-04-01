package fr.lecnam.nfa032.chapitre2;

public class TestCompteErreur {

	public static void main(String[] args) {
		Compte2 c1 = new Compte2(100010, "Christian");
		// Décommenter ici les 3 lignes suivantes pour voir apparaitre les 3 erreurs de compilations
		//c1.solde = 100;
		//c1.numero = 1;
		//c1.titulaire = "Charles";
	}
}
