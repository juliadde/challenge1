package br.com.projetochallange.agencia.servico;

import br.com.projetochallange.agencia.resposta.RespostaSistema;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ListarSistema {
    public List<RespostaSistema> executar() {
        List<RespostaSistema> respostaSistemas = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            RespostaSistema respostaSistema = new RespostaSistema();
            respostaSistema.setCodigoSistema(UUID.randomUUID().toString());
            respostaSistemas.add(respostaSistema);
        }
        return respostaSistemas;
    }
}
