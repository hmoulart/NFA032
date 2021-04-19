package fr.lecnam.nfa032.chapitre4;

import java.util.Scanner;

public class Arret3 {
	public static void P() {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if (x > 0) {
			throw new Stop2();
		}
	}

	public static void main(String[] args) {
		System.out.println("Etape 1"); // 1
		try {
			P();
			System.out.println("Etape 2"); // 2
		} catch (Stop e) {
			System.out.println("Etape 3"); // 3
		} catch (Stop2 e) {
			System.out.println("Etape 3 bis"); // 3bis
		}
		System.out.println("Etape 4"); // 4
	}
}

class Stop extends RuntimeException {}
class Stop2 extends RuntimeException {}