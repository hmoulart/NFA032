package fr.lecnam.nfa032.chapitre2;

public class Voiture {
	
	String marque;
	String couleur;
	int poids;
	int vitesseMaxi;
	int vitesseCourante;
	boolean etatMoteur; // true = moteur démarré / false = moteur éteint
	
	void initialiser() {
		this.marque = "Nissan";
		this.couleur = "rouge";
		this.poids = 1560;
		this.vitesseMaxi = 180;
		this.vitesseCourante = 0;
		this.etatMoteur = false; // Moteur eteint par défaut
	}
	
	void accelerer(int vitesse) {
		if (this.etatMoteur) {
			this.vitesseCourante = this.vitesseCourante + vitesse;
			if (vitesseCourante >= this.vitesseMaxi) {
				this.vitesseCourante = this.vitesseMaxi;
			}
		}
	}
	
	void lireCompteTour() {
		if (this.etatMoteur) {
			System.out.println("Vitesse actuelle de ma super " + this.marque + " " + this.couleur + " : " + this.vitesseCourante + " km/h");
		} else {
			System.out.println("Le moteur de ma super  " + this.marque + " est éteint !");
		}
	}
	
	// FIXME : Aucune vérification sur la vitesse courante négative !
	void ralentir(int vitesse) {
		if (this.etatMoteur) {
			this.vitesseCourante = this.vitesseCourante - vitesse;
		}
	}
	
	void freiner() {
		if (this.etatMoteur) {
			this.vitesseCourante = 0;
		}
	}
	
	void demarrerMoteur() {
		this.etatMoteur = true;
		this.vitesseCourante = 0;
	}
	
	void arreterMoteur() {
		this.etatMoteur = false;
		this.vitesseCourante = 0;
	}
}