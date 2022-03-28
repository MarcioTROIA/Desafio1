public abstract class CalculoMedia {
	private int[] numeros;
	private int indice;
	
	public CalculoMedia() {
		numeros = new int[5];
		indice = 0;
	}
	
	public void registra(int numero) {
		numeros[indice] = numero;
		indice++;
	}
	
	public double calculaMedia() {
		double soma = 0;
		for (int numero : numeros) soma += numero;
		return soma / indice;
	}
	
	public boolean listaCheia() {
		return indice == numeros.length;
	}
	
	public int getNumero(int indice) {
		return numeros[indice];
	}
}
