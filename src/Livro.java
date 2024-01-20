
public class Livro {
	private int codigo;
	private String titulo;
	private String autor;
	private String edicao;
	private int anoPublicacao;
	private int anoActual;
	
	static int contarNumeroDeObjectosCriados=0;
	
	public Livro(int codigo, String titulo, String autor, String edicao, int anoPublicacao, 
			int anoActual) {
		super();
		
		this.codigo = codigo;
		this.titulo = titulo;
		this.autor = autor;
		this.edicao = edicao;
		this.anoPublicacao = anoPublicacao;
		this.anoActual = anoActual;
		contarNumeroDeObjectosCriados++;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEdicao() {
		return edicao;
	}

	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}

	public int getAnoPoblicacao() {
		return anoPublicacao;
	}

	public void setAnoPoblicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public int getAnoActual() {
		return anoActual;
	}

	public void setAnoActual(int anoActual) {
		this.anoActual = anoActual;
	}
	
	public String toString () {
		return "Codigo: "+ codigo+" - "+ "Titulo: "+titulo+" - "+"Autor: "+autor+" - "+
				"Edicao: "+ edicao+" - "
				+"Ano de Publicacao: "+ anoPublicacao+" - "+"Ano Actual: "+
				anoActual+" - "+"Tempo de Existencia do Livro: "+calcularTempoDeExistencia();
	}
	
	public void imprimir() {
		System.out.println("Codigo: "+codigo);
		System.out.println("Titulo: "+titulo);
		System.out.println("Autor: "+autor);
		System.out.println("Edicao: "+ edicao);
		System.out.println("Ano de Publicacao: "+anoPublicacao);
		System.out.println("Ano Actual: "+anoActual);
		System.out.println("Tempo de Existencia do Livro: "+calcularTempoDeExistencia());
	}
	
	public boolean equals(Livro compararObjectos) {
		
		if(this.codigo== compararObjectos.codigo) {
			
				return true;
		}else {
				return false;
		}
		
	}
	
	public int calcularTempoDeExistencia () {
		return anoActual-anoPublicacao;
	}
}
