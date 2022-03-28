import java.io.IOException;
import java.util.Scanner;

public class Programa {
	public static void main(String[] args) throws IOException {		
		EscritaTxt escritaTxt = new EscritaTxt("saida");
		EscritaExcel escritaExcel = new EscritaExcel("saida");
		
		System.out.println("Digite 5 numeros inteiros de 0 a 10:");
		
		Scanner scanner = new Scanner(System.in);
		
		while (!escritaTxt.listaCheia()) {
			int valor = scanner.nextInt();
			
			if (valor >= 0 && valor <= 10) {
				escritaTxt.escreverNumero(valor);
				escritaExcel.escreverNumero(valor);
			} else {
				System.out.println("Valor invalido, tente um numero inteiro de 0 a 10");
			}
		}
		
		escritaTxt.escreverMedia();
		escritaExcel.escreverMedia();
	}
}
