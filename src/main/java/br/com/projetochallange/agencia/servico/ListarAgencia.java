package br.com.projetochallange.agencia.servico;

import br.com.projetochallange.agencia.resposta.RespostaAgencia;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ListarAgencia {
    public List<RespostaAgencia> executar() {
        List<RespostaAgencia> respostaAgencias = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            RespostaAgencia respostaAgencia = new RespostaAgencia();
            respostaAgencia.setIdentificador(UUID.randomUUID().toString());
            respostaAgencias.add(respostaAgencia);
        }
        return respostaAgencias;
    }
}
