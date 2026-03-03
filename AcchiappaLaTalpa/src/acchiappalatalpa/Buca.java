/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acchiappalatalpa;

import javax.swing.JButton;

/**
 *
 * @author pazzagli.angelica
 */
public class Buca {
    private JButton bottone;
    private boolean occupata;

    public Buca(JButton bottone) {
        this.bottone = bottone;
        this.occupata = false;
    }

    public void mostraTalpa() {
        occupata = true;
        bottone.setText("TALPA!");
    }

    public void nascondiTalpa() {
        occupata = false;
        bottone.setText("");
    }

    public boolean presenzaTalpa() {
        return occupata;
    }
}
