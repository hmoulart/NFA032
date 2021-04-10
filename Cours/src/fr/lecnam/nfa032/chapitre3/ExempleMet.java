package fr.lecnam.nfa032.chapitre3;

public class ExempleMet {

	static int carre(int x) {
		int res = x * x;
		return res;
	}

	static int carreDeMoitie(int nb) {
		int res;
		res = carre(nb / 2);
		return res;
	}

	public static void main(String[] args) {
		int x, y;
		x = 5;
		y = carreDeMoitie(x + 1);
		System.out.println(y);
	}
}