package br.com.projetochallange.agencia.servico;

import br.com.projetochallange.agencia.requisicao.TratativaRequest;
import br.com.projetochallange.agencia.resposta.RespostaTratativa;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CadastrarTratativa {
    public RespostaTratativa executar(TratativaRequest tratativaRequest) {
        RespostaTratativa respostaTratativa = new RespostaTratativa();
        respostaTratativa.setIdentificador(UUID.randomUUID().toString());
        respostaTratativa.setStatusConcluido(tratativaRequest.getStatusConcluido());
        respostaTratativa.setDepartamentoRequest(tratativaRequest.getDepartamentoRequest());
        respostaTratativa.setProcedimento(tratativaRequest.getProcedimento());
        return respostaTratativa;
    }
}
