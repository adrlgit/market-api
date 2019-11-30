package com.andreluis.market.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Data
public class Endereco  implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cep;

   private Cliente cliente;
   
   private Cidade cidade;

   public Endereco() {
   }

    public Endereco(Integer id, String logradouro, String numero, String complemento, String bairro, String cep) {
        this.id = id;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cep = cep;
    }
}
