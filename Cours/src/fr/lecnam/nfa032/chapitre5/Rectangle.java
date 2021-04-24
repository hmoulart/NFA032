package fr.lecnam.nfa032.chapitre5;

public class Rectangle implements AvecSurface {

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

}
