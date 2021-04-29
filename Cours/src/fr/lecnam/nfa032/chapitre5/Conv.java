package fr.lecnam.nfa032.chapitre5;

public class Conv {

	public static void main(String[] args) {
		Point p = new Point(1,3);
		Cercle c1 = new Cercle(p,2.3);
		AvecSurface c2 = new Cercle(p,5);
		AvecTranslation c3 = new Cercle(p,4.2);
		c2 = c1; // OK
		c1 = c2; // erreur à la compilation
		c2 = c3; // erreur à la compilation
	}
}