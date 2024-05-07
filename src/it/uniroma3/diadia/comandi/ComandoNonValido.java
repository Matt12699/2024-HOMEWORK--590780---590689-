package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.ambienti.Stanza;

public class ComandoNonValido implements Comando {

	public String direzione;
	public String nome;
	private IO console;

	public ComandoNonValido(IO io) {
		this.console = io;
	}
	/**
	 * esecuzione del comando
	 */
	@Override
	public void esegui(Partita partita) {
		this.console.mostraMessaggio("Comando non valido! ");
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
