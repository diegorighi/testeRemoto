package br.com.vilt.test.client;

import br.com.vilt.test.modelo.M3;
import br.com.vilt.test.modelo.M35;
import br.com.vilt.test.modelo.M5;

public class UserClient {

	public static short INICIO = 1;
	public static short FIM = 200;

	public static void main(String[] args) {
		UserClient uc = new UserClient();
		uc.forASC();
	}

	public void forASC() {
		for (short i = INICIO; i <= FIM; i++) {
			getMultiplo(i);
		}
	}

	public void forDESC() {
		for (short i = FIM; i >= INICIO; i--) {
			getMultiplo(i);
		}
	}
	
	public void getMultiplo(short n) {
		new M3().isMultiplo(n);
		new M5().isMultiplo(n);
		new M35().isMultiplo(n);
	}

}
