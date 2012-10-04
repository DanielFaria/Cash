package br.com.ideiadascoisas.domain;

import java.math.BigDecimal;
import java.math.MathContext;

/***
 * Classe que deve encapsular as operações do campo monetário
 * utilizando um BigDecimal
 * @author daniel
 * @since  0.1
 */
public class Dinheiro {
	 
	private BigDecimal valor;
	private int scale = 2;		
	private ARREDONDAMENTO arredondamento = ARREDONDAMENTO.ACIMA;
	private MathContext mc;
	/***
	 * Construtor para construir o o valor 
	 * a partir de uma String
	 * @param {@link String}
	 * @author Daniel
	 */
	public Dinheiro(String valor, int scale, ARREDONDAMENTO arredondamento) {
		super();
		this.valor = new BigDecimal(valor);
		this.scale = scale;
		this.arredondamento = arredondamento;
		this.setscale(scale);
		mc = new MathContext(this.scale, this.arredondamento.getArredondamento());
	}
	/***
	 * Construtor para construir o o valor 
	 * a partir de uma String
	 * Quando a scale não é informada o valor default é 2
	 * Quando o arredondamento não é informado o padrão é sempre acima
	 * @param {@link String}
	 * @author Daniel
	 */
	public Dinheiro(String valor) {
		super();
		this.valor = new BigDecimal(valor);
		mc = new MathContext(this.scale, this.arredondamento.getArredondamento());
	}
	/***
	 * Construtor para construir o o valor 
	 * a partir de uma String
	 * Quando a scale não é informada o valor default é 2
	 * @param {@link String}
	 * @author Daniel
	 */
	public Dinheiro(String valor, ARREDONDAMENTO arredondamento) {
		super();
		this.valor = new BigDecimal(valor);
		this.arredondamento = arredondamento;
		mc = new MathContext(this.scale, this.arredondamento.getArredondamento());
	}
	/***
	 * Construtor para construir o o valor 
	 * a partir de uma String
	 * Quando o arredondamento não é informado o padrão é sempre acima
	 * @param {@link String}
	 * @author Daniel
	 */
	public Dinheiro(String valor, int scale) {
		super();
		this.valor = new BigDecimal(valor);
		this.setscale(this.scale);
	}
	/****
	 * Método que realiza multiplicação
	 * @author daniel
	 * @since 0.1
	 * @param  {@link Dinheiro}
	 * @return {@link Dinheiro}
	 */
	public Dinheiro multiplicar(Dinheiro multiplicando ){
		if(multiplicando == null)
			throw new IllegalArgumentException("O valor do multiplicando não pode ser nulo");
		BigDecimal resultado = valor.multiply(multiplicando.getValor());
		resultado = resultado.setScale(2, this.arredondamento.getArredondamento());
		return new Dinheiro(resultado.toString(), this.scale,this.arredondamento);
	}
	private void setscale(int scale) {
		this.valor.setScale(scale);
	}
	
	@Override
	public String toString() {
		return this.valor.toString();
	}
	public ARREDONDAMENTO getArredondamento() {
		return arredondamento;
	}
	public BigDecimal getValor() {
		return valor;
	}
	
	
	
	
	
	
	
	
	
	
}

