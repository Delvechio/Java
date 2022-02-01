package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta {
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void saca(double valor) throws SaldoinsuficienteException{
		double valorASacar = valor + 0.2;
		super.saca(valorASacar);
	}
	
	@Override
	public void deposita (double valor) {
		super.saldo += valor;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Numero" + super.toString();
	}
}
