package herancaaula1;
/*
* @author EveReis
 */
public class Pessoa {
   private String nome;
   private int matricula;
   private String disciplinas;
   private String cpf;
   private String endereco;
   private String horario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nom) {
        this.nome = nom;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int mat) {
        this.matricula = mat;
    }

    public String getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String disc) {
        this.disciplinas = disc;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String c) {
        this.cpf = c;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String end) {
        this.endereco = end;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String hora) {
        this.horario = hora;
    }
   
   
}
