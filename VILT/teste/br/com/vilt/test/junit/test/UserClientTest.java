package br.com.vilt.test.junit.test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

import br.com.vilt.test.enums.Inicializador;

public class UserClientTest {

	@Test
	public void TestaSeOsIntervalosSaoValidos() {
		short INICIO = Inicializador.INICIO.getSelecionado();
		short FIM = Inicializador.FIM.getSelecionado();
		
		assertThat(INICIO, equalTo((short)1));
		assertThat(FIM, equalTo((short)200));
	}
	
	@Test
	public void ConfereListaFatoradaESeuTamanho() {
		
	}
	

}
