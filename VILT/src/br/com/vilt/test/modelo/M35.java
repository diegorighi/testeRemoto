package br.com.vilt.test.modelo;

import br.com.vilt.test.api.Multiplo;

public class M35 implements Multiplo {

	@Override
	public void isMultiplo(short n) {
		if(n%3 == 0 && n%5 == 0)
			System.out.println(n+" = M35" );
	}

}
