package br.com.projetochallange.agencia.resposta;

import br.com.projetochallange.agencia.requisicao.InconsistenciaRequest;
import lombok.Data;

@Data
public class RespostaInconsistencia extends InconsistenciaRequest {
    private String identificador;
}
