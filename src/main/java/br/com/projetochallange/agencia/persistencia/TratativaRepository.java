package br.com.projetochallange.agencia.persistencia;


import br.com.projetochallange.agencia.requisicao.InconsistenciaRequest;
import br.com.projetochallange.agencia.requisicao.TratativaRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TratativaRepository extends JpaRepository<TratativaRequest, InconsistenciaRequest> {


    static void deleteById(String codigoTratativa) {
    }

    Optional<TratativaRequest> findByCodigoTratativa(String codigoTratativa);
}
