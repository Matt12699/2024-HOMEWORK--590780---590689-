package it.uniroma3.diadia.comandi;

import static org.junit.Assert.*;


import org.junit.Test;

import it.uniroma3.diadia.IOConsole;
import it.uniroma3.diadia.comandi.*;

public class FabbricaDiComandiFisarmonicaTest {

	public Comando c;
	private IOConsole console;
	

	//Test su costruisciComando
	@Test
	public void testCostruisciComando_Comando_Inesistente() {
		this.console = new IOConsole();
		FabbricaDiComandiFisarmonica factory= new FabbricaDiComandiFisarmonica();
		c= factory.costruisciComando("dadad", this.console);
		assertEquals("dadad", c.getNome());
	}

	//Test su costruisciComando
	@Test
	public void testCostruisciComando_Comando_Vai() {
		this.console = new IOConsole();
		FabbricaDiComandiFisarmonica factory= new FabbricaDiComandiFisarmonica();
		c= factory.costruisciComando("vai nord", this.console);
		assertEquals("vai nord", c.getNome() + " " + c.getParametro());
	}

	//Test su costruisciComando
	@Test
	public void testCostruisciComando_Comando_Aiuto() {
		this.console = new IOConsole();
		FabbricaDiComandiFisarmonica factory= new FabbricaDiComandiFisarmonica();
		c= factory.costruisciComando("aiuto", this.console);
		assertEquals("aiuto", c.getNome());
	}

	//Test su costruisciComando
	@Test
	public void testCostruisciComando_Comando_Fine() {
		this.console = new IOConsole();
		FabbricaDiComandiFisarmonica factory= new FabbricaDiComandiFisarmonica();
		c= factory.costruisciComando("fine", this.console);
		assertEquals("fine", c.getNome());
	}

	//Test su costruisciComando
	@Test
	public void testCostruisciComando_Comando_Guarda() {
		this.console = new IOConsole();
		FabbricaDiComandiFisarmonica factory= new FabbricaDiComandiFisarmonica();
		c= factory.costruisciComando("guarda", this.console);
		assertEquals("guarda", c.getNome());
	}

	//Test su costruisciComando
	@Test
	public void testCostruisciComando_Comando_Posa() {
		this.console = new IOConsole();
		FabbricaDiComandiFisarmonica factory= new FabbricaDiComandiFisarmonica();
		c= factory.costruisciComando("posa", this.console);
		assertEquals("posa", c.getNome());
	}

	//Test su costruisciComando
	@Test
	public void testCostruisciComando_Comando_Prendi() {
		this.console = new IOConsole();
		FabbricaDiComandiFisarmonica factory= new FabbricaDiComandiFisarmonica();
		c= factory.costruisciComando("prendi", this.console);
		assertEquals("prendi", c.getNome());
	}

}
