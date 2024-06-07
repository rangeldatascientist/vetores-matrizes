package exerc01_vetor;

import java.util.Scanner;

public class exercicio_03_matriz {
	//Matriz 3x3

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        int[][] numInteiro = new int[3][3];
        int somaPrincipal = 0, somaSecundaria = 0;

        for (int linha = 0; linha < numInteiro.length; linha++) {
            for (int coluna = 0; coluna < numInteiro.length; coluna++) {
                System.out.println("Digite um valor para a posição [" + linha + "][" + coluna + "]: ");
                numInteiro[linha][coluna] = sc.nextInt();
            }
        }
        System.out.print("Elementos da diagonal principal: ");
        for (int i = 0; i < numInteiro.length; i++) {
            System.out.print(numInteiro[i][i]+" ");
            somaPrincipal+=numInteiro[i][i];
        }
        System.out.println();

        System.out.print("Elementos da diagonal secundária: ");
        for (int i = 0; i < numInteiro.length; i++) {
            System.out.print(numInteiro[i][numInteiro.length-i-1]+" ");
            somaSecundaria+=numInteiro[i][numInteiro.length-i-1];
        }
        System.out.println();
        System.out.println("Soma dos elementos da diagonal principal: " +somaPrincipal);
        System.out.println("Soma dos elementos da diagonal secundária: " +somaSecundaria);
		        
		        sc.close();

		    }


	}

