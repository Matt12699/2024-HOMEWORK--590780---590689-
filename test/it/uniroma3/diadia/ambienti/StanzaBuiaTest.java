package it.uniroma3.diadia.ambienti;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import it.uniroma3.diadia.ambienti.*;
import it.uniroma3.diadia.attrezzi.*;

public class StanzaBuiaTest {
	
	private StanzaBuia atrio;
	private Attrezzo lanterna;
	
	@Before
	public void setUp() throws Exception {
		this.atrio= new StanzaBuia("atrio");
		this.lanterna= new Attrezzo("lanterna", 7);
		
		this.atrio.addAttrezzo(lanterna);
		
	}
    
	//Test su getDescrizione
	@Test
	public void testGetDescrizione_Stanza_Senza_Attrezzo() {
		StanzaBuia stanza = new StanzaBuia("atrio");
		assertEquals("Qui c'è un buio pesto", stanza.getDescrizione());
	}
	
	//Test su getDescrizione
		@Test
		public void testGetDescrizione_Stanza_Con_Attrezzo() {
			StanzaBuia stanza = new StanzaBuia("atrio");
			Attrezzo attrezzoSb = new Attrezzo("lanterna", 7);
			stanza.addAttrezzo(attrezzoSb);
			assertEquals(this.atrio.getDescrizione(), stanza.getDescrizione());
		}

}
