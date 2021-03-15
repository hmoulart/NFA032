package fr.lecnam.nfa032.chapitre1;

import java.util.Scanner;

public class LeJustePrix {
	
	private static final String JUSTE_PRIX_A_TROUVER[][] = 
		{
			{"MacBook Air 11 pouces 4Go de RAM", "999"},
			{"Liseuse Kindle Paperwhite", "129"},
			{"Drone DJI Phantom 3 Standard", "599"},
			{"iPhone 7 Plus 32 Go", "909"},
			{"Google Chromecast Noir", "35"},
			{"Enceinte sans fil Bose SoundTouch 20 III", "399"},
			{"GoPro Hero Session", "219"}
		};
	private static final int CHANCE_MAX = 5;
	private static final Scanner READER = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("==> Bonjour et bienvenue au Juste Prix ! <==");
		affichageObjet();
		int objetSelectionne = 0;
		do {
			try {
				String saisie = READER.nextLine();
				objetSelectionne = Integer.valueOf(saisie);
				if (objetSelectionne <= 0 || objetSelectionne > JUSTE_PRIX_A_TROUVER.length) {
					erreurSaisieObjet();
				}
			} catch (Exception e) {
				erreurSaisieObjet();
			}
		} while (objetSelectionne <= 0 || objetSelectionne > JUSTE_PRIX_A_TROUVER.length);
		System.out.println(String.format("Vous avez %d tentative(s) pour trouver le juste prix de %s", CHANCE_MAX, JUSTE_PRIX_A_TROUVER[objetSelectionne-1][0]));
		System.out.println("Trois, deux, un, c'est partie !");
		
		int justePrix = Integer.parseInt(JUSTE_PRIX_A_TROUVER[objetSelectionne-1][1]);
		int prix = 0;
		int compteur = 1;
		while (prix != justePrix && compteur <= CHANCE_MAX) {
			try {
	            prix = Integer.valueOf(READER.nextLine());
	            if (prix < justePrix) {
	                System.out.println("C'est plus...");
	                compteur++;
	            }
	            if (prix > justePrix) {
	                System.out.println("C'est moins...");
	                compteur++;
	            }
			} catch (Exception e) {
				System.err.println("Erreur de saisie !");
			}
        }

		if (compteur >= CHANCE_MAX) {
			System.err.println("Perdu... Vous avez dépassé les " + CHANCE_MAX + " tentatives");
		} else {
			System.out.println(String.format("Bravo ! Vous avez gagné en %d fois !", compteur));
		}
	}
	
	private static void affichageObjet() {
		System.out.println("Selectionner un objet et tenter de trouver le juste prix !");
		for (int i = 0; i < JUSTE_PRIX_A_TROUVER.length; i++) {
			System.out.println(i+1 + ". " + JUSTE_PRIX_A_TROUVER[i][0]);
		}
		System.out.println(String.format("Quelle est votre choix ? (La saisie doit être comprise entre 1 et %d)", JUSTE_PRIX_A_TROUVER.length));
	}
	
	private static void erreurSaisieObjet() {
		System.err.println(String.format("Désolé, votre saisie doit être comprise entre 1 et %d. Veuillez recommencer.", JUSTE_PRIX_A_TROUVER.length));
	}
}
