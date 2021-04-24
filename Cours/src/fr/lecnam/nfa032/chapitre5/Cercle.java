package fr.lecnam.nfa032.chapitre5;

public class Cercle implements AvecSurface {

	Point centre;
	double rayon;

	Cercle(Point ctr, double r) {
		centre = ctr;
		rayon = r;
	}

	public double surface() {
		return Math.PI * rayon * rayon;
	}

}
