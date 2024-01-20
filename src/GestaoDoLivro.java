import java.util.Scanner;
public class GestaoDoLivro {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Digite a Capacidade do Array: ");
		int capacidade = input.nextInt();
		System.out.println();
		
		Livro [] livros = new Livro[capacidade];
		
		char continuar='c';
		while(continuar== 'c') {
			
			System.out.println("1 Preencher Array");
			System.out.println("2 Listar Livros");
			System.out.println("3 Livros De Mia Couto");
			System.out.println("4 Comparar Livros");
			System.out.println("5 Livros Criados");
			System.out.println("6 Livros De Edicoes Xitlango");
			System.out.println();
			System.out.print("Escolha a Opcao que Desejas: ");
			int opcao = input.nextInt();
			
			System.out.println();
			
			switch (opcao) {
			case 1: MetodosDoLivro.preencherArray(livros); break;
			case 2: MetodosDoLivro.listarLivros(livros);break;
			case 3: MetodosDoLivro.livrosDeMiaCouto(livros);break; 
			case 4: MetodosDoLivro.compararLivros(livros);break;
			case 5: MetodosDoLivro.livrosCriados();break; 
			case 6: MetodosDoLivro.livrosDeEdicoesXitlango(livros);break; 
			default:System.out.print("Opcao Invalida, Escolhe Uma Opcao Valida: ");break;
				
			}
			
			System.out.print("Digite o 'C' Para Continuar no Programa ou Outra Letra Pra Sair: ");
			continuar = input.next().toLowerCase().charAt(0);
		}
	}

}
