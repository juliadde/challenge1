package br.com.projetochallange.agencia.servico;

import br.com.projetochallange.agencia.conversores.ConverteAgenciaRequestParaRespostaAgencia;
import br.com.projetochallange.agencia.conversores.ConverteSistemaRequestParaRespostaSistema;
import br.com.projetochallange.agencia.persistencia.AgenciaRepository;
import br.com.projetochallange.agencia.persistencia.SistemaRepository;
import br.com.projetochallange.agencia.requisicao.AgenciaRequest;
import br.com.projetochallange.agencia.requisicao.SistemaRequest;
import br.com.projetochallange.agencia.resposta.RespostaAgencia;
import br.com.projetochallange.agencia.resposta.RespostaSistema;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AlterarSistema {
    private final SistemaRepository sistemaRepository;
    private final ConsultarSistema consultarSistema;

    public RespostaSistema executar(SistemaRequest sistemaRequest, String codigoSistema) {
        RespostaSistema respostaSistema = consultarSistema.executar(codigoSistema);
        SistemaRequest sistemaRequest1 = new SistemaRequest();
        sistemaRequest1.setNome(sistemaRequest1.getNome());
        sistemaRequest1.setDepartamentoRequest(sistemaRequest1.getDepartamentoRequest());
        sistemaRequest1.setFuncaoSistema(sistemaRequest1.getFuncaoSistema());
        sistemaRequest1.setCodigoSistema(sistemaRequest1.getCodigoSistema());
        sistemaRepository.save(sistemaRequest1);
        return ConverteSistemaRequestParaRespostaSistema.converte(sistemaRequest1);
    }
}
