package br.com.projetochallange.agencia.controllers;

import br.com.projetochallange.agencia.requisicao.AgenciaRequest;
import br.com.projetochallange.agencia.resposta.RespostaAgencia;
import br.com.projetochallange.agencia.servico.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/agencia")
@Slf4j
public class AgenciaController {

    @Autowired
    private final CadastrarAgencia cadastrarAgencia;
    private final ConsultarAgencia consultarAgencia;
    private final ListarAgencia listarAgencia;
    private final RemoverAgencia removerAgencia;
    private final AlterarAgencia alterarAgencia;

    @PostMapping(path = "", produces = "aplication/json")
    @ResponseStatus(HttpStatus.CREATED)
    public RespostaAgencia respostaAgencia(@RequestBody AgenciaRequest agenciaRequest) {
        log.info("Info {}", agenciaRequest);
        return cadastrarAgencia.executar(agenciaRequest);
    }

    @GetMapping(path = "/{codigoAgencia}")
    public RespostaAgencia consultarAgencia(@PathVariable("codigoAgencia") String codigoAgencia) {
        return consultarAgencia.executar(codigoAgencia);
    }

    @GetMapping(path = "")
    public List<RespostaAgencia> listarAgencia() {

        return listarAgencia.executar();
    }

    @DeleteMapping(path = "/{condigoAgencia}")
    public RespostaAgencia removerAgencia(@PathVariable("codigoAgencia") String codigoAgencia) {
        return removerAgencia.executar(codigoAgencia);
    }

    @PatchMapping(path = "/{codigoAgencia}")
    public RespostaAgencia alterarAgencia(@RequestBody AgenciaRequest agenciaRequest,
                                                        @PathVariable("codigoAgencia") String codigoAgencia) {
        return alterarAgencia.executar(agenciaRequest, codigoAgencia);
    }
}




