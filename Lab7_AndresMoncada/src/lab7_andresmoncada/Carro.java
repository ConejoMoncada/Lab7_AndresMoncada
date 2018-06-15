/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_andresmoncada;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Dell
 */
public class Carro {
    private DefaultTreeModel model;
    private String nombre;

    public Carro(String nombre) {
        this.nombre = nombre;
        model = new DefaultTreeModel(new DefaultMutableTreeNode(nombre));
    }

    public DefaultTreeModel getModel() {
        return model;
    }

    public void setModel(DefaultTreeModel model) {
        this.model = model;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
