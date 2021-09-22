package fr.lecnam.nfa032.chapitre9;

class GareDepart extends ArretSup {
	protected int numero;
	protected ArretSup premierArret;

	GareDepart(String s, int n, Heure heureDepart, ArretSup a) {
		super(s, null, heureDepart, a);
		numero = n;
		premierArret = a;
	}

	public String toString() {
		String res;
		res = "Train numero " + numero;
		res = res + " " + nomGare + " " + heureDepart.toString();
		return res;
	}

	public int nombreDeGares() {
		int res = 0;
		ArretSup a = this;
		while (a != null) {
			res++;
			a = a.getArretSuivant();
		}
		return res;
	}

	public Heure heureDePassage(String gare) throws PassePas {
		ArretSup a = this;
		while (a != null && !gare.equals(a.getNomGare())) {
			a = a.getArretSuivant();
		}
		if (a == null)
			throw new PassePas();
		else
			return a.getHeureArrivee();
	}
}
