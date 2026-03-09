/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acchiappalatalpa;

import java.util.ArrayList;

/**
 *
 * @author pazzagli.angelica
 */
public class Gestore {
    private ArrayList<Buca> buche;
    private int punteggio;
    private Scambio scambio;

    public Gestore(ArrayList<Buca> buche, Scambio scambio) {
        this.buche = buche;
        this.scambio = scambio;
        punteggio = 0;
    }

    public ArrayList<Buca> getBuche() {
        return buche;
    }

    public synchronized void colpisciBuca(int indice) {
        Buca b = buche.get(indice);
        if(b.presenzaTalpa()){
            b.nascondiTalpa();
            punteggio++;
            scambio.aggiornaPunteggio(punteggio);
            scambio.nascondiTalpa(indice);
        }
    }
    
    public synchronized void resetPunteggio() {
        punteggio = 0;
        scambio.aggiornaPunteggio(punteggio);
    }
    
    public synchronized int getPunteggio() {
        return punteggio;
    }
}
