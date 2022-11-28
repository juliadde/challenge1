package br.com.projetochallange.agencia.persistencia;

import br.com.projetochallange.agencia.requisicao.AgenciaRequest;
import br.com.projetochallange.agencia.requisicao.ProdutoRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoRequest, String> {
    Optional<ProdutoRequest> findByCodigoProduto(String codigoProduto);
}
