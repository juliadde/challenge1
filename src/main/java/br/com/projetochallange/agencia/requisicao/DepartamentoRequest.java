package br.com.projetochallange.agencia.requisicao;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "departamento")
@Data


public class DepartamentoRequest {
    @Id
    private String nome;
    private String codigoDepartamento;

}
