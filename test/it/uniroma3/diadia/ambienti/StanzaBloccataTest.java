package it.uniroma3.diadia.ambienti;

import static org.junit.Assert.*;

import org.junit.Before;

import it.uniroma3.diadia.attrezzi.*;


import org.junit.Test;

public class StanzaBloccataTest {
	
	private Stanza atrio;
	private Attrezzo lanterna;
	private Stanza armeria;
	
	@Before
	public void setUp() throws Exception {
		this.atrio= new Stanza("atrio");
		this.lanterna= new Attrezzo("lanterna", 7);

		this.atrio.addAttrezzo(lanterna);
		
	}
    
	//Test su getDescrizione
	@Test
	public void testGetDescrizione_Stanza_Bloccata() {
		StanzaBloccata stanza = new StanzaBloccata("atrio", "nord", "lanterna");
		assertEquals("La stanza ha una direzione bloccata! recupera lanterna per poterla sbloccare", stanza.getDescrizione());
	}
	
	//Test su getDescrizione
	@Test
	public void testGetDescrizione_Stanza_Sbloccata() {
		StanzaBloccata stanza = new StanzaBloccata("atrio", "nord", "lanterna");
		Attrezzo attrezzo = new Attrezzo("lanterna", 7);
		stanza.addAttrezzo(attrezzo);
		assertEquals(this.atrio.getDescrizione(), stanza.getDescrizione());
	}
	
	//Test su getStanzaAdiacente
	@Test
	public void testGetStanzaAdiacente_Stanza_Bloccata() {
		StanzaBloccata stanza = new StanzaBloccata("atrio", "nord", "lanterna");
		assertEquals(stanza, stanza.getStanzaAdiacente("nord"));
	}
	
	//Test su getStanzaAdiacente
		@Test
		public void testGetStanzaAdiacente_Stanza_Sbloccata() {
			StanzaBloccata stanza = new StanzaBloccata("atrio", "nord", "lanterna");
			Attrezzo attrezzo = new Attrezzo("lanterna", 7);
			stanza.addAttrezzo(attrezzo);
			assertEquals(this.atrio.getStanzaAdiacente("nord"), stanza.getStanzaAdiacente("nord"));
		}
}
