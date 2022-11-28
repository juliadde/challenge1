package br.com.projetochallange.agencia.servico;

import br.com.projetochallange.agencia.resposta.RespostaSistema;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ConsultarSistema {
    public RespostaSistema executar(String identificador) {
        RespostaSistema respostaSistema = new RespostaSistema();
        respostaSistema.setCodigoSistema(UUID.randomUUID().toString());
        return respostaSistema;
    }
}
