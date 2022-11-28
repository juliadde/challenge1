package br.com.projetochallange.agencia.servico;

import br.com.projetochallange.agencia.excecao.SemConteudoExcecao;
import br.com.projetochallange.agencia.persistencia.DepartamentoRepository;
import br.com.projetochallange.agencia.requisicao.AgenciaRequest;
import br.com.projetochallange.agencia.requisicao.DepartamentoRequest;
import br.com.projetochallange.agencia.resposta.RespostaAgencia;
import br.com.projetochallange.agencia.resposta.RespostaDepartamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ConsultarDepartamento {
    @Autowired
    private DepartamentoRepository departamentoRepository;
    public RespostaDepartamento executar(String codigoDepartamento) {
        DepartamentoRequest departamentoRequest = departamentoRepository.
                findByCodigoDepartamento(codigoDepartamento).orElseThrow(SemConteudoExcecao::new);

        RespostaDepartamento respostaDepartamento = new RespostaDepartamento();
        respostaDepartamento.setCodigoDepartamento(respostaDepartamento.getCodigoDepartamento());
        respostaDepartamento.setNome(respostaDepartamento.getNome());
        return respostaDepartamento;
    }
}