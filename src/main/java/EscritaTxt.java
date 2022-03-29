import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscritaTxt extends CalculoMedia implements Escrita {
	private FileWriter arq;
	private PrintWriter gravarArq;
	
	public EscritaTxt(String nomeArquivo, int qtdeNumeros) throws IOException {
		super(qtdeNumeros);
		arq = new FileWriter(nomeArquivo + ".txt");
		gravarArq = new PrintWriter(arq);
	}
	
	public void escreverNumero(int numero) {
		gravarArq.println(numero);
		super.registra(numero);
	}

	public void escreverMedia() throws IOException {
		gravarArq.print(super.calculaMedia());
		arq.close();
	}
}
