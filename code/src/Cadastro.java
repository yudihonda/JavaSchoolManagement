
public class Cadastro {
	public void cadastrarAluno(Aluno aluno, Turma turma) {
		aluno.setTurma(turma);
		turma.addAluno(aluno);
	}
	public void cadastrarProfessor(Professor professor,Turma turma) {
		professor.setTurma(turma);
		turma.setProfessor(professor);
	}
	public void cadastrarCurso(Curso curso,Turma turma) {
		curso.setTurma(turma);
		turma.setCurso(curso);
	}
	public void cadastrarTurma(Turma turma, Sala sala) {
		sala.setTurma(turma);
		
	}
}
