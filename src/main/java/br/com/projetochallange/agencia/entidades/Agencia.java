package br.com.projetochallange.agencia.entidades;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "agencia")
@Data

public class Agencia {
    @Id
    private String codigoAgencia;
    private String nome;
    private String cidade;
}
