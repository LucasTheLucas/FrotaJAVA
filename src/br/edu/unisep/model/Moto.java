package br.edu.unisep.model;

public class Moto extends Veiculo {

    private int bauEmLitro;

    public int getBauEmLitro() {
        return bauEmLitro;
    }

    public void setBauEmLitro(int bauEmLitro) {
        this.bauEmLitro = bauEmLitro;
    }

    public Moto(int id, int bauEmLitro, String placa, String modelo, String marca, int velocidadeMaxima)
    {
        super(id, placa, marca, modelo, velocidadeMaxima);
        this.bauEmLitro = bauEmLitro;
    }

    @Override
    public String exibirDetalhes() {
        return "Esta moto contem " + getBauEmLitro() + "litros de armazenamento." +
                "\nE chega a valocidade de " +  this.getVelocidadeMaxima() + "Km/h" +
                "\nTem a placa: " + getPlaca() + " - " + getModelo();
    }

    @Override
    public String movendo() {
        return "A moto está se movendo na velocidade de " + this.getVelocidadeMaxima() + " Km/H";
    }
}
