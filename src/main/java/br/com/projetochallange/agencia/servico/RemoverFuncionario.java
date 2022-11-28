package br.com.projetochallange.agencia.servico;


import br.com.projetochallange.agencia.persistencia.FuncionarioRepository;
import br.com.projetochallange.agencia.resposta.RespostaFuncionario;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RemoverFuncionario {
    private final FuncionarioRepository funcionarioRepository;
    private final ConsultarFuncionario consultarFuncionario;

    public RespostaFuncionario executar(String codigoFuncionario){
        RespostaFuncionario respostaFuncionario = consultarFuncionario.executar(codigoFuncionario);
        funcionarioRepository.deleteById(respostaFuncionario.getCodigoFuncionario());
        return respostaFuncionario;
    }
}
