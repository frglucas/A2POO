package Ex2.entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Turma {

    private int idTurma;
    private int numAlunos;
    private String horarioAula;
    private int duracaoAula;
    private String tipoAtividade;
    private Instrutor instrutor;
    private Date dataInicial;
    private Date dataFinal;

    public Turma(int idTurma, int numAlunos, String horarioAula, int duracaoAula, String tipoAtividade, Instrutor instrutor, String dataInicial, String dataFinal) {
        this.idTurma = idTurma;
        this.numAlunos = numAlunos;
        this.horarioAula = horarioAula;
        this.duracaoAula = duracaoAula;
        this.tipoAtividade = tipoAtividade;
        this.instrutor = instrutor;
        this.dataInicial = getData(dataInicial);
        this.dataFinal = getData(dataFinal);
    }

    public int getIdTurma() {
        return idTurma;
    }

    public void setIdTurma(int idTurma) {
        this.idTurma = idTurma;
    }

    public int getNumAlunos() {
        return numAlunos;
    }

    public void setNumAlunos(int numAlunos) {
        this.numAlunos = numAlunos;
    }

    public String getHorarioAula() {
        return horarioAula;
    }

    public void setHorarioAula(String horarioAula) {
        this.horarioAula = horarioAula;
    }

    public int getDuracaoAula() {
        return duracaoAula;
    }

    public void setDuracaoAula(int duracaoAula) {
        this.duracaoAula = duracaoAula;
    }

    public String getTipoAtividade() {
        return tipoAtividade;
    }

    public void setTipoAtividade(String tipoAtividade) {
        this.tipoAtividade = tipoAtividade;
    }

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    private Date getData(String dataRecebida){
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date data = null;
        try {
            data = format.parse(dataRecebida);
        } catch (ParseException e) {
            System.out.println("Data informada não é válida!");
        }
        return data;
    }
}
