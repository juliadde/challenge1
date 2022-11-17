package br.com.projetochallange.agencia.resposta;

import br.com.projetochallange.agencia.requisicao.TratativaRequest;
import lombok.Data;

@Data
public class RespostaTratativa extends TratativaRequest {
    private String identificador;
}

