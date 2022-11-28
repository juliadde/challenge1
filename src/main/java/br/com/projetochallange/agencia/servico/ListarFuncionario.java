package br.com.projetochallange.agencia.servico;

import br.com.projetochallange.agencia.resposta.RespostaFuncionario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ListarFuncionario {
    public List<RespostaFuncionario> executar() {
        List<RespostaFuncionario> respostaFuncionarios = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            RespostaFuncionario respostaFuncionario = new RespostaFuncionario();
            respostaFuncionario.setCodigoFuncionario(UUID.randomUUID().toString());
            respostaFuncionarios.add(respostaFuncionario);
        }
        return respostaFuncionarios;
    }
}


