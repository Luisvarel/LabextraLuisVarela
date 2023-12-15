/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labextraluisvarela;

import java.util.ArrayList;

/**
 *
 * @author Luis Andres Varela
 */
public class Deporte {

    private ArrayList<Torneo> t = new ArrayList();
    private boolean q1;
    private boolean q2;
    private boolean q4;
    private boolean q5;
    private String nombre;

    public Deporte(boolean q1, boolean q2, boolean q4, boolean q5, String nombre) {
        this.q1 = q1;
        this.q2 = q2;
        this.q4 = q4;
        this.q5 = q5;
        this.nombre = nombre;
    }

    public ArrayList<Torneo> getT() {
        return t;
    }

    public void setT(ArrayList<Torneo> t) {
        this.t = t;
    }

    public boolean isQ1() {
        return q1;
    }

    public void setQ1(boolean q1) {
        this.q1 = q1;
    }

    public boolean isQ2() {
        return q2;
    }

    public void setQ2(boolean q2) {
        this.q2 = q2;
    }

    public boolean isQ4() {
        return q4;
    }

    public void setQ4(boolean q4) {
        this.q4 = q4;
    }

    public boolean isQ5() {
        return q5;
    }

    public void setQ5(boolean q5) {
        this.q5 = q5;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
