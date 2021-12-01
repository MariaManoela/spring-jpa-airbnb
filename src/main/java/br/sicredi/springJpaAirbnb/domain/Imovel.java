package br.sicredi.springJpaAirbnb.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Imovel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String cidade;
    private double valor;
    private TiposImovel tipo;

    public Imovel(){}

    public Imovel(String cidade, double valor, TiposImovel tipo) {
        this.cidade = cidade;
        this.valor = valor;
        this.tipo = tipo;
    }
}
