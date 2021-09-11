package Tde;

public class Automovel {
	
	private boolean abastecendo = false;
	private boolean acelerando = false;
	private boolean freando = false;
	private boolean passandoMarcha = false;
	
	public void abastecer() {
		if(!this.isAbastecendo()) {
			System.out.println("Abastecendo!");
		}
			setAbastecendo(false);
		}
			
	
	public void acelerar() {
		if(!this.isAcelerando()) {
			setAcelerando(true);
			System.out.println("Acelerando!");
		}
		setAcelerando(false);
	}
	
	public void frear() {
		if(!this.isFreando()) {
			setFreando(true);
			System.out.println("Freando!");
		}
		setFreando(false);
	}
	
	public void passarMarcha() {
		if(!this.isPassandoMarcha()) {
			setPassandoMarcha(true);
			System.out.println("Passando marcha!");
		}
		setPassandoMarcha(false);
	}
	
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
	public boolean isPassandoMarcha() {
		return passandoMarcha;
	}
	public void setPassandoMarcha(boolean passandoMarcha) {
		this.passandoMarcha = passandoMarcha;
	}
	
}
