package model;

public class Caminhao {
	public String placa;
	public String modelo;
	public String cor;
	public int quilometragem;
	public int combustivel;
	
	public boolean ligado = false;
	
	public void dirigir() {
		if(combustivel > 0) {
			System.out.println("Dirigindo..");
		}else {
			System.out.println("Acabou a gasolina!");
		}
	}
	
	public void buzinar() {
		System.out.println("HONK HONK");
	}
	
	public void ligarMotor() {
		if(!ligado) {
			System.out.println("Motor ligado");
			ligado = true;
		}else {
			System.out.println("Motor desligado");
		}
	}

	@Override
	public String toString() {
		return "Caminhao [placa=" + placa + ", modelo=" + modelo + ", cor=" + cor + ", quilometragem=" + quilometragem
				+ ", combustivel=" + combustivel + "]";
	}
}
