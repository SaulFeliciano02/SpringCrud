package saulwebavanzada.crudspring.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Estudiante {
    @Column(length = 2000)
    private String nombre;
    @Column(length = 2000)
    private String apellido;
    @Id
    private long matricula;
    private long telefono;

    public Estudiante(){}

    public Estudiante(String nombre, String apellido, long matricula, long telefono){
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setMatricula(matricula);
        this.setTelefono(telefono);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public long getMatricula() {
        return matricula;
    }
    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }
    public long getTelefono() {
        return telefono;
    }
    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }
}
