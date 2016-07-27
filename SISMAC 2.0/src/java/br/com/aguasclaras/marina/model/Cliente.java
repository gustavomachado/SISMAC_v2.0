/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aguasclaras.marina.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author gustavo
 */
@Entity
@Table(name = "cliente")
public class Cliente extends Bean {

    @Id
    @GeneratedValue
    @Column(name = "id_cliente",nullable = false)
    private Long id;
    
    @Column(name = "nome")
    private String nome;
    
    @Column(name = "conjugue")
    private String conjugue;
    
    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getConjugue() {
        return conjugue;
    }

    public void setConjugue(String conjugue) {
        this.conjugue = conjugue;
    }
    
    

}
