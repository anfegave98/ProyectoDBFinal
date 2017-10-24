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
public class Auxiliar {
    private int id_auxiliar;
    private String nombre_auxiliar;
    private String apellido_auxiliar;
    private String fecha_entrada;
    private String turno;
    private int id_supervisor;

    public Auxiliar(int id_auxiliar, String nombre_auxiliar, String apellido_auxiliar, String fecha_entrada, String turno, int id_supervisor) {
        this.id_auxiliar = id_auxiliar;
        this.nombre_auxiliar = nombre_auxiliar;
        this.apellido_auxiliar = apellido_auxiliar;
        this.fecha_entrada = fecha_entrada;
        this.turno = turno;
        this.id_supervisor = id_supervisor;
    }

    public int getId_auxiliar() {
        return id_auxiliar;
    }

    public void setId_auxiliar(int id_auxiliar) {
        this.id_auxiliar = id_auxiliar;
    }

    public String getNombre_auxiliar() {
        return nombre_auxiliar;
    }

    public void setNombre_auxiliar(String nombre_auxiliar) {
        this.nombre_auxiliar = nombre_auxiliar;
    }

    public String getApellido_auxiliar() {
        return apellido_auxiliar;
    }

    public void setApellido_auxiliar(String apellido_auxiliar) {
        this.apellido_auxiliar = apellido_auxiliar;
    }

    public String getFecha_entrada() {
        return fecha_entrada;
    }

    public void setFecha_entrada(String fecha_entrada) {
        this.fecha_entrada = fecha_entrada;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getId_supervisor() {
        return id_supervisor;
    }

    public void setId_supervisor(int id_supervisor) {
        this.id_supervisor = id_supervisor;
    }
    
    
}
