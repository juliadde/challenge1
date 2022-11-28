package br.com.projetochallange.agencia.servico;
import br.com.projetochallange.agencia.persistencia.DepartamentoRepository;
import br.com.projetochallange.agencia.persistencia.ProdutoRepository;
import br.com.projetochallange.agencia.requisicao.DepartamentoRequest;
import br.com.projetochallange.agencia.requisicao.ProdutoRequest;
import br.com.projetochallange.agencia.resposta.RespostaProduto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CadastrarProduto {
    private final ProdutoRepository produtoRepository;
    public RespostaProduto executar(ProdutoRequest produtoRequest) {
        RespostaProduto respostaProduto = new RespostaProduto();
        respostaProduto.setCodigoProduto(UUID.randomUUID().toString());

        ProdutoRequest produtoRequest1 = new ProdutoRequest();
        produtoRequest1.setNome(produtoRequest1.getNome());
        produtoRequest1.setSistemaRequest(produtoRequest1.getSistemaRequest());
        produtoRepository.save(produtoRequest1);

        respostaProduto.setNome(produtoRequest.getNome());
        respostaProduto.setSistemaRequest(produtoRequest.getSistemaRequest());
        return respostaProduto;
    }
}
