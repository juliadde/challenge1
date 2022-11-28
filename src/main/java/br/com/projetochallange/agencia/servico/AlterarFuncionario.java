package br.com.projetochallange.agencia.servico;

import br.com.projetochallange.agencia.conversores.ConverteAgenciaRequestParaRespostaAgencia;
import br.com.projetochallange.agencia.conversores.ConverteFuncionarioRequestParaRespostaFuncionario;
import br.com.projetochallange.agencia.persistencia.AgenciaRepository;
import br.com.projetochallange.agencia.persistencia.FuncionarioRepository;
import br.com.projetochallange.agencia.requisicao.AgenciaRequest;
import br.com.projetochallange.agencia.requisicao.FuncionarioRequest;
import br.com.projetochallange.agencia.resposta.RespostaAgencia;
import br.com.projetochallange.agencia.resposta.RespostaFuncionario;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AlterarFuncionario {
    private final FuncionarioRepository funcionarioRepository;
    private final ConsultarFuncionario consultarFuncionario;

    public RespostaFuncionario executar(FuncionarioRequest funcionarioRequest, String codigoFuncionario) {
        RespostaFuncionario respostaFuncionario = consultarFuncionario.executar(codigoFuncionario);
        FuncionarioRequest funcionarioRequest1 = new FuncionarioRequest();
        funcionarioRequest1.setNome(funcionarioRequest1.getNome());
        funcionarioRequest1.setEmail(funcionarioRequest1.getEmail());
        funcionarioRequest1.setCodigoFuncionario(funcionarioRequest1.getCodigoFuncionario());
        funcionarioRequest1.setAgenciaRequest(funcionarioRequest1.getAgenciaRequest());

        funcionarioRepository.save(funcionarioRequest1);
        return ConverteFuncionarioRequestParaRespostaFuncionario.converte(funcionarioRequest1);
    }
}
