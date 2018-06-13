package modelo;

public class CadastroEstados {
	private long codigo;
	private String nome;
	private String sigla;
	private int qtdeCaracteres;

	public int getQtdeCaracteres() {
		return qtdeCaracteres;
	}

	public void setQtdeCaracteres(int qtdeCaracteres) {
		this.qtdeCaracteres = qtdeCaracteres;
	}

	

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

}
