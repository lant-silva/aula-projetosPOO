package model;
public class Televisao {
	
	public String modelo;
	public String marca;
	public String cor;
	public String polegadas;
	public double preco;
	
	public boolean ligado = false;
	public boolean conectado = false;
	
	public void ligar() {
		if(!ligado) {
			System.out.println("Televisão ligada");
			ligado = true;
		}else {
			System.out.println("Televisão desligada");
		}
	}
	
	public void conectar() {
		if(!conectado) {
			System.out.println("Conectado a internet!");
		}else {
			System.out.println("Desconectado");
		}
	}
	
	public void transmitir() {
		System.out.println("Transmitindo a imagem do celular");
	}

	@Override
	public String toString() {
		return "Televisao [modelo=" + modelo + ", marca=" + marca + ", cor=" + cor + ", polegadas=" + polegadas
				+ ", preco=" + preco + "]";
	}
}
