package br.com.projetochallange.agencia.servico;
import br.com.projetochallange.agencia.resposta.RespostaAgencia;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ConsultarAgencia {
    public RespostaAgencia executar(String identificador) {
        RespostaAgencia respostaAgencia = new RespostaAgencia();
        respostaAgencia.setIdentificador(UUID.randomUUID().toString());
        return respostaAgencia;
    }
}
