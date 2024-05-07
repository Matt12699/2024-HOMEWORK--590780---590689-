package it.uniroma3.diadia.ambienti;

public class StanzaBloccata extends Stanza {

	private String direzioneBloccata;
	private String attrezzoSbloccatore;

	public StanzaBloccata(String nome,String direzioneBloccata, String attrezzoSbloccatore) {
		super(nome);
		this.direzioneBloccata=direzioneBloccata;
		this.attrezzoSbloccatore=attrezzoSbloccatore;
	}

	@Override
	public Stanza getStanzaAdiacente(String direzione) {
		if(this.direzioneBloccata.equals(direzione))
			if(super.getAttrezzo(this.attrezzoSbloccatore)==null)
				return this;
			else
				return super.getStanzaAdiacente(direzione);
		else
			return super.getStanzaAdiacente(direzione);
	}

	@Override
	public String getDescrizione() {

		if(super.getAttrezzo(this.attrezzoSbloccatore)==null)
			return "La stanza ha una direzione bloccata! recupera " + attrezzoSbloccatore + " per poterla sbloccare";
		else
			return super.getDescrizione();

	}

}
