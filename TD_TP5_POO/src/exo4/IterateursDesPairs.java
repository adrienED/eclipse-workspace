package exo4;

public class IterateursDesPairs implements IterateurTabInt {

	
	private int [] tab;
	private int pos;
	
	public IterateursDesPairs (int [] tab) {
		this.tab=tab;
		this.pos=0;
		
	}
	
	@Override
	public int suivant() throws PasDeSuivantException {
		
		if (aUnSuivant()) {
			
			pos=indiceDuSuivant();
			int v = tab[pos];
			pos++;
			return v;
		}
		throw new PasDeSuivantException("Il n'y a pas de suivant");
	}

	@Override
	public int indiceDuSuivant() throws PasDeSuivantException {
		if (! this.aUnSuivant())
			throw new PasDeSuivantException("Il n'y a pas de suivant");

		for (int i = pos; i<tab.length;i++) {
			if (tab[i]%2==0) {
				pos=i;
				return pos;
			}
			
		}
		pos=tab.length;
		throw new PasDeSuivantException("Tableau épuisé sans trouver de chiffre pair");
	}

	@Override
	public boolean aUnSuivant() {

		return this.pos<tab.length;
		
	}

}
