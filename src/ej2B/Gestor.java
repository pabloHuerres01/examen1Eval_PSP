package ej2B;

import java.util.concurrent.Semaphore;

public class Gestor {
	Semaphore sHoy;
	Semaphore sEstoy;
	Semaphore sContento;
	
	public Gestor (Semaphore sHoy,	Semaphore sEstoy,	Semaphore sContento) {
		this.sHoy=sHoy;
		this.sEstoy=sEstoy;
		this.sContento=sContento;
	}
	
	public  void mostrarHoy() {
	
			try {
				sHoy.acquire();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		
		System.out.println("Hoy");
		sEstoy.release();
	}
	
	public void mostrarEstoy() {
		
			try {
				sEstoy.acquire();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		
		System.out.println("Estoy");
		sContento.release();
		
	}
	
	
	public  void mostrarContentoTriste() {		
		
			try {
				sContento.acquire();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		System.out.println("Contento");		
		sHoy.release();
	}
	
}
