/* Data: 17/08/2023
*  Esse código cria um pequeno retangulo ao redor de um nome
*  Criado para ser escalável com nomes pequenos ou grandes
*/
import java.util.Scanner;
public class Inicio {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("digite seu nome");
		String nome = input.nextLine();
		
		String linha = "";
		int separacao = 5;
		
		for(int i=0;i<separacao;i++) {
			nome = " "+nome;
		}
		for(int i=0;i<separacao;i++) {
			nome = nome+" ";
		}
		nome = "#"+nome+"#";
		int tamanhoNome = nome.length();
		
		for(int i=0;i<tamanhoNome;i++) {
			linha += "#";
		}
		
		System.out.println("la vem a magica :D");
		
		System.out.println(linha);
		System.out.println(nome);
		System.out.println(linha);
		input.close();
	}
}
