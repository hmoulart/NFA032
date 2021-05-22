package fr.lecnam.nfa032.chapitre6;

import java.util.ArrayList;

public class Humain implements Filiation<Humain> {
	String nom;
	Humain pere;
	ArrayList<Humain> fils;

	// Constructeur de Humain permettant de définir le nom et un tableau vide de fils
	public Humain(String n) {
		nom = n;
		fils = new ArrayList<Humain>();
	}

	// Récupération de la liste des fils de l’humain instanciée
	public Humain[] getFils() {
		return fils.toArray(new Humain[0]);
	}

	// Déclaration de nouveaux fils
	public void declareFils(Humain t) {
		// Si un père de l’humain en paramètre est défini 
		if (t.pere != null) {
			t.pere.fils.remove(fils);
		}
		t.pere = this;
		this.fils.add(t);
	}

	public boolean estFils(Humain t) {
		return t.pere.equals(this);
	}

	public boolean estPere(Humain t) {
		return this.pere.equals(t);
	}

	public boolean estAncetre(Humain t) {
		Humain ancetre = t.pere;
		while (ancetre != null && ancetre != this) {
			ancetre = ancetre.pere;
		}
		return (ancetre != null);
	}
}
