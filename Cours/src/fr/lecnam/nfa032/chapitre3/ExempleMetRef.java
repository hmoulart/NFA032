package fr.lecnam.nfa032.chapitre3;

public class ExempleMetRef {

	public static void main(String[] args) {
		Entier obj = new Entier(10);
		ajouterUn(obj);
		ajouterUn(obj);
		System.out.println(obj.val);
	}

	public static void ajouterUn(Entier e) {
		e.val = e.val + 1;
	}
}