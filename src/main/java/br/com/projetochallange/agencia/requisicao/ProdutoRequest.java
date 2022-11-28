package br.com.projetochallange.agencia.requisicao;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "produto")
@Data

public class ProdutoRequest {

    @Id
    private String nome;
    @OneToOne
    @JoinColumn(name = "id_sistema")
    private SistemaRequest sistemaRequest;
    private String codigoProduto;
}
