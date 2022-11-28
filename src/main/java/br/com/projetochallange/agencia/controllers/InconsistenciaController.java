package br.com.projetochallange.agencia.controllers;

import br.com.projetochallange.agencia.requisicao.InconsistenciaRequest;
import br.com.projetochallange.agencia.resposta.RespostaInconsistencia;
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

public class InconsistenciaController {

    @Autowired
    private final CadastrarInconsistencia cadastrarInconsistencia;
    private final ConsultarInconsistencia consultarInconsistencia;
    private final ListarInconsistencia listarInconsistencia;
    private final RemoverInconsistencia removerInconsistencia;
    private final AlterarInconsistencia alterarInconsistencia;

    @PostMapping(path = "", produces = "aplication/json")
    @ResponseStatus(HttpStatus.CREATED)
    public RespostaInconsistencia respostaInconsistencia(@RequestBody InconsistenciaRequest inconsistenciaRequest) {
        log.info("Info {}", inconsistenciaRequest);
        return cadastrarInconsistencia.executar(inconsistenciaRequest);
    }

    @GetMapping(path = "/{codigoInconsistencia}")
    public RespostaInconsistencia consultarInconsistencia(@PathVariable("codigoInconsistencia") String codigoInconsistencia) {
        return consultarInconsistencia.executar(codigoInconsistencia);
    }

    @GetMapping(path = "")
    public List<RespostaInconsistencia> listarInconsistencia() {

        return listarInconsistencia.executar();
    }

    @DeleteMapping(path = "/{codigoInconsistencia}")
    public RespostaInconsistencia removerInconsistencia(@PathVariable("codigoInconsistencia") String codigoInconsistencia) {
        return removerInconsistencia.executar(codigoInconsistencia);
    }

    @PatchMapping(path = "/{codigoInconsistencia}")
    public RespostaInconsistencia alterarInconsistencia(@RequestBody InconsistenciaRequest inconsistenciaRequest,
                                                        @PathVariable("codigoInconsistencia") String codigoInconsistencia) {
        return alterarInconsistencia.executar(inconsistenciaRequest, codigoInconsistencia);
    }
}



