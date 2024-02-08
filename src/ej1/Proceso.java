package ej1;

public class Proceso {
	private String comando ;
	private long pid;
	
	public Proceso (String comando, long pid) {
		this.comando = comando ;
		this.pid = pid;
	}

	public String getComando() {
		return comando;
	}

	public void setComando(String comando) {
		this.comando = comando;
	}

	public long getPid() {
		return pid;
	}

	public void setPid(long pid) {
		this.pid = pid;
	}

	@Override
	public String toString() {
		return "proceso [comando=" + comando + ", pid=" + pid + "]";
	}
}
