import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Produto produto1;
		produto1 = new Produto();
		
		System.out.println("Entre com o nome do protudo: ");
		produto1.produto = leia.nextLine();
		System.out.println("Entre com o valor do produto: ");
		produto1.preco = leia.nextLine();
		System.out.println("Entre com a quantidade em estoque: ");
		produto1.estoque = leia.nextDouble();
		
		System.out.println(produto1.produto + " " + produto1.preco + " " + produto1.estoque);
		
		leia.close();

	}

}
