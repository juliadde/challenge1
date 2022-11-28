package br.com.projetochallange.agencia.requisicao;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "agencia")
@Data

public class AgenciaRequest {

        @Id
        private String codigoAgencia;
        private String nomeFuncionario;
    }


