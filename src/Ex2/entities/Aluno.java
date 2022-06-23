package Ex2.entities;

public class Aluno extends Pessoa {

    private Matricula matricula;
    private String telefone;
    private int idTurmaAux;

    public Aluno(String codMatricula, String dataMatricula, String nome, Endereco endereco, String telefone, String dataNascimento, int altura, double peso, int idTurmaAux) {
        super(nome);
        matricula = new Matricula(codMatricula, dataMatricula);
        this.telefone = telefone;
        setEndereco(endereco);
        setDataNascimento(dataNascimento);
        setAltura(altura);
        setPeso(peso);
        this.idTurmaAux = idTurmaAux;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
