package ProjetoDeAlgoritmo;

import java.util.Scanner;

public class Guloso {
	public void trocar(int troco) {
		int vetor[] = { 50, 25, 10, 5 };
		int quant[] = { 0, 0, 0, 0 };
		int rest = troco;
		
		for (int i = 0; i < vetor.length; i++) {
			quant[i] = (int) (rest / vetor[i]);
			rest = rest % vetor[i];
		}
		System.out.println("***************************");
		System.out.println("Para o troco de " + troco);
		System.out.println("***************************");
		for (int i = 0; i < quant.length; i++) {
			System.out.println("Temos "+ quant[i] + " moedas de " + vetor[i]);
		}

	}

	public static void main(String[] args) {
		Guloso g = new Guloso();
		Scanner s = new Scanner(System.in);
		System.out.print("Digite o troco necessário: ");
		int troco = s.nextInt();
		g.trocar(troco);
	}

}
