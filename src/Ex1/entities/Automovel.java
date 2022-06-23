package Ex1.entities;

public class Automovel extends Veiculo {

    private int diametroRoda;

    public Automovel(String nome, Fabricante fabricante, int anoFabricacao, int capacidade, int diametroRoda) {
        super(nome, fabricante, anoFabricacao, capacidade);
        this.diametroRoda = diametroRoda;
    }

    public void abrirPortaMalas(){
        System.out.println("O porta malas do carro foi aberto");
    }

    @Override
    public void acelerar() {
        System.out.println("O automóvel acelerou");
    }

    @Override
    public void mostrarDetalhes() {
        String detalhesString = "O automóvel " + getNome() +
                ", ano " + getAnoFabricacao() +
                ", produzido pela " + getFabricante().getNome() +
                "(" + getFabricante().getPaisDeOrigem() + ")" +
                " tem sua roda com diametro de " + getDiametroRoda() +
                "mm e possui capacidade para " + getCapacidade() + " pessoas.";

        System.out.println(detalhesString);
    }

    public int getDiametroRoda() {
        return diametroRoda;
    }

    public void setDiametroRoda(int diametroRoda) {
        this.diametroRoda = diametroRoda;
    }
}
