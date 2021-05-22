package fr.lecnam.nfa032.chapitre7;

public class CompteRemunere extends CompteBancaire {
	double taux;
	double interets;
	
	public CompteRemunere(String proprio, char[] num, double montant, double taux) {
		super(proprio, num, montant);
		fixerTaux(taux);
		this.interets = 0.0;
	}
	
	public void fixerTaux(double taux) {
		this.taux = taux;
	}
	
	public void retrait(double montant) {
		System.out.println("Appel de retrait sur compte rémunéré");
		if (this.solde < montant) {
			throw new ProvisionInsuffisanteErreur();
		} else {
			solde = solde - montant;
		}
	}
	
	public void calculerInteret() {
		this.interets = interets + 1.0; // Le code en réalité est bien plus complexe
	}
}
