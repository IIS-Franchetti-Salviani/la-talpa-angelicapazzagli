/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acchiappalatalpa;

/**
 *
 * @author 39333
 */
public class Scambio {
    private FormGioco form;

    public Scambio(FormGioco form) {
        this.form = form;
    }

    public void mostraTalpa(int indice) {
        form.mostraTalpa(indice);
    }

    public void nascondiTalpa(int indice) {
        form.nascondiTalpa(indice);
    }
    
    public void aggiornaPunteggio(int punteggio){
        form.aggiornaPunteggio(punteggio);
    }
}
