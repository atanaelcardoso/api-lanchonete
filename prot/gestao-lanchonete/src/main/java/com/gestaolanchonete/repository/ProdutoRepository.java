package com.gestaolanchonete.repository;

import com.gestaolanchonete.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
