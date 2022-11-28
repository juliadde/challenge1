package br.com.projetochallange.agencia.servico;

import br.com.projetochallange.agencia.conversores.ConverteAgenciaRequestParaRespostaAgencia;
import br.com.projetochallange.agencia.conversores.ConverteProdutoRequestParaRespostaProduto;
import br.com.projetochallange.agencia.persistencia.AgenciaRepository;
import br.com.projetochallange.agencia.persistencia.ProdutoRepository;
import br.com.projetochallange.agencia.requisicao.AgenciaRequest;
import br.com.projetochallange.agencia.requisicao.ProdutoRequest;
import br.com.projetochallange.agencia.resposta.RespostaAgencia;
import br.com.projetochallange.agencia.resposta.RespostaProduto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AlterarProduto {
    private final ProdutoRepository produtoRepository;
    private final ConsultarProduto consultarProduto;

    public RespostaProduto executar(ProdutoRequest produtoRequest, String codigoProduto) {
        RespostaProduto respostaProduto = consultarProduto.executar(codigoProduto);
        ProdutoRequest produtoRequest1 = new ProdutoRequest();
        produtoRequest1.setNome(produtoRequest1.getNome());
        produtoRequest1.setSistemaRequest(produtoRequest1.getSistemaRequest());
        produtoRepository.save(produtoRequest1);
        return ConverteProdutoRequestParaRespostaProduto.converte(produtoRequest1);
    }
}
