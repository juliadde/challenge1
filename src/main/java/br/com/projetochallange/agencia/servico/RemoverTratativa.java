package br.com.projetochallange.agencia.servico;

import br.com.projetochallange.agencia.persistencia.TratativaRepository;
import br.com.projetochallange.agencia.resposta.RespostaTratativa;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RemoverTratativa {
    private final TratativaRepository tratativaRepository;
    private final ConsultarTratativa consultarTratativa;

    public RespostaTratativa executar(String codigoTratativa){
        RespostaTratativa respostaTratativa = consultarTratativa.executar(codigoTratativa);
        TratativaRepository.deleteById(respostaTratativa.getCodigoTratativa());
        return respostaTratativa;
    }
}
