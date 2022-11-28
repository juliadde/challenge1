package br.com.projetochallange.agencia.servico;

import br.com.projetochallange.agencia.conversores.ConverteAgenciaRequestParaRespostaAgencia;
import br.com.projetochallange.agencia.persistencia.AgenciaRepository;
import br.com.projetochallange.agencia.requisicao.AgenciaRequest;
import br.com.projetochallange.agencia.resposta.RespostaAgencia;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AlterarAgencia {
    private final AgenciaRepository agenciaRepository;
    private final ConsultarAgencia consultarAgencia;

    public RespostaAgencia executar(AgenciaRequest agenciaRequest, String codigoAgencia) {
        RespostaAgencia respostaAgencia = consultarAgencia.executar(codigoAgencia);
        AgenciaRequest agenciaRequest1 = new AgenciaRequest();
        agenciaRequest1.setCodigoAgencia(agenciaRequest1.getCodigoAgencia());
        agenciaRequest1.setNomeFuncionario(agenciaRequest1.getNomeFuncionario());
        agenciaRepository.save(agenciaRequest1);
        return ConverteAgenciaRequestParaRespostaAgencia.converte(agenciaRequest1);
    }
}
