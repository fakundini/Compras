package listadecompras;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author 52645341
 */
public class Compra {

    String nombre;
    int cantidad;
    double precio;

  

    public Compra(String nombre, int cantidad, double precio) {

        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;

    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public double calcularTotal() {
        return this.cantidad * this.precio;
    }

    public int getCantidad() {
        return cantidad;
    }

}
