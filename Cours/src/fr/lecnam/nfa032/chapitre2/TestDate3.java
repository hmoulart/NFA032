package fr.lecnam.nfa032.chapitre2;

public class TestDate3 {

	public static void main(String[] args) {
		Date d2 = new Date();
		d2.annee = 2000;
		d2.jour = 28;
		d2.mois = 2;
		d2.afficherDate();
		d2.passerAuLendemain();
		d2.afficherDate();
		d2.passerAuLendemain();
		d2.afficherDate();
	}
}