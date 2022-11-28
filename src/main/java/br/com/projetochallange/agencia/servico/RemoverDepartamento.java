package br.com.projetochallange.agencia.servico;

import br.com.projetochallange.agencia.persistencia.DepartamentoRepository;
import br.com.projetochallange.agencia.resposta.RespostaDepartamento;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RemoverDepartamento {
    private final DepartamentoRepository departamentoRepository;
    private final ConsultarDepartamento consultarDepartamento;

    public RespostaDepartamento executar(String codigoDepartamento){
        RespostaDepartamento respostaDepartamento = consultarDepartamento.executar(codigoDepartamento);
        departamentoRepository.deleteById(respostaDepartamento.getCodigoDepartamento());
        return respostaDepartamento;
    }
}
