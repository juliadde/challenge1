package br.com.projetochallange.agencia.requisicao;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "funcionario")
@Data

public class FuncionarioRequest {
    @Id
    private String nome;
    private String email;
    private String codigoFuncionario;
    @ManyToOne
    @JoinColumn(name = "id_agencia")
    private AgenciaRequest agenciaRequest;
}
