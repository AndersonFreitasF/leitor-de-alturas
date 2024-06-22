package questao;
import java.util.Locale;
import java.util.Scanner;
import entidades.pessoas;

public class QuestaoPessoas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas pessoas serão digitadas?");
		int p = sc.nextInt();
		sc.nextLine();
		pessoas v[] = new pessoas [p];
		for(int i = 0 ;i<p ; i++) {
			System.out.println("Digite o nome do " + (i+1) + "o aluno:");
			String nome = sc.nextLine();
			System.out.println("Digite a idade do aluno:");
			int idade = sc.nextInt();
			System.out.println("Digite a altura do aluno");
			double altura = sc.nextDouble();
		
		pessoas pessoa = new pessoas(nome,idade,altura);
			v[i] = pessoa;
		}
		for (int i =0; i <p ; i++ ) {
			System.out.println("Informações dos alunos:\n"+ v[i]);
		}
		sc.close();	
	}

}

