package Ex1.entities;

public class Barco extends Veiculo {

    private int numVelas;

    public Barco(String nome, Fabricante fabricante, int anoFabricacao, int capacidade, int numVelas) {
        super(nome, fabricante, anoFabricacao, capacidade);
        this.numVelas = numVelas;
    }

    public void icarVelas(){
        if(getNumVelas() > 0){
            System.out.println("O barco está com as velas içadas");
        } else {
            System.out.println("O barco não possui velas");
        }
    }

    public void recolherVelas(){
        if(getNumVelas() > 0){
            System.out.println("Velas recolhidas");
        } else {
            System.out.println("O barco não possui velas");
        }
    }

    @Override
    public void acelerar() {
        System.out.println("O barco acelerou");
    }

    @Override
    public void mostrarDetalhes() {
        String detalhesString = "O barco " + getNome() +
                ", ano " + getAnoFabricacao() +
                ", produzido pela " + getFabricante().getNome() +
                "(" + getFabricante().getPaisDeOrigem() + ")" +
                " tem " + getNumVelas() + " velas" +
                " e possui capacidade para " + getCapacidade() + " pessoas.";

        System.out.println(detalhesString);
    }

    public int getNumVelas() {
        return numVelas;
    }

    public void setNumVelas(int numVelas) {
        this.numVelas = numVelas;
    }
}
