package fr.lecnam.nfa032.chapitre2;

public class Date {
	int jour;
	int mois;
	int annee;
	static int nb; // Variable statique 
	
	public Date() {
		this.jour = 1;
		this.mois = 1;
		this.annee = 1;
	}
	
	public Date(int j) {
		this.jour = j;
	}
	
	public void DateMois(int m) {
		this.mois = m;
	}
	
	public Date(int j, int m, int a) {
		if (m > 0 && m < 13 && j <= longueur(m, a)) {
			this.jour = j;
			this.mois = m;
			this.annee = a;
		} else {
			throw new Error();
		}
	}
	
	public void afficherDate() {
		System.out.println(this.jour + "/" + this.mois + "/" + this.annee);
	}
	
	public static boolean bissextile(int a) {
		return ((a%4==0) && (!(a%100 ==0) || a%400==0));
	}
	
	public static int longueur(int m, int a) {
		if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8|| m == 10 || m == 12) {
			return 31;
		} else if (m==2) {
			if (bissextile(a)) {
				return 29;
			} else {
				return 28;
			}
		} else {
			return 30;
		}
	}
	
	public void passerAuLendemain() {
		if (this.jour < longueur(this.mois, this.annee)) {
			this.jour = this.jour + 1;
		} else if (this.mois == 12) {
			this.jour = 1; this.annee = this.annee + 1; this.mois = 1;
		} else {
			this.jour = 1; this.mois = this.mois + 1;
		}
	}
}