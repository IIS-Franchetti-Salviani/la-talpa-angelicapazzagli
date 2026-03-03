/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acchiappalatalpa;

import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author pazzagli.angelica
 */
public class Buca {
    private JButton bottone;
    private boolean occupata;
    private ImageIcon talpaImmagine;

    public Buca(JButton bottone) {
        this.bottone = bottone;
        this.occupata = false;
        talpaImmagine = new ImageIcon(getClass().getResource("/images/talpa.jfif"));
    }

    public void mostraTalpa() {
        occupata = true;
        bottone.setIcon(talpaImmagine);
        bottone.setText("");
    }

    public void nascondiTalpa() {
        occupata = false;
        bottone.setIcon(null); 
        bottone.setText("");
    }

    public boolean presenzaTalpa() {
        return occupata;
    }
}
