package br.com.vilt.test.modelo;

import br.com.vilt.test.api.Multiplo;

public class M5 implements Multiplo {
	@Override
	public void isMultiplo(Parametros params) {
		if (params.getNumero() % 5 == 0 && params.getNumero() % 3 != 0) {
			params.setNumeroFatorado(String.format("%s = M5", params.getNumero()));
			params.getUc().addList(params);
		}
	}

}
