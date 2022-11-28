package br.com.projetochallange.agencia.persistencia;

import br.com.projetochallange.agencia.requisicao.AgenciaRequest;
import br.com.projetochallange.agencia.requisicao.SistemaRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SistemaRepository extends JpaRepository<SistemaRequest, String> {
    Optional<SistemaRequest> findByCodigoSistema(String codigoSistema);

}
