package fr.lecnam.nfa032.chapitre2;

class Personne {
	/**
	 * Variables de classe
	 */
	String nom;
	String prenom;
	int age;
	
	/**
	 * Méthode qui initialise les 3 variables de la classe "Personne"
	 * Cela permet d'initialiser la classe
	 * @param n Le nom de la personne
	 * @param p Le prénom de la personne
	 * @param a L'âge de la personne
	 */
	void initialise(String n, String p, int a) {
		this.nom = n;
		this.prenom = p;
		this.age = a;
	}
	
	/**
	 * Méthode getInfoPerso permettant d'afficher un texte par défaut
	 */
	String getInfoPerso() {
		return String.format("Je me présente, je m'appelle %s %s, et j'ai %d an(s)", this.prenom, this.nom, this.age);
	}
}
