package br.com.projetochallange.agencia.conversores;

import br.com.projetochallange.agencia.requisicao.ProdutoRequest;
import br.com.projetochallange.agencia.resposta.RespostaProduto;

public class ConverteProdutoRequestParaRespostaProduto {

    public static RespostaProduto converte(ProdutoRequest produtoRequest){
        RespostaProduto respostaProduto = new RespostaProduto();
        respostaProduto.setNome(respostaProduto.getNome());
        respostaProduto.setSistemaRequest(respostaProduto.getSistemaRequest());
        return respostaProduto;
    }
}
