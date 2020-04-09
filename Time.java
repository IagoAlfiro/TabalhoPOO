package br.lasalle.opp.trab1;

public class Time {
	
	private String nome;
	private int qtdVitorias;
	private int qtdEmpates;
	private	int qtdDerrotas;
	private int qtdPontos;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQtdVitorias() {
		return qtdVitorias;
	}
	public void setQtdVitorias(int qtdVitorias) {
		this.qtdVitorias = qtdVitorias;
	}
	public int getQtdEmpates() {
		return qtdEmpates;
	}
	public void setQtdEmpates(int qtdEmpates) {
		this.qtdEmpates = qtdEmpates;
	}
	public int getQtdDerrotas() {
		return qtdDerrotas;
	}
	public void setQtdDerrotas(int qtdDerrotas) {
		this.qtdDerrotas = qtdDerrotas;
	}
	public int getQtdPontos() {
		return qtdPontos;
	}
	public void setQtdPontos(int qtdPontos) {
		this.qtdPontos = qtdPontos;
	}
	
	public void listar() {
		System.out.println("");
		System.out.println("Time: "+getNome());
		System.out.println("Vitorias: "+getQtdVitorias());
		System.out.println("Empates: "+getQtdEmpates());
		System.out.println("Derrotas: "+getQtdDerrotas());
		System.out.println("Pontos: "+getQtdPontos());
	}
	
	
	
	

}
