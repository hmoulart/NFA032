package fr.lecnam.nfa032.chapitre7;

public class CompteBancaire {
	protected String nomProprietaire;
	protected char[] numero;
	protected double solde;
	
	public CompteBancaire() {
		// Constructeur vide
	}
	
	public CompteBancaire(String proprio, char[] num, double montant) {
		this.nomProprietaire = proprio;
		this.numero = num;
		this.solde = montant;
	}
	
	public double getSoldeCourant() {
		return this.solde;
	}
	
	public void deposer(double montant) {
		this.solde = this.solde + montant;
	}

	public void retrait(double montant) {
		System.out.println("Appel de retrait sur compte simple");
		if (this.solde < montant) {
			throw new ProvisionInsuffisanteErreur();
		} else {
			solde = solde - montant;
		}
	}
	
	public void virerVers(CompteBancaire c, double montant) {
		c.retrait(montant);
		this.deposer(montant);
	}
}
