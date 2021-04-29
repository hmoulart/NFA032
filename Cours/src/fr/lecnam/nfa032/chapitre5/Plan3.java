package fr.lecnam.nfa032.chapitre5;

public class Plan3 {

	public static void main(String[] args) {
		Point p1 = new Point(1, 3);
		Point p2 = new Point(1, 5);
		Point p3 = new Point(2, 4);
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
		AvecTranslation[] tab2 = new AvecTranslation[4];
		tab2[0] = new Triangle(p1, p2, p3);
		tab2[1] = new Rectangle(p1, 2.7, 5.0);
		tab2[2] = new Cercle(p1, 2.5);
		tab2[3] = new Point(1, 5);
		// on déplace tout vers la droite
		for (int i = 0; i < 4; i++) {
			tab2[i].translation(2.0, 0);
		}
	}
}