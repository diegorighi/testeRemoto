package br.com.vilt.test.modelo;

import br.com.vilt.test.api.Multiplo;

public class M5 implements Multiplo {

	@Override
	public void isMultiplo(short n) {
		if(n%5 == 0 && n%3 != 0)
			System.out.println(n+" = M5" );
		else
			System.out.println(n);

	}

}
