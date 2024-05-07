package it.uniroma3.diadia;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


import it.uniroma3.diadia.ambienti.Stanza;

public class PartitaTest {
	
	
	private Partita p;
	private Stanza atrio;
	private Stanza biblioteca;
	
	@Before
	public void setUp() throws Exception {
		this.p= new Partita();
		this.atrio= new Stanza("atrio");
		this.biblioteca= new Stanza("biblioteca");
		
		this.p.getLabirinto().setStanzaIniziale(atrio);
		this.p.getLabirinto().setStanzaVincente(biblioteca);
		
		this.atrio.impostaStanzaAdiacente("nord", biblioteca);
		this.biblioteca.impostaStanzaAdiacente("sud", atrio);
		
		
	}

	@Test
	public void testStanzaCorrente() {
		assertEquals("Atrio", this.p.getStanzaCorrente().getNome());
	}
	@Test 
	public void testStanzaVincente() {
		assertEquals("biblioteca", this.p.getLabirinto().getStanzaVincente().getNome());
	}
	@Test
	public void finitaTrue() {
		this.p.setStanzaCorrente(biblioteca);
		assertTrue(this.p.isFinita());
	}
	@Test 
	public void finitaFalse() {
		assertFalse(this.p.isFinita());
	}
	@Test
	public void vintaTrue() {
		this.p.setStanzaCorrente(biblioteca);
		assertTrue(this.p.vinta());
	}
	@Test
	public void vintaFalse() {
		assertFalse(this.p.vinta());
	}
	

}
