/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto3;

/**
 *
 * @author milton
 */
public class Vuelo {
    private String ciudad;
    private String ciudad2;
    private String aerolinea;
    private double precio;
    private double distancia;

    public Vuelo(String ciudad, String ciudad2, String aerolinea, double precio, double distancia) {
        this.ciudad = ciudad;
        this.ciudad2 = ciudad2;
        this.aerolinea = aerolinea;
        this.precio = precio;
        this.distancia = distancia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCiudad2() {
        return ciudad2;
    }

    public void setCiudad2(String ciudad2) {
        this.ciudad2 = ciudad2;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    
}
