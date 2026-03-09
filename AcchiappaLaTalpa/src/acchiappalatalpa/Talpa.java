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
    private ArrayList<Buca> buche;
    private Random random;
    private Scambio scambio;

    public Talpa(ArrayList<Buca> buche, Scambio scambio) {
        this.buche = buche;
        this.scambio = scambio;
        random = new Random();
    }

    @Override
    public void run() {
        while(true) {
            try {
                int indice = random.nextInt(buche.size());
                Buca b = buche.get(indice);
                if(!b.presenzaTalpa()) {
                    b.mostraTalpa();
                    scambio.mostraTalpa(indice);
                    Thread.sleep(1000);
                    b.nascondiTalpa();
                    scambio.nascondiTalpa(indice);
                }
                Thread.sleep(500);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
