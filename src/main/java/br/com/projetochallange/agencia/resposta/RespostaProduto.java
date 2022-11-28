package br.com.projetochallange.agencia.resposta;

import br.com.projetochallange.agencia.requisicao.ProdutoRequest;
import lombok.Data;

@Data
public class RespostaProduto extends ProdutoRequest {
    private String codigoProduto;

}
