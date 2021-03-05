package fr.lecnam.nfa032.chapitre1;

import java.util.Scanner;

public class TriangleIsocele {
	
	final static char ETOILE = '*'; // Caractère de remplissage du triangle
	final static char ESPACE = ' '; // Caractère espace
	
	public static void main(String[] args) {
		int nbLignes; // Nombre total de lignes
		int numLigne; // Compteur de ligne
		int numEspaces; // Nombre d’espaces précédent une étoile
		
		System.out.print("Combien de lignes ?");
		Scanner sc = new Scanner(System.in);
		nbLignes = Integer.parseInt(sc.nextLine());

		for (numLigne = 0; numLigne < nbLignes; numLigne++) {
			numEspaces = nbLignes - numLigne - 1;
			for (int j=0; j<numEspaces; j++) System.out.print(ESPACE);
			for (int j=0; j<2*numLigne+1; j++) System.out.print(ETOILE);
			System.out.println();
		}
	}
}
