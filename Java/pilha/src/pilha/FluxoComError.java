package pilha;

public class FluxoComError {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
        	metodo2();
		} catch (ArithmeticException | NullPointerException e) {
			String msgString = e.getMessage();
			System.out.println("Exception " + msgString);
			e.printStackTrace();
		} 
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Chamando metodo 2");
        metodo2();
        System.out.println("Fim do metodo 2");
        //System.out.println("Fim do metodo2");
    }
}
