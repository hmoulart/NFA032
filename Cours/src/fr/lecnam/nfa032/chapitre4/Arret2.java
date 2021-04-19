package fr.lecnam.nfa032.chapitre4;

import java.util.Scanner;

public class Arret2 {

	public static void P() {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if (x > 0) {
			throw new Stop();
		}
	}

	public static void main(String[] args) {
		System.out.println("Etape 1"); // 1
		try {
			P();
			System.out.println("Etape 2"); // 2
		} catch (Stop e) {
			System.out.println("Etape 3"); // 3
		}
		System.out.println("Etape 4"); // 4
	}
}

class Stop extends RuntimeException {}