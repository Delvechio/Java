package pilha;

public class TestaContaComExcecaoChecked {
	public static void main(String[] args) {
		Conta conta = new Conta();
		try {
			conta.deposi();
		} catch (MinhaException e) {
			System.out.println("Tratamento ...");
		}
		
	}
}
