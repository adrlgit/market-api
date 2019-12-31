package com.andreluis.market.services;

import com.andreluis.market.domain.Cliente;
import com.andreluis.market.repositories.ClienteRepository;
import com.andreluis.market.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repo;

    public Cliente find(Integer id){
        Optional<Cliente> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado Id: " + id + ", Tipo: " + Cliente.class.getName()));
    }

}
