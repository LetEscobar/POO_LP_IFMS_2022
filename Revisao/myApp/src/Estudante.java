import java.time.format.DateTimeFormatter;

public class Estudante extends Pessoa {
    private String ra;
    private String curso;

    // Construtor da classe Estudante:
    public Estudante(String _ra, String _nome) {
        this.ra = _ra;
        this.nome = _nome;
    }

    // Getters and Setters
    public String getRa(){
        return this.ra;
    }

    public void setRa(String _ra){
        this.ra = _ra;
    }

    public String getCurso(){
        return this.curso;
    }

    public void setCurso(String _curso){
        this.curso = _curso;
    }

    public String toString(){
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Nome: " + this.nome + 
                "\nRA: " + this.ra +
                "\nCurso: " + this.curso + 
                "\nData de nascimento: " + this.dataNascimento.format(formatDate);
    }
}