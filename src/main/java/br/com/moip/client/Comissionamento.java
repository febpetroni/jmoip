package br.com.moip.client;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Comissionamento")
public class Comissionamento {

	@XStreamAlias("ValorPercentual")
	private String valorPercentual;
	
	@XStreamAlias("ValorFixo")
	private String valorFixo;

	@XStreamAlias("Comissionado")
	private Comissionado comissionado;

	@XStreamAlias("Razao")
	private String razao;

	public static Comissionamento comissionamento() {
		return new Comissionamento();
	}

	public Comissionamento comRazao(final String razao) {
		this.razao = razao;
		return this;
	}

	public Comissionamento comValorPercentual(final String valor) {
		this.valorPercentual = valor;
		return this;
	}
	
	public Comissionamento comValorFixo(final String valor) {
		this.valorFixo = valor;
		return this;
	}

	public Comissionamento comComissionado(final Comissionado comissionado) {
		this.comissionado = comissionado;
		return this;
	}

	public Comissionado getComissionado() {
		return comissionado;
	}

	public void setComissionado(final Comissionado comissionado) {
		this.comissionado = comissionado;
	}

	public String getValorPercentual() {
		return valorPercentual;
	}

	public void setValorPercentual(final String valorPercentual) {
		this.valorPercentual = valorPercentual;
	}

	public String getValorFixo() {
		return valorFixo;
	}
	
	public void setValorFixo(String valorFixo) {
		this.valorFixo = valorFixo;
	}
	
	public String getRazao() {
		return razao;
	}

	public void setRazao(final String razao) {
		this.razao = razao;
	}

}