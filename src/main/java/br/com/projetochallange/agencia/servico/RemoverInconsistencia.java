package br.com.projetochallange.agencia.servico;


import br.com.projetochallange.agencia.persistencia.InconsistenciaRepository;
import br.com.projetochallange.agencia.resposta.RespostaInconsistencia;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RemoverInconsistencia {
    private final InconsistenciaRepository inconsistenciaRepository;
    private final ConsultarInconsistencia consultarInconsistencia;

    public RespostaInconsistencia executar(String codigoInconsistencia){
        RespostaInconsistencia respostaInconsistencia = consultarInconsistencia.executar(codigoInconsistencia);
        inconsistenciaRepository.deleteById(respostaInconsistencia.getCodigoInconsistencia());
        return respostaInconsistencia;
    }
}
