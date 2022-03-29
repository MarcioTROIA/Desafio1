import java.io.IOException;

public abstract interface Escrita {
	abstract void escreverNumero(int numero);
	abstract public void escreverMedia() throws IOException;
	abstract public int getIndice();
}
