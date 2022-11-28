package br.com.projetochallange.agencia.servico;

import br.com.projetochallange.agencia.resposta.RespostaInconsistencia;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ConsultarInconsistencia {
    public RespostaInconsistencia executar(String identificador) {
        RespostaInconsistencia respostaInconsistencia = new RespostaInconsistencia();
        respostaInconsistencia.setCodigoInconsistencia(UUID.randomUUID().toString());
        return respostaInconsistencia;
    }

}
