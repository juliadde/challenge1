package br.com.projetochallange.agencia.servico;

import br.com.projetochallange.agencia.persistencia.FuncionarioRepository;
import br.com.projetochallange.agencia.requisicao.AgenciaRequest;
import br.com.projetochallange.agencia.requisicao.FuncionarioRequest;
import br.com.projetochallange.agencia.resposta.RespostaAgencia;
import br.com.projetochallange.agencia.resposta.RespostaFuncionario;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CadastrarFuncionario {
    private final FuncionarioRepository funcionarioRepository;
    public RespostaFuncionario executar(FuncionarioRequest funcionarioRequest) {
        RespostaFuncionario respostaFuncionario = new RespostaFuncionario();
        respostaFuncionario.setCodigoFuncionario(UUID.randomUUID().toString());

        FuncionarioRequest funcionarioRequest1 = new FuncionarioRequest();
        funcionarioRequest1.setNome(funcionarioRequest1.getNome());
        funcionarioRequest1.setEmail(funcionarioRequest1.getEmail());
        funcionarioRequest1.setAgenciaRequest(funcionarioRequest1.getAgenciaRequest());
        funcionarioRepository.save(funcionarioRequest1);

        respostaFuncionario.setNome(funcionarioRequest.getNome());
        respostaFuncionario.setEmail(funcionarioRequest.getEmail());
        respostaFuncionario.setAgenciaRequest(funcionarioRequest.getAgenciaRequest());
        return respostaFuncionario;
    }
}
