package fr.lecnam.nfa032.chapitre2;

class ParallelepipedeRectangle {
	
	// Mes 2 variables d'instances de ma classe Parallelepipede Rectange
	int longueur;
	int largeur;
	int hauteur;
	
	// Ma méthode d'initialisation
	void init(int lon, int lar, int hau) {
		longueur = lon;
		largeur = lar;
		hauteur = hau;
	}
	
	// Le calcul du volume du Parallelepipede Rectange
	int getVolume() {
		return longueur * largeur * hauteur;
	}
}