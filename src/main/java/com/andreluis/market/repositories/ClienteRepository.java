package com.andreluis.market.repositories;

import com.andreluis.market.domain.Cliente;
import com.andreluis.market.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
