
public class TestaContaSemCliente {
	private void main() {
		Conta contaDaMarcelaConta = new Conta();
		
		
		contaDaMarcelaConta.titular = new Cliente();
		System.out.println(contaDaMarcelaConta.titular);
		contaDaMarcelaConta.titular.nome = "Marcela";
		System.out.println(contaDaMarcelaConta.titular.nome);

	}
}
