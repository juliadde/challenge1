package br.com.projetochallange.agencia.servico;

import br.com.projetochallange.agencia.persistencia.SistemaRepository;
import br.com.projetochallange.agencia.resposta.RespostaSistema;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RemoverSistema {
    private final SistemaRepository sistemaRepository;
    private final ConsultarSistema consultarSistema;

    public RespostaSistema executar(String codigoSistema){
        RespostaSistema respostaSistema = consultarSistema.executar(codigoSistema);
        sistemaRepository.deleteById(respostaSistema.getCodigoSistema());
        return respostaSistema;
    }
}
