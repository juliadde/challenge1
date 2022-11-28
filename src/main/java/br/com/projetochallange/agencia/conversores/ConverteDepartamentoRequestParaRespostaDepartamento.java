package br.com.projetochallange.agencia.conversores;


import br.com.projetochallange.agencia.requisicao.DepartamentoRequest;
import br.com.projetochallange.agencia.resposta.RespostaDepartamento;

public class ConverteDepartamentoRequestParaRespostaDepartamento {
    public static RespostaDepartamento converte(DepartamentoRequest departamentoRequest){
        RespostaDepartamento respostaDepartamento = new RespostaDepartamento();
        respostaDepartamento.setCodigoDepartamento(respostaDepartamento.getCodigoDepartamento());
        respostaDepartamento.setNome(respostaDepartamento.getNome());
        return respostaDepartamento;
    }
}
