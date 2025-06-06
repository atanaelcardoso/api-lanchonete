package com.gestaolanchonete.DAO;

import org.springframework.data.repository.CrudRepository;

import com.gestaolanchonete.model.Usuario;

public interface IPedido extends CrudRepository<Usuario, Integer> {

}