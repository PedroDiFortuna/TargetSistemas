package app;

public class Exercicio_04 {

	public static void main(String[] args) {

		double sp = 67.83643;
		double rj = 36.67866;
		double mg = 29.22988;
		double es = 27.16548;

		double outros = 19.84953;

		double total = sp + rj + mg + es + outros;

		double percentualSP = (sp / total) * 100;
		double percentualRJ = (rj / total) * 100;
		double percentualMG = (mg / total) * 100;
		double percentualES = (es / total) * 100;
		double percentualOutros = (outros / total) * 100;

		System.out.println("Percentual de cada estado:");
		System.out.printf("SP: %.5f %%\n", percentualSP);
		System.out.printf("RJ: %.5f %%\n", percentualRJ);
		System.out.printf("MG: %.5f %%\n", percentualMG);
		System.out.printf("ES: %.5f %%\n", percentualES);
		System.out.printf("Outros: %.5f %%\n", percentualOutros);

	}

}
