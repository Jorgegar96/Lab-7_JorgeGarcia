
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JorgeLuis
 */
public class Orden {
    private Cajero cajero;
    private Client cliente;
    private ArrayList<Producto> productos;

    public Orden() {
    }

    public Orden(Cajero cajero, Client cliente, ArrayList<Producto> productos) {
        this.cajero = cajero;
        this.cliente = cliente;
        this.productos = productos;
    }

    public Orden(Cajero cajero, Client cliente) {
        this.cajero = cajero;
        this.cliente = cliente;
    }

    public Cajero getCajero() {
        return cajero;
    }

    public void setCajero(Cajero cajero) {
        this.cajero = cajero;
    }

    public Client getCliente() {
        return cliente;
    }

    public void setCliente(Client cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Orden{" + '}';
    }
    
}
