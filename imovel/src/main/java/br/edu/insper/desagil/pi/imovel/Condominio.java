package br.edu.insper.desagil.pi.imovel;

import java.util.List;

public class Condominio {
    private String endereco;
    private List<Predio> predios;
    private Sindico sindico;

    public Condominio(String endereco, List<Predio> predios) {
        this.endereco = endereco;
        this.predios = predios;
    }

    public String getEndereco() {
        return endereco;
    }

    public List<Predio> getPredios() {
        return predios;
    }

    public Sindico getSindico() {
        return sindico;
    }

    public void setSindico(Sindico sindico) {
        this.sindico = sindico;
    }
}
