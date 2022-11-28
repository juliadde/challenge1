package br.com.projetochallange.agencia.requisicao;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "sistema")
@Data

public class SistemaRequest {
    @Id
    private String nome;
    @OneToOne
    @JoinColumn(name = "id_departamento")
    private DepartamentoRequest departamentoRequest;
    private String funcaoSistema;
    private String codigoSistema;
}
