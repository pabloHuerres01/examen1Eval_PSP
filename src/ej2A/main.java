package ej2A;

public class Main {
	
	
	public Main () {
		Gestor Gestor = new Gestor();
		
	
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
