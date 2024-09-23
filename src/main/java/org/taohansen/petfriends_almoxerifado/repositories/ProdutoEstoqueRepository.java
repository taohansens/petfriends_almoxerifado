package org.taohansen.petfriends_almoxerifado.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.taohansen.petfriends_almoxerifado.entities.ProdutoEstoque;

import java.util.List;
import java.util.Optional;

public interface ProdutoEstoqueRepository extends JpaRepository<ProdutoEstoque, Long> {
    Optional<ProdutoEstoque> findByCodigoProduto(String codigoProduto);
    List<ProdutoEstoque> findByQuantidadeLessThanEqual(int quantidade);

}