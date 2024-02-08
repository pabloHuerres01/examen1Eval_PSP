package ej2A;

public class Gestor {
	private int i = 0;
	
	public synchronized void mostrarHoy() {
		while(i!=0) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		i++;
		System.out.println("Hoy");
		notifyAll();
	}
	
	public synchronized void mostrarEstoy() {
		while(i!=1) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		i++;
		System.out.println("Estoy");
		notifyAll();
	}
	
	
	public synchronized void mostrarContento() {		
		while(i!=2) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("Contento");		
		i++;
		notifyAll();
	}
	public synchronized void mostrarTriste() {		
		while(i!=3) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("Triste");		
		i=0;
		notifyAll();
	}
	
}
