package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.*;

public class ComandoGuarda implements Comando {

	public String direzione;
	public String nome;
	private IO console;

	public ComandoGuarda(IO io) {
		this.console = io;
	}
	/**
	 * esecuzione del comando
	 */
	@Override
	public void esegui(Partita partita) {
		Stanza stanzaCorrente=partita.getStanzaCorrente();
		this.console.mostraMessaggio(stanzaCorrente.getDescrizione());
		this.console.mostraMessaggio("Il giocatore ha a disposizione: " + partita.getGiocatore().getCfu() + " cfu");
		this.console.mostraMessaggio(partita.getGiocatore().getBorsa().toString());
	}

	@Override
	public void setParametro(String parametro) {
		this.direzione = parametro;
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
		return direzione;
	}

}
