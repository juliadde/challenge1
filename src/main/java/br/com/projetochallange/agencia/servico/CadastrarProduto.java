package br.com.projetochallange.agencia.servico;
import br.com.projetochallange.agencia.requisicao.AgenciaRequest;
import br.com.projetochallange.agencia.requisicao.ProdutoRequest;
import br.com.projetochallange.agencia.resposta.RespostaAgencia;
import br.com.projetochallange.agencia.resposta.RespostaProduto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CadastrarProduto {
    public RespostaProduto executar(ProdutoRequest produtoRequest) {
        RespostaProduto respostaProduto = new RespostaProduto();
        respostaProduto.setIdentificador(UUID.randomUUID().toString());
        respostaProduto.setNome(produtoRequest.getNome());
        respostaProduto.setSistema(produtoRequest.getSistema());
        return respostaProduto;
    }
}
