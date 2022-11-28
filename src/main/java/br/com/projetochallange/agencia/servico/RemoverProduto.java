package br.com.projetochallange.agencia.servico;

import br.com.projetochallange.agencia.persistencia.AgenciaRepository;
import br.com.projetochallange.agencia.persistencia.ProdutoRepository;
import br.com.projetochallange.agencia.resposta.RespostaAgencia;
import br.com.projetochallange.agencia.resposta.RespostaProduto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RemoverProduto {
    private final ProdutoRepository produtoRepository;
    private final ConsultarProduto consultarProduto;

    public RespostaProduto executar(String codigoProduto){
        RespostaProduto respostaProduto = consultarProduto.executar(codigoProduto);
        produtoRepository.deleteById(respostaProduto.getCodigoProduto());
        return respostaProduto;
    }
}
