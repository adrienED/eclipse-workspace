/**
 * 
 */
package gestionVille;

/**
 * @author nizar
 *
 */
public abstract class Bien {
	
	private int valEuros;
	private int coutEntretienMensuel;
	private static int nbExemplaires=0;
	
	public Bien() {
		this.valEuros=0;
		this.coutEntretienMensuel=0;
		nbExemplaires++;
	}
	
	public Bien(int v, int c) {
		this.valEuros=v;
		this.coutEntretienMensuel=c;
		nbExemplaires++;
	}

	/**
	 * @return the valEuros
	 */
	public int getValEuros() {
		return valEuros;
	}

	/**
	 * @param valEuros the valEuros to set
	 */
	public void setValEuros(int valEuros) {
		this.valEuros = valEuros;
	}

	/**
	 * @return the coutEntretienMensuel
	 */
	public int getCoutEntretienMensuel() {
		return coutEntretienMensuel;
	}

	/**
	 * @param coutEntretienMensuel the coutEntretienMensuel to set
	 */
	public void setCoutEntretienMensuel(int coutEntretienMensuel) {
		this.coutEntretienMensuel = coutEntretienMensuel;
	}

	/**
	 * @return the nbExemplaires
	 */
	public static int getNbExemplaires() {
		return nbExemplaires;
	}
	
	public String getInfo() {
		String info = "Bien : \n";
		info+="Valeur en euro : "+valEuros+"\n";
		info+="Cout entretien mensuel : "+this.coutEntretienMensuel+"\n";
		return info;
	}

}
