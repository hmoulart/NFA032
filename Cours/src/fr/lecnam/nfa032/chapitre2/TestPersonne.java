package fr.lecnam.nfa032.chapitre2;

public class TestPersonne {

	public static void main(String[] args) {
		Personne p1 = new Personne();
		Personne p2 = new Personne();
		p1.nom = "Martin";
		p1.prenom = "Jules";
		p1.age = 48;
		p2 = p1;
		p2.age = 52;
		System.out.println("Valeur de l’objet Personne p1 : " + p1.nom + ", " + p1.prenom + ", " + p1.age);
		System.out.println("Valeur de l’objet Personne p2 : " + p2.nom + ", " + p2.prenom + ", " + p2.age);
	}
}
