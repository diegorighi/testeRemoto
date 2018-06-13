package br.com.vilt.test.client;

import java.util.ArrayList;
import java.util.Collection;

import javax.swing.JOptionPane;

import br.com.vilt.test.modelo.M3;
import br.com.vilt.test.modelo.M35;
import br.com.vilt.test.modelo.M5;
import br.com.vilt.test.modelo.NonMultipl;
import br.com.vilt.test.modelo.Parametros;

public class UserClient {

	public static short INICIO = 1;
	public static short FIM = 200;
	private Collection<String> listaFatorada = new ArrayList<>();

	public static void main(String[] args) {
		Parametros params = new Parametros();
		params.setUc(new UserClient());
		params.setOperador(dialogoUI());
		params.getUc().metodologia(params);
	}

	private static int dialogoUI() {
		Object[] options = { "Exibir Lista Reversa", "Exibir Lista Normal" };
		return JOptionPane.showOptionDialog(null, "Qual lista deseja exibir?", "ATENÇÃO",
				JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
	}

	private void metodologia(Parametros params) {
		for (short i = INICIO; i <= FIM; i++) {
			params.setNumero(i);
			params.getUc().getMultiplo(params);
		}
		params.getSentidoDaLista().isReverse(params);
	}

	public void getMultiplo(Parametros params) {
		new M3().isMultiplo(params);
		new M5().isMultiplo(params);
		new M35().isMultiplo(params);
		new NonMultipl().isMultiplo(params);
	}

	public void addList(Parametros params) {
		this.listaFatorada.add(params.getNumeroFatorado());
	}

	public Collection<String> getListaFatorada() {
		return this.listaFatorada;
	}

}
