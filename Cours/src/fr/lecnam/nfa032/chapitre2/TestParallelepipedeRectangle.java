package fr.lecnam.nfa032.chapitre2;

public class TestParallelepipedeRectangle {

	public static void main(String[] args) {
		ParallelepipedeRectangle pr1 = new ParallelepipedeRectangle();
		pr1.hauteur = 5;
		pr1.largeur = 3;
		pr1.longueur = 10;
		System.out.println("Le volume de mon parallelepipede Rectange est de : " + pr1.getVolume());
	}
}