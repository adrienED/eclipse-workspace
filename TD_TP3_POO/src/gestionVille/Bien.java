package gestionVille;

public abstract class  Bien {
	
	
	private int ValEuros;
	private int CoutEntretienMensuel;
	public static int NbExemplaires=0;
	
	 public abstract int getNb();
	 public abstract String getNumeroImatriculation();
	
	
	public Bien() {
		this.ValEuros=0;
		this.CoutEntretienMensuel=0;
		NbExemplaires++;
		
		
	}
	
	public Bien (int v, int c) {
		this.ValEuros=v;
		this.CoutEntretienMensuel=c;
		
	}
	
	
	
	/**
	 * @return the valEuros
	 */
	
	public int getValEuros() {
	return ValEuros;
	
	}
	/**
 	 * @param valEuros the valEuros to set
	 */

	public void setValEuros(int v) {
		this.ValEuros = v;
	}
	
	public int getCoutEntretienMensuel() {
		return CoutEntretienMensuel;
	}
	
	public void setCoutEntretienMensuel(int c) {
		this.CoutEntretienMensuel = c;
	}
	public static int getNbExemplaires() {
		return NbExemplaires;
	}
	
	public String getInfo() {
		String info = "Bien : \n";		
		info+= "Valeur en euro : "+ValEuros+"\n";
		info+="Cout entretien mensuel : "+this.CoutEntretienMensuel+"\n";
	
		return info;
	}

}
