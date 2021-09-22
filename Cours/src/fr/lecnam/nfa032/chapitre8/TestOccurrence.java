package fr.lecnam.nfa032.chapitre8;

public class TestOccurrence {
	
	static int nbOccurrences (char c, String s) {
		if(s.length() == 0) return 0; //condition d’arret: chaine vide
		else{
			int sous_resultat = nbOccurrences(c, s.substring(1, s.length()));
			if(s.charAt(0) == c) return 1 + sous_resultat;
			else return sous_resultat;
		}
	}


	public static void main(String[] args) {
		System.out.println(nbOccurrences('n', "mamanmaman"));

	}

}