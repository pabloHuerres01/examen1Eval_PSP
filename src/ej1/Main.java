package ej1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private ArrayList <Proceso> proceso = new ArrayList <Proceso>();
	private Runtime rt = Runtime.getRuntime();
	private Process miProceso = null;
	private Scanner t = new Scanner (System.in);
	private int num ;
	private String comando ;
	
	public void crearProceso () {
		System.out.println("Introduce el comando");
		comando= t .nextLine();
		try {
			miProceso = rt.exec(comando);
			
			Proceso p = new Proceso (comando, miProceso.pid());
			proceso.add(p);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void mostrar() {
		for(Proceso p : proceso) {
			System.out.println(p.toString());
		}
	}
	public void pideNumeros() {
		System.out.println("Introduce el numero del 1 al 5");
		num = Integer.parseInt(t.nextLine());
		while(num<0 || num>5) {
			System.out.println("Introduce el numero del 1 al 5");
			num = Integer.parseInt(t.nextLine());
		}
		for(int i = 0; i<num;i++) {
			crearProceso();
		}
	}
	public void borrar() {
		System.out.println("Introduce el numero que deseas borrar (se empieza a contar desde el numero 1)");
		num = Integer.parseInt(t.nextLine());
		while(num<0 || num>proceso.size()) {
			System.out.println("Introduce el numero que deseas borrar (se empieza a contar desde el numero 1)");
			num = Integer.parseInt(t.nextLine());
		}
		long pid = (proceso.get(num-1)).getPid();
		try {
			miProceso = rt.exec("cmd.exe /c taskkill /pid "+pid);
			System.out.println(pid);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		proceso.remove(num-1);
		
		
			
		
	}
	public Main() {
		pideNumeros();
		mostrar();
		borrar();
		mostrar();
		
	}

	public static void main(String[] args) {
		Main ej = new Main();

	}

}
