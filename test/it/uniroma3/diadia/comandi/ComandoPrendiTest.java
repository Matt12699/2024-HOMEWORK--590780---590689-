package it.uniroma3.diadia.comandi;

import static org.junit.Assert.*;


import org.junit.Test;

import it.uniroma3.diadia.comandi.*;
import it.uniroma3.diadia.*;
import it.uniroma3.diadia.attrezzi.*;

public class ComandoPrendiTest {
	
	private IOConsole console;

	//Test su esegui
	@Test
	public void testEsegui_Attrezzo_Inesistente() {
		this.console = new IOConsole();
		ComandoPrendi comandoPrendi = new ComandoPrendi(this.console);
		Partita partita = new Partita();
		comandoPrendi.setParametro("attrezzoInesistente");
		comandoPrendi.esegui(partita);
		assertNull(partita.getGiocatore().getBorsa().getAttrezzo("attrezzoInesistente"));
	}

	//Test su esegui
	@Test
	public void testEsegui_Attrezzo_Esistente() {
		this.console = new IOConsole();
		ComandoPrendi comandoPrendi = new ComandoPrendi(this.console);
		Partita partita = new Partita();
		comandoPrendi.setParametro("osso");
		comandoPrendi.esegui(partita);
		assertNull(partita.getStanzaCorrente().getAttrezzo("osso"));
	}

}
