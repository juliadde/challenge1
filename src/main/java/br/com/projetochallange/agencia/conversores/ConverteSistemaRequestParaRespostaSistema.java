package br.com.projetochallange.agencia.conversores;

import br.com.projetochallange.agencia.requisicao.SistemaRequest;
import br.com.projetochallange.agencia.resposta.RespostaSistema;

public class ConverteSistemaRequestParaRespostaSistema {

    public static RespostaSistema converte(SistemaRequest sistemaRequest){
        RespostaSistema respostaSistema = new RespostaSistema();
        respostaSistema.setNome(respostaSistema.getNome());
        respostaSistema.setDepartamentoRequest(respostaSistema.getDepartamentoRequest());
        respostaSistema.setFuncaoSistema(respostaSistema.getFuncaoSistema());
        respostaSistema.setCodigoSistema(respostaSistema.getCodigoSistema());
        return respostaSistema;
    }
}
