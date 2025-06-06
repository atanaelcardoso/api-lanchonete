package com.gestaolanchonete.repository;

import com.gestaolanchonete.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
