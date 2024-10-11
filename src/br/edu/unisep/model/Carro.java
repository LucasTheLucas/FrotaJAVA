package br.edu.unisep.model;

public class Carro extends Veiculo{
    private int portas;
    
    public Carro(int portas, int velocidadeMaxima, int id, String placa, String marca,  String modelo)
    {
        super(id,placa,marca,modelo, velocidadeMaxima);
        this.portas = portas;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    @Override
    public String exibirDetalhes() {
        return "Este carro contem " + getPortas() + " portas." +
                "\nE chega a valocidade de " +  this.getVelocidadeMaxima() + "Km/h" +
                "\nTem a placa: " + getPlaca() + " - " + getModelo();
    }

    @Override
    public String movendo() {
        return "O carro se move na velocidade de " + this.getVelocidadeMaxima() + " Km/H";
    }
}
