package fr.lecnam.nfa032.chapitre3;

public class ExoRefTableau {

	public static void main(String[] args) {
		int[] t1, t2, t3, t4, t5;
		t2 = new int[4];
		t3 = new int[4];
		t4 = new int[4];
		for (int i = 0; i < t3.length; i++) {
			t3[i] = 10 + i;
			t4[i] = 10 + i;
		}
		t5 = t4;
	}
}