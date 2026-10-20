/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Entity;

/**
 *
 * @author LAB DESARROLLO 05
 */
public class Organización {
    
    private int id;
    private String nombre;
    private String descripcion;
    private String telefono;
    private String correo;
    private String sitioWeb;
    private boolean activa;

    public Organización(int id,String nombre,String descripcion, String telefono,String correo, String sitioWeb,boolean activa){
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.telefono = telefono;
        this.correo = correo;
        this.sitioWeb = sitioWeb;
        this.activa = activa;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getSitioWeb() {
        return sitioWeb;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setSitioWeb(String sitioWeb) {
        this.sitioWeb = sitioWeb;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }
}
