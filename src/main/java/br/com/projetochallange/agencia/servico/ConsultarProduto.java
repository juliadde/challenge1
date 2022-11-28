package br.com.projetochallange.agencia.servico;
import br.com.projetochallange.agencia.resposta.RespostaAgencia;
import br.com.projetochallange.agencia.resposta.RespostaProduto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ConsultarProduto {
    public RespostaProduto executar(String identificador) {
        RespostaProduto respostaProduto = new RespostaProduto();
        respostaProduto.setCodigoProduto(UUID.randomUUID().toString());
        return respostaProduto;
    }
}
