package br.com.projetochallange.agencia.servico;

import br.com.projetochallange.agencia.conversores.ConverteAgenciaRequestParaRespostaAgencia;
import br.com.projetochallange.agencia.conversores.ConverteDepartamentoRequestParaRespostaDepartamento;
import br.com.projetochallange.agencia.persistencia.AgenciaRepository;
import br.com.projetochallange.agencia.persistencia.DepartamentoRepository;
import br.com.projetochallange.agencia.requisicao.AgenciaRequest;
import br.com.projetochallange.agencia.requisicao.DepartamentoRequest;
import br.com.projetochallange.agencia.resposta.RespostaAgencia;
import br.com.projetochallange.agencia.resposta.RespostaDepartamento;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AlterarDepartamento {
    private final DepartamentoRepository departamentoRepository;
    private final ConsultarDepartamento consultarDepartamento;

    public RespostaDepartamento executar(DepartamentoRequest departamentoRequest, String codigoDepartamento) {
        RespostaDepartamento respostaDepartamento = consultarDepartamento.executar(codigoDepartamento);
        DepartamentoRequest departamentoRequest1 = new DepartamentoRequest();
        departamentoRequest1.setCodigoDepartamento(departamentoRequest1.getCodigoDepartamento());
        departamentoRequest1.setNome(departamentoRequest1.getNome());
        departamentoRepository.save(departamentoRequest1);
        return ConverteDepartamentoRequestParaRespostaDepartamento.converte(departamentoRequest1);
    }
}
