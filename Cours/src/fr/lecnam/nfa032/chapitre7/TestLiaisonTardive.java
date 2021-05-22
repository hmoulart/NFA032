package fr.lecnam.nfa032.chapitre7;

import java.util.Scanner;

public class TestLiaisonTardive {

	public static void main(String[] args) {
		CompteBancaire c;
		String num = "AAA4AA54";
		System.out.println("Voulez vous créer un compte ordinaire O/N :");
		Scanner sc = new Scanner(System.in);
		String reponse = sc.nextLine();
		if (reponse.equals("O") || reponse.equals("o")) {
			System.out.println("Création d’un compte ordinaire");
			c = new CompteBancaire("Marie", num.toCharArray(), 10000.00);
		} else {
			System.out.println("Création d’un compte avec découvert");
			System.out.println("Quel est le découvert maximal autorisé: ");
			double max;
			max = sc.nextDouble();
			c = new CompteAvecDecouvert("Marie", num.toCharArray(), 10000.00, max);
		}
		System.out.println("Solde avant retrait " + c.getSoldeCourant());
		System.out.println("Tentative de retrait de 11000.00");
		c.retrait(11000.00);
		System.out.println("Le retrait c’est bien passée ; nouveau solde = " + c.getSoldeCourant());
	}

}
