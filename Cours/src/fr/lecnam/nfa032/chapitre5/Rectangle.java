package fr.lecnam.nfa032.chapitre5;

public class Rectangle implements AvecSurface, AvecTranslation {

	Point basGauche;
	double dimHor, dimVer;

	Rectangle(Point bg, double dh, double dv) {
		basGauche = bg;
		dimHor = dh;
		dimVer = dv;
	}

	public double surface() {
		return dimHor * dimVer;
	}

	public void translation(double deplHor, double deplVer) {
		basGauche.translation(deplHor, deplVer);
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