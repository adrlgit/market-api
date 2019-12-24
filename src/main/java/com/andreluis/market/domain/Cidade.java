package com.andreluis.market.domain;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
public class Cidade  implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private  String nome;


    @ManyToOne
    @JoinColumn(name = "ESTADO_ID")
    private Estado estado;

    public Cidade(){
    }

    public Cidade(Integer id, String nome, Estado estado) {
        super();
        this.id = id;
        this.nome = nome;
        this.estado = estado;
    }
}
