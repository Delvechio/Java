package br.com.bytebank.banco.teste;
import javax.swing.plaf.synth.SynthOptionPaneUI;

import br.com.bytebank.banco.modelo.*;



public class TesteSaca {
	public static void main(String[] args) {
		Conta conta = new ContaCorrente(123, 321);
		conta.deposita(200.0);
		try {
			conta.saca(190.0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(conta.getSaldo());
	}
}
