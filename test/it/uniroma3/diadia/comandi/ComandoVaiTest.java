package it.uniroma3.diadia.comandi;

import static org.junit.Assert.*;


import org.junit.Test;

import it.uniroma3.diadia.comandi.*;
import it.uniroma3.diadia.*;

public class ComandoVaiTest {
	
	private IOConsole console;
	
	

	//Test su setParametro
	@Test
	public void testSetParametro_parametro_nullo() {
		this.console = new IOConsole();
		ComandoVai comandoVai = new ComandoVai(this.console);
		comandoVai.setParametro(null);
		assertNull(comandoVai.direzione);
	}

	//Test su setParametro
	@Test
	public void testSetParametro_parametro__non_nullo() {
		this.console = new IOConsole();
		ComandoVai comandoVai = new ComandoVai(this.console);
		comandoVai.setParametro("nord");
		assertNotNull(comandoVai.direzione);
	}

	//Test su esegui
	@Test
	public void testEsegui() {
		this.console = new IOConsole();
		ComandoVai comandoVai = new ComandoVai(this.console);
		Partita partita = new Partita();
		comandoVai.setParametro("nord");
		comandoVai.esegui(partita);
		assertEquals(19, partita.getGiocatore().getCfu());
	}

}
