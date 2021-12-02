package br.sicredi.springJpaAirbnb.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String usuario;
    private String senha;
//    @Enumerated(EnumType.STRING)
    private TiposUsuario tipo;

    public Usuario() {}

    public Usuario(String usuario, String senha, TiposUsuario tipo) {
        this.usuario = usuario;
        this.senha = senha;
        this.tipo = tipo;
    }
}
