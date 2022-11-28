package br.com.projetochallange.agencia.servico;
import br.com.projetochallange.agencia.resposta.RespostaAgencia;
import br.com.projetochallange.agencia.resposta.RespostaFuncionario;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ConsultarFuncionario {
    public RespostaFuncionario executar(String identificador) {
        RespostaFuncionario respostaFuncionario = new RespostaFuncionario();
        respostaFuncionario.setCodigoFuncionario(UUID.randomUUID().toString());
        return respostaFuncionario;
    }
}
