package br.com.projetochallange.agencia.servico;

import br.com.projetochallange.agencia.conversores.ConverteAgenciaRequestParaRespostaAgencia;
import br.com.projetochallange.agencia.excecao.SemConteudoExcecao;
import br.com.projetochallange.agencia.persistencia.AgenciaRepository;
import br.com.projetochallange.agencia.requisicao.AgenciaRequest;
import br.com.projetochallange.agencia.resposta.RespostaAgencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultarAgencia {
    @Autowired
    private AgenciaRepository agenciaRepository;

    public RespostaAgencia executar(String codigoAgencia) {
        AgenciaRequest agenciaRequest = agenciaRepository.
                findByCodigoAgencia(codigoAgencia).orElseThrow(SemConteudoExcecao::new);
        return ConverteAgenciaRequestParaRespostaAgencia.converte(agenciaRequest);

    }
}
