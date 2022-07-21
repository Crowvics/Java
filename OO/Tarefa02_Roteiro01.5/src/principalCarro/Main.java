package principalCarro;
import classesCarro.Roda;
import classesCarro.Carro;

public class Main {

	public static void main(String[] args) {
		Carro c1, c2;
		c1 = new Carro ();
		c1.preencherCarro();
		c1.imprimirCarro();
		
		c2 = new Carro ();
		c2.copiarCarro(c1);
		c2.imprimirCarro();

	}

}
