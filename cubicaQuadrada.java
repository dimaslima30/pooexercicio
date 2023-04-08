import java.util.Locale;
import java.util.Scanner;

public class cubicaQuadrada {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite um numero: ");
		double numero = sc.nextDouble();
		
		if(numero % 2 == 0) {
			System.out.println("Raiz cúbica de " + numero + " é igual a " + (Math.cbrt(numero)));
		}else {
			System.out.println("Raiz quadrada de " + numero + " é igual a " + (Math.sqrt(numero)));
		}

	}

}
