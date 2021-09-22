package fr.lecnam.nfa032.chapitre9;

class Arret {
	private String nomGare;
	private Heure heure;
	private Arret arretSuivant;

	public Arret(String n, Heure h, Arret as) {
		nomGare = n;
		heure = h;
		arretSuivant = as;
	}

	public void setArretSuivant(Arret arr) {
		arretSuivant = arr;
	}

	public String toString() {
		return nomGare + " " + heure.toString();
	}

	public Arret getArretSuivant() {
		return arretSuivant;
	}

	public String getNomGare() {
		return nomGare;
	}

	public Heure getHeure() {
		return heure;
	}
}