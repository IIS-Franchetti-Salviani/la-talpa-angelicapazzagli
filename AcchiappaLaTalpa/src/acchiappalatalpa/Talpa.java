/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acchiappalatalpa;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author pazzagli.angelica
 */
public class Talpa extends Thread {
    private Gestore gestore;
    private Random random;
    private Scambio scambio;
    private FormGioco form;

    public Talpa(Gestore gestore, Scambio scambio, FormGioco form) {
        this.gestore = gestore;
        this.scambio = scambio;
        this.form = form;
        random = new Random();
    }

    @Override
    public void run() {
        ArrayList<Buca> buche = gestore.getBuche();
        while(true){
            try{
                if (!form.inCorso) {
                    Thread.sleep(200);
                    continue;
                }
                int indice = random.nextInt(buche.size());
                Buca b = buche.get(indice);
                if(!b.presenzaTalpa()){
                    b.mostraTalpa();
                    scambio.mostraTalpa(indice);
                    Thread.sleep(1000);
                    if(b.presenzaTalpa()){
                        b.nascondiTalpa();
                        scambio.nascondiTalpa(indice);
                    }
                }
                Thread.sleep(500);
            }
            catch(Exception e){ }
        }
    }
}
