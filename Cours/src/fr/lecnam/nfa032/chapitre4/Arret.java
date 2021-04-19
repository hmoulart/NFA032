package fr.lecnam.nfa032.chapitre4;

import java.util.Scanner;

public class Arret {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println("Etape 1");
		if (x > 0) {
			throw new Stop();
		}
		System.out.println("Etape 2");
		System.out.println("Etape 3");
		System.out.println("Etape 4");

	}
}

class Stop extends RuntimeException {}