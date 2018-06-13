package br.com.vilt.test.modelo;

import java.util.Collections;
import java.util.List;

import br.com.vilt.test.api.SentidoDaLista;

public class ListaReversa implements SentidoDaLista {

	@Override
	public void isReverse(Parametros params) {

		if (params.getOperador() == 1) {
			// ASC
			params.getUc().getListaFatorada().stream().forEach(l -> {
				System.out.println(l);
			});
		} else if (params.getOperador() == 0) {
			// DESC
			Collections.reverse((List<String>) params.getUc().getListaFatorada());
			params.getUc().getListaFatorada().stream().forEach(l -> {
				System.out.println(l);
			});
		} else
			throw new IllegalArgumentException("Andou fuçando o código, né? :)");

	}

}
