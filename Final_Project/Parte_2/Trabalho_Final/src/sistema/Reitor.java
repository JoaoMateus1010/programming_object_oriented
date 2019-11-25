/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import java.util.Scanner;

/**
 *
 * @author joaom
 */
public class Reitor extends Professor{
    private int senha_especial_reitor;

    public Reitor(int senha_especial_reitor, int total_creditos, String nome, String email, int senha) {
        super(total_creditos, nome, email, senha);
        this.senha_especial_reitor = senha_especial_reitor;
    }

    public Reitor(int senha_especial_reitor, int total_creditos) {
        super(total_creditos);
        this.senha_especial_reitor = senha_especial_reitor;
    }

    public int getSenha_especial_reitor() {
        return senha_especial_reitor;
    }

    public void setSenha_especial_reitor(int senha_especial_reitor) {
        this.senha_especial_reitor = senha_especial_reitor;
    }
    
    public boolean Cadastrar_Professor(Sistema atual) {
        boolean ret = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do professor: ");
        String nome_professor = sc.nextLine();
        System.out.print("Digite o email do professor: ");
        String email_professor = sc.nextLine();
        System.out.print("Digite a senha do professor: ");
        int senha_professor = sc.nextInt();
        System.out.print("Digite o total de créditos do professor: ");
        int total_creditos_professor = sc.nextInt();
        if ((total_creditos_professor >= 8) && (total_creditos_professor <= 16)) {
            Professor professor = new Professor(total_creditos_professor, nome_professor, email_professor, senha_professor);
            if (!atual.getInstituicao().VerificaDuplicidadeProfessor(professor)) {
                atual.getInstituicao().CadastrarProfessor(professor);
                ret = true;
            } else {
                System.out.println("Professor já cadastrado");
            }
        } else {
            System.out.println("Quantidade de horas fora do limite de 8 horas mínimas e 16 horas máximas!");
            return false;
        }
        return ret;
    }
    
    public boolean Cadastrar_Curso(Sistema atual) {
        boolean ret = true;
        try{
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite o nome do curso: ");
            String curso_nome = sc.nextLine();
            System.out.print("Digite a descrição do curso: ");
            String curso_descricao = sc.nextLine();
            System.out.print("Digite a duração do curso em semestres: ");
            int curso_duracao = sc.nextInt();        
            Curso curso = new Curso(curso_nome, curso_descricao, curso_duracao);
            atual.getInstituicao().CadastrarCurso(curso);        
        }catch(Exception e){
            ret = false;
        }
        return ret;
    }   
    
    public void Adicionar_Disciplina(Sistema atual) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha o Curso da disciplina");
        atual.getInstituicao().showCursos();
        String curso = sc.nextLine();
        Curso disciplina_curso = atual.getInstituicao().getCursoToNome(curso);
        if (disciplina_curso != null) {
            System.out.println("Escolha a turma da disciplina");
            disciplina_curso.showTurmas();
            int requestID = sc.nextInt();
            Turma disciplina_turma = disciplina_curso.getTurmaByID(requestID);
            if (disciplina_turma != null) {
                sc = new Scanner(System.in);
                System.out.print("Digite o nome da disciplina: ");
                String disciplina_nome = sc.nextLine();
                System.out.print("Digite o número de créditos: ");
                int disciplina_num_credito = sc.nextInt();
                System.out.println("Digite o horário: ");
                System.out.println(""
                        + "    1- Primeiro horário da manhã\n"
                        + "    2- Segundo horário da manhã\n"
                        + "    3- Primeiro Horário da tarde\n"
                        + "    4- Segundo horário da tarde\n"
                        + "    5- Primeiro Horário da noite\n"
                        + "    6- Segundo horário ad noite ");
                int disciplina_horario = sc.nextInt();
                System.out.println("Digite o dia da semana: ");
                System.out.println(""
                        + "    1-Segunda\n"
                        + "    2-Terça\n"
                        + "    3-Quarta\n"
                        + "    4-Quinta\n"
                        + "    5-Sexta");
                int disciplina_diaSemana = sc.nextInt();
                System.out.print("Digite o semestre: ");
                int disciplina_semestre = sc.nextInt();
                System.out.print("Escolha o professor que irá lecionar: ");       
                atual.getInstituicao().showProfessores();
                sc = new Scanner(System.in);
                Professor disciplina_professor = atual.getInstituicao().getProfessorToLogin(sc.nextLine());
                Disciplina disciplina = new Disciplina(disciplina_nome, disciplina_num_credito, disciplina_horario, disciplina_diaSemana, disciplina_semestre, disciplina_professor);
                System.out.print("Digite a senha especial para confirmar: ");
                int checkSenhaEspecial = sc.nextInt();
                if(checkSenhaEspecial==atual.getInstituicao().getReitor().getSenha_especial_reitor()){
                    disciplina_turma.setDisciplina(disciplina);
                }
            } else {
                System.out.println("Turma não encontrada");
            }
        } else {
            System.out.println("Curso não encontrado!");
        }
    }
}
