package Tde;

public class Moto {
	
	private boolean abastecendo = false;
	private boolean acelerando = false;
	private boolean freando = false;
	private boolean buzinando = false;
	
	public boolean isAbastecendo() {
		return abastecendo;
	}
	public void setAbastecendo(boolean abastecendo) {
		this.abastecendo = abastecendo;
	}
	public boolean isAcelerando() {
		return acelerando;
	}
	public void setAcelerando(boolean acelerando) {
		this.acelerando = acelerando;
	}
	public boolean isFreando() {
		return freando;
	}
	public void setFreando(boolean freando) {
		this.freando = freando;
	}
	public boolean isBuzinando() {
		return buzinando;
	}
	public void setBuzinando(boolean buzinando) {
		this.buzinando = buzinando;
	}

}
