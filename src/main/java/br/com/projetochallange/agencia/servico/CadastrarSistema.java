package br.com.projetochallange.agencia.servico;

import br.com.projetochallange.agencia.requisicao.SistemaRequest;
import br.com.projetochallange.agencia.resposta.RespostaSistema;
import org.springframework.stereotype.Service;

import java.util.UUID;
        @Service
public class CadastrarSistema {
            public RespostaSistema executar(SistemaRequest sistemaRequest) {
                RespostaSistema respostaSistema = new RespostaSistema();
                respostaSistema.setIdentificador(UUID.randomUUID().toString());
                respostaSistema.setNome(sistemaRequest.getNome());
                respostaSistema.setDepartamentoRequest(sistemaRequest.getDepartamentoRequest());
                respostaSistema.setFuncaoSistema(sistemaRequest.getFuncaoSistema());
                return respostaSistema;
            }
}
