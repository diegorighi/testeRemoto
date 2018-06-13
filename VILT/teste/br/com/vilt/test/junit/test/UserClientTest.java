package br.com.vilt.test.junit.test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Before;
import org.junit.Test;

import br.com.vilt.test.client.UserClient;
import br.com.vilt.test.dto.ParametrosDTO;
import br.com.vilt.test.enums.Inicializador;

public class UserClientTest {

	ParametrosDTO params = new ParametrosDTO();
	private boolean contem = false;
	
	@Before
    public void setUp() {
		this.contem = false;
		params.setUc(new UserClient());
		params.setOperador(1);
		params.getUc().metodologia(params);
    }
	
	@Test
	public void TestaSeOsIntervalosSaoValidos() {
		short INICIO = Inicializador.INICIO.getSelecionado();
		short FIM = Inicializador.FIM.getSelecionado();
		short valoresEnum = (short) Inicializador.values().length;
		
		assertThat(INICIO, equalTo((short)1));
		assertThat(FIM, equalTo((short)200));
		
		//Boas práticas
		assertThat(valoresEnum, equalTo((short)2));
	}
	
	@Test
	public void ConfereListaFatoradaESeuTamanhoTotalDe200() {
		
		assertThat(params.getUc().getListaFatorada().iterator().hasNext(), equalTo(true));
		assertThat(params.getUc().getListaFatorada().size(), equalTo(200));
	}
	
	@Test
	public void ConfereSeONumero195EDivisivelPor3EPor5() {
		
		params.getUc().getListaFatorada().stream().forEachOrdered( numero -> {
			if(numero.contains("195 = M35"))
				this.contem  = true;
		});
		
		assertThat(true, equalTo(this.contem));
		
	}

}
