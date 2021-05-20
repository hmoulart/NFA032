package fr.lecnam.nfa032.chapitre6;

public class UtiliseMyArrayList {

	public static void main(String[] args) {
		MyArrayList<String> mal;
		mal = new MyArrayList<String>();
		mal.add("un");
		mal.add("deux");
		System.out.println(mal.size());
		System.out.println(mal.get(0));
		
		
		
		MyArrayList<Integer> mal2;
		mal2 = new MyArrayList<Integer>();
		mal2.add(10);
		mal2.add(20);
		mal2.add(30);
		mal2.add("coucou");
		System.out.println(mal2.size());
		System.out.println(mal2.get(2));
		
	}

}
