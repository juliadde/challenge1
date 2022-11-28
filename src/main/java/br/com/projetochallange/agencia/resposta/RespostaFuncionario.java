package br.com.projetochallange.agencia.resposta;

import br.com.projetochallange.agencia.requisicao.FuncionarioRequest;
import lombok.Data;

@Data
public class RespostaFuncionario extends FuncionarioRequest {
    private String codigoFuncionario;
}
