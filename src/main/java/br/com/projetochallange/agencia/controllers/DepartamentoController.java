package br.com.projetochallange.agencia.controllers;

import br.com.projetochallange.agencia.requisicao.DepartamentoRequest;
import br.com.projetochallange.agencia.resposta.RespostaDepartamento;
import br.com.projetochallange.agencia.servico.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/departamento")
@Slf4j

public class DepartamentoController {

    @Autowired
    private final CadastrarDepartamento cadastrarDepartamento;
    private final ConsultarDepartamento consultarDepartamento;
    private final ListarDepartamento listarDepartamento;
    private final RemoverDepartamento removerDepartamento;
    private final AlterarDepartamento alterarDepartamento;
    @PostMapping(path = "", produces = "aplication/json")
    @ResponseStatus(HttpStatus.CREATED)
    public RespostaDepartamento respostaDepartamento(@RequestBody DepartamentoRequest departamentoRequest) {
        log.info("Info {}", departamentoRequest);
        return cadastrarDepartamento.executar(departamentoRequest);
    }

    @GetMapping(path = "/{codigoDepartamento}")
    public RespostaDepartamento consultarDepartamento(@PathVariable("codigoDepartamento")
                                                          String codigoDepartamento) {
        return consultarDepartamento.executar(codigoDepartamento);
    }

    @GetMapping(path = "")
    public List<RespostaDepartamento> listarDepartamento() {

        return listarDepartamento.executar();
    }

    @DeleteMapping(path = "/{codigoDepartamento}")
    public RespostaDepartamento removerDepartamento(@PathVariable("codigoDepartamento")
                                                        String codigoDepartamento) {
        return removerDepartamento.executar(codigoDepartamento);
    }

    @PatchMapping(path = "/{codigoDepartamento}")
    public RespostaDepartamento alterarDepartamento(@RequestBody DepartamentoRequest departamentoRequest,
                                                        @PathVariable("codigoDepartamento")
                                                        String codigoDepartamento) {
        return alterarDepartamento.executar(departamentoRequest, codigoDepartamento);    }
}



