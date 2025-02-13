import java.util.*;
public class Main {
	public static void main(String[] args) {
		List<Aluno> alunos = new ArrayList<>();
		List<Professor> professores = new ArrayList<>();
		List<Curso> cursos = new ArrayList<>();
		List<Turma> turmas = new ArrayList<>();
		List<Sala> salas = new ArrayList<>(15);
		String id;
		String matricula;
		String nome;
		String cpf;
		String email;
		String fone;
		String cargaHoraria;
		String descricao;
		String local;
		String capacidade;
		int num;
		int num2;
		int a;
		boolean z = true;
		Scanner scan = new Scanner(System.in);
		Cadastro cadastro = new Cadastro();
		while (z) {
			System.out.println("Digite a opção desejada:");
            System.out.println("1. Adicionar Aluno");
            System.out.println("2. Adicionar Professor");
            System.out.println("3. Adicionar Curso");
            System.out.println("4. Adicionar Turma");
            System.out.println("5. Adicionar Sala");
            System.out.println("6. Cadastro");
            System.out.println("7. Sair");
            System.out.println("0. Visualizar Dados");
            a = scan.nextInt();
			switch (a) {
			case 0:
                System.out.println("----- ALUNOS -----");
                for (Aluno aluno : alunos) {
                    System.out.println(aluno.getNome());
                }
                System.out.println("------------------");

                System.out.println("----- PROFESSORES -----");
                for (Professor professor : professores) {
                    System.out.println(professor.getNome());
                }
                System.out.println("-----------------------");

                System.out.println("----- CURSOS -----");
                for (Curso curso : cursos) {
                    System.out.println(curso.getNomeCurso());
                }
                System.out.println("------------------");

                System.out.println("----- TURMAS -----");
                for (Turma turma : turmas) {
                    System.out.println(turma.getIdTurma());
                }
                System.out.println("------------------");

                System.out.println("----- SALAS -----");
                for (Sala sala : salas) {
                    System.out.println(sala.getNome());
                }
                System.out.println("-----------------");
                break;
			case 1:
				scan.nextLine();
				System.out.println("Digite o nome do aluno:");
				nome = scan.nextLine();

				System.out.println("Digite o CPF do aluno:");
				cpf = scan.nextLine();

				System.out.println("Digite o e-mail do aluno:");
				email = scan.nextLine();

				System.out.println("Digite o telefone do aluno:");
				fone = scan.nextLine();

				System.out.println("Digite o ID do aluno:");
				id = scan.nextLine();

				System.out.println("Digite a matrícula do aluno:");
				matricula = scan.nextLine();

				try {
					num = Integer.parseInt(id);
					num2 = Integer.parseInt(matricula);
				} catch (Exception e) {
					System.out.println("Erro ao converter número.");
				}
				num = Integer.parseInt(id);
				num2 = Integer.parseInt(matricula);
				Aluno aluno = new Aluno(nome, cpf, email, fone, num, num2);
				alunos.add(aluno);
				break;
			case 2:
				scan.nextLine();
				System.out.println("Digite o nome do professor:");
				nome = scan.nextLine();

				System.out.println("Digite o CPF do professor:");
				cpf = scan.nextLine();

				System.out.println("Digite o e-mail do professor:");
				email = scan.nextLine();

				System.out.println("Digite o telefone do professor:");
				fone = scan.nextLine();

				System.out.println("Digite o ID do professor:");
				id = scan.nextLine();

				try {
					num = Integer.parseInt(id);
				} catch (Exception e) {
					System.out.println("Erro ao converter número.");
				}
				num = Integer.parseInt(id);
				Professor professor = new Professor(nome, cpf, email, fone, num);
				professores.add(professor);
				break;
			case 3:
				scan.nextLine();
				System.out.println("Digite o ID do curso:");
				id = scan.nextLine();

				System.out.println("Digite o nome do curso:");
				nome = scan.nextLine();

				System.out.println("Digite a carga horária do curso:");
				cargaHoraria = scan.nextLine();

				System.out.println("Digite a descrição do curso:");
				descricao = scan.nextLine();

				try {
					num = Integer.parseInt(id);
					num2 = Integer.parseInt(cargaHoraria);
				} catch (Exception e) {
					System.out.println("Erro ao converter número.");
				}
				num = Integer.parseInt(id);
				num2 = Integer.parseInt(cargaHoraria);
				Curso curso = new Curso(nome, descricao, num, num2);
				cursos.add(curso);
				break;
			case 4:
				scan.nextLine();
				System.out.println("Digite o ID da turma:");
				id = scan.nextLine();
				try {
					num = Integer.parseInt(id);
				} catch (Exception e) {
					System.out.println("Erro ao converter número.");
				}
				num = Integer.parseInt(id);
				Turma turma = new Turma(num);
				turmas.add(turma);
				break;
			case 5:
				scan.nextLine();
				System.out.println("Digite o ID da sala:");
				id = scan.nextLine();

				System.out.println("Digite o nome da sala:");
				nome = scan.nextLine();

				System.out.println("Digite o local da sala:");
				local = scan.nextLine();

				System.out.println("Digite a capacidade total da sala:");
				capacidade = scan.nextLine();

				try {
					num = Integer.parseInt(id);
					num2 = Integer.parseInt(capacidade);
				} catch (Exception e) {
					System.out.println("Erro ao converter número.");
				}
				num = Integer.parseInt(id);
				num2 = Integer.parseInt(capacidade);
				Sala sala = new Sala(num, nome, local, num2);
                salas.add(sala);
                break;
			case 6:
                System.out.println("Digite a opção desejada:");
                System.out.println("1. Cadastrar Aluno em Turma");
                System.out.println("2. Cadastrar Professor em Turma");
                System.out.println("3. Cadastrar Curso em Turma");
                System.out.println("4. Cadastrar Turma em Sala");
                System.out.println("5. Voltar");

                int bx = scan.nextInt();
                scan.nextLine(); 

                switch (bx) {
                    case 1:
                        System.out.println("Digite o ID do aluno:");
                        int idAluno = scan.nextInt();
                        scan.nextLine(); 

                        System.out.println("Digite o ID da turma:");
                        int idTurma = scan.nextInt();
                        scan.nextLine();

                        Aluno alunoSelect = null;
                        Turma turmaSelect = null;

                        for (Aluno aluno1 : alunos) {
                            if (aluno1.getIdAluno() == idAluno) {
                                alunoSelect = aluno1;
                                break;
                            }
                        }

                        for (Turma turma1 : turmas) {
                            if (turma1.getIdTurma() == idTurma) {
                                turmaSelect = turma1;
                                break;
                            }
                        }

                        cadastro.cadastrarAluno(alunoSelect, turmaSelect);
                        break;

                    case 2:
                        System.out.println("Digite o ID do professor:");
                        int idProfessor = scan.nextInt();
                        scan.nextLine();

                        System.out.println("Digite o ID da turma:");
                        idTurma = scan.nextInt();
                        scan.nextLine();

                        Professor professorSelect = null;
                        turmaSelect = null;

                        for (Professor prof : professores) {
                            if (prof.getIdFuncionario() == idProfessor) {
                                professorSelect = prof;
                                break;
                            }
                        }

                        for (Turma turma1 : turmas) {
                            if (turma1.getIdTurma() == idTurma) {
                                turmaSelect = turma1;
                                break;
                            }
                        }

                        cadastro.cadastrarProfessor(professorSelect, turmaSelect);
                        break;

                    case 3:
                        System.out.println("Digite o ID do curso:");
                        int idCurso = scan.nextInt();
                        scan.nextLine(); 

                        System.out.println("Digite o ID da turma:");
                        idTurma = scan.nextInt();
                        scan.nextLine();

                        Curso cursoSelect = null;
                        turmaSelect = null;

                        for (Curso curso1 : cursos) {
                            if (curso1.getIdCurso() == idCurso) {
                                cursoSelect = curso1;
                                break;
                            }
                        }

                        for (Turma turma1 : turmas) {
                            if (turma1.getIdTurma() == idTurma) {
                                turmaSelect = turma1;
                                break;
                            }
                        }

                        cadastro.cadastrarCurso(cursoSelect, turmaSelect);
                        break;

                    case 4:
                        System.out.println("Digite o ID da turma:");
                        idTurma = scan.nextInt();
                        scan.nextLine(); 

                        System.out.println("Digite o ID da sala:");
                        int idSala = scan.nextInt();
                        scan.nextLine(); 

                        turmaSelect = null;
                        Sala salaSelect = null;

                        for (Turma turma1 : turmas) {
                            if (turma1.getIdTurma() == idTurma) {
                                turmaSelect = turma1;
                                break;
                            }
                        }

                        for (Sala salaq : salas) {
                            if (salaq.getIdSala() == idSala) {
                                salaSelect = salaq;
                                break;
                            }
                        }

                        cadastro.cadastrarTurma(turmaSelect, salaSelect);
                        break;

                    case 5:
                        z = false;
                        break;
				case 7:
					z = false;
				}
			}
		}
        scan.close();
	}
}
