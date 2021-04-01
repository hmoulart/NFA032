package fr.lecnam.nfa032.chapitre2;

class Compte2 {
	private int solde;
	private String titulaire;
	private int numero;

	Compte2(int num, String tit) {
		titulaire = tit;
		numero = num;
		solde = 0;
	}

	int getNumero() {
		return numero;
	}

	String getTitulaire() {
		return titulaire;
	}

	int getSolde() {
		return solde;
	}

	void afficher() {
		System.out.println("solde" + this.solde);
	}

	void deposer(int montant) {
		this.solde = this.solde + montant;
	}

	void retirer(int montant) {
		this.solde = this.solde - montant;
	}
}