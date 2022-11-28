package br.com.projetochallange.agencia.persistencia;

import br.com.projetochallange.agencia.requisicao.DepartamentoRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface DepartamentoRepository extends JpaRepository<DepartamentoRequest, String>{
    Optional<DepartamentoRequest> findByCodigoDepartamento(String codigoDepartamento);
}


