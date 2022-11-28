package br.com.projetochallange.agencia.servico;

import br.com.projetochallange.agencia.resposta.RespostaDepartamento;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ListarDepartamento {

    public List<RespostaDepartamento> executar() {
        List<RespostaDepartamento> respostaDepartamentos = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            RespostaDepartamento respostaDepartamento = new RespostaDepartamento();
            respostaDepartamento.setCodigoDepartamento(UUID.randomUUID().toString());
            respostaDepartamentos.add(respostaDepartamento);
        }
        return respostaDepartamentos;
    }
}
