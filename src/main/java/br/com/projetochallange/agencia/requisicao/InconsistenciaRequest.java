package br.com.projetochallange.agencia.requisicao;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "inconsistencia")
@Entity
public class InconsistenciaRequest {
    @Id
    private String mensagemErro;
    @ManyToOne
    @JoinColumn(name = "sistema_request_nome")
    private SistemaRequest sistemaRequest;
    private String etapa;

}
