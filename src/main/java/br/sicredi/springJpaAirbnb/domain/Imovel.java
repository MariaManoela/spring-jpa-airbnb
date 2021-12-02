package br.sicredi.springJpaAirbnb.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Imovel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String cidade;
    private double valor;
//    @Enumerated(EnumType.STRING)
    private TiposImovel tipo;

    public Imovel(){}

    public Imovel(String nome, String cidade, double valor, TiposImovel tipo) {
        this.nome = nome;
        this.cidade = cidade;
        this.valor = valor;
        this.tipo = tipo;
    }
}
