package Ex1.entities;

public abstract class Veiculo {

    protected String nome;
    protected Fabricante fabricante;
    protected int anoFabricacao;
    protected int capacidade;

    public Veiculo(String nome, Fabricante fabricante, int anoFabricacao, int capacidade) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.anoFabricacao = anoFabricacao;
        this.capacidade = capacidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public abstract void acelerar();
    public abstract void mostrarDetalhes();
}
