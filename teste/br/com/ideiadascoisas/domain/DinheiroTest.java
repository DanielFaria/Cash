package br.com.ideiadascoisas.domain;

import org.junit.Test;


/**
 * Classe para testar a classe {@link Dinheiro}
 * @author daniel
 * @since  0.1
 */
public class DinheiroTest {

	
	@Test(expected=IllegalArgumentException.class)
	public void dinheiroSoPodeSerContruidaPorUmaStringEmFormatoNumerico(){
			new Dinheiro("asasasas");
	}
}
