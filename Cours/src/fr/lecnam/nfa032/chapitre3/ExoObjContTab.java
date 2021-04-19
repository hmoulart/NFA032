package fr.lecnam.nfa032.chapitre3;

public class ExoObjContTab {

	public static void main(String[] args) {
		C3 pl1, pl2, pl3;
		C1 cl1;
		cl1 = new C1(0);
		pl1 = new C3();
		pl2 = new C3();
		pl2.tab = new C1[3];
		pl3 = new C3();
		pl3.tab = new C1[3];
		pl3.tab[1] = cl1;
		pl3.tab[2] = cl1;
	}
}