/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Entity;

/**
 *
 * @author LAB DESARROLLO 05
 */
public class Servicio {
    
    private int id;
    private String nombre;
    private String descripcion;
    private String requisitos;
    private String modalidad;
    private boolean activo;
    private Categoria categoria;
    private Organización organizacion;
    private Ubicación ubicacion;

    public Servicio(int id, String nombre,String descripcion, String requisitos,String modalidad, boolean activo,Categoria categoria,Organización organizacion,Ubicación ubicacion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.requisitos = requisitos;
        this.modalidad = modalidad;
        this.activo = activo;
        this.categoria = categoria;
        this.organizacion = organizacion;
        this.ubicacion = ubicacion;
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

    public String getRequisitos() {
        return requisitos;
    }

    public String getModalidad() {
        return modalidad;
    }

    public boolean isActivo() {
        return activo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Organización getOrganizacion() {
        return organizacion;
    }

    public Ubicación getUbicacion() {
        return ubicacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setOrganizacion(Organización organizacion) {
        this.organizacion = organizacion;
    }

    public void setUbicacion(Ubicación ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
