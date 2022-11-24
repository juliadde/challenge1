package br.com.projetochallange.agencia.controllers;
import br.com.projetochallange.agencia.requisicao.ProdutoRequest;
import br.com.projetochallange.agencia.resposta.RespostaProduto;
import br.com.projetochallange.agencia.servico.CadastrarProduto;
import br.com.projetochallange.agencia.servico.ConsultarProduto;
import br.com.projetochallange.agencia.servico.ListarProduto;
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

    @PostMapping(path = "", produces = "aplication/json")
    @ResponseStatus(HttpStatus.CREATED)
    public RespostaProduto respostaProduto(@RequestBody ProdutoRequest produtoRequest) {
        log.info("Info {}", produtoRequest);
        return cadastrarProduto.executar(produtoRequest);
    }

    @GetMapping(path = "/{identificador}")
    public RespostaProduto consultarProduto(@PathVariable("identificador") String identificador) {
        return consultarProduto.executar(identificador);
    }

    @GetMapping(path = "")
    public List<RespostaProduto> listarProduto() {

        return listarProduto.executar();
    }

    @DeleteMapping(path = "/{identificador}")
    public RespostaProduto removerProduto(@PathVariable("identificador") String identificador) {
        return new RespostaProduto();
    }

    @PatchMapping(path = "/{identificador}")
    public RespostaProduto alterarProduto(@RequestBody ProdutoRequest produtoRequest,
                                                        @PathVariable("identificador") String identificador) {
        return new RespostaProduto();
    }
}





