/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labextraluisvarela;

/**
 *
 * @author Luis Andres Varela
 */
public class Partido {

    private equipo[] nombre = new equipo[2];
    /*
    equipo 1 posicion 0
    equipo 1 puntaje posicion 0
    equipo 2 posicion 1
    equipo 2 puntaje posicion 1
     */
    private int[] puntaje = new int[2];

    public Partido(equipo equipo1, equipo equipo2, int puntaje1, int puntaje2) {
        nombre[0] =  equipo1;
        puntaje[0] = puntaje1;
        nombre[1] =  equipo2;
        puntaje[1] = puntaje2;
    }

}
