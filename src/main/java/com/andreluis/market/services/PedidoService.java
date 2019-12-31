package com.andreluis.market.services;

import com.andreluis.market.domain.Categoria;
import com.andreluis.market.domain.Pedido;
import com.andreluis.market.repositories.CategoriaRepository;
import com.andreluis.market.repositories.PedidoRepository;
import com.andreluis.market.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repo;

    public Pedido find(Integer id){
        Optional<Pedido>  obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado Id: " + id + ", Tipo: " + Pedido.class.getName()));
    }
}
