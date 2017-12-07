
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
public class Cajero extends Thread{
    private String nombre;
    private String ID;
    private ArrayList<Orden> ordenes;

    public Cajero() {
    }

    public Cajero(String nombre, String ID, ArrayList<Orden> ordenes) {
        this.nombre = nombre;
        this.ID = ID;
        this.ordenes = ordenes;
    }

    public Cajero(String nombre, String ID) {
        this.nombre = nombre;
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public ArrayList<Orden> getOrdenes() {
        return ordenes;
    }

    public void setOrdenes(ArrayList<Orden> ordenes) {
        this.ordenes = ordenes;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    @Override
    public void run(){
        while (true){
            
        }
    }
}
