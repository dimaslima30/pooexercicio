import java.util.Locale;
import java.util.Scanner;

public class conversorTemperatura {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite a temperatura: ");
		float temperatura = sc.nextFloat();
		sc.nextLine();
		
		System.out.println("Digite o número da escala: 1-Celsius, 2-Fahrenheit; 3-Kelvin");
		int escala = sc.nextInt();
		
		switch(escala) {
			case 1:
				System.out.println("A temperatura " + temperatura + "ºC é igual a " + (temperatura*1.8 +32) + " ºF e a " + (temperatura+273) + " ºK");
				break;
			case 2:
				System.out.println("A temperatura " + temperatura + "ºF é igual a " + ((temperatura-32)/1.8) + " ºC e a " + ((temperatura+459.67) * 5/9) + " ºK");
				break;
			case 3: 
				System.out.println("A temperatura " + temperatura + "ºK é igual a " + (temperatura - 273) + " ºC e a " + (1.8*(temperatura-273) + 32) + " ºF");
				break;
			default:
				System.out.println("Selecione uma escala existente(1, 2 ou 3)");
				break;
		}
		

	}

}
