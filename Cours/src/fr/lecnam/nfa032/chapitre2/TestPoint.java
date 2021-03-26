package fr.lecnam.nfa032.chapitre2;

public class TestPoint {

	public static void main(String[] args) {
		Point p1 = new Point();
		Point p2 = new Point();
		p1.initialise('A', 1.7);
		p2.initialise('B', -5.9);
		
		p1.affiche();
		p2.affiche();
		
		p2.translate(5.1);
		
		p1.affiche();
		p2.affiche();
	}
}