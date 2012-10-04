package br.com.ideiadascoisas.domain;

import java.math.RoundingMode;


/***
 * Enum para representar o arredondamento que pode sofrer 
 * nas operações da classe {@link Dinheiro}
 * @author daniel
 *
 */
enum ARREDONDAMENTO {

	ACIMA(RoundingMode.HALF_UP), ABAIXO(RoundingMode.HALF_DOWN);

	private RoundingMode arredondamento;

	private ARREDONDAMENTO(RoundingMode arredondamento) {
		this.arredondamento = arredondamento;
	}

	public RoundingMode getArredondamento() {
		return arredondamento;
	}

}
