package br.com.projetochallange.agencia.requisicao;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "inconsistencia")
@Entity
public class InconsistenciaRequest {
    @Id
    private String mensagemErro;
    @OneToOne
    @JoinColumn(name = "id_sistema")
    private SistemaRequest sistemaRequest;
    private String etapa;

}
