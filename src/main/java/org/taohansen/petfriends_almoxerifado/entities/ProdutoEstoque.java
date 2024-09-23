package org.taohansen.petfriends_almoxerifado.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class ProdutoEstoque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeProduto;
    private String codigoProduto;
    private int quantidade;
    private LocalDate dataEntrada;
    private LocalDate dataValidade;

    private String fornecedorId;

    public boolean isValidProduto() {
        return dataValidade == null || dataValidade.isAfter(LocalDate.now());
    }
}
