package fr.lecnam.nfa032.chapitre7;

public class Test1ComptesBancaires {

	public static void main(String[] args) {
		CompteBancaire c1 ;
		CompteBancaire c2 ;
		CompteBancaire c3 ;
		String num1 = "123456789";
		String num2 = "145775544";
		String num3 = "A4545AA54";
		c1 = new CompteBancaire("Paul", num1.toCharArray(), 1000.00);
		c2 = new CompteBancaire("Paul", num2.toCharArray(), 2300.00);
		c3 = new CompteBancaire("Henri", num3.toCharArray(), 5000.00);
		c1.deposer(100.00);
		c2.virerVers(c1, 1000.00);
		System.out.println(c2.getSoldeCourant());
		System.out.println(c1.getSoldeCourant());
		
		CompteAvecDecouvert d1;
		String num4 = "DJHFH838";
		d1 = new CompteAvecDecouvert("Jacques", num4.toCharArray(), 6000.0, 0.0);
		d1.retrait(6000.0);
		System.out.println("Le retrait s'est bien passée. Nouveau solde = " + d1.getSoldeCourant());
		d1.fixerDecouvertMaximal(2000.0);
		d1.retrait(2000.0);
		System.out.println("Le retrait s'est bien passée. Nouveau solde = " + d1.getSoldeCourant());
		d1.deposer(5000.0);
		System.out.println("Solde = " + d1.getSoldeCourant());
		
		d1.deposer(5000);
		c1.virerVers(d1, 1000.00);
		d1.virerVers(c1, 1000.00);
		
		CompteBancaire c;
		String num = "AAA4AA54";
		
		c = new CompteBancaire("Marie", num.toCharArray(), 10000.00);
		c.retrait(100.00);
		c = new CompteAvecDecouvert("Marie", num.toCharArray(), 10000.00, 0.0);
		c.retrait(100.00);


	}
}
