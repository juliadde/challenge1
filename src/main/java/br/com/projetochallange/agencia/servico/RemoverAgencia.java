package br.com.projetochallange.agencia.servico;

import br.com.projetochallange.agencia.persistencia.AgenciaRepository;
import br.com.projetochallange.agencia.resposta.RespostaAgencia;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RemoverAgencia {
    private final AgenciaRepository agenciaRepository;
    private final ConsultarAgencia consultarAgencia;

    public RespostaAgencia executar(String codigoAgencia){
    RespostaAgencia respostaAgencia = consultarAgencia.executar(codigoAgencia);
    agenciaRepository.deleteById(respostaAgencia.getCodigoAgencia());
    return respostaAgencia;
    }

}
