package Ex2.entities;

import java.util.ArrayList;
import java.util.List;

public class Instrutor extends Pessoa {

    private String titulacao;
    private List<String> listTelefones = new ArrayList<>();

    public Instrutor(String rg, String nome, String dataNascimento, String titulacao, List<String> listaTelefones) {
        super(nome);
        setRg(rg);
        setDataNascimento(dataNascimento);
        this.titulacao = titulacao;
        this.listTelefones.addAll(listaTelefones);
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public List<String> getListTelefones() {
        return listTelefones;
    }

    public void setListTelefones(List<String> listTelefones) {
        this.listTelefones = listTelefones;
    }
}
