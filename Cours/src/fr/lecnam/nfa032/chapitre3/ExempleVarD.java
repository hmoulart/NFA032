package fr.lecnam.nfa032.chapitre3;

public class ExempleVarD {

	public static void main(String[] args) {
		int[] tab1, tab2;
		Objet obj1, obj2;
		obj1 = new Objet(3);
		obj2 = obj1;
		obj2.x = 17;
		System.out.println(obj1.x);
		tab1 = new int[3];
		tab2 = tab1;
		tab2[1] = 12;
		System.out.println(tab1[1]);
	}
}