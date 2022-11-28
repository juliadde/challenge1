package br.com.projetochallange.agencia.conversores;

import br.com.projetochallange.agencia.requisicao.InconsistenciaRequest;
import br.com.projetochallange.agencia.resposta.RespostaInconsistencia;

public class ConverteInconsistenciaRequestParaRespostaInconsistencia {
    public static RespostaInconsistencia converte(InconsistenciaRequest inconsistenciaRequest){
        RespostaInconsistencia respostaInconsistencia = new RespostaInconsistencia();
        respostaInconsistencia.setMensagemErro(respostaInconsistencia.getMensagemErro());
        respostaInconsistencia.setSistemaRequest(respostaInconsistencia.getSistemaRequest());
        respostaInconsistencia.setEtapa(respostaInconsistencia.getEtapa());
        respostaInconsistencia.setCodigoInconsistencia(respostaInconsistencia.getCodigoInconsistencia());
        return respostaInconsistencia;
    }
}
