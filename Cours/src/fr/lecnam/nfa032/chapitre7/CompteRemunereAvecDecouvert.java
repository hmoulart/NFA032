package fr.lecnam.nfa032.chapitre7;

public class CompteRemunereAvecDecouvert extends CompteRemunere {
	double decouvertMax;

	public CompteRemunereAvecDecouvert(String proprio, char[] num, double montant, double taux, double decouvertMax) {
		super(proprio, num, montant, taux);
		this.decouvertMax = decouvertMax;
	}
	
	public void fixerDecouvertMaximal(double montant) {
		this.decouvertMax = montant;
	}
	
	public void retrait(double montant) {
		System.out.println("Appel de retrait sur compte rémunéré avec découvert");
		if (this.solde - montant < -decouvertMax) {
			throw new ProvisionInsuffisanteErreur();
		} else {
			solde = solde - montant;
		}
	}
}
