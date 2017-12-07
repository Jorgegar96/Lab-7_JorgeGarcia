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

public class AdminCajeros {
    
     private ArrayList<Cajero> cajeros;
     private File f;

    public AdminCajeros(String path) {
        this.f = new File(path);
    }

    public ArrayList<Cajero> getCajeros() {
        return cajeros;
    }

    public void setCajeros(ArrayList<Cajero> cajeros) {
        this.cajeros = cajeros;
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
            for (Cajero c : cajeros) {
                bw.write(c.getNombre() + ";");
                bw.write(c.getId() + ";");
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
            cajeros = new ArrayList();
            try {

                sc = new Scanner(f);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    Cajero c = new Cajero(sc.next(),
                            sc.next()
                    );
                    cajeros.add(c);
                }

            } catch (Exception e) {
            }
            sc.close();
        }
    }
}
