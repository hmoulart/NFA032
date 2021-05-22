package fr.lecnam.nfa032.chapitre7;

public class CompteAvecDecouvert extends CompteBancaire {

	double decouvertMax;

	/**
	 * @param proprio
	 * @param num
	 * @param montant
	 */
	public CompteAvecDecouvert(String proprio, char[] num, double montant, double decouvertMax) {
		super(proprio, num, montant);
		this.decouvertMax = decouvertMax;
	}
	
	public void fixerDecouvertMaximal(double montant) {
		this.decouvertMax = montant;
	}
	
	public void retrait(double montant) {
		System.out.println("Appel de retrait sur compte avec découvert");
		if (this.solde - montant < -decouvertMax) {
			throw new ProvisionInsuffisanteErreur();
		} else {
			solde = solde - montant;
		}
	}
}
