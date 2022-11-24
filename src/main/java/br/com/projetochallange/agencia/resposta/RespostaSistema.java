package br.com.projetochallange.agencia.resposta;
import br.com.projetochallange.agencia.requisicao.SistemaRequest;
import lombok.Data;
@Data
public class RespostaSistema extends SistemaRequest{
    private String identificador;
}
