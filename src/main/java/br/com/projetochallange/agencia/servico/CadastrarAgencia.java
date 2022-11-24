package br.com.projetochallange.agencia.servico;
import br.com.projetochallange.agencia.requisicao.AgenciaRequest;
import br.com.projetochallange.agencia.requisicao.DepartamentoRequest;
import br.com.projetochallange.agencia.resposta.RespostaAgencia;
import br.com.projetochallange.agencia.resposta.RespostaDepartamento;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CadastrarAgencia {
    public RespostaAgencia executar(AgenciaRequest agenciaRequest) {
        RespostaAgencia respostaAgencia = new RespostaAgencia();
        respostaAgencia.setIdentificador(UUID.randomUUID().toString());
        respostaAgencia.setCodigoAgencia(agenciaRequest.getCodigoAgencia());
        respostaAgencia.setNome(agenciaRequest.getNome());
        respostaAgencia.setCidade(agenciaRequest.getCidade());
        return respostaAgencia;
}}
