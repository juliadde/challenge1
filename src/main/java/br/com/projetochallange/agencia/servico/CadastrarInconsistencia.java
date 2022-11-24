package br.com.projetochallange.agencia.servico;

import br.com.projetochallange.agencia.requisicao.InconsistenciaRequest;
import br.com.projetochallange.agencia.resposta.RespostaInconsistencia;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CadastrarInconsistencia {
    public RespostaInconsistencia executar(InconsistenciaRequest inconsistenciaRequest) {
        RespostaInconsistencia respostaInconsistencia = new RespostaInconsistencia();
        respostaInconsistencia.setIdentificador(UUID.randomUUID().toString());
        respostaInconsistencia.setMensagemErro(inconsistenciaRequest.getMensagemErro());
        respostaInconsistencia.setSistemaRequest(inconsistenciaRequest.getSistemaRequest());
        respostaInconsistencia.setEtapa(inconsistenciaRequest.getEtapa());
        return respostaInconsistencia;
    }
}
