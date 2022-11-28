package br.com.projetochallange.agencia.servico;

import br.com.projetochallange.agencia.persistencia.SistemaRepository;
import br.com.projetochallange.agencia.requisicao.DepartamentoRequest;
import br.com.projetochallange.agencia.requisicao.SistemaRequest;
import br.com.projetochallange.agencia.resposta.RespostaSistema;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CadastrarSistema {
    private final SistemaRepository sistemaRepository;
    public RespostaSistema executar(SistemaRequest sistemaRequest) {
        RespostaSistema respostaSistema = new RespostaSistema();
        respostaSistema.setCodigoSistema(UUID.randomUUID().toString());

        SistemaRequest sistemaRequest1 = new SistemaRequest();
        sistemaRequest1.setNome(sistemaRequest1.getNome());
        sistemaRequest1.setDepartamentoRequest(sistemaRequest1.getDepartamentoRequest());
        sistemaRepository.save(sistemaRequest1);

        respostaSistema.setNome(sistemaRequest.getNome());
        respostaSistema.setDepartamentoRequest(sistemaRequest.getDepartamentoRequest());
        respostaSistema.setFuncaoSistema(sistemaRequest.getFuncaoSistema());
        return respostaSistema;
    }
}
