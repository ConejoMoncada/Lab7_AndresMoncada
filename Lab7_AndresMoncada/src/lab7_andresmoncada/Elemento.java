/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_andresmoncada;

/**
 *
 * @author Dell
 */
public class Elemento {
    private String carro;
    private String pieza;
    private int tiempo;

    public Elemento(String carro, String pieza, int tiempo) {
        this.carro = carro;
        this.pieza = pieza;
        this.tiempo = tiempo;
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    public String getPieza() {
        return pieza;
    }

    public void setPieza(String pieza) {
        this.pieza = pieza;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    
}
