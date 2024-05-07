package it.uniroma3.diadia.comandi;

import static org.junit.Assert.*;



import org.junit.Test;

import it.uniroma3.diadia.comandi.*;
import it.uniroma3.diadia.*;
import it.uniroma3.diadia.attrezzi.*;

public class ComandoPosaTest {
	
	private IOConsole console;

	//Test su esegui
	@Test
	public void testEsegui_Attrezzo_Inesistente() {
		this.console = new IOConsole();
		ComandoPosa comandoPosa = new ComandoPosa(this.console);
		Partita partita = new Partita();
		comandoPosa.setParametro("attrezzoInesistente");
		comandoPosa.esegui(partita);
		assertNull(partita.getGiocatore().getBorsa().getAttrezzo("attrezzoInesistente"));
	}
	
	//Test su esegui
		@Test
		public void testEsegui_Attrezzo_Esistente() {
			this.console = new IOConsole();
			ComandoPosa comandoPosa = new ComandoPosa(this.console);
			Partita partita = new Partita();
			Attrezzo forbice= new Attrezzo("forbice", 1);
			partita.getGiocatore().getBorsa().addAttrezzo(forbice);
			comandoPosa.setParametro("forbice");
			comandoPosa.esegui(partita);
			assertNotNull(partita.getStanzaCorrente().getAttrezzo("forbice"));
		}

}
