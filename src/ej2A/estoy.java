package ej2A;

public class Estoy implements Runnable{
	private Gestor gestor;
	
	public Estoy (Gestor gestor) {
		this.gestor = gestor;
	}

	@Override
	public void run() {
		for(int i = 0 ;i<50;i++) {
			gestor.mostrarEstoy();
		}
		
	}
}
