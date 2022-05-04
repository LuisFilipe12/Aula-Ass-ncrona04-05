import java.util.Scanner;

public class Programa1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Equacao equacao1;
		equacao1 = new Equacao();
		
		double delta;
		int x1;
		int x2;
		
		System.out.println("Entre com os valores da equação do 2º: ");
		equacao1.a = leia.nextInt();
		equacao1.b = leia.nextInt();
		equacao1.c = leia.nextInt();
		
		delta = (b * b) - (4 * a * c);
		x1 = 0;
		x2 = 0;
		
		if(delta >= 0) {
			x1 = (- b + Math.sqrt(delta)) / (2 * a);
		x2 = (- b + Math.sqrt(delta)) / (2 * a);
		System.out.println("Valor de Delta é" + delta);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		leia.close();
		

	}

}
