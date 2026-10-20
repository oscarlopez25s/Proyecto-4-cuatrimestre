/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Entity;

/**
 *
 * @author LAB DESARROLLO 05
 */
public class Ubicación {
   
    private int id;
    private String calle;
    private String numero;
    private String colonia;
    private String municipio;
    private String codigoPostal;
    private double latitud;
    private double longitud;

    public Ubicación(int id, String calle, String numero,String colonia, String municipio,String codigoPostal,double latitud, double longitud) {
        this.id = id;
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.municipio = municipio;
        this.codigoPostal = codigoPostal;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public int getId() {
        return id;
    }

    public String getCalle() {
        return calle;
    }

    public String getNumero() {
        return numero;
    }

    public String getColonia() {
        return colonia;
    }

    public String getMunicipio() {
        return municipio;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public double getLatitud() {
        return latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public String getDireccionCompleta() {
        return calle + " " + numero + ", " + colonia
                + ", " + municipio + ", C.P. " + codigoPostal;
    }
}
