/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acchiappalatalpa;


/**
 *
 * @author pazzagli.angelica
 */
public class Buca {
    private boolean occupata;

    public Buca() {
        occupata = false;
    }

    public synchronized void mostraTalpa() {
        occupata = true;
    }

    public synchronized void nascondiTalpa() {
        occupata = false;
    }

    public synchronized boolean presenzaTalpa() {
        return occupata;
    }
}
