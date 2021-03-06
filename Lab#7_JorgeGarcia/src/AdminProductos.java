/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JorgeLuis
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AdminProductos {
     private ArrayList<Producto> productos;
     private File f;

    public AdminProductos(String path) {
        this.f = new File(path);
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public File getF() {
        return f;
    }

    public void setF(File f) {
        this.f = f;
    }
    
     public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(f, false);
            bw = new BufferedWriter(fw);
            for (Producto p : productos) {
                bw.write(p.getNombre() + ";");
                bw.write(p.getPrecio() + ";");
                bw.write(p.getTiemo_procesamiento()+ ";");
            }
            bw.flush();
        } catch (Exception e) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        if (f.exists()) {
            Scanner sc = null;
            productos = new ArrayList();
            try {

                sc = new Scanner(f);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    Producto p = new Producto(sc.next(),
                            sc.nextFloat(),
                            sc.nextInt()
                    );
                    productos.add(p);
                }

            } catch (Exception e) {
            }
            sc.close();
        }
    }
}
