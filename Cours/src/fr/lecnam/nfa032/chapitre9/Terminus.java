package fr.lecnam.nfa032.chapitre9;

class Terminus extends ArretSup {
	Terminus(String n, Heure heureArr) {
		super(n, heureArr, null, null);
	}

	public String toString() {
		return " " + nomGare + " " + heureArrivee.toString();
	}
}
