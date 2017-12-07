
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JorgeLuis
 */
public class Hora  extends Thread{
    JLabel hora;

    public Hora(JLabel hora) {
        this.hora = hora;
    }
    
    @Override
    public void run(){
        while (true){
            Date f = new Date();
            DateFormat formato = new SimpleDateFormat("hh:mm:ss");
            hora.setText(formato.format(f));
            try {
                Thread.sleep(200);
            } catch (Exception e) {
            }
        }
    }
}
