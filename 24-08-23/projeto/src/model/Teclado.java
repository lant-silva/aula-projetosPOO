package model;
public class Teclado {
	public String modelo;
	public String tipo;
	public String tamanho;
	public String cor;
	public String marca;
	
	public boolean ligado = false;
	
	public void digitar() {
		System.out.println("Digitando");
	}
	
	public void ligarLuzes() {
		if(!ligado) {
			System.out.println("Luzes ligadas");
			ligado = true;
		}else {
			System.out.println("Luzes desligadas");
		}
		
	}
	
	public void alternarTeclas() {
		System.out.println("Teclas alternadas");
	}

	@Override
	public String toString() {
		return "Teclado [modelo=" + modelo + ", tipo=" + tipo + ", tamanho=" + tamanho + ", cor=" + cor + ", marca="
				+ marca + "]";
	}
}
