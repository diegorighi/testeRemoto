package br.com.vilt.test.enums;

public enum Inicializador {

	INICIO((short) 1), FIM((short) 200);
	private short selecionado;

	Inicializador(short select) {
		this.selecionado = select;
	}

	public short getSelecionado() {
		return this.selecionado;
	}

}
