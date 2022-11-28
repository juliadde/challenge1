package br.com.projetochallange.agencia.servico;

import br.com.projetochallange.agencia.resposta.RespostaTratativa;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ListarTratativa {
    public List<RespostaTratativa> executar() {
        List<RespostaTratativa> respostaTratativas = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            RespostaTratativa respostaTratativa = new RespostaTratativa();
            respostaTratativa.setCodigoTratativa(UUID.randomUUID().toString());
            respostaTratativas.add(respostaTratativa);
        }
        return respostaTratativas;
    }
}