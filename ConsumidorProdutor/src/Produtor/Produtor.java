package Produtor;

import java.util.Random;

public class Produtor extends Thread{
	private Fila f;
	private int id;
	
	public Produtor(Fila f,int id){
		this.f = f;
		this.id = id;
	}
	public void run(){
		
		while(true){
			Random rn = new Random();
			int produzido = rn.nextInt(100) + 1;
			try {
				f.add(String.valueOf(produzido),id);
				sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}	
		
		
	}

	public void setF(Fila f) {
		this.f = f;
	}
	

}
