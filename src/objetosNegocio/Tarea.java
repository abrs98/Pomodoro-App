/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
* Este archivo pertenece al branch primeros frames
 */
package objetosNegocio;

import java.util.Objects;
import org.bson.types.ObjectId;

/**
 *
 * @author Abrahan Barrios
 */
public class Tarea {
    private String nombre;
    private String descripcion;
    private int minutos;
    private int segundos;
    private String estado;
    private ObjectId id;
    String Fecha; //se creo esta variable con sus get y set

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public Tarea() {
    }

    public Tarea(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Tarea(String nombre, String descripcion, String estado) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    //se creo este constructor
    public Tarea(String nombre, String descripcion, String estado, String Fecha) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
        this.Fecha = Fecha;
    }

    //jalar
    public Tarea(String nombre, String descripcion, int minutos, int segundos, String estado) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.minutos = minutos;
        this.segundos = segundos;
        this.estado = estado;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    //jalar
    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

   

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    
    //jalar
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tarea other = (Tarea) obj;
        if (this.minutos != other.minutos) {
            return false;
        }
        if (this.segundos != other.segundos) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.descripcion, other.descripcion)) {
            return false;
        }
        if (!Objects.equals(this.estado, other.estado)) {
            return false;
        }
        if (!Objects.equals(this.Fecha, other.Fecha)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

   

    
    
    
    
}