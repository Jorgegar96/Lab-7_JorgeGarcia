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
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Persona t : listaPersonas) {
                bw.write(t.getCodigo() + ";");
                bw.write(t.getNombre() + ";");
                bw.write(t.getEdad() + ";");
                for (int x = 0; x < t.getHobbies().size(); x++) {
                    bw.write(t.getHobbies().get(x).getCodigo() + ",");
                    bw.write(t.getHobbies().get(x).getDescripcion() + ",");
                    bw.write(t.getHobbies().get(x).getDuracion() + ",");
                }
                bw.write(";");
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
                    Persona p = new Persona(sc.nextInt(),
                            sc.next(),
                            sc.nextInt()
                    );
                    listaPersonas.add(p);
                    String[] hobbies = sc.next().split(",");
                    for (int x = 0; x < hobbies.length; x += 3) {
                        p.getHobbies().add(new Hobby(Integer.parseInt(hobbies[x]), hobbies[x + 1], Integer.parseInt(hobbies[x + 2])));
                    }
                }

            } catch (Exception e) {
            }
            sc.close();
        }
    }
}
