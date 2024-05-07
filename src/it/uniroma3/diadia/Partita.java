package it.uniroma3.diadia;

import it.uniroma3.diadia.ambienti.Labirinto;
import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.giocatore.Giocatore;

/**
 * Questa classe modella una partita del gioco
 *
 * @author  docente di POO
 * @see Stanza
 * @version base
 */

public class Partita {
	
	private Labirinto labirinto;
	private boolean finita;
	private Giocatore giocatore;
	private Stanza stanzaCorrente;
	
	public Partita(){
		this.labirinto=new Labirinto();
		this.finita = false;
		this.giocatore = new Giocatore();
		this.stanzaCorrente= this.getLabirinto().getStanzaIniziale();
	}

	public Stanza getStanzaCorrente() {
		return stanzaCorrente;
	}



	public void setStanzaCorrente(Stanza stanzaCorrente) {
		this.stanzaCorrente = stanzaCorrente;
	}

	/**
	 * Restituisce vero se e solo se la partita e' stata vinta
	 * @return vero se partita vinta
	 */
	public boolean vinta() {
		return this.getStanzaCorrente() == this.labirinto.getStanzaVincente();

		//return this.lab.getStanzaCorrente().equals(this.lab.getStanzaVincente());
	}

	/**
	 * Restituisce vero se e solo se la partita e' finita
	 * @return vero se partita finita
	 */
	public boolean isFinita() {
		return finita || vinta() || (giocatore.getCfu() == 0);
	}
	
	/**
	 * Restituisce vero se e solo se il giocatore è ancora vivo
	 * @return vero se giocatore vivo
	 */
	public boolean giocatoreIsVivo() {
		if(this.giocatore.cfu==0)
			return false;
		
		return true;
	}
	
	

	/**
	 * Imposta la partita come finita
	 *
	 */
	public void setFinita() {
		this.finita = true;
	}

	public Labirinto getLabirinto() {
		return labirinto;
	}

	public void setLabirinto(Labirinto labirinto) {
		this.labirinto = labirinto;
	}

	public Giocatore getGiocatore() {
		return giocatore;
	}

	public void setGiocatore(Giocatore giocatore) {
		this.giocatore = giocatore;
	}
	
	
}
