package app;

import java.util.Scanner;

public class Exercicio_02 {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        
        int numero = sc.nextInt();
        
        sc.close();

        int anterior = 0;
        int atual = 1;
        boolean referente = false;

        while (atual <= numero) {
            if (atual == numero) {
                referente = true;
                break;
            }
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }

        if (referente) {
            System.out.printf("O número %d pertence à sequência de Fibonacci." , numero);
        } else {
            System.out.printf("O número %d não pertence à sequência de Fibonacci." , numero);
        }
    }
}
