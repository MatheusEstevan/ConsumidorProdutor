package Produtor;
import java.util.ArrayList;

public class Fila {

	private static ArrayList<String> fila = new ArrayList();
	
	

	
	
	public  synchronized void add(String i,int id) throws InterruptedException{
		while(fila.size() >= 10){
			System.out.println("fila cheia");
			wait();
		}
		fila.add(i);
		System.out.println("Produtor " + id + " Produziu: " + i);
		notifyAll();
	}
	public synchronized String retirar(int id) throws InterruptedException{
		while(fila.size() == 0){
			System.out.println("fila vazia");
			wait();
		}
		String rt = fila.get(0);
		fila.remove(0);
		System.err.println("Consumidor " + id + " Retirou: " + rt);
		notifyAll();
		return rt;
		
		
	}
}
