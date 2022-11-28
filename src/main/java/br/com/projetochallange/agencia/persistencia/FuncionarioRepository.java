package br.com.projetochallange.agencia.persistencia;
import br.com.projetochallange.agencia.requisicao.AgenciaRequest;
import br.com.projetochallange.agencia.requisicao.FuncionarioRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FuncionarioRepository extends JpaRepository<FuncionarioRequest, String>{
    Optional<FuncionarioRequest> findByCodigoFuncionario(String codigoFuncionario);
}
