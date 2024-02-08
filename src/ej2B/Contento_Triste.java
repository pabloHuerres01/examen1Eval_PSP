package ej2B;

public class Contento_Triste implements Runnable{
	private Gestor gestor;
	
	public Contento_Triste (Gestor gestor) {
		this.gestor = gestor;
	}

	@Override
	public void run() {
		for(int i = 0 ;i<50;i++) {
			gestor.mostrarContentoTriste();
			
		}
		
	}
}
