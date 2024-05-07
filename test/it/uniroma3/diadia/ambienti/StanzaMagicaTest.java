package it.uniroma3.diadia.ambienti;

import static org.junit.Assert.*;

import org.junit.Test;

import it.uniroma3.diadia.attrezzi.Attrezzo;

public class StanzaMagicaTest {
    
	
	//Test su addAttrezzo
	@Test
	public void testAddAttrezzo() {
		StanzaMagica stanza = new StanzaMagica("Laboratorio", 1);
		stanza.contatoreAttrezziPosati = 2;
		Attrezzo attrezzo= new Attrezzo("Broccolo", 7);
		stanza.addAttrezzo(attrezzo);
		assertEquals(1, stanza.numeroAttrezzi);
	}
	
	//Test su modificaAttrezzo
	@Test
    public void testModificaAttrezzo() {
		StanzaMagica stanza = new StanzaMagica("Laboratorio", 7);
		Attrezzo attrezzo= new Attrezzo("Broccolo", 7);
		attrezzo=stanza.modificaAttrezzo(attrezzo);
		assertEquals("oloccorB", attrezzo.getNome());
		assertEquals(14, attrezzo.getPeso());
		
	}
}
