
public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("testando condiconais ");
		int idade = 20;
		int quantidadeDePessoas = 3;
		if (idade >= 18) {
			System.out.println("Você tem mais de 18 anos");
			System.out.println("Seja bem vindo");
			
		}else {
			if (quantidadeDePessoas >= 2) {
				System.out.println("Você não tem 18, mas pode entrar,"
						+ " pois está acompanahdo.");
			} else {
				System.out.println("Infelismente você não pode entrar!");
			}
			
		}
	}
}
