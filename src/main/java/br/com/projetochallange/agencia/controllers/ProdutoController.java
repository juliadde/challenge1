package br.com.projetochallange.agencia.controllers;
import br.com.projetochallange.agencia.requisicao.ProdutoRequest;
import br.com.projetochallange.agencia.resposta.RespostaProduto;
import br.com.projetochallange.agencia.servico.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/produto")
@Slf4j
public class ProdutoController {

    @Autowired
    private final CadastrarProduto cadastrarProduto;
    private final ConsultarProduto consultarProduto;
    private final ListarProduto listarProduto;
    private final RemoverProduto removerProduto;
    private final AlterarProduto alterarProduto;

    @PostMapping(path = "", produces = "aplication/json")
    @ResponseStatus(HttpStatus.CREATED)
    public RespostaProduto respostaProduto(@RequestBody ProdutoRequest produtoRequest) {
        log.info("Info {}", produtoRequest);
        return cadastrarProduto.executar(produtoRequest);
    }

    @GetMapping(path = "/{codigoProduto}")
    public RespostaProduto consultarProduto(@PathVariable("codigoProduto") String codigoProduto) {
        return consultarProduto.executar(codigoProduto);
    }

    @GetMapping(path = "")
    public List<RespostaProduto> listarProduto() {

        return listarProduto.executar();
    }

    @DeleteMapping(path = "/{codigoProduto}")
    public RespostaProduto removerProduto(@PathVariable("codigoProduto") String codigoProduto) {
        return removerProduto.executar(codigoProduto);
    }

    @PatchMapping(path = "/{codigoProduto}")
    public RespostaProduto alterarProduto(@RequestBody ProdutoRequest produtoRequest,
                                                        @PathVariable("codigoProduto") String codigoProduto) {
        return alterarProduto.executar(produtoRequest, codigoProduto);
    }
}





