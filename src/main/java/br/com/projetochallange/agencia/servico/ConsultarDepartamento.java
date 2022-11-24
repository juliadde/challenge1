package br.com.projetochallange.agencia.servico;

import br.com.projetochallange.agencia.resposta.RespostaDepartamento;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ConsultarDepartamento {
    public RespostaDepartamento executar(String identificador) {
        RespostaDepartamento respostaDepartamento = new RespostaDepartamento();
        respostaDepartamento.setIdentificador(UUID.randomUUID().toString());
        return respostaDepartamento;
    }

}
