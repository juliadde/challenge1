package br.com.projetochallange.agencia.servico;

import br.com.projetochallange.agencia.resposta.RespostaTratativa;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class ConsultarTratativa {
    public RespostaTratativa executar(String identificador) {
        RespostaTratativa respostaTratativa = new RespostaTratativa();
        respostaTratativa.setIdentificador(UUID.randomUUID().toString());
        return respostaTratativa;
    }
}
