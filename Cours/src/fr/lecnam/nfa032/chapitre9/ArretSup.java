package fr.lecnam.nfa032.chapitre9;

class ArretSup {
	protected String nomGare;
	protected Heure heureArrivee;
	protected Heure heureDepart;
	protected ArretSup arretSuivant;

	ArretSup(String n, Heure ha, Heure hd, ArretSup as) {
		nomGare = n;
		heureArrivee = ha;
		heureDepart = hd;
		arretSuivant = as;
	}

	public String toString() {
		return " " + nomGare + " " + heureArrivee.toString() + " " + heureDepart.toString();
	}

	public ArretSup getArretSuivant() {
		return arretSuivant;
	}

	public String getNomGare() {
		return nomGare;
	}

	public Heure getHeureArrivee() {
		return heureArrivee;
	}

	public Heure getHeureDepart() {
		return heureDepart;
	}

	public void setArretSuivant(ArretSup arr) {
		arretSuivant = arr;
	}

	public void setHeureArrivee(Heure h) {
		heureArrivee = h;
	}

	public void setHeureDepart(Heure h) {
		heureDepart = h;
	}

	public void afficher() {
		System.out.println(this.toString());
		if (arretSuivant != null)
			arretSuivant.afficher();
	}
}
