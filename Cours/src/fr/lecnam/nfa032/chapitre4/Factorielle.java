package fr.lecnam.nfa032.chapitre4;

public class Factorielle {
	static int factorielle(int n) {
		int res = 1;
		if (n < 0) {
			throw new PasDefiniError();
		}
		for (int i = 1; i <= n; i++) {
			res = res * i;
		}
		return res;
	}
}

class PasDefiniError extends Error {}