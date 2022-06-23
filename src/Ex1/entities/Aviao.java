package Ex1.entities;

public class Aviao extends Veiculo {

    private int numTurbinas;

    public Aviao(String nome, Fabricante fabricante, int anoFabricacao, int capacidade, int numTurbinas) {
        super(nome, fabricante, anoFabricacao, capacidade);
        this.numTurbinas = numTurbinas;
    }

    public void decolar(){
        System.out.println("O avião decolou");
    }

    public void pousar(){
        System.out.println("O avião pousou");
    }

    @Override
    public void acelerar() {
        System.out.println("O avião acelerou");
    }

    @Override
    public void mostrarDetalhes() {
        String detalhesString = "O avião " + getNome() +
                ", ano " + getAnoFabricacao() +
                ", produzido pela " + getFabricante().getNome() +
                "(" + getFabricante().getPaisDeOrigem() + ")" +
                " utiliza " + getNumTurbinas() + " turbinas" +
                " e possui capacidade para " + getCapacidade() + " pessoas.";

        System.out.println(detalhesString);
    }

    public int getNumTurbinas() {
        return numTurbinas;
    }

    public void setNumTurbinas(int numTurbinas) {
        this.numTurbinas = numTurbinas;
    }
}
