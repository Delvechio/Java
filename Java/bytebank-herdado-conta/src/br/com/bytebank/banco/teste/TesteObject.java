package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteObject {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(22, 33);
		ContaCorrente cp = new ContaCorrente(33, 22);
		
		System.out.println(cc);
		System.out.println(cp);
	}
}
