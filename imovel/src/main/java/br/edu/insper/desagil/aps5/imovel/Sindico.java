package br.edu.insper.desagil.aps5.imovel;

import java.time.ZonedDateTime;

public class Sindico extends Administrador {
    public Sindico(String cpf, String nome, ZonedDateTime inicioMandato, ZonedDateTime fimMandato) {
        super(cpf, nome, inicioMandato, fimMandato);
    }

    @Override
    public void avisa() {
    }
}
