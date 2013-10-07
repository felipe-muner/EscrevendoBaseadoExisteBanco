package entity;

public class Inspetor {
	private Integer idInspetor;
	private String nome;
	private Integer idade;
	
	public Inspetor() {
		// TODO Auto-generated constructor stub
	}

	public Inspetor(Integer idInspetor, String nome, Integer idade) {
		super();
		this.idInspetor = idInspetor;
		this.nome = nome;
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Inspetor [idInspetor=" + idInspetor + ", nome=" + nome
				+ ", idade=" + idade + "]";
	}

	public Integer getIdInspetor() {
		return idInspetor;
	}

	public void setIdInspetor(Integer idInspetor) {
		this.idInspetor = idInspetor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	
	
}
