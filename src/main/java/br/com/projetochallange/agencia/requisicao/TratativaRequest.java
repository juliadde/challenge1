package br.com.projetochallange.agencia.requisicao;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "tratativa")
@Entity
public class TratativaRequest {
    @Id
    @OneToOne
    @JoinColumn(name = "id_mensagemErro")
    private InconsistenciaRequest inconsistenciaRequest;
    private String procedimento;
    private Boolean statusConcluido;
    @OneToOne
    @JoinColumn(name = "id_departamento")
    private DepartamentoRequest departamentoRequest;
    private String codigoTratativa;


}


