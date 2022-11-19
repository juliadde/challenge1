package br.com.projetochallange.agencia.controllers;

import br.com.projetochallange.agencia.requisicao.TratativaRequest;
import br.com.projetochallange.agencia.resposta.RespostaInconsistencia;
import br.com.projetochallange.agencia.resposta.RespostaTratativa;
import br.com.projetochallange.agencia.servico.CadastrarTratativa;
import br.com.projetochallange.agencia.servico.ConsultarTratativa;
import br.com.projetochallange.agencia.servico.ListarInconsistencia;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/tratativa")
@Slf4j
@EnableSwagger2

public class TratativaController {
    @Autowired
    private final CadastrarTratativa cadastrarTratativa;
    private final ConsultarTratativa consultarTratativa;
    private final ListarInconsistencia listarInconsistencia;

    @PostMapping(path = "", produces = "aplication/json")
    @ResponseStatus(HttpStatus.CREATED)
    public RespostaTratativa cadastrarTratativa(@RequestBody TratativaRequest tratativaRequest) {
        log.info("Info {}", tratativaRequest);
        return cadastrarTratativa.executar(tratativaRequest);
    }

    @GetMapping(path = "/{identificador}")
    public RespostaTratativa consultarTratativa(@PathVariable("identificador") String identificador) {
        return consultarTratativa.executar(identificador);

    }

    @GetMapping(path = "")
    public List<RespostaInconsistencia> listarInconsistencia() {
        return listarInconsistencia.executar();
    }

    @DeleteMapping(path = "/{identificador}")
    public RespostaTratativa removerTratativa(@PathVariable("identificador") String identificador) {
        return new RespostaTratativa();
    }

    @PatchMapping(path = "/{identificador}")
    public RespostaTratativa alterarTratativa(@RequestBody TratativaRequest tratativaRequest,
                                              @PathVariable("identificador") String identificador) {
        return new RespostaTratativa();
    }
}



    


