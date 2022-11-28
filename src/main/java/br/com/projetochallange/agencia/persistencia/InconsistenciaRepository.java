package br.com.projetochallange.agencia.persistencia;

import br.com.projetochallange.agencia.requisicao.AgenciaRequest;
import br.com.projetochallange.agencia.requisicao.InconsistenciaRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface InconsistenciaRepository extends JpaRepository<InconsistenciaRequest, String> {
    Optional<InconsistenciaRequest> findByCodigoInconsistencia(String codigoInconsistencia);
}
