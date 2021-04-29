package fr.lecnam.nfa032.chapitre5;

public class Plan5 {

	public static void main(String[] args) {
		Point p1 = new Point(1, 3);
		Point p2 = new Point(1, 5);
		Point p3 = new Point(2000000, 4);
		Triangle t = new Triangle(p1, p2, p3);
		Cercle c = new Cercle(p1, 2.5);
		Rectangle r = new Rectangle(p1, 2.7, 5.0);
		AvecSurface as = t;
		AvecSurface[] tab = new AvecSurface[3];
		tab[0] = new Triangle(p1, p2, p3);
		tab[1] = new Rectangle(p1, 2.7, 5.0);
		tab[2] = new Cercle(p1, 2.5);
		for (int i = 0; i < 3; i++) {
			System.out.println("surface de tab[" + i + "]: " + tab[i].surface());
		}
		AvecSurface plusGrand = tab[0];
		for (int i = 1; i < 3; i++) {
			if (plusGrand.compareSurface(tab[i]) < 0) {
				plusGrand = tab[i];
			}
		}
		System.out.println("Le plus grand: " + plusGrand.getClass().getName());
	}
}