/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aguasclaras.marina.controller;

import br.com.aguasclaras.marina.model.Cliente;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author gustavo
 */

@ManagedBean
public class ClienteMB extends GenericMB{
    
    private Cliente cliente = new Cliente();

    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
       
}
