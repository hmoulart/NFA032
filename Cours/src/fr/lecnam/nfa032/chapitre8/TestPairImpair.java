package fr.lecnam.nfa032.chapitre8;

import java.util.Scanner;

public class TestPairImpair {

	static boolean pair(int n) {
		if (n < 0)
			throw new MauvaisParametre();
		else if (n == 0)
			return true;
		else if (n == 1)
			return false;
		else
			return impair(n - 1);
	}

	static boolean impair(int n) {
		if (n < 0)
			throw new MauvaisParametre();
		else if (n == 0)
			return false;
		else if (n == 1)
			return true;
		else
			return pair(n - 1);
	}

	public static void main(String[] args) {
		System.out.print("Entrez un entier positif : ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if (pair(x))
			System.out.println("nombre pair");
		else
			System.out.println("nombre impair");
	}

}
class MauvaisParametre extends Error{}