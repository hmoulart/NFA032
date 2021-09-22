package fr.lecnam.nfa032.chapitre9;

public class Train {
	private int numero;
	private Arret premierArret;

	public Train(int n, Arret a) {
		numero = n;
		premierArret = a;
	}

	public static void main(String[] args) throws PasHeure {
		Arret a1, a2, a3, a4;
		Train t;
		a1 = new Arret("Chambery", new Heure(14, 29), null);
		a2 = new Arret("Albertville", new Heure(13, 40), a1);
		a3 = new Arret("Moutiers-Salins", new Heure(13, 12), a2);
		a4 = new Arret("Bourg-Saint-Maurice", new Heure(12, 32), a3);
		t = new Train(4652, a4);
		t.afficher();
		System.out.println("Nombre de gares parcouru par le train : " + t.nombreDeGares());
		try {
			System.out.println(t.heureDePassage("Albertville"));
		} catch (PassePas e) {
			System.out.println("Le train ne passe pas par cette gare");
		}
		t.enregistrerRetard(1, 30);
		t.afficher();

		Train t1 = new Train(5385, null);
		t1.ajouterArretDebut("Chambery", new Heure(14, 29));
		t1.ajouterArretDebut("Albertville", new Heure(13, 40));
		t1.ajouterArretDebut("Moutiers-Salins", new Heure(13, 12));
		t1.ajouterArretDebut("Bourg-Saint-Maurice", new Heure(12, 32));
		t1.ajouterALaFin("Lille", new Heure(19, 54));
		try {
			t1.supprimerArret("lille");
		} catch (PassePas e) {
			System.out.println("Passe pas");
		}
		t1.afficher();
	}

	void afficher() {
		System.out.println("Train numero " + numero);
		Arret a = premierArret;
		while (a != null) {
			System.out.println(a.toString());
			a = a.getArretSuivant();
		}
	}

	public int nombreDeGares() {
		int res = 0;
		Arret a = premierArret;
		while (a != null) {
			res++;
			a = a.getArretSuivant();
		}
		return res;
	}

	public Heure heureDePassage(String gare) throws PassePas {
		Arret a = premierArret;
		while (a != null && !gare.equalsIgnoreCase(a.getNomGare())) {
			a = a.getArretSuivant();
		}
		if (a == null)
			throw new PassePas();
		else
			return a.getHeure();
	}

	public void enregistrerRetard(int heuresenplus, int minutesenplus) {
		Arret a = premierArret;
		while (a != null) {
			a.getHeure().ajouterDelai(heuresenplus, minutesenplus);
			a = a.getArretSuivant();
		}
	}

	public void ajouterArretDebut(String nomGare, Heure h) {
		Arret nouveau = new Arret(nomGare, h, premierArret);
		premierArret = nouveau;
	}

	public void ajouterALaFin(String nomGare, Heure h) {
		Arret nouveau = new Arret(nomGare, h, null);
		if (premierArret == null) {
			premierArret = nouveau;
		} else {
			Arret arr = premierArret;
			while (arr.getArretSuivant() != null) {
				arr = arr.getArretSuivant();
			}
			arr.setArretSuivant(nouveau);
		}
	}

	public void supprimerArret(String ng) throws PassePas {
		if (premierArret == null)
			throw new PassePas();
		if (premierArret.getNomGare().equals(ng))
			premierArret = premierArret.getArretSuivant();
		else {
			Arret precedent = premierArret;
			while (precedent.getArretSuivant() != null && !precedent.getArretSuivant().getNomGare().equalsIgnoreCase(ng)) {
				precedent = precedent.getArretSuivant();
			}
			if (precedent.getArretSuivant() == null)
				throw new PassePas();
			precedent.setArretSuivant(precedent.getArretSuivant().getArretSuivant());
		}
	}
}
