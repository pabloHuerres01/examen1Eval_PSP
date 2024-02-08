package ej2B;

import java.util.concurrent.Semaphore;

public class Main {
	
	
	public Main () {
		Semaphore sHoy = new Semaphore(1);
		Semaphore sEstoy = new Semaphore(0);
		Semaphore sContento = new Semaphore(0);
		
		Gestor Gestor = new Gestor(sHoy, sEstoy, sContento);
		
	
		Thread hiloHoy = new Thread(new Hoy (Gestor));
		Thread hiloEstoy = new Thread(new Estoy (Gestor));
		Thread hiloContentoTriste = new Thread(new Contento_Triste (Gestor));
		
		hiloHoy.start();
		hiloEstoy.start();
		hiloContentoTriste.start();
		
		}
	public static void main(String[] args) {
		Main ej = new Main();
	}
}
