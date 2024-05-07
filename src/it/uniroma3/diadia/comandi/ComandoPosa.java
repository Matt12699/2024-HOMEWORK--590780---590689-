package it.uniroma3.diadia.comandi;


import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.attrezzi.Attrezzo;

public class ComandoPosa implements Comando{
	public String attrezzo;
	public String nome;
	private IO console;

	public ComandoPosa(IO io) {
		this.console = io;
	}
	/**
	 * esecuzione del comando
	 */
	@Override
	public void esegui(Partita partita) {
		if(attrezzo==null) {
			this.console.mostraMessaggio("Che attrezzo vuoi posare?");
			return;
		}
		Attrezzo selezionato = null;
		boolean ver = partita.getGiocatore().getBorsa().searchAtt(attrezzo);
		selezionato = partita.getGiocatore().getBorsa().getAttrezzo(attrezzo);
		if(!ver)
			this.console.mostraMessaggio("Attrezzo non presente nella borsa");
		else {
			partita.getStanzaCorrente().addAttrezzo(selezionato);
			partita.getGiocatore().getBorsa().removeAttrezzo(attrezzo);
			this.console.mostraMessaggio("Oggetto posato");
		}

	}

	@Override
	public void setParametro(String parametro) {
		this.attrezzo = parametro;
	}

	@Override
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String getNome() {
		return nome;
	}

	@Override
	public String getParametro() {
		return attrezzo;
	}
}
