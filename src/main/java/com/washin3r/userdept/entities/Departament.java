package com.washin3r.userdept.entities;
//processo de ORM -> em cima da class

import jakarta.persistence.*;

@Entity
@Table(name = "tb_department")
public class Departament {
    @Id  //quer dizer que o id e a chave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // o banco gera automaticamente
    private Long id;
    private String name;
    public Departament(){
        // metodo construtor vazio -> quer dizer que a classe pode ser instanciada sem passar argumento
        // a classe pode ser instanciada sem passar nenhum argumento
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
