package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.*;

public class ComandoAiuto implements Comando {
	
	static final private String[] elencoComandi = {"vai", "aiuto", "fine", "prendi", "posa", "guarda"};

	public String direzione;
	public String nome;
	private IO console;
	
	public ComandoAiuto(IO io) {
		this.console = io;
	}
	/**
	 * esecuzione del comando
	 */
	@Override
	public void esegui(Partita partita) {
		for(int i=0; i< elencoComandi.length; i++) 
			this.console.mostraMessaggio(elencoComandi[i]+" ");
		this.console.mostraMessaggio(" ");
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
