package fr.lecnam.nfa032.chapitre9;

public class Train3 {
	public static void main(String[] args) throws PasHeure, PassePas {
		ArretSup trainprov;
		GareDepart letrain;
		trainprov = new Terminus("Chambery", new Heure(14, 29));
		trainprov = new ArretSup("Albertville", new Heure(13, 40), new Heure(13, 42), trainprov);
		trainprov = new ArretSup("Moutiers-Salins", new Heure(13, 12), new Heure(13, 15), trainprov);
		letrain = new GareDepart("Bourg-Saint-Maurice", 4652, new Heure(12, 32), trainprov);
		letrain.afficher();
		System.out.println(letrain.nombreDeGares() + " gares");
		System.out.println(" arret a Moutiers: " + letrain.heureDePassage("Moutiers-Salins"));
	}
}
