package fr.lecnam.nfa032.chapitre9;

class TestMili2 {
	public static void main(String[] args) {
		Militaire premierMili;
		premierMili=new Militaire("Chabert","Colonel",null);
		premierMili=new Militaire("Chapuis","lieutenant",premierMili);
		premierMili=new Militaire("Martin","soldat",premierMili);
	}
}
