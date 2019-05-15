package com.github.garciagiovane.prova.fadergs;

public class Produto {
	private String nome;
	private double valor;
	private String tipo;
	private String prazoValidade;
	private String marca;
	
	public Produto(String nome, double valor, String tipo) {
		this.nome = nome;
		this.valor = valor;
		this.tipo = tipo;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getPrazoValidade() {
		return prazoValidade;
	}
	public void setPrazoValidade(String prazoValidade) {
		this.prazoValidade = prazoValidade;
	}
	@Override
	public String toString() {
		return "Produto \nNome: " + nome + "\nValor: " + valor + "\nTipo: " + tipo;
	}
}
