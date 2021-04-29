package fr.lecnam.nfa032.chapitre5;

public class Point implements AvecTranslation {
	double x, y;

	Point(double xi, double yi) {
		x = xi;
		y = yi;
	}

	static double distance(Point p1, Point p2) {
		return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
	}

	public void translation(double deplHor, double deplVer) {
		x = x + deplHor;
		y = y + deplVer;
	}
}
