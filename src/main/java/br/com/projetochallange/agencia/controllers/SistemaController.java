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
@RequestMapping("/inconsistencia")
@Slf4j

public class SistemaController {

    @Autowired
    private final CadastrarSistema cadastrarSistema;
    private final ConsultarSistema consultarSistema;
    private final ListarSistema listarSistema;

    @PostMapping(path = "", produces = "aplication/json")
    @ResponseStatus(HttpStatus.CREATED)
    public RespostaSistema respostaSistema(@RequestBody SistemaRequest sistemaRequest) {
        log.info("Info {}", sistemaRequest);
        return cadastrarSistema.executar(sistemaRequest);
    }

    @GetMapping(path = "/{identificador}")
    public RespostaSistema consultarsistema(@PathVariable("identificador") String identificador) {
        return consultarSistema.executar(identificador);
    }

    @GetMapping(path = "")
    public List<RespostaSistema> listarSistema() {

        return listarSistema.executar();
    }

    @DeleteMapping(path = "/{identificador}")
    public RespostaSistema removerSistema(@PathVariable("identificador") String identificador) {
        return new RespostaSistema();
    }

    @PatchMapping(path = "/{identificador}")
    public RespostaSistema alterarSistema(@RequestBody SistemaRequest sistemaRequest,
                                                        @PathVariable("identificador") String identificador) {
        return new RespostaSistema();
    }
}
