package fr.lecnam.nfa032.chapitre9;

public class TestMilitaire {

	public static void main(String[] args) {
		Militaire leGrade = new Militaire("Thomas", "Général", null);
		Militaire soldat1 = new Militaire("Michu", "Soldat", leGrade);
		Militaire soldat2 = new Militaire("Jean", "Soldat", leGrade);
		Militaire soldat3 = new Militaire("Balene", "Soldat", leGrade);
	}
}
