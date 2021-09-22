package fr.lecnam.nfa032.chapitre8;

public class TestInverse {

	static void affichageInverse(int[] t, int n){
		if(n==0) System.out.println(t[0]); //condition d’arret: un seul element
		else {
			System.out.println(t[n]);
			affichageInverse(t, n-1);
		}
	}


	public static void main(String[] args) {
		int[] monTableauEntier = {3, 5, 65, 23, 67};
		affichageInverse(monTableauEntier, 4);
	}

}
