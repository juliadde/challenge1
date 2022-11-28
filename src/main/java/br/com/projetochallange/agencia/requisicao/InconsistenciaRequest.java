package br.com.projetochallange.agencia.requisicao;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Table(name = "inconsistencia")
@Entity
public class InconsistenciaRequest implements Serializable {
    @Id
    private String mensagemErro;
    @OneToOne
    @JoinColumn(name = "id_sistema")
    private SistemaRequest sistemaRequest;
    private String etapa;
    private String codigoInconsistencia;

}
