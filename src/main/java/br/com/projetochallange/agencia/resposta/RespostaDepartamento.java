package br.com.projetochallange.agencia.resposta;

import br.com.projetochallange.agencia.requisicao.DepartamentoRequest;
import lombok.Data;

@Data
public class RespostaDepartamento extends DepartamentoRequest {
    private String identificador;
}
