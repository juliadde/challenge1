package br.com.projetochallange.agencia.requisicao;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "tratativa")
@Entity
public class TratativaRequest {
    @Id
    private String procedimento;
    private Boolean statusConcluido;
    @ManyToOne
    @JoinColumn(name = "departamento_request_nome")
    private DepartamentoRequest departamentoRequest;


}


