package it.uniroma3.diadia.giocatore;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GiocatoreTest {
	private Giocatore g;
	
	@Before
	public void setUp() throws Exception {
		this.g= new Giocatore();
	}
	@Test
	public void testGetCfu() {
		assertEquals(20, this.g.getCfu());
	}
	@Test
	public void testSetCfu() {
		this.g.setCfu(30);;
		assertEquals(30, this.g.getCfu());
	}

}
