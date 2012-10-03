package br.com.ideiadascoisas.domain;

import java.math.BigDecimal;


/***
 * Enum para representar o arredondamento que pode sofrer 
 * nas operações da classe {@link Dinheiro}
 * @author daniel
 *
 */
enum ARREDONDAMENTO {

	ACIMA(BigDecimal.ROUND_HALF_UP), ABAIXO(BigDecimal.ROUND_DOWN);

	private Integer arredondamento;

	private ARREDONDAMENTO(Integer arredonadamento) {
		this.arredondamento = arredonadamento;
	}

	public Integer getArredondamento() {
		return arredondamento;
	}

}
