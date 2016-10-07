import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ArrayList<Questao> lista_questoes = new ArrayList<>();
		
		String quant;
		int quanti;
		
		System.out.println("Você quer adicionar quantas questões?");
		quant = ler.nextLine();
		quanti = Integer.parseInt(quant);
		
		for (int i = 0; i < quanti; i++) {
			Questao q = new Questao();
			System.out.println("Digite o titulo da Questão:");
			q.titulo = ler.nextLine();
			System.out.println("Digite o Enunciado da Questão:");
			q.enunciado = ler.nextLine();
			System.out.println("Digite a Alternativa A:");
			q.alternativaA = ler.nextLine();
			System.out.println("Digite a Alternativa B:");
			q.alternativaB = ler.nextLine();
			System.out.println("Digite a Alternativa C:");
			q.alternativaC = ler.nextLine();
			System.out.println("Digite a Alternativa D:");
			q.alternativaD = ler.nextLine();
			System.out.println("Digite a Alternativa E:");
			q.alternativaE = ler.nextLine();
			System.out.println("Qual é a Resposta? (A,B,C,D,E)");
			q.resposta = ler.nextLine();
			lista_questoes.add(q);
		}
		
		EscreverQuestoes esc = new EscreverQuestoes();
		esc.escrverTex(lista_questoes);

	}

}
