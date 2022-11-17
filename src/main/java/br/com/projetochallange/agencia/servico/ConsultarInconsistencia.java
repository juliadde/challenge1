package br.com.projetochallange.agencia.servico;

import br.com.projetochallange.agencia.resposta.RespostaInconsistencia;
import br.com.projetochallange.agencia.resposta.RespostaTratativa;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ConsultarInconsistencia {
    public RespostaInconsistencia executar(String identificador) {
        RespostaInconsistencia respostaInconsistencia = new RespostaInconsistencia();
        respostaInconsistencia.setIdentificador(UUID.randomUUID().toString());
        return respostaInconsistencia;
    }

}
