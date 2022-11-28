package br.com.projetochallange.agencia.controllers;

import br.com.projetochallange.agencia.requisicao.SistemaRequest;
import br.com.projetochallange.agencia.resposta.RespostaSistema;
import br.com.projetochallange.agencia.servico.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/sistema")
@Slf4j

public class SistemaController {

    @Autowired
    private final CadastrarSistema cadastrarSistema;
    private final ConsultarSistema consultarSistema;
    private final ListarSistema listarSistema;
    private final RemoverSistema removerSistema;
    private final AlterarSistema alterarSistema;

    @PostMapping(path = "", produces = "aplication/json")
    @ResponseStatus(HttpStatus.CREATED)
    public RespostaSistema respostaSistema(@RequestBody SistemaRequest sistemaRequest) {
        log.info("Info {}", sistemaRequest);
        return cadastrarSistema.executar(sistemaRequest);
    }

    @GetMapping(path = "/{codigoSistema}")
    public RespostaSistema consultarsistema(@PathVariable("codigoSistema") String codigoSistema) {
        return consultarSistema.executar(codigoSistema);
    }

    @GetMapping(path = "")
    public List<RespostaSistema> listarSistema() {

        return listarSistema.executar();
    }

    @DeleteMapping(path = "/{codigoSistema}")
    public RespostaSistema removerSistema(@PathVariable("codigoSistema") String codigoSistema) {
        return removerSistema.executar(codigoSistema);    }

    @PatchMapping(path = "/{codigoSistema}")
    public RespostaSistema alterarSistema(@RequestBody SistemaRequest sistemaRequest,
                                                        @PathVariable("codigoSistema") String codigoSistema) {
        return alterarSistema.executar(sistemaRequest, codigoSistema);
    }
}
