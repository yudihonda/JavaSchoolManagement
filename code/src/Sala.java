
public class Sala {

	private int idSala;
	private String nome;
	private String local;
	private int capacidadeTotal;
	public Turma turma;

	public Sala(int idSala, String nome, String local, int capacidadeTotal) {
		super();
		this.idSala = idSala;
		this.nome = nome;
		this.local = local;
		this.capacidadeTotal = capacidadeTotal;
	}

	public int getIdSala() {
		return idSala;
	}

	public void setIdSala(int idSala) {
		this.idSala = idSala;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String _nome) {
		this.nome = _nome;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String _local) {
		this.local = _local;
	}

	public int getCapacidadeTotal() {
		return capacidadeTotal;
	}

	public void setCapacidadeTotal(int _capacidadeTotal) {
		this.capacidadeTotal = _capacidadeTotal;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

}
