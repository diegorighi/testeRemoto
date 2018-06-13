package br.com.vilt.test.modelo;

import br.com.vilt.test.api.Multiplo;

public class M5 implements Multiplo {
	@Override
	public void isMultiplo(Parametros params) {
		if (params.getNumero() % 5 == 0 && params.getNumero() % 3 != 0) {
			params.getUc().addList(+params.getNumero()+" = M5");
		}
	}

}
