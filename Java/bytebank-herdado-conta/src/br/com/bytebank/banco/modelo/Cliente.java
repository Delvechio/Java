package br.com.bytebank.banco.modelo;
import javax.management.loading.PrivateClassLoader;
/*
 * Classe que representa um cliente na Conta.
 * @author Delvechio Duarte
 * @version 0.1
 */

public class Cliente {
	private String nome;
	private String cpf;
	private String profissao;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	
}