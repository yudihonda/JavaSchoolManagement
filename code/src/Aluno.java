
public class Aluno extends Pessoa {
	private int idAluno;
	private int matricula;
	public Turma turma;

	public Aluno(String nomeComp, String cpf, String email, String fone, int idAluno, int matricula) {
		this.nomeComp = nomeComp;
		this.cpf = cpf;
		this.email = email;
		this.fone = fone;
		this.idAluno = idAluno;
		this.matricula = matricula;
	}

	public int getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(int _idAluno) {
		this.idAluno = _idAluno;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int _matricula) {
		this.matricula = _matricula;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

}
