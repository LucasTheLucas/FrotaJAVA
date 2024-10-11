package br.edu.unisep.model;

public class Caminhao extends Veiculo{
    private int pesoMaximo;

    public Caminhao(int id, String placa, String marca, String modelo, int velocidadeMaxima, int pesoMaximo)
    {
        super(id, placa, marca, modelo, velocidadeMaxima);
        this.pesoMaximo = pesoMaximo;
    }

    public int getPesoMaximo() {
        return pesoMaximo;
    }

    public void setPesoMaximo(int pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }

    @Override
    public String exibirDetalhes() {
        return  "Este caminhão pode conter até" + getPesoMaximo() + "KG de mercadorias" +
                "\nE chega a valocidade de " +  this.getVelocidadeMaxima() + "Km/h" +
                "\nTem a placa: " + getPlaca() + " - " + getModelo();
    }

    @Override
    public String movendo() {
        return "O caminhão se move na velocidade de " + this.getVelocidadeMaxima() + " Km/H";    }
}
