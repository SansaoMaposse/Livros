import java.util.Scanner;

public class MetodosDoLivro {
static Scanner input = new Scanner (System.in);
	
	public static void preencherArray (Livro[] livros) {
		
		for(int i=0; i<livros.length; i++) {
			System.out.print("Digite o Codigo " +(i+1)+ " Livro: ");
			int codigo= input.nextInt();
			System.out.print("Digite o Titulo do Livro: ");
			String titulo= input.next();
			System.out.print("Digite o Autor do Livro: ");
			String autor= input.nextLine();
			System.out.print("Digite a Edicao do  Livro: ");
			String edicao= input.next();
			System.out.print("Digite o Ano da Publicacao do Livro: ");
			int anoPublicacao= input.nextInt();
			System.out.print("Digite o Ano Actual Livro: ");
			int anoActual= input.nextInt();
			
			livros [i] = new Livro(codigo, titulo, autor, edicao, anoPublicacao, anoActual);
			System.out.println();
		}
	}

}