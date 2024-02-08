package ej2B;

public class Hoy implements Runnable{
	private Gestor gestor;
	
	public Hoy (Gestor gestor) {
		this.gestor = gestor;
	}

	@Override
	public void run() {
		for(int i = 0 ;i<50;i++) {
			gestor.mostrarHoy();
		}
		
	}
	
}
