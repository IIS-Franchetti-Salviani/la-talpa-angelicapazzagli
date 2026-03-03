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
public class Gestore extends Thread{
    private ArrayList<Buca> buche;
    private Random random;

    public Gestore(ArrayList<Buca> buche) {
        this.buche = buche;
        this.random = new Random();
    }

    @Override
    public void run() {
        while(true) {
            try {
                int indice = random.nextInt(buche.size());
                Buca buca = buche.get(indice);
                if (!buca.presenzaTalpa()) {
                    buca.mostraTalpa();
                    Thread.sleep(1000);
                    buca.nascondiTalpa();
                }
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
