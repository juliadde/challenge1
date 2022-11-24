package br.com.projetochallange.agencia.resposta;

import br.com.projetochallange.agencia.requisicao.AgenciaRequest;
import lombok.Data;

@Data
public class RespostaAgencia extends AgenciaRequest {
    private String identificador;

}
