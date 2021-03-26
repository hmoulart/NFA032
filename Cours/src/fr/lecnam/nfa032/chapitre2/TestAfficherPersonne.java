package fr.lecnam.nfa032.chapitre2;

public class TestAfficherPersonne {

	public static void main(String[] args) {
		Personne p1 = new Personne();
		Personne p2 = new Personne();
		p1.nom = "Martin";
		p1.prenom = "Jules";
		p1.age = 48;
		System.out.println(p1.getInfoPerso());
		System.out.println(p2.getInfoPerso());
	}
}