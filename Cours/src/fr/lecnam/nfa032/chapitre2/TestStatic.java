package fr.lecnam.nfa032.chapitre2;

public class TestStatic {

	public static void main(String[] args) {
		Date d1 = new Date(1, 1, 2000);
		Date d2 = new Date(2, 2, 2004);
		System.out.println(Date.nb); // Accès à nb par la classe Date.
		System.out.println(d1.nb); // Accès à nb par une variable d’instance
		System.out.println(d2.nb); // Accès à nb par une autre variable d’instance
		Date.nb = 2;
		System.out.println(Date.nb + "/" + d1.nb + "/" + d2.nb);
		d1.nb = 1;
		d1.jour = 23;
		System.out.println(Date.nb + "/" + d1.nb + "/" + d2.nb);
		System.out.println(d1.jour + ", " + d2.jour);
	}
}