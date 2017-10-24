
package Model;

import java.util.ArrayList;

/**
 *
 * @author anfeg
 */
public class Prestamo {
    private int id_prestamo;
    private Solicitante solicitante;
    private Trabajador trabajador;
    private ArrayList<Activo> activo;
    private String tipo;
    private String fechaEntrada;
    private String fechaSalida;

    public Prestamo(int id_prestamo, Solicitante solicitante, Trabajador trabajador, ArrayList<Activo> activo, String tipo, String fechaEntrada, String fechaSalida) {
        this.id_prestamo = id_prestamo;
        this.solicitante = solicitante;
        this.trabajador = trabajador;
        this.activo = activo;
        this.tipo = tipo;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }

    public int getId_prestamo() {
        return id_prestamo;
    }

    public void setId_prestamo(int id_prestamo) {
        this.id_prestamo = id_prestamo;
    }

    public Solicitante getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Solicitante solicitante) {
        this.solicitante = solicitante;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

    public ArrayList<Activo> getActivo() {
        return activo;
    }

    public void setActivo(ArrayList<Activo> activo) {
        this.activo = activo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
    
    
    
    
}
