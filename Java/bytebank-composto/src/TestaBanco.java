
public class TestaBanco {
	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		
		paulo.nome = "Paulo silveira";
		paulo.cpf = "222.222.222=22";
		paulo.profissao = "progamador";
		
		Conta contaDoPauloConta = new Conta();
		contaDoPauloConta.deposita(100);
		
		contaDoPauloConta.titular = paulo;
		System.out.println(contaDoPauloConta.titular.nome);
	}
}
