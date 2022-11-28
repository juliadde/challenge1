package br.com.projetochallange.agencia.servico;

import br.com.projetochallange.agencia.persistencia.InconsistenciaRepository;
import br.com.projetochallange.agencia.requisicao.DepartamentoRequest;
import br.com.projetochallange.agencia.requisicao.InconsistenciaRequest;
import br.com.projetochallange.agencia.resposta.RespostaInconsistencia;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CadastrarInconsistencia {
    private final InconsistenciaRepository inconsistenciaRepository;
    public RespostaInconsistencia executar(InconsistenciaRequest inconsistenciaRequest) {
        RespostaInconsistencia respostaInconsistencia = new RespostaInconsistencia();
        respostaInconsistencia.setCodigoInconsistencia(UUID.randomUUID().toString());

        InconsistenciaRequest inconsistenciaRequest1 = new InconsistenciaRequest();
        inconsistenciaRequest1.setMensagemErro(inconsistenciaRequest1.getMensagemErro());
        inconsistenciaRequest1.setSistemaRequest(inconsistenciaRequest1.getSistemaRequest());
        respostaInconsistencia.setEtapa(inconsistenciaRequest1.getEtapa());
        inconsistenciaRepository.save(inconsistenciaRequest1);

        respostaInconsistencia.setMensagemErro(inconsistenciaRequest.getMensagemErro());
        respostaInconsistencia.setSistemaRequest(inconsistenciaRequest.getSistemaRequest());
        respostaInconsistencia.setEtapa(inconsistenciaRequest.getEtapa());
        return respostaInconsistencia;
    }
}
