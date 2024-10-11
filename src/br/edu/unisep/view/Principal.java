package br.edu.unisep.view;

import br.edu.unisep.model.Caminhao;
import br.edu.unisep.model.Carro;
import br.edu.unisep.model.Frota;
import br.edu.unisep.model.Moto;

import javax.swing.*;

public class Principal {
    public static void main(String[] args)
    {
        Frota frota = new Frota();
        Carro carro1 = new Carro(4,300,1,"LUC7S", "FIAT","UNO");
        Moto moto = new Moto(2,150,"LUC4S", "UNO","FIAT", 300);
        Caminhao caminhao = new Caminhao(3,"LUCA5","FIAT","UNO",300,3000);

        frota.adicionarAFrota(carro1);
        frota.adicionarAFrota(moto);
        frota.adicionarAFrota(caminhao);

        JOptionPane.showMessageDialog(null,frota.exibirFrota());
    }
}
