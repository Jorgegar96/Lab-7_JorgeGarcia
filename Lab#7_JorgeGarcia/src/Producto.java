/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JorgeLuis
 */
public class Producto {
    private String nombre;
    private float precio;
    private int tiemo_procesamiento;

    public Producto() {
    }

    public Producto(String nombre, float precio, int tiemo_procesamiento) {
        this.nombre = nombre;
        this.precio = precio;
        this.tiemo_procesamiento = tiemo_procesamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getTiemo_procesamiento() {
        return tiemo_procesamiento;
    }

    public void setTiemo_procesamiento(int tiemo_procesamiento) {
        this.tiemo_procesamiento = tiemo_procesamiento;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
