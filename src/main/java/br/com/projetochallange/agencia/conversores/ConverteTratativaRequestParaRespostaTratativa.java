package br.com.projetochallange.agencia.conversores;

import br.com.projetochallange.agencia.requisicao.TratativaRequest;
import br.com.projetochallange.agencia.resposta.RespostaTratativa;

public class ConverteTratativaRequestParaRespostaTratativa {

    public static RespostaTratativa converte(TratativaRequest tratativaRequest){
        RespostaTratativa respostaTratativa = new RespostaTratativa();
        respostaTratativa.setInconsistenciaRequest(respostaTratativa.getInconsistenciaRequest());
        respostaTratativa.setProcedimento(respostaTratativa.getProcedimento());
        respostaTratativa.setStatusConcluido(respostaTratativa.getStatusConcluido());
        respostaTratativa.setDepartamentoRequest(respostaTratativa.getDepartamentoRequest());
        respostaTratativa.setCodigoTratativa(respostaTratativa.getCodigoTratativa());
        return respostaTratativa;
    }
}
