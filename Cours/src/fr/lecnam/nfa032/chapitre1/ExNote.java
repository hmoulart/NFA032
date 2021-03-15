package fr.lecnam.nfa032.chapitre1;

import java.util.Scanner;

public class ExNote {

	public static void main(String[] args) {
		int note;
		System.out.println("Entrez votre note: ");
		Scanner sc = new Scanner(System.in);
		note = sc.nextInt();
		while (note<0 || note>20){
			System.out.println("Vous vous êtes trompé");
			System.out.println("La note doit être comprise entre 0 et 20");
			System.out.println("Veuillez recommencer");
			System.out.println("Entrez votre note: ");
			note = sc.nextInt();
		}
		System.out.println("Votre note est " + note);
		sc.close();
	}
}