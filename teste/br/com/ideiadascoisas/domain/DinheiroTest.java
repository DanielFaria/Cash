package br.com.ideiadascoisas.domain;

import junit.framework.Assert;

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
	
	@Test
	public void testaValorMultiplicacao(){
		Dinheiro valor = new Dinheiro("3");
		Dinheiro multiplicando = new Dinheiro("0.51");
	    Dinheiro resultado = valor.multiplicar(multiplicando);
		Assert.assertEquals("Valor da multiplicação é 1.53 e não ocorreu","1.53", resultado.toString());
	}
	@Test(expected=IllegalArgumentException.class)
	public void valorMultiplicandoNaoPodeSerNull(){
		Dinheiro valor = new Dinheiro("0.51");
		Dinheiro multiplicando = null;
	    valor.multiplicar(multiplicando);
	}
	
	
	
}
