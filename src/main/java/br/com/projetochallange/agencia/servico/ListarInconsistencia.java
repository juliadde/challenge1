package br.com.projetochallange.agencia.servico;

import br.com.projetochallange.agencia.resposta.RespostaInconsistencia;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ListarInconsistencia {
    public List<RespostaInconsistencia> executar() {
        List<RespostaInconsistencia> respostaInconsistencias = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            RespostaInconsistencia respostaInconsistencia = new RespostaInconsistencia();
            respostaInconsistencia.setCodigoInconsistencia(UUID.randomUUID().toString());
            respostaInconsistencias.add(respostaInconsistencia);
        }
        return respostaInconsistencias;
    }
}
