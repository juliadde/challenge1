package br.com.projetochallange.agencia.controllers;

import br.com.projetochallange.agencia.requisicao.AgenciaRequest;
import br.com.projetochallange.agencia.resposta.RespostaAgencia;
import br.com.projetochallange.agencia.servico.CadastrarAgencia;
import br.com.projetochallange.agencia.servico.ConsultarAgencia;
import br.com.projetochallange.agencia.servico.ListarAgencia;
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

    @PostMapping(path = "", produces = "aplication/json")
    @ResponseStatus(HttpStatus.CREATED)
    public RespostaAgencia respostaAgencia(@RequestBody AgenciaRequest agenciaRequest) {
        log.info("Info {}", agenciaRequest);
        return cadastrarAgencia.executar(agenciaRequest);
    }

    @GetMapping(path = "/{identificador}")
    public RespostaAgencia consultarAgencia(@PathVariable("identificador") String identificador) {
        return consultarAgencia.executar(identificador);
    }

    @GetMapping(path = "")
    public List<RespostaAgencia> listarAgencia() {

        return listarAgencia.executar();
    }

    @DeleteMapping(path = "/{identificador}")
    public RespostaAgencia removeragencia(@PathVariable("identificador") String identificador) {
        return new RespostaAgencia();
    }

    @PatchMapping(path = "/{identificador}")
    public RespostaAgencia alterarAgencia(@RequestBody AgenciaRequest agenciaRequest,
                                                        @PathVariable("identificador") String identificador) {
        return new RespostaAgencia();
    }
}




