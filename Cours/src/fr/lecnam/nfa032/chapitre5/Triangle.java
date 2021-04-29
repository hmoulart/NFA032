package fr.lecnam.nfa032.chapitre5;

class Triangle implements AvecSurface, AvecTranslation {
	Point p1, p2, p3;

	Triangle(Point p1i, Point p2i, Point p3i) {
		p1 = p1i;
		p2 = p2i;
		p3 = p3i;
	}

	public double surface() {
		double a = Point.distance(p1, p2);
		double b = Point.distance(p1, p3);
		double c = Point.distance(p2, p3);
		double demiper = (a + b + c) / 2;
		return Math.sqrt(demiper * (demiper - a) * (demiper - b) * (demiper - c));
	}

	@Override
	public void translation(double deplHor, double deplVer) {
		p1.translation(deplHor, deplVer);
		p2.translation(deplHor, deplVer);
		p3.translation(deplHor, deplVer);
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