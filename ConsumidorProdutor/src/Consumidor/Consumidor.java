package Consumidor;

import Produtor.Fila;

public class Consumidor extends Thread{
	private int id;
	private Fila f;
	
	
	public Consumidor(Fila f,int id){
		this.f = f;
		this.id = id;
	}
	public void run(){
		
		while(true){
			String pr;
			try {
				
				pr = f.retirar(id);
				
				sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//wait();
			
		}
		
	}
	public void setF(Fila f) {
		this.f = f;
	}
	
}
