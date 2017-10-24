/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author anfeg
 */
public class Auxiliar extends Trabajador {
    private String turno;

    public Auxiliar(int id, String nombre, String apellido, String fechaEntrada, String turno) {
        super(id, nombre, apellido, fechaEntrada);
        this.turno=turno;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

   
    
}
