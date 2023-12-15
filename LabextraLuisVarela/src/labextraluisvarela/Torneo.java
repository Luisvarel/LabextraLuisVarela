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
public class Torneo {

    private String Nombre;
    private ArrayList<equipo> e = new ArrayList();
    private ArrayList<Partido> p = new ArrayList();

    public Torneo(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList<equipo> getE() {
        return e;
    }

    public void setE(ArrayList<equipo> e) {
        this.e = e;
    }

    public ArrayList<Partido> getP() {
        return p;
    }

    public void setP(ArrayList<Partido> p) {
        this.p = p;
    }

    @Override
    public String toString() {
        return "" + Nombre;
    }

}
