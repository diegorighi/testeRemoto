package br.com.vilt.test.modelo;

import java.util.Collections;
import java.util.List;

import br.com.vilt.test.api.SentidoDaLista;
import br.com.vilt.test.client.UserClient;

public class ListaReversa implements SentidoDaLista {

	@Override
	public void isReverse(int sentido, UserClient uc) {

		if (sentido == 1) {
			// ASC
			uc.getListaFatorada().stream().forEach(l -> {
				System.out.println(l);
			});
		} else if (sentido == 0) {
			// DESC
			Collections.reverse((List<String>) uc.getListaFatorada());
			uc.getListaFatorada().stream().forEach(l -> {
				System.out.println(l);
			});
		} else
			throw new IllegalArgumentException("Andou fuçando no código, né? :)");

	}

}
