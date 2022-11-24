package br.com.projetochallange.agencia.servico;

import br.com.projetochallange.agencia.requisicao.DepartamentoRequest;
import br.com.projetochallange.agencia.resposta.RespostaDepartamento;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CadastrarDepartamento {
    public RespostaDepartamento executar(DepartamentoRequest departamentoRequest) {
        RespostaDepartamento respostaDepartamento = new RespostaDepartamento();
        respostaDepartamento.setIdentificador(UUID.randomUUID().toString());
        respostaDepartamento.setNome(departamentoRequest.getNome());
        respostaDepartamento.setJuncaoDepartamento(departamentoRequest.getJuncaoDepartamento());
        return respostaDepartamento;
    }
}
