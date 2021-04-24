package fr.lecnam.nfa032.chapitre4;

import java.util.Scanner;

class Factorielle {
	static int factorielle(int n) throws PasDefini { // 1
		int res = 1;
		if (n < 0) {
			throw new PasDefini(); // 2
		}
		for (int i = 1; i <= n; i++) {
			res = res * i;
		}
		return res;
	}

	public static void main(String[] args) {
		int x;
		System.out.println("Entrez un nombre (petit):");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		try { // 3
			System.out.println(factorielle(x));
			System.out.println("Etape suivante");
		} catch (PasDefini e) { // 3 bis
			System.out.println("La factorielle de " + x + " n’est pas définie !");
		}
	}
}

class PasDefini extends Exception {
} // (4)
