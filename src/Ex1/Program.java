package Ex1;

import Ex1.entities.*;

public class Program {

    public static void main(String[] args) {

        // Criando automoveis

        System.out.println("\n Automoveis \n");

        Veiculo carro1 = new Automovel("Voyage", new Fabricante("Volksvagem", "Alemanha"),
                1995, 5, 572);
        Automovel carro2 = new Automovel("Corsa", new Fabricante("Chevrolet", "USA"),
                2005, 5, 572);

        // Testando funções
        carro1.acelerar();
        carro2.acelerar();

        carro1.mostrarDetalhes();
        carro2.mostrarDetalhes();

        // O objeto carro1 não tem a função abrirPortaMalas, pois é do tipo Veiculo
        // carro1.abrirPortaMalas();
        carro2.abrirPortaMalas();

        // Modificando o objeto e testando
        carro1.setAnoFabricacao(2022);
        carro1.setCapacidade(8);

        carro2.setDiametroRoda(805);
        carro2.setFabricante(new Fabricante("Gurgel", "Brasil"));

        System.out.println("\nObjeto modificado");
        carro1.mostrarDetalhes();
        carro2.mostrarDetalhes();

        // Criando avioes

        System.out.println("\n Avioes \n");

        Fabricante fabricante = new Fabricante("Boeing", "USA");
        Aviao aviao1 = new Aviao("747", fabricante, 2007, 660, 40);
        Aviao aviao2 = new Aviao("777", fabricante, 2001, 368, 36);

        // Testando funções
        aviao1.acelerar();
        aviao2.acelerar();

        aviao1.decolar();
        aviao2.decolar();

        aviao1.pousar();
        aviao2.pousar();

        aviao1.mostrarDetalhes();
        aviao2.mostrarDetalhes();

        aviao1.setCapacidade(150);
        aviao2.setNome("727");

        System.out.println("\nObjeto modificado");
        aviao1.mostrarDetalhes();
        aviao2.mostrarDetalhes();

        // Criando barcos

        System.out.println("\n Barcos \n");

        Fabricante fabricante1 = new Fabricante("Sessa Marine", "Itália");

        Barco barco1 = new Barco("C40", fabricante1, 2015, 12, 0);

        barco1.acelerar();
        barco1.icarVelas();
        barco1.recolherVelas();
        barco1.mostrarDetalhes();

        barco1.setNumVelas(2);
        barco1.setCapacidade(20);

        System.out.println("\nObjeto modificado");
        barco1.icarVelas();
        barco1.recolherVelas();
        barco1.mostrarDetalhes();

    }

}
