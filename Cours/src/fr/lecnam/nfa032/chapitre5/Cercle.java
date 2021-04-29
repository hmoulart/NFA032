package fr.lecnam.nfa032.chapitre5;

public class Cercle implements AvecSurface, AvecTranslation {

	Point centre;
	double rayon;

	Cercle(Point ctr, double r) {
		centre = ctr;
		rayon = r;
	}

	public double surface() {
		return Math.PI * rayon * rayon;
	}

	public void translation(double deplHor, double deplVer) {
		centre.translation(deplHor, deplVer);
	}

	public int compareSurface(AvecSurface as) {
		int res = 0;
		if (this.surface() < as.surface()) {
			res = -1;
		} else if (this.surface() > as.surface()) {
			res = 1;
		}
		return res;
	}
}