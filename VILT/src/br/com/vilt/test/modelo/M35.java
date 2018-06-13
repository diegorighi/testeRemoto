package br.com.vilt.test.modelo;

import br.com.vilt.test.api.Multiplo;
import br.com.vilt.test.client.UserClient;

public class M35 implements Multiplo {
	@Override
	public void isMultiplo(short n, UserClient uc) {
		if (n % 3 == 0 && n % 5 == 0) {
			uc.addList(+n+" = M35");
		}
	}

}
