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
    
    private int tempoVisibile = 1000;
    private int pausa = 500; 

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
                int tempoRimanente = form.getTempoRimanente();
                if (tempoRimanente <= 20) {
                    pausa = 300;
                    tempoVisibile = 800;
                }
                if (tempoRimanente <= 10) {
                    pausa = 150;
                    tempoVisibile = 600;
                }
                int indice = random.nextInt(buche.size());
                Buca b = buche.get(indice);
                if (!b.presenzaTalpa()) {
                    b.mostraTalpa();
                    scambio.mostraTalpa(indice);
                    Thread.sleep(tempoVisibile);
                    if(b.presenzaTalpa()) {
                        b.nascondiTalpa();
                        scambio.nascondiTalpa(indice);
                    }
                }
                Thread.sleep(pausa);
            }
            catch(Exception e){ }
        }
    }
}
