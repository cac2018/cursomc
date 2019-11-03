package com.cristianaugusto.cursomc.services;

import com.cristianaugusto.cursomc.domain.Pedido;
import com.cristianaugusto.cursomc.repositories.PedidoRepository;
import com.cristianaugusto.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repo;

    public Pedido buscar(Integer id){
    Optional<Pedido> obj = repo.findById(id);
    return obj.orElseThrow( () -> new ObjectNotFoundException("Objeto não encontrado! Id:" + id
            + ", Tipo: " + Pedido.class.getName()));
    }

}
