package fr.lecnam.nfa032.chapitre2;

import java.util.Scanner;

public class ExerciceTestPersonne {

	public static void main(String[] args) {
		// Initialisation des variables
		Personne[] tab;
		String nom = "";
		String prenom = "";
		int age = 0;
		int max, min;
		int positionMax = 0, positionMin = 0;
		int somme = 0;
		float moyenne = 0;

		// Question à l'utilisateur
		System.out.println("Veuillez donner le nombre de personnes à stocker :");
		Scanner sc = new Scanner(System.in);
		int nombreDePersonnes = sc.nextInt();

		tab = new Personne[nombreDePersonnes];

		for (int i = 0; i < tab.length; i++) {
			System.out.println("Quel est le nom de la personne n" + (i + 1));
			nom = sc.next(); // Si vous utilisez nextLine(), cela ne fonctionnera pas (car utilisation de nextInt())
			System.out.println("Quel est le prenom de la personne n" + (i + 1));
			prenom = sc.next();
			System.out.println("Quel est l'age de la personne n" + (i + 1));
			age = sc.nextInt();

			Personne p = new Personne();
			p.initialise(nom, prenom, age);
			tab[i] = p;
		}

		// Affichage des informations personnelles des personnes
		for (Personne personne : tab) {
			System.out.println(personne.getInfoPerso());
		}

		// Age maximum et mininum des personnes
		max = tab[0].age;
		min = tab[0].age;

		for (int i = 0; i < tab.length; i++) {
			if (max < tab[i].age) {
				max = tab[i].age;
				positionMax = i;
			}
			if (min > tab[i].age) {
				min = tab[i].age;
				positionMin = i;
			}
		}

		System.out.println("La personne la plus agée est " + tab[positionMax].getInfoPerso());
		System.out.println("La personne la moins agée est " + tab[positionMin].getInfoPerso());

		// Calcul de l'age moyen
		for (int i = 0; i < tab.length; i++) {
			somme += tab[i].age;
		}
		moyenne = (float) somme / nombreDePersonnes;

		System.out.println("la moyenne d'age est " + moyenne);
	}
}