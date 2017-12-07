
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

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
    private JFrame frame;

    public Cajero() {
        frame = new PantallaProceso();
    }

    public Cajero(String nombre, String ID, ArrayList<Orden> ordenes) {
        this.nombre = nombre;
        this.ID = ID;
        this.ordenes = ordenes;
        frame = new PantallaProceso();
    }

    public Cajero(String nombre, String ID) {
        this.nombre = nombre;
        this.ID = ID;
        frame = new PantallaProceso();
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

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    @Override
    public void run(){
        while (true){
            if (ordenes.size() > 0){
                while (ordenes.size() > 0) {
                    Orden orden = ordenes.get(0);
                    ((PantallaProceso)frame).getJl_cliente().setText(orden.getCliente() + "");
                    for (Producto producto : orden.getProductos()) {
                        ((PantallaProceso)frame).getTf_producto().setText(producto + "");
                        try {
                            Thread.sleep(producto.getTiemo_procesamiento() * 1000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Cajero.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    ordenes.remove(0);
                }
            }
        }
    }
}
