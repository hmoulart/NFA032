package fr.lecnam.nfa032.chapitre2;

public class Ordinateur {
	private int frequenceCpu; // En MHz
	private int quantiteMemoireVive; // Go
	private String modeleCarteGraphique;
	private int frequenceCpuGraphique; // MHz
	private double quantiteMemoireViveGraphique; // Go
	
	public Ordinateur(String mcg) {
		this.frequenceCpu = 100;
		this.quantiteMemoireVive = 0;
		this.modeleCarteGraphique = mcg;
		this.frequenceCpuGraphique = 0;
		this.quantiteMemoireViveGraphique = 0.016; // 16 Mo
	}
	
	public Ordinateur() {
		this.frequenceCpu = 100;
		this.quantiteMemoireVive = 0;
		this.modeleCarteGraphique = "";
		this.frequenceCpuGraphique = 0;
		this.quantiteMemoireViveGraphique = 0.016;
	}

	public int frequenceCpuTotal() {
		return this.frequenceCpu + this.frequenceCpuGraphique;
	}
	
	public void frequenceCpuTotalAff() {
		System.out.println("Fréquence total CPU + graphique CPU : " + this.frequenceCpu + this.frequenceCpuGraphique);
	}
	
	public double quantiteMemoireViveTotal() {
		return this.quantiteMemoireVive + this.quantiteMemoireViveGraphique;
	}
	
	public void quantiteMemoireViveTotalAff() {
		System.out.println("Quantité mémoire vive total : " + this.quantiteMemoireVive + this.quantiteMemoireViveGraphique);
	}
	
	public int getFrequenceCpu() {
		return frequenceCpu;
	}

	public void setFrequenceCpu(int frequenceCpu) {
		this.frequenceCpu = frequenceCpu;
	}

	public int getQuantiteMemoireVive() {
		return quantiteMemoireVive;
	}

	public void setQuantiteMemoireVive(int quantiteMemoireVive) {
		this.quantiteMemoireVive = quantiteMemoireVive;
	}

	public String getModeleCarteGraphique() {
		return modeleCarteGraphique;
	}

	public void setModeleCarteGraphique(String modeleCarteGraphique) {
		this.modeleCarteGraphique = modeleCarteGraphique;
	}

	public int getFrequenceCpuGraphique() {
		return frequenceCpuGraphique;
	}

	public void setFrequenceCpuGraphique(int frequenceCpuGraphique) {
		this.frequenceCpuGraphique = frequenceCpuGraphique;
	}

	public double getQuantiteMemoireViveGraphique() {
		return quantiteMemoireViveGraphique;
	}

	public void setQuantiteMemoireViveGraphique(double quantiteMemoireViveGraphique) {
		this.quantiteMemoireViveGraphique = quantiteMemoireViveGraphique;
	}
}
