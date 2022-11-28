package br.com.projetochallange.agencia.servico;

import br.com.projetochallange.agencia.persistencia.AgenciaRepository;
import br.com.projetochallange.agencia.requisicao.AgenciaRequest;
import br.com.projetochallange.agencia.resposta.RespostaAgencia;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor

public class CadastrarAgencia {
    private final AgenciaRepository agenciaRepository;
    public RespostaAgencia executar(AgenciaRequest agenciaRequest) {
        RespostaAgencia respostaAgencia = new RespostaAgencia();
        respostaAgencia.setCodigoAgencia(UUID.randomUUID().toString());

        AgenciaRequest agenciaRequest1 = new AgenciaRequest();
        agenciaRequest1.setNomeFuncionario(agenciaRequest1.getNomeFuncionario());
        agenciaRequest1.setCodigoAgencia(agenciaRequest1.getCodigoAgencia());
        agenciaRepository.save(agenciaRequest1);

        respostaAgencia.setCodigoAgencia(agenciaRequest.getCodigoAgencia());
        respostaAgencia.setNomeFuncionario(agenciaRequest.getNomeFuncionario());
        return respostaAgencia;
    }
}
