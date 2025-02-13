
public class Professor extends Pessoa {
	private int idFuncionario;
	public Turma turma;

	public Professor(String nomeComp, String cpf, String email, String fone, int idFuncionario) {
		this.nomeComp = nomeComp;
		this.cpf = cpf;
		this.email = email;
		this.fone = fone;
		this.idFuncionario = idFuncionario;
	}

	public int getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(int _idFuncionario) {
		this.idFuncionario = _idFuncionario;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}
}
