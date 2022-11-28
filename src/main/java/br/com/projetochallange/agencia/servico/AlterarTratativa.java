package br.com.projetochallange.agencia.servico;

import br.com.projetochallange.agencia.conversores.ConverteTratativaRequestParaRespostaTratativa;
import br.com.projetochallange.agencia.persistencia.TratativaRepository;
import br.com.projetochallange.agencia.requisicao.TratativaRequest;
import br.com.projetochallange.agencia.resposta.RespostaTratativa;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AlterarTratativa {
    private final TratativaRepository tratativaRepository;
    private final ConsultarTratativa consultarTratativa;

    public RespostaTratativa executar(TratativaRequest tratativaRequest, String codigoTratativa) {
        RespostaTratativa respostaTratativa = consultarTratativa.executar(codigoTratativa);
        TratativaRequest tratativaRequest1 = new TratativaRequest();
        tratativaRequest1.setInconsistenciaRequest(tratativaRequest1.getInconsistenciaRequest());
        tratativaRequest1.setProcedimento(tratativaRequest1.getProcedimento());
        tratativaRequest1.setStatusConcluido(tratativaRequest1.getStatusConcluido());
        tratativaRequest1.setDepartamentoRequest(tratativaRequest1.getDepartamentoRequest());
        tratativaRequest1.setCodigoTratativa(tratativaRequest1.getCodigoTratativa());
        tratativaRepository.save(tratativaRequest1);
        return ConverteTratativaRequestParaRespostaTratativa.converte(tratativaRequest1);
}}
