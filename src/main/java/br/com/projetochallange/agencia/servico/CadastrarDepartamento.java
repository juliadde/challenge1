package br.com.projetochallange.agencia.servico;

import br.com.projetochallange.agencia.persistencia.DepartamentoRepository;
import br.com.projetochallange.agencia.requisicao.DepartamentoRequest;
import br.com.projetochallange.agencia.resposta.RespostaDepartamento;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CadastrarDepartamento {
    private final DepartamentoRepository departamentoRepository;
    public RespostaDepartamento executar(DepartamentoRequest departamentoRequest) {
        RespostaDepartamento respostaDepartamento = new RespostaDepartamento();
        respostaDepartamento.setCodigoDepartamento(UUID.randomUUID().toString());

        DepartamentoRequest departamentoRequest1 = new DepartamentoRequest();
        departamentoRequest1.setNome(departamentoRequest1.getNome());
        departamentoRequest1.setCodigoDepartamento(departamentoRequest1.getCodigoDepartamento());
        departamentoRepository.save(departamentoRequest1);

        respostaDepartamento.setNome(departamentoRequest.getNome());
        respostaDepartamento.setCodigoDepartamento(departamentoRequest.getCodigoDepartamento());
        return respostaDepartamento;
    }
}
