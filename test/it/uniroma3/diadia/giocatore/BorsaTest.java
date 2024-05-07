package it.uniroma3.diadia.giocatore;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import it.uniroma3.diadia.attrezzi.Attrezzo;

public class BorsaTest {
	public final static int DEFAULT_PESO_MAX_BORSA = 10;
	private Borsa b;
	private Attrezzo spada;
	
	
	
	@Before
	public void setUp() throws Exception {
		this.b= new Borsa();
		this.spada= new Attrezzo("spada", 4);
	}

	@Test
	public void testAddAttrezzo() {
		assertTrue(this.b.addAttrezzo(spada));
	}
	@Test
	public void testGetAttrezzoEsiste() {
		this.b.addAttrezzo(spada);
		assertEquals("spada", this.b.getAttrezzo("spada").getNome());
	}
	@Test
	public void testGetAttrezzoNonEsiste() {
		assertNull(this.b.getAttrezzo("martello"));
	}
	@Test
	public void testIsEmptyEsiste() {
		assertTrue(this.b.isEmpty());
	}
	@Test
	public void testIsEmptyNonEsiste() {
		this.b.addAttrezzo(spada);
		assertFalse(this.b.isEmpty());
	}
	@Test
	public void testRemoveEsiste() {
		this.b.addAttrezzo(spada);
		this.b.removeAttrezzo("spada");
		assertTrue(this.b.isEmpty());
	}
	@Test
	public void testRemoveNonEsiste() {
		this.b.addAttrezzo(spada);
		this.b.removeAttrezzo("martello");
		assertFalse(this.b.isEmpty());
	}

}
