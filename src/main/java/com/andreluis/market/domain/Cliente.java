package com.andreluis.market.domain;

import com.andreluis.market.enums.TipoCliente;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
public class Cliente  implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String nome;
    private String emial;
    private String cpfOuCnpj;
    private TipoCliente tipo;

    private List<Cidade> cidade = new ArrayList<>();

    private Set<String> telefones = new HashSet<>();

    public Cliente(){
    }

    public Cliente(Integer id, String nome, String emial, String cpfOuCnpj, TipoCliente tipo) {
        this.id = id;
        this.nome = nome;
        this.emial = emial;
        this.cpfOuCnpj = cpfOuCnpj;
        this.tipo = tipo;
    }
}
