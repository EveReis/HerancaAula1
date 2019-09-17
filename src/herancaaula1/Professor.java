package herancaaula1;
/*
 * @author EveReis
 */
public class Professor extends Pessoa{
     private String cursos;
 private double salario;

    public String getCursos() {
        return cursos;
    }

    public void setCursos(String curs) {
        this.cursos = curs;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double sal) {
        this.salario = sal;
    }
}
