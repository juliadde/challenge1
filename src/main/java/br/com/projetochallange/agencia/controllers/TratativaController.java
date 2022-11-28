package br.com.projetochallange.agencia.controllers;

import br.com.projetochallange.agencia.requisicao.TratativaRequest;
import br.com.projetochallange.agencia.resposta.RespostaTratativa;
import br.com.projetochallange.agencia.servico.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/tratativa")
@Slf4j


public class TratativaController {
    @Autowired
    private final CadastrarTratativa cadastrarTratativa;
    private final ConsultarTratativa consultarTratativa;
    private final ListarTratativa listarTratativa;
    private final RemoverTratativa removerTratativa;
    private final AlterarTratativa alterarTratativa;

    @PostMapping(path = "", produces = "aplication/json")
    @ResponseStatus(HttpStatus.CREATED)
    public RespostaTratativa cadastrarTratativa(@RequestBody TratativaRequest tratativaRequest) {
        log.info("Info {}", tratativaRequest);
        return cadastrarTratativa.executar(tratativaRequest);
    }

    @GetMapping(path = "/{codigoTratativa}")
    public RespostaTratativa consultarTratativa(@PathVariable("codigoTratativa") String codigoTratativa) {
        return consultarTratativa.executar(codigoTratativa);

    }

    @GetMapping(path = "")
    public List<RespostaTratativa> listarTratativa() {
        return listarTratativa.executar();
    }

    @DeleteMapping(path = "/{codigoTratativa}")
    public RespostaTratativa removerTratativa(@PathVariable("codigoTratativa") String codigoTratativa) {
        return removerTratativa.executar(codigoTratativa);
    }

    @PatchMapping(path = "/{codigoTratativa}")
    public RespostaTratativa alterarTratativa(@RequestBody TratativaRequest tratativaRequest,
                                              @PathVariable("codigoTratativa") String codigoTratativa) {
        return alterarTratativa.executar(tratativaRequest, codigoTratativa);
    }
}



    


