import java.util.*;

public class Turma {
	private int idTurma;
	private Curso curso;
	private Professor professor;
	public List<Aluno> alunos=new ArrayList<>(15);
	private Sala sala;
	//private List<String> diasDaSemana;
	
	public Turma(int id) {
		this.idTurma=id;
	}
	public void addAluno(Aluno aluno) {
		alunos.add(aluno);
	}
	public void removerAluno(Aluno aluno) {
		alunos.remove(aluno);
	}

	public int getIdTurma() {
		return idTurma;
	}

	public void setIdTurma(int _idTurma) {
		this.idTurma = _idTurma;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso _curso) {
		this.curso = _curso;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor _professor) {
		this.professor = _professor;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala _sala) {
		this.sala = _sala;
	}

}
