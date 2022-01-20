import java.awt.geom.CubicCurve2D;

public class TesteContas {

	public static void main(String[] args) {
		ContaCorrente cc =new ContaCorrente(111, 111);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);	
		cp.deposita(200.0);
		
		cc.transferi(10.0, cp);
		System.out.println("cc: " + cc.getSaldo());
		System.out.println("cp: " + cp.getSaldo());
	}

}
