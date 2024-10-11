package br.edu.unisep.model;

import java.util.ArrayList;
import java.util.List;

public class Frota {
    List<Veiculo> Frota = new ArrayList<>();

    public Frota() {}

    public void adicionarAFrota(Veiculo veiculo)
    {
        Frota.add(veiculo);
    }

    public String exibirFrota()
    {
        String texto = "SUA FROTA:\n";
        for (int i = 0; i < this.Frota.size(); i++)
        {
            texto += this.Frota.get(i).exibirDetalhes() + "\n\n";
        }
        return texto;
    }
}
