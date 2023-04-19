package principal;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Enquete enquete;
		
		int quant;
		
		System.out.print("Informe o numero de clientes pesquisados: ");
		quant = teclado.nextInt();
		enquete = new Enquete(quant);
		
		System.out.print("\nVetor: [");
		for (int i=0; i<enquete.quantClientes(); i++) {
			System.out.print(enquete.getNotas()[i]+" ");
		}
		System.out.println("]\n");
		
		System.out.println("Frequencia de ocorrencia das notas\n");
		
		for (int i=1; i<=10; i++) {
			System.out.printf("Nota %d: %d vez(es)%n", i, enquete.frequencia(i));
		}
		System.out.printf("\nMedia das notas: %.1f%n", enquete.media());
		System.out.println("Numero de clientes entrevistados: "+enquete.quantClientes());
		
		teclado.close();
	}
}
