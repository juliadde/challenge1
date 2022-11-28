package br.com.projetochallange.agencia.conversores;

import br.com.projetochallange.agencia.requisicao.AgenciaRequest;
import br.com.projetochallange.agencia.resposta.RespostaAgencia;

public class ConverteAgenciaRequestParaRespostaAgencia {

    public static RespostaAgencia converte(AgenciaRequest agenciaRequest){
        RespostaAgencia respostaAgencia = new RespostaAgencia();
        respostaAgencia.setCodigoAgencia(respostaAgencia.getCodigoAgencia());
        respostaAgencia.setNomeFuncionario(respostaAgencia.getNomeFuncionario());
        return respostaAgencia;
    }
}
