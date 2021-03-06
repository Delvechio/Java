package br.com.bytebank.banco.modelo;


/**
 * Classe representa moldur conta
 * @author delve
 *
 */
public abstract class Conta{
	protected double saldo = 100;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta() {
		
	}
	/**
	 * Construtor inicializar classe
	 * @param agencia
	 * @param numero
	 */
	public Conta(int agencia, int numero) {
		Conta.total++;
		//System.out.println("o total de conta ?: " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		//this.saldo = 100;
		//System.out.println("estou criando uma conta " + this.numero);
	}
	
	public abstract void deposita(double valor);
	/**
	 * Valor precisa maior  que saldo
	 * @param valor
	 * @throws SaldoinsuficienteException
	 */
	public void saca(double valor) throws SaldoinsuficienteException{
		if (this.saldo < valor) {
			throw new SaldoinsuficienteException("Saldo: " + this.saldo + ", valor: " + valor);
		}
		this.saldo -= valor;
	}
	
	public void transferi(double valor,Conta destino) throws SaldoinsuficienteException{
		this.saca(valor);
		destino.deposita(valor);
	}
		
	
	public double getSaldo() {
		return this.saldo;

	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public  void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("n?o pode valor menor que 0");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if (agencia <=0) {
			System.out.println("n?o pode valor menor igual a 0");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public Cliente getTitular() {
		return titular;
	}
	public static int getTotal() {	
		return Conta.total;
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		return "Numero:" + this.numero;
	}
	
}