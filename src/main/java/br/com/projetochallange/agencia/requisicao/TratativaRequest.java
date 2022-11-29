package br.com.projetochallange.agencia.requisicao;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Table(name = "tratativa")
@Entity
public class TratativaRequest implements Serializable {

    @OneToOne
    @JoinColumn(name = "id_mensagemErro")
    private InconsistenciaRequest inconsistenciaRequest;
    @Id
    private String procedimento;
    private Boolean statusConcluido;
    @OneToOne
    @JoinColumn(name = "id_departamento")
    private DepartamentoRequest departamentoRequest;
    private String codigoTratativa;


}


