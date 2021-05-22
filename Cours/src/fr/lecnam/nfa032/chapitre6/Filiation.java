package fr.lecnam.nfa032.chapitre6;

public interface Filiation<T> {
	T[]getFils();
	void declareFils(T fils);
	boolean estFils(T t);
	boolean estPere(T t);
	boolean estAncetre(T t);
}