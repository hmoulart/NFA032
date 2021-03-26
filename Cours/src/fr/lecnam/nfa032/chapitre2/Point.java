package fr.lecnam.nfa032.chapitre2;

public class Point {
	char nom;
	double abs;
	
	/**
	 * Méthode permet d'initialiser les variables d'instances de la classe Point
	 * @param nom Nom du point
	 * @param abs La coordonnée du point
	 */
	void initialise(char nom, double abs) {
		this.nom = nom;
		this.abs = abs;
	}
	
	/**
	 * Méthode d'affichage des informations de la classe Point
	 */
	void affiche() {
		System.out.println("Nom du point : " + this.nom + " - Coordonnée : " + this.abs);
	}
	
	/**
	 * Méthode qui permet de modifier la coordonnée du point
	 * @param newAbs Nouvelle coordonnée du point
	 */
	void translate(double newAbs) {
		this.abs = newAbs;
	}
}