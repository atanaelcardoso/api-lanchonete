package com.gestaolanchonete.model;

import jakarta.persistence.*;

@Entity
@Table(name = "pedidos")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;
}

