/* Data: 24/08/2023
 * Projeto que visa o estudo de objetos e suas instancias no Java
 * by: lant-silva
*/
package view;

import model.Caminhao;
import model.Teclado;
import model.Televisao;

public class Main {
	public static void main(String[] args) {
		
		Caminhao c1 = new Caminhao();
		Caminhao c2 = new Caminhao();
		
		Teclado t1 = new Teclado();
		Teclado t2 = new Teclado();
		
		Televisao tv1 = new Televisao();
		Televisao tv2 = new Televisao();
		
		c1.placa = "ABC-1234";
		c1.modelo = "Iveco Stralis";
		c1.cor = "Preto";
		c1.quilometragem = 123;
		c1.combustivel = 3;
		
		c2.placa = "COM-2314";
		c2.modelo = "Volvo Globetrotter XL";
		c2.cor = "Cinza";
		c2.quilometragem = 24;
		c2.combustivel = 15;
		
		t1.modelo = "Dark Avenger";
		t1.tipo = "Mecanico";
		t1.tamanho = "TKL/80%";
		t1.cor = "Preto";
		t1.marca = "Redragon";
		
		t2.modelo = "CK61";
		t2.tipo = "Mecanico";
		t2.tamanho = "60%";
		t2.cor = "Branco";
		t2.marca = "Motospeed";
		
		tv1.modelo = "Neo QLED";
		tv1.marca = "Samsung";
		tv1.cor = "Preto";
		tv1.polegadas = "86";
		tv1.preco = 4999.99;
		
		tv2.modelo = "OLED evo";
		tv2.marca = "LG";
		tv2.cor = "Cinza";
		tv2.polegadas = "60";
		tv2.preco = 21849.05;
		
//==============================================================//
		System.out.println(c1.toString());
		c1.buzinar();
		c1.dirigir();
		c1.ligarMotor();
		
		System.out.println("\n");
		
		System.out.println(c2.toString());
		c2.buzinar();
		c2.dirigir();
		c2.ligarMotor();
		
		System.out.println("\n");
		
		System.out.println(t1.toString());
		t1.digitar();
		t1.alternarTeclas();
		t1.ligarLuzes();
		
		System.out.println("\n");
		
		System.out.println(t2.toString());
		t2.digitar();
		t2.alternarTeclas();
		t2.ligarLuzes();
		
		System.out.println("\n");
		
		System.out.println(tv1.toString());
		tv1.conectar();
		tv1.ligar();
		tv1.transmitir();
		
		System.out.println("\n");
		
		System.out.println(tv2.toString());
		tv2.conectar();
		tv2.ligar();
		tv2.transmitir();		
	}
}
