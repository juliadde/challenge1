package br.com.projetochallange.agencia.requisicao;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "sistema")
@Data

public class SistemaRequest {
    @Id
    private String nome;
    @ManyToOne
    @JoinColumn(name = "departamento_request_nome")
    private DepartamentoRequest departamentoRequest;
    private String funcaoSistema;
}
