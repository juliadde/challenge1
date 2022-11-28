package br.com.projetochallange.agencia.conversores;

import br.com.projetochallange.agencia.requisicao.FuncionarioRequest;
import br.com.projetochallange.agencia.resposta.RespostaFuncionario;

public class ConverteFuncionarioRequestParaRespostaFuncionario {
    public static RespostaFuncionario converte(FuncionarioRequest funcionarioRequest){
        RespostaFuncionario respostaFuncionario = new RespostaFuncionario();
        funcionarioRequest.setNome(funcionarioRequest.getNome());
        funcionarioRequest.setEmail(funcionarioRequest.getEmail());
        funcionarioRequest.setCodigoFuncionario(funcionarioRequest.getCodigoFuncionario());
        funcionarioRequest.setAgenciaRequest(funcionarioRequest.getAgenciaRequest());
        return respostaFuncionario;
    }
}
