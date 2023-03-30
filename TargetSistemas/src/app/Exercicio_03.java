package app;

import java.util.Arrays;

public class Exercicio_03 {
	public static void main(String[] args) {
		double[] faturamentoDiario = { 22174.1664, 24537.6698, 26139.6134, 0.0, 0.0, 26742.6612, 0.0, 42889.2258,
				46251.174, 11191.4722, 0.0, 0.0, 3847.4823, 373.7838, 2659.7563, 48924.2448, 18419.2614, 0.0, 0.0,
				35240.1826, 43829.1667, 18235.6852, 4355.0662, 13327.1025, 0.0, 0.0, 25681.8318, 1718.1221, 13220.495,
				8414.61 };

		double menorFaturamento = Arrays.stream(faturamentoDiario).filter(f -> f != 0).min().orElse(0);

		double maiorFaturamento = Arrays.stream(faturamentoDiario).filter(f -> f != 0).max().orElse(0);

		double somaFaturamento = Arrays.stream(faturamentoDiario).filter(f -> f != 0).sum();

		double mediaFaturamento = somaFaturamento
				/ (faturamentoDiario.length - Arrays.stream(faturamentoDiario).filter(f -> f == 0).count());

		int diasAcimaMedia = 0;
		for (double faturamento : faturamentoDiario) {
			if (faturamento > mediaFaturamento && faturamento != 0) {
				diasAcimaMedia++;
			}
		}

		System.out.println("Menor faturamento: " + menorFaturamento);

		System.out.println("Maior faturamento: " + maiorFaturamento);

		System.out.println("Dias de faturamento acima da média: " + diasAcimaMedia);
	}
}
