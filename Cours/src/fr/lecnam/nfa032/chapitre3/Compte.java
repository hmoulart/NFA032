package fr.lecnam.nfa032.chapitre3;

public class Compte {
	public int solde = 0;

	void deposer(int x) {
		this.solde = this.solde + x;
	}
}