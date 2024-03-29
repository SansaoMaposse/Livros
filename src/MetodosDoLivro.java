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
			String autor= input.next();
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
	
public static void listarLivros (Livro[] livros) {
		
		for(int i=0; i<livros.length;i++) {
			System.out.println(livros[i].toString());
		}
		System.out.println();
	}
	
public static void livrosDeMiaCouto (Livro[] livros) {
	
	for(int i=0; i<livros.length;i++) {
		
		if(livros[i].getAutor().equalsIgnoreCase("Mia")) {
			System.out.println("O Titulo Do Livro E: "+livros[i].getTitulo());
			System.out.println("Edicao Do Livro: "+livros[i].getEdicao());
			System.out.println("O Tempo de Existencia do Livro E: "
			+livros[i].calcularTempoDeExistencia());	
		}
	}
	System.out.println();
}

public static void compararLivros (Livro[] livros) {
	
	for (int i = 0; i < livros.length; i++) {
		System.out.println(livros[i].equals(livros[livros.length - 2]));
	}
	System.out.println();
	
}

public static void livrosCriados () {
	System.out.println("O Foram criados "+ Livro.contarNumeroDeObjectosCriados+ " Livros.");
	
	System.out.println();
}

public static void livrosDeEdicoesXitlango (Livro[] livros) {
	
	for(int i=0; i<livros.length;i++) {
		if(livros[i].getEdicao().equalsIgnoreCase("Xitlango")) {
			livros[i].imprimir();
		}
	}
	System.out.println();
}

}
