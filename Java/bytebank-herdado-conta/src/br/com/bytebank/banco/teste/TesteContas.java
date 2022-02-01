package br.com.bytebank.banco.teste;
import java.awt.geom.CubicCurve2D;

import br.com.bytebank.banco.modelo.*;



public class TesteContas {

	public static void main(String[] args) throws SaldoinsuficienteException{
		ContaCorrente cc =new ContaCorrente(111, 111);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);	
		cp.deposita(200.0);
		
		cc.transferi(10.0, cp);
		System.out.println("cc: " + cc.getSaldo());
		System.out.println("cp: " + cp.getSaldo());
	}

}
