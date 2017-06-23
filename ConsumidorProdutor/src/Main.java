import Consumidor.Consumidor;
import Produtor.Fila;
import Produtor.Produtor;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Fila f = new Fila();
		Produtor p1 = new Produtor(f,1);
		Produtor p2 = new Produtor(f,2);
		Produtor p3 = new Produtor(f,3);
		Consumidor c1 = new Consumidor(f,1);
		Consumidor c2 = new Consumidor(f,2);
		p1.start();
		p2.start();
		p3.start();
		c1.start();
		c2.start();
	
		
	}

}
