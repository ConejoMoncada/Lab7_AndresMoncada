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
    private Object[] row = new Object[3];

    public Elemento(String carro, String pieza, int tiempo) {
        this.carro = carro;
        this.pieza = pieza;
        this.tiempo = tiempo;
        row[0] = carro;
        row[1] = pieza;
        row[2] = tiempo;
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
    public Object[] getRow(){
        return row;
    }
}
