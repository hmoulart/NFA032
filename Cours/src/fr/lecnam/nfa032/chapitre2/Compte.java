package fr.lecnam.nfa032.chapitre2;

class Compte {
	int solde;
	String titulaire;
	int numero;

	void afficher(){
		System.out.println("solde: " + this.solde);
	}
	void deposer(int montant){
		this.solde = this.solde + montant;
	}
	void retirer(int montant){
		this.solde = this.solde - montant;
	}
}