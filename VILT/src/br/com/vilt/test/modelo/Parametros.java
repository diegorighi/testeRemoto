package br.com.vilt.test.modelo;

import br.com.vilt.test.client.UserClient;

public class Parametros{
	
	private UserClient uc = new UserClient();
	private int operador = -1;
	ListaReversa sentidoDaLista = new ListaReversa();
	private short numero = 0;
	private String numeroFatorado = null;
	
	/**
	 * @return the uc
	 */
	public UserClient getUc() {
		return uc;
	}
	/**
	 * @param uc the uc to set
	 */
	public void setUc(UserClient uc) {
		this.uc = uc;
	}
	/**
	 * @return the operador
	 */
	public int getOperador() {
		return operador;
	}
	/**
	 * @param operador the operador to set
	 */
	public void setOperador(int operador) {
		this.operador = operador;
	}
	/**
	 * @return the numero
	 */
	public short getNumero() {
		return numero;
	}
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(short numero) {
		this.numero = numero;
	}
	/**
	 * @return the sentidoDaLista
	 */
	public ListaReversa getSentidoDaLista() {
		return sentidoDaLista;
	}
	/**
	 * @return the numeroFatorado
	 */
	public String getNumeroFatorado() {
		return numeroFatorado;
	}
	/**
	 * @param numeroFatorado the numeroFatorado to set
	 */
	public void setNumeroFatorado(String numeroFatorado) {
		this.numeroFatorado = numeroFatorado;
	}
	
	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Parametros [uc=" + uc + ", operador=" + operador + ", sentidoDaLista=" + sentidoDaLista + ", numero="
				+ numero + ", numeroFatorado=" + numeroFatorado + "]";
	}
	
	
	
	
	
}
