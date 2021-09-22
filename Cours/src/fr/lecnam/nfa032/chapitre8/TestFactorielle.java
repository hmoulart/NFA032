package fr.lecnam.nfa032.chapitre8;

import java.util.Scanner;

public class TestFactorielle {

	static int factorielle (int n) {
		int resultat;
		if(n<0) throw new MauvaisParametre();
		else if(n==0) resultat = 1;
		else {
			int sous_resultat = factorielle (n-1); //appel recursif
			resultat = sous_resultat *n;
		} return resultat;
	}


	public static void main(String[] args) {
		System.out.println("Entrez un entier positif : "); // Max 31 à implémenter pour éviter d'avoir un résultat non cohérent
		Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
			System.out.println(x + "! = " + factorielle(x));
	}

}

class MauvaisParametre extends Error{}