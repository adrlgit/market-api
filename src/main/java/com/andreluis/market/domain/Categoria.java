package com.andreluis.market.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

import java.util.Objects;

@Getter @Setter @NoArgsConstructor @Entity
public class Categoria implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;

	public Categoria(Integer id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Categoria categoria = (Categoria) o;
		return id.equals(categoria.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}