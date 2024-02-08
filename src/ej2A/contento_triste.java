package ej2A;

public class Contento_Triste implements Runnable{
	private Gestor gestor;
	
	
	public Contento_Triste (Gestor gestor) {
		this.gestor = gestor;
	}

	@Override
	public void run() {
		for(int i = 0 ;i<50;i++) {
			if (i%2!=0){
				gestor.mostrarTriste();
			}
			else if (i%2==0){
				gestor.mostrarContento();
			}

			
			
		}
		
	}
}
