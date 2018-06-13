package br.com.vilt.test.client;

import java.util.ArrayList;
import java.util.Collection;

import javax.swing.JOptionPane;

import br.com.vilt.test.dto.ParametrosDTO;
import br.com.vilt.test.enums.Inicializador;
import br.com.vilt.test.impl.M3;
import br.com.vilt.test.impl.M35;
import br.com.vilt.test.impl.M5;
import br.com.vilt.test.impl.NonMultipl;

public class UserClient {

	public static short _INICIO = Inicializador.INICIO.getSelecionado();
	public static short _FIM = Inicializador.FIM.getSelecionado();
	private Collection<String> listaFatorada = new ArrayList<>();

	public static void main(String[] args) {
		ParametrosDTO params = new ParametrosDTO();
		params.setUc(new UserClient());
		params.setOperador(dialogoUI());
		params.getUc().metodologia(params);
	}

	private static int dialogoUI() {
		Object[] options = { "Exibir Lista Reversa", "Exibir Lista Normal" };
		return JOptionPane.showOptionDialog(null, "Qual lista deseja exibir?", "ATENÇÃO",
				JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
	}

	private void metodologia(ParametrosDTO params) {
		for (short i = _INICIO; i <= _FIM; i++) {
			params.setNumero(i);
			params.getUc().getMultiplo(params);
		}
		params.getSentidoDaLista().isReverse(params);
	}

	public void getMultiplo(ParametrosDTO params) {
		new M3().isMultiplo(params);
		new M5().isMultiplo(params);
		new M35().isMultiplo(params);
		new NonMultipl().isMultiplo(params);
	}

	public void addList(ParametrosDTO params) {
		this.listaFatorada.add(params.getNumeroFatorado());
	}

	public Collection<String> getListaFatorada() {
		return this.listaFatorada;
	}

}
