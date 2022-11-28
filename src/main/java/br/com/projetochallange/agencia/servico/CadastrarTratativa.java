package br.com.projetochallange.agencia.servico;

import br.com.projetochallange.agencia.persistencia.TratativaRepository;
import br.com.projetochallange.agencia.requisicao.TratativaRequest;
import br.com.projetochallange.agencia.resposta.RespostaTratativa;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CadastrarTratativa {
    private final TratativaRepository tratativaRepository;
    public RespostaTratativa executar(TratativaRequest tratativaRequest) {
        RespostaTratativa respostaTratativa = new RespostaTratativa();
        respostaTratativa.setCodigoTratativa(UUID.randomUUID().toString());

        TratativaRequest tratativaRequest1 = new TratativaRequest();
        tratativaRequest1.setInconsistenciaRequest(tratativaRequest1.getInconsistenciaRequest());
        tratativaRequest1.setProcedimento(tratativaRequest1.getProcedimento());
        tratativaRequest1.setStatusConcluido(tratativaRequest1.getStatusConcluido());
        tratativaRequest1.setDepartamentoRequest(tratativaRequest1.getDepartamentoRequest());
        tratativaRepository.save(tratativaRequest1);

        respostaTratativa.setStatusConcluido(tratativaRequest.getStatusConcluido());
        respostaTratativa.setDepartamentoRequest(tratativaRequest.getDepartamentoRequest());
        respostaTratativa.setProcedimento(tratativaRequest.getProcedimento());
        return respostaTratativa;
    }
}
