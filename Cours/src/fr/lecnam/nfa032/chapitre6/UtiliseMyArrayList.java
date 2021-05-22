package fr.lecnam.nfa032.chapitre6;

public class UtiliseMyArrayList {

	public static void main(String[] args) {
		MyArrayList<Integer> mal5 = new MyArrayList<Integer>();
		mal5.add(7);
		mal5.add(12);
		int x = mal5.get(0);
		System.out.println(x); // 7
	}

}
