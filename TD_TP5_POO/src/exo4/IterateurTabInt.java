package exo4;

public interface IterateurTabInt {
	
	public abstract int suivant() throws PasDeSuivantException;
	public abstract int indiceDuSuivant() throws PasDeSuivantException ;
	public abstract boolean aUnSuivant();

}
