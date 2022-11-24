package br.com.projetochallange.agencia.controllers;

import br.com.projetochallange.agencia.requisicao.InconsistenciaRequest;
import br.com.projetochallange.agencia.resposta.RespostaInconsistencia;
import br.com.projetochallange.agencia.servico.CadastrarInconsistencia;
import br.com.projetochallange.agencia.servico.ConsultarInconsistencia;
import br.com.projetochallange.agencia.servico.ListarInconsistencia;
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

public class InconsistenciaController {

    @Autowired
    private final CadastrarInconsistencia cadastrarInconsistencia;
    private final ConsultarInconsistencia consultarInconsistencia;
    private final ListarInconsistencia listarInconsistencia;

    @PostMapping(path = "", produces = "aplication/json")
    @ResponseStatus(HttpStatus.CREATED)
    public RespostaInconsistencia respostaInconsistencia(@RequestBody InconsistenciaRequest inconsistenciaRequest) {
        log.info("Info {}", inconsistenciaRequest);
        return cadastrarInconsistencia.executar(inconsistenciaRequest);
    }

    @GetMapping(path = "/{identificador}")
    public RespostaInconsistencia consultarInconsistencia(@PathVariable("identificador") String identificador) {
        return consultarInconsistencia.executar(identificador);
    }

    @GetMapping(path = "")
    public List<RespostaInconsistencia> listarInconsistencia() {

        return listarInconsistencia.executar();
    }

    @DeleteMapping(path = "/{identificador}")
    public RespostaInconsistencia removerInconsistencia(@PathVariable("identificador") String identificador) {
        return new RespostaInconsistencia();
    }

    @PatchMapping(path = "/{identificador}")
    public RespostaInconsistencia alterarInconsistencia(@RequestBody InconsistenciaRequest inconsistenciaRequest,
                                                        @PathVariable("identificador") String identificador) {
        return new RespostaInconsistencia();
    }
}



