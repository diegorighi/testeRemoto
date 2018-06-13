package br.com.vilt.test.modelo;

import br.com.vilt.test.api.Multiplo;
import br.com.vilt.test.client.UserClient;

public class NonMultipl implements Multiplo{

	@Override
	public void isMultiplo(short n, UserClient uc) {
		if(n % 5 != 0 && n % 3 != 0) {
			uc.addList(+n+"");
		}
		
	}

}
