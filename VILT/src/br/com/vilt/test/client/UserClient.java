package br.com.vilt.test.client;

import java.util.ArrayList;
import java.util.Collection;

import javax.swing.JOptionPane;

import br.com.vilt.test.modelo.ListaReversa;
import br.com.vilt.test.modelo.M3;
import br.com.vilt.test.modelo.M35;
import br.com.vilt.test.modelo.M5;
import br.com.vilt.test.modelo.NonMultipl;

public class UserClient {

	public static short INICIO = 1;
	public static short FIM = 200;
	private Collection<String> listaFatorada = new ArrayList<>();

	public static void main(String[] args) {
		UserClient uc = new UserClient();
		Object[] options = { "Exibir Lista Reversa", "Exibir Lista Normal" };
		int op = JOptionPane.showOptionDialog(null, "Deseja exibir a lista reversa?", "ATENÇÃO",
				JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);

		uc.metodologia(uc, op);

	}

	private void metodologia(UserClient uc, int op) {
		ListaReversa list = new ListaReversa();
		for (short i = INICIO; i <= FIM; i++) {
			uc.getMultiplo(i, uc);
		}
		list.isReverse(op, uc);
	}

	public void getMultiplo(short n, UserClient uc) {
		new M3().isMultiplo(n, uc);
		new M5().isMultiplo(n, uc);
		new M35().isMultiplo(n, uc);
		new NonMultipl().isMultiplo(n, uc);
	}

	public void addList(String n) {
		this.listaFatorada.add(n);
	}

	public Collection<String> getListaFatorada() {
		return this.listaFatorada;
	}

}
