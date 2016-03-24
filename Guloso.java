package Guloso;

public class Guloso {
	public void trocar(int troco) {
		int vetor[] = { 50, 25, 10, 5 };
		int quant[] = { 0, 0, 0, 0 };
		int rest = troco;
		
		for (int i = 0; i < vetor.length; i++) {
			quant[i] = (int) (rest / vetor[i]);
			rest = rest % vetor[i];
		}
		for (int i = 0; i < quant.length; i++) {
			System.out.println("Para o troco de " + troco + " temos "+ quant[i] + " moedas de " + vetor[i]);
		}

	}

	public static void main(String[] args) {
		Guloso g = new Guloso();
		g.trocar(100);
	}

}
