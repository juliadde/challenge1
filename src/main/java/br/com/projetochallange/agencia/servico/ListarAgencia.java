package br.com.projetochallange.agencia.servico;

import br.com.projetochallange.agencia.conversores.ConverteAgenciaRequestParaRespostaAgencia;
import lombok.RequiredArgsConstructor;
import br.com.projetochallange.agencia.persistencia.AgenciaRepository;
import br.com.projetochallange.agencia.resposta.RespostaAgencia;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ListarAgencia {
    private final AgenciaRepository agenciaRepository;

    public List<RespostaAgencia> executar() {
        return agenciaRepository.findAll().stream()
                .map(ConverteAgenciaRequestParaRespostaAgencia::converte).collect(Collectors.toList());
    }

    }
