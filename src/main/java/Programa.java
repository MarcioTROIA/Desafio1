import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		int qtdeNumeros = 5;
		
		Escrita[] escritores = {new EscritaTxt("saida", qtdeNumeros), new EscritaExcel("saida", qtdeNumeros)};
		
		System.out.println("Digite " + qtdeNumeros + " numeros inteiros de 0 a 10:");
		
		Scanner scanner = new Scanner(System.in);
		
		while (escritores[0].getIndice() < qtdeNumeros) {
			boolean invalido = false;
			
			if (scanner.hasNextInt()) {
				int valor = scanner.nextInt();
				
				if (valor >= 0 && valor <= 10) {
					for (Escrita escritor : escritores) {
						escritor.escreverNumero(valor);
					}
				} else {
					invalido = true;
				}
			} else {
				scanner.nextLine();
				invalido = true;
			}
			
			if (invalido) System.out.println("Valor invalido, tente um numero inteiro de 0 a 10");
		}
		
		scanner.close();
		
		for (Escrita escritor : escritores) {
			escritor.escreverMedia();
		}
	}
}
