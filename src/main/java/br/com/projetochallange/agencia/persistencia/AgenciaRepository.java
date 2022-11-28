package br.com.projetochallange.agencia.persistencia;

import br.com.projetochallange.agencia.requisicao.AgenciaRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AgenciaRepository extends JpaRepository<AgenciaRequest, String> {
    Optional<AgenciaRequest> findByCodigoAgencia(String codigoAgencia);
}
