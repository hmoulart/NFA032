package fr.lecnam.nfa032.chapitre9;

public class Militaire {
	String nom;
	String grade;
	Militaire superieur;
	
	/**
	 * @param nom
	 * @param grade
	 * @param superieur
	 */
	public Militaire(String nom, String grade, Militaire superieur) {
		this.nom = nom;
		this.grade = grade;
		this.superieur = superieur;
	}
}
