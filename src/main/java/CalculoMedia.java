public abstract class CalculoMedia {
	private int[] numeros;
	private int indice;
	
	protected CalculoMedia(int qtdeNumeros) {
		numeros = new int[qtdeNumeros];
		indice = 0;
	}
	
	protected void registra(int numero) {
		numeros[indice] = numero;
		indice++;
	}
	
	protected double calculaMedia() {
		double soma = 0;
		for (int numero : numeros) soma += numero;
		return soma / indice;
	}
}
