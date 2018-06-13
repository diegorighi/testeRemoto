package br.com.vilt.test.impl;

import br.com.vilt.test.api.Multiplo;
import br.com.vilt.test.dto.ParametrosDTO;

public class NonMultipl implements Multiplo{

	@Override
	public void isMultiplo(ParametrosDTO params) {
		if(params.getNumero() % 3 != 0 && params.getNumero() % 5 != 0) {
			params.setNumeroFatorado(String.format("%s", params.getNumero()));
			params.getUc().addList(params);
		}
		
	}

}
