package br.com.projetochallange.agencia.requisicao;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produto")
@Data

public class ProdutoRequest {

    @Id
    String nome;
    String sistema;
}
