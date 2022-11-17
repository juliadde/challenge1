package br.com.projetochallange.agencia.entidades;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produto")
@Data

public class Produto {
    @Id
    String nome;
    String sistema;
}
