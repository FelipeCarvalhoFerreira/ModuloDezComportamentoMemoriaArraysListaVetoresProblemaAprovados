package ModuloDezComportamentoMemoriaArraysListaVetoresProblemaAprovados;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();

		Alunos aluno[] = new Alunos[n];

		for (int i = 0; i < n; i++) {

			System.out.printf("Digite nome, primeira e segunda nota do %do aluno:\n", i + 1);
			String nome = sc.next();
			double primeira = sc.nextDouble();
			double segunda = sc.nextDouble();

			aluno[i] = new Alunos(nome, primeira, segunda);

		}

		System.out.println("Alunos aprovados: ");
		double media = 0.0;
		for (int i = 0; i < n; i++) {
			media = (aluno[i].getPrimeira() + aluno[i].getSegunda()) / 2;
			
			if (media >= 6) {
				System.out.println( aluno[i].getNome());
				
			}
			
		}
		
		sc.close();

	}

}
