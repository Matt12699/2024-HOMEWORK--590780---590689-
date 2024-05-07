package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.*;

public class ComandoFine implements Comando {

	public String direzione;
	public String nome;
	private IO console;

	public ComandoFine(IO io) {
		this.console = io;
	}
	/**
	 * esecuzione del comando
	 */
	@Override
	public void esegui(Partita partita) {
		this.console.mostraMessaggio("Grazie di aver giocato!");  // si desidera smettere
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
