/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aguasclaras.marina.util;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.MenuModel;

/**
 *
 * @author gustavo
 */
@ManagedBean
@SessionScoped
public class BreadCrumb {
    
    private MenuModel menuModel = new DefaultMenuModel();
    
    public BreadCrumb(){
        this.menuModel = new DefaultMenuModel();
        DefaultMenuItem index = new DefaultMenuItem();
        index.setValue("Home");
        index.setCommand("#{breadCrumb.navigateIndex}");
        this.menuModel.addElement(index);
    }

    public MenuModel getMenuModel() {
        return menuModel;
    }

    public void setMenuModel(MenuModel menuModel) {
        this.menuModel = menuModel;
    }
    
}
