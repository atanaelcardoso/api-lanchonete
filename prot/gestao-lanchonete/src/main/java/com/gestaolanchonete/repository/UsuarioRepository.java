package com.gestaolanchonete.repository;

import com.gestaolanchonete.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // Métodos adicionais podem ser definidos aqui
}
