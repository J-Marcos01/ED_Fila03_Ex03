package model;

public class Processo {
	private String nome;
	private int qtdRetornos;
	
	public Processo(String nome,int qtdRetornos) {
		this.nome=nome;
		this.qtdRetornos=qtdRetornos;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQtdRetornos() {
		return qtdRetornos;
	}
	public void setQtdRetornos(int qtdRetornos) {
		this.qtdRetornos = qtdRetornos;
	}
	@Override
	public String toString() {
		return nome+";"+qtdRetornos;
	}
}
