package br.com.ideiadascoisas.domain;

import java.math.BigDecimal;

/***
 * Classe que deve encapsular as operações do campo monetário
 * utilizando um BigDecimal
 * @author daniel
 * @since  0.1
 */
public class Dinheiro {
	 
	private BigDecimal valor;
	private Integer SCALE = 2;
	
	public static enum ARREDONDAMENTO {
		ACIMA(BigDecimal.ROUND_HALF_UP), ABAIXO(BigDecimal.ROUND_DOWN);
		
		private Integer arredondamento;

		private ARREDONDAMENTO(Integer arredonadamento) {
			this.arredondamento = arredonadamento;
		}

		
		
		public Integer getArredondamento() {
			return arredondamento;
		}
		
		
	}
	
	/***
	 * Contrutor para construir o o valor 
	 * a partir de uma String
	 * @param {@link String}
	 * @author Daniel
	 */
	public Dinheiro(String valor) {
		super();
		this.valor = new BigDecimal(valor);
	}
	
	
	public BigDecimal getValor() {
		return valor;
	}
	
	
	
	
	
	
	
	
	
	
}

