package br.com.projetochallange.agencia.controllers;

import br.com.projetochallange.agencia.requisicao.FuncionarioRequest;
import br.com.projetochallange.agencia.resposta.RespostaFuncionario;
import br.com.projetochallange.agencia.servico.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/funcionario")
@Slf4j

public class FuncionarioController {
    @Autowired
    private final CadastrarFuncionario cadastrarFuncionario;
    private final ConsultarFuncionario consultarFuncionario;
    private final ListarFuncionario listarFuncionario;
    private final RemoverFuncionario removerFuncionario;
    private final AlterarFuncionario alterarFuncionario;

    @PostMapping(path = "", produces = "aplication/json")
    @ResponseStatus(HttpStatus.CREATED)
    public RespostaFuncionario respostaFuncionario(@RequestBody FuncionarioRequest funcionarioRequest) {
        log.info("Info {}", funcionarioRequest);
        return cadastrarFuncionario.executar(funcionarioRequest);
    }

    @GetMapping(path = "/{codigoFuncionario}")
    public RespostaFuncionario consultarFuncionario(@PathVariable("condigoFuncionario") String condigoFuncionario) {
        return consultarFuncionario.executar(condigoFuncionario);
    }

    @GetMapping(path = "")
    public List<RespostaFuncionario> listarFuncionario() {

        return listarFuncionario.executar();
    }

    @DeleteMapping(path = "/{codigoFuncionario}")
    public RespostaFuncionario removerFuncionario(@PathVariable("codigoFuncionario") String codigoFuncionario) {
        return removerFuncionario.executar(codigoFuncionario);
    }

    @PatchMapping(path = "/{condigoFuncionario}")
    public RespostaFuncionario alterarFuncionario(@RequestBody FuncionarioRequest funcionarioRequest,
                                          @PathVariable("condigoFuncionario") String condigoFuncionario) {
        return alterarFuncionario.executar(funcionarioRequest, condigoFuncionario);    }
}
