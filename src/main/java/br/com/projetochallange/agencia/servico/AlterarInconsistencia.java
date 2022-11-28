package br.com.projetochallange.agencia.servico;

import br.com.projetochallange.agencia.conversores.ConverteInconsistenciaRequestParaRespostaInconsistencia;
import br.com.projetochallange.agencia.persistencia.InconsistenciaRepository;
import br.com.projetochallange.agencia.requisicao.InconsistenciaRequest;
import br.com.projetochallange.agencia.resposta.RespostaInconsistencia;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AlterarInconsistencia {
    private final InconsistenciaRepository inconsistenciaRepository;
    private final ConsultarInconsistencia consultarInconsistencia;

    public RespostaInconsistencia executar(InconsistenciaRequest inconsistenciaRequest, String codigoInconsistencia) {
        RespostaInconsistencia respostaInconsistencia = consultarInconsistencia.executar(codigoInconsistencia);
        InconsistenciaRequest inconsistenciaRequest1 = new InconsistenciaRequest();
        inconsistenciaRequest1.setMensagemErro(inconsistenciaRequest1.getMensagemErro());
        inconsistenciaRequest1.setSistemaRequest(inconsistenciaRequest1.getSistemaRequest());
        inconsistenciaRequest1.setEtapa(inconsistenciaRequest1.getEtapa());
        inconsistenciaRequest1.setCodigoInconsistencia(inconsistenciaRequest1.getCodigoInconsistencia());

        inconsistenciaRepository.save(inconsistenciaRequest1);
        return ConverteInconsistenciaRequestParaRespostaInconsistencia.converte(inconsistenciaRequest1);
}}
