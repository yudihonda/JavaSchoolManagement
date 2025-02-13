
public class Curso {
	private int idCurso;
	private String nomeCurso;
	private int cargaHoraria;
	private String descricao;
	public Turma turma;
	
	public Curso(String nomeCurso,String descricao, int idCurso,int cargaHoraria) {
		this.idCurso=idCurso;
		this.nomeCurso=nomeCurso;
		this.cargaHoraria=cargaHoraria;
		this.descricao=descricao;
		
	}

	public int getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(int _idCurso) {
		this.idCurso = _idCurso;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String _nomeCurso) {
		this.nomeCurso = _nomeCurso;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int _cargaHoraria) {
		this.cargaHoraria = _cargaHoraria;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String _descricao) {
		this.descricao = _descricao;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

}
