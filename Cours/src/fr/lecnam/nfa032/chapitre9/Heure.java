package fr.lecnam.nfa032.chapitre9;

class Heure {
	private int minutes, heures;

	public Heure(int h, int m) throws PasHeure {
		if (h < 0 || h > 23 || m < 0 || m > 59)
			throw new PasHeure();
		heures = h;
		minutes = m;
	}

	public String toString() {
		return "" + heures + ":" + minutes;
	}

	public void ajouterDelai(int heuresenplus, int minutesenplus) {
		heures = (heures + heuresenplus + ((minutes + minutesenplus) / 60)) % 24;
		minutes = (minutes + minutesenplus) % 60; // modulo 60
	}

}