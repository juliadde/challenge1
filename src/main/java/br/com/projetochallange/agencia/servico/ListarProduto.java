package br.com.projetochallange.agencia.servico;
import br.com.projetochallange.agencia.resposta.RespostaAgencia;
import br.com.projetochallange.agencia.resposta.RespostaProduto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ListarProduto {
    public List<RespostaProduto> executar() {
        List<RespostaProduto> respostaProdutos = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            RespostaProduto respostaProduto = new RespostaProduto();
            respostaProduto.setCodigoProduto(UUID.randomUUID().toString());
            respostaProdutos.add(respostaProduto);
        }
        return respostaProdutos;
    }
}
