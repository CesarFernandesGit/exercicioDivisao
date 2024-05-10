import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.print("Quantos casos voce vai digitar? ");
		int casos = scanner.nextInt();

		double numerador = 0;
		double denominador = 0;
		double divisão;

		for (int i = 0; i < casos; i++) {

			System.out.print("Entre com o numerador: ");
			numerador = scanner.nextInt();

			System.out.print("Entre com o denominador: ");
			denominador = scanner.nextInt();
			
			if (denominador == 0) {
				System.out.printf("DIVISAO IMPOSSIVEL%n");
			} else {
				divisão = numerador / denominador;
				System.out.printf("DIVISAO = %.2f%n", divisão);
			}

		}

		scanner.close();
	}

}
