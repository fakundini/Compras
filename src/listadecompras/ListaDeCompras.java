/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listadecompras;

import java.util.Scanner;

public class ListaDeCompras {

    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        String producto, salida;
        double precio,totali=0;
        int cant, cont = 0;
        boolean salir = true;
        Compra compras[] = new Compra[10];
        double [] cuantoCada=new double [10];

        while (salir && (cont < compras.length)) {
          
            System.out.println("agregue un producto");
            producto = f.next();
            System.out.println("cual es el costo de " + producto);
            precio = f.nextDouble();
            System.out.println("cuanta cantidad desea llevar");
            cant = f.nextInt();
            System.out.println("desea continuar llenando el carrito?");
           
           
            Compra obj2 = new Compra(producto, cant, precio);
            compras[cont] = obj2;
             System.out.println("el precio total es " + compras[cont].calcularTotal());
             
             cuantoCada[cont]=obj2.calcularTotal();
             cont++;
             salida = f.next();
            if (salida.equalsIgnoreCase("no")) {
                salir= false;
            } else {
            }
        }
        for(int e= 0; e< cont; e++) {
           totali +=cuantoCada[e];
            System.out.println((e+1)+"- "+compras[e].nombre+" $"+cuantoCada[e]);
            System.out.println("el total a gastar sera de"+" $"+totali);
        }
    }

}
