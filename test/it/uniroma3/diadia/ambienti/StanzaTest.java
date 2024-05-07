package it.uniroma3.diadia.ambienti;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

import it.uniroma3.diadia.attrezzi.Attrezzo;

public class StanzaTest {
	
	private Stanza atrio;
	private Stanza armeria;
	private Attrezzo osso;
	private Attrezzo spada;
	
	@Before
	public void setUp() throws Exception {
		this.atrio= new Stanza("atrio");
		this.armeria= new Stanza("armeria");
		this.osso= new Attrezzo("osso", 1);
		this.spada= new Attrezzo("spada", 10);
		
		this.atrio.impostaStanzaAdiacente("sud", armeria);
		this.atrio.addAttrezzo(osso);
		
	}

	@Test
	public void getStanzaAdiacenteEsiste() {
		assertEquals("armeria", this.atrio.getStanzaAdiacente("sud").getNome());
	}
	@Test
	public void getStanzaAdiacenteNonEsiste() {
		assertNull("armeria", this.atrio.getStanzaAdiacente("nord"));
	}
	@Test
	public void searchAttEsiste() {
		assertTrue(this.atrio.searchAtt("osso"));
	}
	@Test
	public void searchAttNonEsiste() {
		assertFalse(this.atrio.searchAtt("lampada"));
	}
	@Test
	public void addAttrezzoEsiste() {
		assertFalse(this.atrio.searchAtt("spada"));
		this.atrio.addAttrezzo(spada);
		assertTrue(this.atrio.searchAtt("spada"));
	}
	@Test
	public void removeAttrezzoEsiste() {
		assertTrue(this.atrio.searchAtt("osso"));
		this.atrio.removeAttrezzo("osso");
		assertFalse(this.atrio.searchAtt("osso"));
	}

}
