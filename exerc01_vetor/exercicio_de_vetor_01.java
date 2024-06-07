package exerc01_vetor;

import java.util.Scanner;

public class exercicio_de_vetor_01 {

	public static void main(String[] args) { 

		Scanner sc = new Scanner(System.in);
		int [] vet = {2,5,1,3,4,9,7,8,10,6};
		int numIn;
		
		System.out.println("Digite um número que quer pesquisar");
		numIn = sc.nextInt();
		
		for (int indice = 0; indice < vet.length; indice++) {
		if(numIn == vet[indice]) {
			System.out.printf("O número %d está localizado na posição %d", numIn, indice);
			return;
			
		}
		}
	    System.out.println("Número não foi encontrado!");    
		
		
		sc.close();
		
	}

}
