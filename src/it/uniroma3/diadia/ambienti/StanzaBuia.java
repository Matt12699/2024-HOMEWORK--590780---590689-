package it.uniroma3.diadia.ambienti;

public class StanzaBuia extends Stanza {
	
	private String attrezzoChiave;
	
	public StanzaBuia(String nome) {
		super(nome);
		this.attrezzoChiave="lanterna";
	}
	
	@Override
	public String getDescrizione() {
		if(super.getAttrezzo(this.attrezzoChiave)!=null)
			return super.getDescrizione();
		
		return "Qui c'è un buio pesto";	
	}

}
