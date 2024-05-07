package it.uniroma3.diadia.ambienti;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LabirintoTest {

	private Labirinto l;
	private Stanza atrio;
	
	@Before
	public void setUp() throws Exception {
		this.l= new Labirinto();
		this.atrio= new Stanza("atrio");
		
	}

	@Test
	public void testGetStanzaIniziale() {
		this.l.setStanzaIniziale(atrio);
		assertEquals("atrio", this.l.getStanzaIniziale().getNome());
	}
	@Test
	public void testGetStanzaVincente() {
		this.l.setStanzaVincente(atrio);
		assertEquals("atrio", this.l.getStanzaVincente().getNome());
	}

}
